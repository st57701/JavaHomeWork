package lv.javaguru.lessons.homework.lesson5.tv;

import java.util.Objects;

public class Tv {
    private int currentChannel;
    private int currentVolumeLevel;
    private String manufactured;
    private boolean turnedOn;


    public Tv(int currentChannel, int currentVolumeLevel, String manufactured, boolean turnedOn) {
        this.currentChannel = currentChannel;
        this.currentVolumeLevel = currentVolumeLevel;
        this.manufactured = manufactured;
        this.turnedOn = turnedOn;
    }

    void nextChanel() {
        if (turnedOn) {
            currentChannel++;
        } else {
            System.out.println("Tv is off");
        }

    }

    void previusChanel() {
        if (turnedOn) {
            currentChannel--;
        } else {
            System.out.println("Tv is off");
        }

    }

    void increaseVolume() {
        if (turnedOn) {
            currentVolumeLevel++;
        } else {
            System.out.println("Tv is off");
        }

    }

    void decreaseVolume() {
        if (turnedOn) {
            currentVolumeLevel--;
        } else {
            System.out.println("Tv is off");
        }

    }

    void turnedOn() {
        System.out.println("Tv is On");
        turnedOn = true;
    }

    void turnedOf() {
        System.out.println("Tv is Off");
        turnedOn = false;

    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

    public void setCurrentVolumeLevel(int currentVolumeLevel) {
        this.currentVolumeLevel = currentVolumeLevel;
    }

    public String getManufactured() {
        return manufactured;
    }

    public void setManufactured(String manufactured) {
        this.manufactured = manufactured;
    }


    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    @Override
    public String toString() {
        if (!turnedOn) {
            return "TV - OFF";
        } else
            return "Tv{" +
                    "currentChannel=" + currentChannel +
                    ", currentVolumeLevel=" + currentVolumeLevel +
                    ", manufactured='" + manufactured + '\'' +
                    ", turnedOn=" + turnedOn +
                    '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tv)) return false;
        Tv tv = (Tv) o;
        return currentChannel == tv.currentChannel &&
                currentVolumeLevel == tv.currentVolumeLevel &&
                turnedOn == tv.turnedOn &&
                Objects.equals(manufactured, tv.manufactured);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChannel, currentVolumeLevel, manufactured, turnedOn);
    }

}
