package pl.testuj;

import pl.testuj.menu.CMenu;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        CMenu menu = new CMenu();

        try {
            menu.launchMenu();
        } catch (IOException e) {
            System.out.println("Wrong input! Close program");
        }
    }
}
