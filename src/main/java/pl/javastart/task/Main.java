package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Televisor tele1 = new Televisor(false);
        tele1.showStatus();

        tele1.turnOn();
        tele1.showStatus();

        tele1.turnOff();
        tele1.showStatus();
    }
}
