package BinaryFunction;

@FunctionalInterface
public interface BinaryFunction<T, U, R> {
    R apply(T val, U val1);
}
