package com.example.cariguru;

public class FAQData {
    private String question;
    private String answer;

    public FAQData() {
    }

    public FAQData(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
