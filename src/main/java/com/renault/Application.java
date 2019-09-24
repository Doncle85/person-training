package com.renault;

public class Application {
    public static void main(String[] args) {

        Person marco = new Person("Marco", "Veratti");
        System.out.println(marco);

        Person m2 = new Person("Marco", "Veratti");
        System.out.println(m2);

        // marco vs m2 = not equals = false
        boolean equals = marco.equals(m2);
        System.out.println(equals);

    }
}
