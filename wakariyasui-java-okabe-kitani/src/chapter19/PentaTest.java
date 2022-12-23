package chapter19;

import java.time.LocalDate;

public class PentaTest {
    public static void main(String[] args) {
        PentaFunction<String, String, String, LocalDate, Integer, Book> penta = Book::new;
        Book book = penta.applyPenta("A103", "japanese", "田中宏", LocalDate.of(2022, 12, 23), 2500);
        System.out.println(book);

    }
}
