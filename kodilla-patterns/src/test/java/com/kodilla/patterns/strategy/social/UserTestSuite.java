package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.SnapchatPublisher;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {

        //Given
        User adam = new Millenials("Adam");
        User pawel = new YGeneration("Pawel");
        User mariusz = new ZGeneration("Mariusz");

        //When
        String adamService = adam.share("This is a Twitter service");
        String pawelService = pawel.share("This is a Facebook service");
        String mariuszService = mariusz.share("This is a Snapchat service");

        //Then
        Assert.assertEquals("This is a Twitter service", adamService);
        System.out.println(adam.getUserName() + " = " + adamService);
        Assert.assertEquals("This is a Facebook service", pawelService);
        System.out.println(pawel.getUserName() + " = " + pawelService);
        Assert.assertEquals("This is a Snapchat service", mariuszService);
        System.out.println(mariusz.getUserName() + " = " + mariuszService);

    }

    @Test
    public void testIndividualSharingStrategy() {
        User edward = new YGeneration("edward");
        edward.setSocialPublishingStrategy(new SnapchatPublisher());
        edward.share("i am not interested in politics ");
    }
}
