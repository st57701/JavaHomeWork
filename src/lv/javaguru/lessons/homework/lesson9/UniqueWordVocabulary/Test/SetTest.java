package lv.javaguru.lessons.homework.lesson9.UniqueWordVocabulary.Test;

public class SetTest {
    public static void main(String[] args) {
        UniqueWordsVocabular firstSett= new UniqueWordsVocabular();
        firstSett.addWord("Dima");
        firstSett.addWord("Denis");
        firstSett.addWord("");
        firstSett.addWord("Dima");
        System.out.println(firstSett.getUniqueWords());
        firstSett.printToConsole();
    }
}
