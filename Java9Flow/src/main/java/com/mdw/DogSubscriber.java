package com.mdw;

import java.util.concurrent.Flow;

public class DogSubscriber implements Flow.Subscriber<Dog> {
    private Flow.Subscription subscription;
    private static final int MAX_NEWS = 3;
    private int newsReceived = 0;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        System.out.printf("new subscription %s\n", subscription);
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(Dog item) {
        System.out.printf(" %s arrived at (%s)\n", item.getName(), item.getDate());
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
        System.out.println("fetching news completed");
    }
    
    
}
