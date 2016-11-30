package pl.testuj.operations;

/**
 * Created by krzysztoffonal on 10/09/16.
 */
public class CPercentageOperation extends COperation {
  /*
   * Assumption: for minus secondArg always return 0
   */
  @Override public int process(int firstArg, int secondArg) {
    return firstArg * secondArg / 100;
  }
}
