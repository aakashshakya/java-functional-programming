package functionalinterface;

import java.util.function.Function;

public interface Incrementor {
    Function<Integer, Integer> incrementByOneFunction = number -> ++number;
}
