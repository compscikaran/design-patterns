package com.design.patterns.structural.proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwitterServiceStub implements TwitterService {

    private Map<String, List<String>> tweets = new HashMap<>();

    @Override
    public String getTimeline(String screenName) {
        if(tweets.containsKey(screenName)) {
            return String.join(" ; ", tweets.get(screenName));
        } else {
            return "";
        }
    }

    @Override
    public void postToTimeline(String screenName, String message) {
        if(tweets.containsKey(screenName)) {
            List<String> tweetsData = tweets.get(screenName);
            tweetsData.add(message);
        } else {
            List<String> tweetsData = new ArrayList<>();
            tweetsData.add(message);
            tweets.put(screenName, tweetsData);
        }
    }
}
