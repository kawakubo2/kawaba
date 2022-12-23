package chapter19;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

record Member(int id, String name) implements Comparable<Member> {
    @Override
    public int compareTo(Member other) {
        return Integer.compare(id, other.id);
    }
}

public class Q190301 {

	public static void main(String[] args) {
        // A
		methodA(System.out::println, "abc");

        // B
        System.out.println(methodB(Math::pow, 2.0, 10.0));

        // C
        List<Member> members = Arrays.asList(
            new Member(201, "山田太郎"),
            new Member(198, "田中宏"),
            new Member(109, "星山裕子"),
            new Member(135, "佐藤勝男")
        );
        // Consumer<List<Member>> con1 = Collections::sort;
        // con1.accept(members);
        // members.forEach(e -> System.out.print(e + " "));
        // System.out.println();
        methodC(Collections::sort, members);
        members.forEach(e -> System.out.print(e + " "));
        System.out.println();

        methodC(Collections::shuffle, members);
        members.forEach(e -> System.out.print(e + " "));
        System.out.println();
	}
	public static void methodA(Consumer<String> s, String str) {
		s.accept(str);
	}
    public static double methodB(BinaryOperator<Double> bo, double a, double b) {
        return bo.apply(a, b);
    }
	public static void methodC(Consumer<List<Member>> u, List<Member> members) {
		u.accept(members);
	}
}