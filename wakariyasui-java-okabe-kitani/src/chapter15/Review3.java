package chapter15;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Review3 {
	public static void main(String[] args) {
		Path path = Paths.get("mydata.txt");
		try (PrintWriter out = new PrintWriter(Files.newBufferedWriter(path, StandardOpenOption.APPEND));) {
			out.print(3002 + "\t");
			out.print("鈴木一郎" + "\t");
			out.println(82.6);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
