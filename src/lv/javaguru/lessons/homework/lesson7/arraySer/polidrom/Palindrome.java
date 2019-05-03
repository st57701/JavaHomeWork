package lv.javaguru.lessons.homework.lesson7.arraySer.polidrom;



public class Palindrome {


    public boolean isPalindrome2(String string1) {
        string1 = string1.replaceAll("\\s+", "").toLowerCase();

        char[] word = string1.toCharArray();
        int n = word.length;

        for (int i = 0, j = n - 1; i < n / 2 || j > n - i - 1; i++, j--) {

            if (word[i] != word[j]) {

                return false;
            }
        }

        return true;
    }
}


