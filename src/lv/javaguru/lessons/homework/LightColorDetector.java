package lv.javaguru.lessons.homework;

public class LightColorDetector {
    public String detect(int wavelength) {
        if (wavelength >= 380 && wavelength <= 449) {
            System.out.println("Violet");
            return "Violet";
        } else if (wavelength >= 450 && wavelength <= 494) {
            System.out.println("blue");
            return "blue";
        } else if (wavelength >= 495 && wavelength <= 569) {
            System.out.println("green");
            return "green";
        } else if (wavelength >= 570 && wavelength <= 589) {
            System.out.println("yellow");
            return "yellow";
        } else if (wavelength >= 590 && wavelength <= 619) {
            System.out.println(" orange");
            return "orange";
        } else if (wavelength >= 620 && wavelength <= 750) {
            System.out.println("Red");
            return "Red";
        } else {
            System.out.println("Not in color range");
        }
        return "Not in color range";
    }


}

