package chapter15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class OStreamExample {
	public static void main(String[] args) {
		String path = "ostream.dat";

		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(path)));) {
			out.writeInt(12345);
			out.writeUTF("文字列abc");
			out.writeObject(LocalDate.now());
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(path)));) {
			int number = in.readInt();
			String str = in.readUTF();
			LocalDate date = (LocalDate)in.readObject();

			System.out.println(number + "\t" + str + "\t" + date.toEpochDay());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
