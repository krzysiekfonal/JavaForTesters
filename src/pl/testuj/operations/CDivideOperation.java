package pl.testuj.operations;

/**
 * Created by krzysztoffonal on 10/09/16.
 */
public class CDivideOperation extends COperation {
  /*
   * Assumption: Choose scenario for minus args - if you want to calculate it properly
   * or always return 0
   */
  @Override public int process(int firstArg, int secondArg) {
    int r = firstArg;
    int n = 1;

    while (r >= secondArg)
      r = r - secondArg;
    n += 1;

    return n;
  }
}
