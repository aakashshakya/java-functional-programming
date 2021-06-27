package functionalinterface;

import java.util.function.Function;

public interface Multiplier {
    Function<Integer, Integer> multiplierFunction = number -> number * 10;
}
