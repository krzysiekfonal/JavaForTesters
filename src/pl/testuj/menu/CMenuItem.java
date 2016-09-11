package pl.testuj.menu;

import pl.testuj.operations.COperation;

/**
 * Created by krzysztoffonal on 11/09/16.
 */
public class CMenuItem {
  private String prompt;
  private COperation operation;

  public CMenuItem(String prompt, COperation operation) {
    this.prompt = prompt;
    this.operation = operation;
  }

  public String getItemPrompt() {
    return prompt;
  }

  public String doItemAction(String input) {
    double[] numbers = parseInput(input);

    return String.valueOf(operation.process(numbers[0], numbers[1]));
  }

  private double[] parseInput(String input) {
    String[] elements =  input.split(" ");
    double[] result = new double[elements.length];

    for (int i = 0; i < elements.length; i++) {
      result[i] = Double.parseDouble(elements[i]);
    }

    return result;
  }
}
