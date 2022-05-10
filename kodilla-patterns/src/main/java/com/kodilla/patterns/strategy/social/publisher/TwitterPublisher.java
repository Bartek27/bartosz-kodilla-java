package com.kodilla.patterns.strategy.social.publisher;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class TwitterPublisher implements SocialPublisher {
    public void share() {
        System.out.println("Twitter");
    }
}
