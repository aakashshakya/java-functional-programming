package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        System.out.println("Using traditional way.");
        greetCustomer(new Customer("Aakash Raj Shakya", "9851320011"));
        System.out.println("Using Consumer(Functional Interface) for printing data");
        greetCustomerConsumer.accept(new Customer("Rojika Rai", "9860450711"));

        System.out.println("Using BiConsumer(Functional Interface) for printing data.");
        greetCustomerBiConsumer.accept(new Customer("Sirshak Bogati", "9846772938"), true);
        greetCustomerBiConsumer.accept(new Customer("Faraaz Khan", "9841298940"), false);

    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName
            + ", thanks for registering phone number:: "
            + customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName
                    + (showPhoneNumber ? ", thanks for registering phone number:: "
                    + customer.customerPhoneNumber : ""));

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName
                + ", thanks for registering phone number:: "
                + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
