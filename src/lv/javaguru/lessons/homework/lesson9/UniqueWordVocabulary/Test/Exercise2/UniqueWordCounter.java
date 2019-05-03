package lv.javaguru.lessons.homework.lesson9.UniqueWordVocabulary.Test.Exercise2;


import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {
    private Integer counter = 1;
    private Map<String, Integer> uniWord = new HashMap<>();
    public Map<String, Integer> getUniWord() {
        return uniWord;
    }
    public void addWords(String word, Integer number) {
        if (word.isEmpty()) {
        } else {
            if (uniWord.containsKey(word)) {
                counter++;
                uniWord.replace(word, number, counter);

            } else
                uniWord.put(word, number);
        }
    }

    public void printMap() {
        System.out.println(getUniWord());
    }

    public String moreRepeats() {
        int max = 0;
        String maxx = null;
        for (Map.Entry<String, Integer> entry : uniWord.entrySet()) {
            if (entry.getValue() >= max) {
                max = entry.getValue();
                maxx = entry.getKey();
            }
        }
        return maxx;
    }
}
