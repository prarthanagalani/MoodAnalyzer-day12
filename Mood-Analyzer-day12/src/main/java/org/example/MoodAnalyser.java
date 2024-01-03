package org.example;

public class MoodAnalyser {
    public String analyseMood(String message) {

        if (message.toLowerCase().contains("happy")) {
            return "Happy";
        } else if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else {
            return "Happy";
        }
    }

}
