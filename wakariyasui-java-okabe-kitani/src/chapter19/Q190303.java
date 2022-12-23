package chapter19;

import java.util.function.Predicate;

public class Q190303 {
    private static class Checker {
        boolean check(String str) {
            return str.length() > 5;
        }
    }

    public static void main(String[] args) {
        // A
        String msg = "Hello";
        Predicate<String> p = msg::equals;
        String msg2 = "Hello, World";
        System.out.println(p.test(msg2.substring(0, 5)));

        // B
        Checker ck = new Checker(); 
        Predicate<String> p2 = ck::check;
        System.out.println(p2.test("独習Python"));
    }
}
