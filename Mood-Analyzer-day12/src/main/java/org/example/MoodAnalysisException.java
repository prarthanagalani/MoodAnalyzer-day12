package org.example;

public class MoodAnalysisException extends Exception {
    private MoodAnalyser.Error error;

    public MoodAnalysisException(MoodAnalyser.Error error) {
        super("Error: " + error);
        this.error = error;
    }

    public MoodAnalyser.Error getError() {
        return error;
    }
}
