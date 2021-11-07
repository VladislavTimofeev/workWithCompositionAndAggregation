package com.company.task1;

/**
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
 * консоль текст, заголовок текста.
 */

//создать 2 предложения и добавить их к существующему. потом 3 статьи, разобрать агрегацию и композицию

public class Task1 {

    public static void main(String[] args) {
        //создаю предложение 1
        Word word1 = new Word("car");
        Word word2 = new Word("green");
        Word[] words1 = new Word[]{word1, word2};
        Sentence sentence1 = new Sentence(words1);

        //создаю предложение 2
        Word word3 = new Word("apple");
        Word word4 = new Word("red");
        Word[] words2 = new Word[]{word3, word4};
        Sentence sentence2 = new Sentence(words2);

        //создаю 3 предложение
        Word word5 = new Word("puppy");
        Word word6 = new Word("happy");
        Word[] words3 = new Word[]{word5, word6};
        Sentence sentence3 = new Sentence(words3);

        // создаю header
        Word word1Header = new Word("Information");
        Word word2Header = new Word("About");
        Word word3Header = new Word("Car");
        Word[] headerWords = new Word[]{word1Header, word2Header, word3Header};
        Sentence sentence1Header = new Sentence(headerWords);

        // создаю массив предложений
        Sentence[] sentences = new Sentence[]{sentence1,sentence2,sentence3};


        Text text = new Text(sentences, sentence1Header);

        text.printText();
    }
}
