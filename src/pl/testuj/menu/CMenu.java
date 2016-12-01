package pl.testuj.menu;

import pl.testuj.operations.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by krzysztoffonal on 11/09/16.
 */
public class CMenu {
  private ArrayList<CMenuItem> items;

  public CMenu() {
    items = new ArrayList<>();
    items.add(new CMenuItem("Type 2 numbers(separated with space) to add:", new CAddOperation()));
    items.add(new CMenuItem("Type 2 numbers(separated with space) to minus:", new CMinusOperation()));
    items.add(new CMenuItem("Type 2 numbers(separated with space) to multiply:", new CMultiplyOperation()));
    items.add(new CMenuItem("Type 2 numbers(separated with space) to divide:", new CDivideOperation()));
    items.add(new CMenuItem("Type 2 numbers(separated with space) to modulo:", new CModuloOperation()));
    items.add(new CMenuItem("Type 2 numbers(separated with space) to calculate percent, 1-number, 2-percent:",
        new CPercentageOperation()));
    items.add(new CMenuItem("Type 2 numbers(separated with space) to power them, 1-number to power, 2-level of power:",
        new CPowerOperation()));
  }

  public void launchMenu() throws IOException {
    boolean quit = false;
    BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

    do{
      //show main menu
      showMainMenu();

      //get input from user
      int choice = Integer.parseInt(scanner.readLine());

      //if input is 0 then quit, otherwise do rest
      if (choice == 0) {
        quit = true;
      } else {
        //show prompt from selected item
        if (choice > items.size()) {
          throw new NotImplementedException();
        }

        CMenuItem selectedItem = items.get(choice - 1);
        System.out.println(selectedItem.getItemPrompt());

        //read numbers from user
        String input = scanner.readLine();

        //process and present result
        System.out.println(selectedItem.doItemAction(input));

        //Ask enter to back main menu
        System.out.println("Enter to back to main menu");
        scanner.readLine();
      }
    } while (!quit);
  }

  private void showMainMenu() {
    System.out.println("Choose operation:\n"
        + "1. Add\n"
        + "2. Minus\n"
        + "3. Multiply\n"
        + "4. Divide\n"
        + "5. Modulo\n"
        + "6. Percentage\n"
        + "7. Power\n"
        + "8. Minimum\n"
        + "9. Cut number\n"
        + "0 - to quit");
  }
}
