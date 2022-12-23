package chapter19;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MyListOuterVar {
    public static void main(String[] args) {
        List<Book> list = Arrays.asList(
            new Book("120", "german", "Janssen", LocalDate.of(2017, 9, 18), 1500),
            new Book("310", "japanese", "田中宏", LocalDate.of(2018,3,5), 5500),
            new Book("400", "english", "Alcott", LocalDate.of(2018, 2, 11), 4500),
            new Book("100", "japanese", "森下花", LocalDate.of(2018, 1, 20), 2200),
            new Book("410", "english", "Hunter", LocalDate.of(2017, 12, 1), 5500)
        );
        Book ref = new Book("010", "japanese", "森下花", LocalDate.of(2016, 2, 11), 2800);

        listup(list, ref::isSameAuthor);
    }

    public static void listup(List<Book> list, Predicate<Book> p) {
        for (Book book: list) {
            if (p.test(book)) {
                System.out.println(book);
            }
        }
    }
}
