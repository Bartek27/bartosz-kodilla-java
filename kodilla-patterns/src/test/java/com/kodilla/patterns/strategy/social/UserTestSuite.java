package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.SnapchatPublisher;
import org.junit.jupiter.api.Test;
public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {

        User adam = new YGeneration("adam");
        User pawel = new ZGeneration("pawel");
        User mariusz = new Millenials("mariusz");

        adam.share("comment and share this post");
        pawel.share("i am eating a sandwich");
        mariusz.share("my dad bought me a new car");

    }

    @Test
    public void testIndividualSharingStrategy() {
        User edward = new YGeneration("edward");
        edward.setSocialPublishingStrategy(new SnapchatPublisher());
        edward.share("i am not interested in politics ");
    }
}
