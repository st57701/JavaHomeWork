package lv.javaguru.lessons.homework.lesson9.UniqueWordVocabulary.Test.Exercise2;

public class MapTest {
    public static void main(String[] args) {
        UniqueWordCounter firstTestUni = new UniqueWordCounter();

        firstTestUni.addWords("Apple",1);
        firstTestUni.addWords("",1);
        firstTestUni.addWords("mango",1);
        firstTestUni.addWords("mango",1);
        firstTestUni.addWords("Apple",1);
        firstTestUni.addWords("Apple",1);
        firstTestUni.printMap();
        System.out.println(firstTestUni.moreRepeats());

    }
}
