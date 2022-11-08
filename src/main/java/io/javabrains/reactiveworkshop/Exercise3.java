package io.javabrains.reactiveworkshop;


import java.util.List;

public class Exercise3 {

    public static void main(String[] args) {

        // Use ReactiveSources.intNumbersFlux()

        // Get all numbers in the ReactiveSources.intNumbersFlux stream
        // into a List and print the list and its size
        // TODO: Write code here
        List<Integer> numbers = ReactiveSources.intNumbersFlux().log().toStream().toList();

        System.out.println("List is " + numbers);

        System.out.println("Size: " + numbers.size());

        List<String> stringNumbers = ReactiveSources.stringNumbersFlux().toStream().toList();
        System.out.println("List is " + stringNumbers);
        System.out.println("Size: " + stringNumbers.size());
        // System.out.println("Press a key to end");
        //System.in.read();
    }

}
