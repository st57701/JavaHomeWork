package lv.javaguru.lessons.homework.lesson7.arraySer.polidrom;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromTestTest {
    private Palindrome victim;
    private PalindromTestTest victim2;
    @BeforeEach
    public void setUP() {
     victim = new Palindrome();


    }
    @Test
    public void testPalindrome() {
        setUP();


        boolean result = victim.isPalindrome2("abba");
        assertEquals(true, result);

    }

    @Test
    void testPalindrome2() {
        setUP();
        boolean result = victim.isPalindrome2("А роза упала на лапу Азора");
        assertEquals(true, result);
    }

    @Test
    void testPalindrome3() {
        setUP();
        boolean result = victim.isPalindrome2("апу АзА роза упала на лор");
        assertEquals(false, result);
    }
}