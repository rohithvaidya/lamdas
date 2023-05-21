package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class Main {

    public static void main(String [] args){
        List<Person> people = Arrays.asList(
                new Person("A", "B", 20),
                new Person("C", "B", 22),
                new Person("B", "B", 21)
        );



        Collections.sort(people, (ob1, ob2)-> ob1.getFirstName().compareTo(ob2.getFirstName()));


        printConditionally(people, p->true, p->System.out.println(p));


        printConditionally(people, (p)-> p.getFirstName().startsWith("A"), p->System.out.println(p.getFirstName()));

    }

    public static void printConditionally(List<Person> people, Predicate<Person> condition, Consumer<Person> consumer){
        for(Person ob:people){
            if(condition.test(ob)){
                consumer.accept(ob);
            }
        }
    }
}
