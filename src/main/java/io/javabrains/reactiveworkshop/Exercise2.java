package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        // TODO: Write code here
        ReactiveSources.intNumbersFlux().subscribe(e -> System.out.println(e));
        // Flux<Integer> stream = ReactiveSources.intNumbersFlux();
        // stream.subscribe(e -> System.out.println(e));
        // stream.subscribe(e -> System.out.println("Another one " + e));

        // Print all users in the ReactiveSources.userFlux stream
        // TODO: Write code here
        ReactiveSources.userFlux().subscribe(e -> System.out.println(e));
        System.out.println("Press a key to end");
        System.in.read();
    }

}
