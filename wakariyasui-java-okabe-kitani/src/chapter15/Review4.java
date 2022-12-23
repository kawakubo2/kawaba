package chapter15;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Review4 {
	public static void main(String[] args) {
		Path path = Paths.get("mydata.txt");
		try (Scanner in = new Scanner(path);) {
			//in.useDelimiter("\t");
			while (in.hasNext()) {
				System.out.printf("|%d|\t|%s|\t|%f|\n", in.nextInt(), in.next(), in.nextDouble());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
