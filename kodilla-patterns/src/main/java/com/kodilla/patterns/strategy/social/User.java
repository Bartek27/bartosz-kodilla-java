package com.kodilla.patterns.strategy.social;

public class User {
    private final String userName;
    protected SocialPublisher socialPublisher;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String share(String post) {
        System.out.println("the post [" + post + "] will be shared on: ");
        socialPublisher.share();
        return post;
    }

    public void setSocialPublishingStrategy(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
