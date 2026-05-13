public interface IFoldableOperation {
    double initialValue();
    double combine(double accumulated, double newValue);
}