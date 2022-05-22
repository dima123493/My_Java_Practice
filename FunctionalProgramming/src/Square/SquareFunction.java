package Square;

import java.util.function.BiFunction;

public class SquareFunction {
    static BiFunction<Integer, Integer, Integer> function = (a, b) -> {
        return Math.min(a, b);
    };
    int result = applyFunctionAndDouble(200, new Function() {//passing a function represented as an anonymous class
        @Override
        public Integer apply(Integer n) {
            return n * 3;// 1. multiply by 3
        }
    });

    public static void main(String[] args) {

        Function squareFunction = new Function() {
            @Override
            public Integer apply(Integer number) {
                return number * number;
            }
        };

        System.out.println(squareFunction.apply(10)); // 100
        System.out.println(squareFunction.apply(20)); // 400
    }

    public static int applyFunctionAndDouble(int n, Function f) {
        return f.apply(n) * 2;// 2. multiply by 2
    }

}
