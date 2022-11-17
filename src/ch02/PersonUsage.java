package ch02;

import ch02.person.Person;

/* Java */

public class PersonUsage {
    public static void main(String[] args) {
        int i = 1;
        switch (i) {
            case 1:
                System.out.println("case1");
                break;
            case 2:
                System.out.println("case2");
                break;
            default:
                System.out.println("case default");
        }

        return;
    }
}
