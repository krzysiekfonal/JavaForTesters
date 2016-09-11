package pl.testuj.operations;

/**
 * Created by krzysztoffonal on 10/09/16.
 */
public class CPercentageOperation extends COperation {
  @Override public double process(double firstArg, double secondArg) {
    double factor = secondArg / 100;
    return firstArg * factor;
  }
}
