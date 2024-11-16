package task;

public class Ram {
    void ra() {
        System.out.println("Not enough ram to run Google Chrome");
    }

    static class Usb {
        void us() {
            System.out.println("You can not expand your ram with an usb card");
        }
    }

    public static void main(String[] args) {
        Ram ra = new Ram();
        Ram.Usb us = new Ram.Usb();

        ra.ra();
        us.us();
    }
}
