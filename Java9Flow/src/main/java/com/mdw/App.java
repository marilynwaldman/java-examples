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

        //Create  the Publisher
        try (SubmissionPublisher<Dog> dogPublisher = new SubmissionPublisher()) {

            //Create the Subscriber
            DogSubscriber newsSubscriber = new DogSubscriber();

            //Subscriber subscribes to Publisher
            dogPublisher.subscribe(newsSubscriber);

            for(int i = 0; i < 10; i++){
                String name = "Dog" +  Integer.toString(i);
                List.of(Dog.create(name)).forEach(dogPublisher::submit);
                sleep(100);
            }

            //Keep main thread alive until the Subscriber cancels
            /*
            while (dogPublisher.hasSubscribers()) {
                System.out.println(Thread.currentThread().getName());
                // wait
            }
            System.out.println("no more news subscribers left, closing publisher..");
            */


            System.out.println("end of main thread");
        }
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);

        } catch (Exception ex) {
        }

    }



}
