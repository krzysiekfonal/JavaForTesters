package pl.testuj.operations;

/**
 * Created by krzysztoffonal on 10/09/16.
 */
public class CPowerOperation extends COperation {
  @Override public int process(int firstArg, int secondArg) {
    return firstArg * firstArg;
  }
}
