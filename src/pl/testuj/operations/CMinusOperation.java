package pl.testuj.operations;

/**
 * Created by krzysztoffonal on 10/09/16.
 */
public class CMinusOperation extends COperation {
  @Override public double process(double firstArg, double secondArg) {
    return firstArg - secondArg;
  }
}