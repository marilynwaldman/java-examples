package com.mdw;

import java.util.concurrent.Flow;
import java.sql.Timestamp;

public class DogSubscriber implements Flow.Subscriber<Dog> {
    private Flow.Subscription subscription;
    private static final int MAX_NEWS = 100;
    private int newsReceived = 0;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        System.out.printf("new subscription %s on thread (%s)\n", subscription,Thread.currentThread().getName());
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(Dog item) {

        System.out.printf(" %s arrived at (%s) running on thread (%s)\n", item.getName(), new Timestamp(item.getTimeNow()),Thread.currentThread().getName() );
        newsReceived++;

        if (newsReceived >= MAX_NEWS) {
            System.out.printf("%d news received (max: %d), cancelling subscription\n", newsReceived,
                    MAX_NEWS);
            subscription.cancel();
            return;
        }



        subscription.request(1);

    }

    @Override
    public void onError(Throwable throwable) {
        System.err.printf("error occurred fetching news: %s\n", throwable.getMessage());
        throwable.printStackTrace(System.err);

    }

    @Override
    public void onComplete() {
        System.out.println("fetching news completed \n");
    }
    
    
}
