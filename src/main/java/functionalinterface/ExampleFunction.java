package functionalinterface;

import java.util.function.BiFunction;

public class ExampleFunction {
    public static void main(String[] args) {
        System.out.println("Traditional way of incrementing number.");
        System.out.println(incrementByOne(0));

        System.out.println("Incrementing by using Functional Approach.");
        System.out.println(Incrementor.incrementByOneFunction.apply(5));

        System.out.println("Incrementing and then multiplying using Functional Approach and Function chaining method");
        System.out.println(
                Incrementor.incrementByOneFunction
                        .andThen(Multiplier.multiplierFunction)
                        .apply(4)
        );

        System.out.println("Traditional way of increasing a number and multiplying by the passed value");
        System.out.println(increaseByOneAndMultiply(5, 10));

        System.out.println("Increments a passed number by 1 and multiplies by the next parameter.");
        System.out.println(increaseByOneAndMultiplyBiFunction.apply(5, 20));
    }

    static int incrementByOne(int number) {
        return number + 1;
    }

    static int increaseByOneAndMultiply(int numberToIncreaseByOne, int numberToMultiplyBy) {
        return (numberToIncreaseByOne + 1) * numberToMultiplyBy;
    }

    static BiFunction<Integer, Integer, Integer> increaseByOneAndMultiplyBiFunction =
            (numberToIncreaseByOne, numberToMultiplyBy) -> (numberToIncreaseByOne + 1) * numberToMultiplyBy;
}
