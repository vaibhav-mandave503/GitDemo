package DigitalOcean;

import java.io.FileNotFoundException;
import java.io.FileInputStream;

public class TryCatchDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("test.txt");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			// java.io.FileNotFoundException: test.txt (The system cannot find the file specified)
		}

	}

}
