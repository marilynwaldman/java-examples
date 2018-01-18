package com.mdw;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.SubmissionPublisher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        try (SubmissionPublisher<Dog> dogPublisher = new SubmissionPublisher()) {
            System.out.println("before new DogScriber");

            DogSubscriber newsSubscriber = new DogSubscriber();
            System.out.println("after new DogScriber");
            dogPublisher.subscribe(newsSubscriber);
            System.out.println("after subscribe");
            List.of(Dog.create("Fido"), Dog.create("Lady"),
                    Dog.create("FoFo")).forEach(dogPublisher::submit);

            while (dogPublisher.hasSubscribers()) {
                // wait
            }
            System.out.println("no more news subscribers left, closing publisher..");
        }
    }



}
