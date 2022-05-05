package pl.javastart.task;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Televisor {
    boolean televisor;

    public Televisor(boolean televisor) {
        this.televisor = televisor;
    }

    void turnOn() {
        televisor = true;
    }

    void turnOff() {
        televisor = false;
    }

    void showStatus() {
        System.out.println(televisor);
    }

}
