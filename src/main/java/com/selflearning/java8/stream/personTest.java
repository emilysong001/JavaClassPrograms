package com.selflearning.java8.stream;

import com.selflearning.java8.StreamTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class personTest {
    public static void main(String[] args) {
        List<Person> listOfPerson = new ArrayList<>();
        listOfPerson.add(new Person("Emily",23,"F"));
        listOfPerson.add(new Person("Azat",25,"M"));
        listOfPerson.add(new Person("Chirag",23,"M"));
        listOfPerson.add(new Person("Diana",23,"F"));
        listOfPerson.add(new Person("Janet",23,"F"));
        int count =0;
        for (Person p:listOfPerson) {
            if(p.getSex().equals("F")){
                count++;
                //System.out.println(p.getName());
            }
        }
        System.out.println("Female numbers: "+count);

        Stream<Person> stream = listOfPerson.stream();
        stream = stream.filter(p->p.getSex().equals("F"));
        //System.out.println(stream.count());

        /*stream.forEach(new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                System.out.println(person.getName());
            }
        });*/

        //long countOfFemales = stream.count();
        //System.out.println(countOfFemales);

        List<Person> after = stream.collect(Collectors.toList());
        System.out.println(after.get(0).getName());



    }
}
