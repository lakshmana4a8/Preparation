package file.reading.writing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {
	public static void main(String args[]) {
		String dirname = System.getProperty("user.dir") + "/tmp";
		File d = new File(dirname);
		d.mkdirs();
		try {
			FileWriter out = new FileWriter(dirname + "/file.txt");
			for (int x = 0; x < 3; x++) {
				out.write("lakshman " + x + "\n");
			}
			out.close();
		} catch (IOException e) {
			System.out.print("Exception");
		}
		
		try {
			File file = new File(dirname);
			String[] paths = file.list();
			for (String path : paths) {
				System.out.println(path);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
