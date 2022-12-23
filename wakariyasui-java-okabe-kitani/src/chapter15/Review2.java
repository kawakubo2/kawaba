package chapter15;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Review2 {
	public static void main(String[] args) {
		Path path = Paths.get("mydata.txt");
		try (PrintWriter out = new PrintWriter(Files.newBufferedWriter(path));) {
			out.print(3001 + "\t");
			out.print("山田隆二" + "\t");
			out.println("70.2");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
