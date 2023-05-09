package com.selflearning.ikm;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class CollectorTest {
    public static void main(String[] args) {
        Consumer<Namer> printit = e-> System.out.println(e.getFirstName()+" "+e.getLastName());
        List<Namer> names = new ArrayList<>(Arrays.asList(new Namer("Harry","Smith"),new Namer("Joe","Smith"),
                new Namer("Jane","Does"),
        new Namer("Marry","Jane"),new Namer("Harry","Homer")));

        /*names.removeIf(e->e.getFirstName().equals("Marry"));
        Comparator<Namer> groupBy = Comparator.comparing(e -> e.getFirstName());
        groupBy = groupBy.thenComparing(e ->e.getLastName());
        names.sort(groupBy);
        names.forEach(printit);*/

        /*//Collections.sort(names, (Namer e1, Namer e2)-> e1.getFirstName().compareTo(e2.getFirstName()));
        Collections.sort(names, Comparator.comparing(e->e.getFirstName()));
        names.removeIf(e->e.getFirstName().equals("Marry"));
       // names.forEach(s-> System.out.println(s.getFirstName()+" "+s.getLastName()));
        for(Namer e:names) System.out.println(e.getFirstName()+" "+e.getLastName());*/

        Function<Namer,String> conv = i->i.getFirstName();
        //Function<Namer,String> conv1 = i->i.getLastName();
        Comparator<Namer> comparator = Comparator.comparing(conv).thenComparing(i->i.getLastName());
        names.sort(comparator);
        names.removeIf(e->e.getFirstName().equals("Marry"));
        names.forEach(printit);

    }
}

class Namer{
    final private String firstName, lastName;

    public Namer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
