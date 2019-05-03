package lv.javaguru.lessons.homework.lesson9.UniqueWordVocabulary.Test;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordsVocabular {




    private Set<String> uqWords = new HashSet<>() ;


    public Set<String> getUqWords() {
        return uqWords;
    }

    public int getUniqueWords() {

        return getUqWords().size();
    }

    public void addWord(String word) {

        if (!word.isEmpty()) {
           uqWords.add(word);
        }
    }

    void printToConsole() {
        for (String s : uqWords)
            System.out.println(s);
    }


}
