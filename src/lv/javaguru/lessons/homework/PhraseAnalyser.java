package lv.javaguru.lessons.homework;

public class PhraseAnalyser {
    public String analyse(String text) {
        String firsWord = "Make";
        String lastWord = "great again";


        if ((text.startsWith(firsWord)) && (text.endsWith(lastWord))) {
            text = "It stands no chance..";

        } else if (text.startsWith(firsWord) || (text.endsWith(lastWord))) {
            text = "It could be worse";

        } else {
            text = "It is fine, really";

        }
        System.out.println(text);
        return text;
    }
}
