package org.example;

public class MoodAnalyser {
    private String message;

    // Constructor with parameters
    public MoodAnalyser(String message) {
        this.message = message;
    }

    // Default constructor
    public MoodAnalyser() {
        this.message = "";
    }

    public String analyseMood() throws MoodAnalysisException {
        if (message == null) {
            return "Happy";
        } else if (message.isEmpty()) {
            throw new MoodAnalysisException("Invalid message.");
        } else if (message.toLowerCase().contains("happy")) {
            return "Happy";
        } else if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else {
            return "Happy";
        }

    }
}
