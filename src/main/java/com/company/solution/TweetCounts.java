package com.company.solution;

import java.util.*;

/**
 * 5334. 推文计数
 */
public class TweetCounts {
    Map<String, List<Integer>> map = new HashMap<>();

    public TweetCounts() {

    }

    public void recordTweet(String tweetName, int time) {
        if (map.containsKey(tweetName)) {
            map.get(tweetName).add(time);
        } else {
            List<Integer> list = new ArrayList<>();
            list.add(time);
            map.put(tweetName, list);
        }
    }

    public List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime, int endTime) {
        int delta = getDelta(freq);
        List<Integer> list = map.get(tweetName);
        if (list == null) {
            return null;
        }
        Collections.sort(list);

        List<Integer> ans = new ArrayList<>();

        int index = 0;

        for (int i = startTime; i <= endTime; i += delta) {
            while (index < list.size() && list.get(index) < i) {
                index++;
            }

            int count = 0;
            while (index < list.size() && list.get(index) < Math.min(i + delta, endTime + 1)) {
                count++;
                index++;
            }
            ans.add(count);
        }
        return ans;
    }

    private int getDelta(String freq) {
        switch (freq) {
            case "minute":
                return 60;
            case "hour":
                return 60 * 60;
            case "day":
                return 60 * 60 * 24;
            default:
                return 0;
        }
    }
}


/**
 * Your TweetCounts object will be instantiated and called as such:
 * TweetCounts obj = new TweetCounts();
 * obj.recordTweet(tweetName,time);
 * List<Integer> param_2 = obj.getTweetCountsPerFrequency(freq,tweetName,startTime,endTime);
 */
