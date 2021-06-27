package functionalinterface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        System.out.println("Traditional way without predicate");
        System.out.println(isMobileNumberValid("9860706065"));
        System.out.println(isMobileNumberValid("986070606"));

        System.out.println("Using predicate for boolean validation");
        System.out.println(isMobileNumberValidUsingPredicate.test("985321353"));
        System.out.println(isMobileNumberValidUsingPredicate.test("9846772847"));

        System.out.println("Chaining predicates for validation.");
        System.out.println("Is phone number valid for 9860706065: "
                + isMobileNumberValidUsingPredicate
                .and(startsWith98).test("9860706065"));

        System.out.println("Is phone number valid for 1234567890: "
                + isMobileNumberValidUsingPredicate
                .and(startsWith98).test("1234567890"));
    }

    static boolean isMobileNumberValid(String mobileNumber) {
        return (mobileNumber.length() == 10);
    }

    static Predicate<String> isMobileNumberValidUsingPredicate =
            mobileNumber -> mobileNumber.length() == 10;

    static Predicate<String> startsWith98 = mobileNumber -> mobileNumber.startsWith("98");
}
