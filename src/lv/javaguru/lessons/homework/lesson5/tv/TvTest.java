package lv.javaguru.lessons.homework.lesson5.tv;

public class TvTest {
    public static void main(String[] args) {
        Tv tv1 = new Tv(1, 2, "Philips", true);
        System.out.println(tv1);
        tv1.increaseVolume();
        System.out.println(tv1);
        tv1.nextChanel();
        System.out.println(tv1);
        tv1.turnedOf();
        System.out.println(tv1);
        tv1.increaseVolume();
        System.out.println(tv1);
        tv1.turnedOn();
        System.out.println(tv1);
        tv1.decreaseVolume();
        System.out.println(tv1);

        System.out.println(tv1.equals(tv1));
        Tv tv2 = new Tv(15,15,"Sony",true);
        tv2.previusChanel();
        System.out.println(tv2);
        System.out.println(tv1.equals(tv2));

    }
}
