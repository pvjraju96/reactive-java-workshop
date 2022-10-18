package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        // TODO: Write code here
        ReactiveSources.intNumberMono().subscribe(
                e -> System.out.println(e),
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("Mono completed"));

        // Get the value from the Mono into an integer variable
        // TODO: Write code here
        Integer number = ReactiveSources.intNumberMono().block();
        System.out.println("number : " + number);

        User user = ReactiveSources.userMono().block();
        System.out.println("User :: " + user);
        ///System.out.println("Press a key to end");
        ///System.in.read();
    }

}
