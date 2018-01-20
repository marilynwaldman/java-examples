package com.mdw;

import java.util.Arrays;
import java.util.concurrent.SubmissionPublisher;

public class App 
{
    public static void main (String [] args) throws InterruptedException {

        //Create Publisher
        SubmissionPublisher <String> publisher = new SubmissionPublisher <> ();

        //Create the Filter Processor - strip out "x"'s
        MyFilterProcessor<String,String> filterProcessor = new MyFilterProcessor<>(s -> !s.equals("x"));

        //Create the Transformation Processor - convert integer valued String to value
        MyTransformProcessor<String, Integer> transformProcessor = new MyTransformProcessor<>(s -> Integer.parseInt(s));

        //Create subscriber for final Processor
        MySubscriber<Integer> subscriber = new MySubscriber<>();

        //Chain Processor and Subscriber
        publisher.subscribe(filterProcessor);
        filterProcessor.subscribe(transformProcessor);
        transformProcessor.subscribe(subscriber);

        System.out.println("Publishing Items...");

        String[] items = {"100", "x", "200", "x", "300", "x"};
        Arrays.asList(items).stream().forEach(i -> publisher.submit(i));

        publisher.close();
        Thread.sleep ( 20000 );

    }
}
