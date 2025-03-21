package org.example.model;

import java.util.List;

public class Publisher {

    List<Subscriber> subscribers;

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }


    public void notifySubscribers() {
        subscribers.forEach(Subscriber::notifyMessage);
    }
}
