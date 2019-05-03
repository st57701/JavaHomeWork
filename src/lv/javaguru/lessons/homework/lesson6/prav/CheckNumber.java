package lv.javaguru.lessons.homework.lesson6;

public class CheckNumber {
    public boolean checkM(int num){
        for ( int i=2; i < num; i++) {
            if ( num%i == 0) {
                //System.out.println("This number is not simple!!!");
                return false;
            }
        }
        //System.out.println("Very well! It's simple!");
        return true;
    }
}

