package org.example;

public class MoodAnalyser {
    private String message;

    public enum Error {
        NULL, EMPTY
    }

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
            throw new MoodAnalysisException(Error.NULL);
        } else if (message.isEmpty()) {
            throw new MoodAnalysisException(Error.EMPTY);
        } else if (message.toLowerCase().contains("happy")) {
            return "Happy";
        } else if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else {
            return "Happy";
        }

    }
}
