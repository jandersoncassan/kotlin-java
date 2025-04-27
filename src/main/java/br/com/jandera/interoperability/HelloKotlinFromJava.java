package br.com.jandera.interoperability;

import br.com.jandera.interoperability.kotlintojava.Person;
import br.com.jandera.objectoriented.generics.MaxKt;

public class HelloKotlinFromJava {

    public static void main(String[] args) {

        Person rob = new Person("Robert", "Martin");
        System.out.println("His name is " + rob.getFirstName() + " " + rob.getLastName());

        rob.setFirstName("Uncle Bob");
        System.out.println("His name is now " + rob.getFirstName() + " " + rob.getLastName());
        System.out.println("His name is now " + rob.getFirstName() + " " + rob.getLastName());

        Integer maxInt = MaxKt.max(2001, 2022);
        System.out.println("The max value is " + maxInt);

    }
}
