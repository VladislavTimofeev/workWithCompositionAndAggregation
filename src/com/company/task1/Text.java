package com.company.task1;

import com.company.util.Util;

public class Text {

    private Sentence[] text;
    private Sentence header;

    public Text(Sentence[] sentences, Sentence header) {
        this.text = sentences;
        this.header = header;
    }

    public void printText() {
        Util.print(header.getSentence());

        for (Sentence sentence : text) {
            Util.print(sentence.getSentence());
        }
    }

    public void addSentence(Sentence sentence, int index) {
        text[index] = sentence;
    }
}
