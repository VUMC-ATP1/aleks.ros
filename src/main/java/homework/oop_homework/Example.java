package homework.oop_homework;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Customer customer = new Customer("Alex");
        customer.setMemberCard(true);
        customer.setMemberType("Premium");
        System.out.println(customer);

        Visit customerVisit = new Visit(customer);
        customerVisit.setProductExpenses(7);
        customerVisit.setServiceExpenses(17);
        System.out.println(customerVisit.getTotalExpenses());

        Customer customer1 = new Customer("Nick");
        customer1.setMemberCard(true);
        customer1.setMemberType("Gold");
        System.out.println(customer1);

        Visit customerVisit1 = new Visit(customer1);
        customerVisit1.setProductExpenses(7);
        customerVisit1.setServiceExpenses(17);
        System.out.println(customerVisit1.getTotalExpenses());

        Customer customer2 = new Customer("John");
        customer2.setMemberCard(false);
        customer2.setMemberType("No");
        System.out.println(customer2);

        Visit customerVisit2 = new Visit(customer2);
        customerVisit2.setProductExpenses(7);
        customerVisit2.setServiceExpenses(17);
        System.out.println(customerVisit2.getTotalExpenses());
    }
}