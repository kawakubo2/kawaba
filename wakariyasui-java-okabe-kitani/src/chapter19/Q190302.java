package chapter19;

import java.time.LocalDate;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

record Member(int id, String name) {}

public class Q190302 {
    public static void main(String[] args) {
        System.out.println(methodA(String::length, "わかりやすいJava"));
        System.out.println(methodB(Book::getAuthor, new Book("2345", "japanese", "山田太郎", LocalDate.of(2022, 12, 23), 5000)));
        System.out.println(methodC(Member::id, new Member(12345, "猫山五郎")));
        System.out.println(methodD(String::charAt, "Scrum Boot Camp", 6));
    }
    public static int methodA(ToIntFunction<String> tif, String str) {
        return tif.applyAsInt(str);
    }
    public static String methodB(Function<Book, String> f, Book book) {
        return f.apply(book);
    }
    public static int methodC(ToIntFunction<Member> tif, Member m) {
        return tif.applyAsInt(m);
    }
    public static Character methodD(BiFunction<String, Integer, Character> bf, String str, int index) {
        return bf.apply(str, index);
    }
}
