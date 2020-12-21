package com.company.solution;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TweetCountsTest {

    @Test
    void test() {
        TweetCounts tweetCounts = new TweetCounts();
        tweetCounts.recordTweet("tweet3", 0);
        tweetCounts.recordTweet("tweet3", 60);
        tweetCounts.recordTweet("tweet3", 10);
        List<Integer> list1 = tweetCounts.getTweetCountsPerFrequency("minute", "tweet3", 0, 59);

        assertArrayEquals(new Integer[]{2}, list1.toArray());

        List<Integer> list2 = tweetCounts.getTweetCountsPerFrequency("minute", "tweet3", 0, 60);
        assertArrayEquals(new Integer[]{2, 1}, list2.toArray());

        tweetCounts.recordTweet("tweet3", 120);

        List<Integer> list3 = tweetCounts.getTweetCountsPerFrequency("hour", "tweet3", 0, 210);
        assertArrayEquals(new Integer[]{4}, list3.toArray());

    }
}
