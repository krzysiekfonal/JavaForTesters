package pl.testuj.operations;

/**
 * Created by krzysztoffonal on 10/09/16.
 */
public class CModuloOperation extends COperation {
  @Override public double process(double firstArg, double secondArg) {
    double r = firstArg;

    while (r>=secondArg)
    {
      r = r - secondArg;
    }

    return r;
  }
}
