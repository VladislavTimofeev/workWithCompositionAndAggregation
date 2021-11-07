package com.company.task1;

public class Sentence {

    private Word[] words;

    public Sentence(Word[] words) {
        this.words = words;
    }

    public String getSentence() {
        StringBuilder sentence = new StringBuilder();

        for (Word word : words) {
            sentence.append(word.getWord()).append(" ");
        }

        return sentence.toString();
    }
}
