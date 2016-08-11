package file.reading.writing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	private void bufferReader(){
		try(BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\src\\file\\reading\\writing\\file.txt"))){
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void inputStream(){
		File file = new File(System.getProperty("user.dir")+"\\src\\file\\reading\\writing\\file.txt");
		try (FileInputStream fis = new FileInputStream(file)) {
			System.out.println("Total file size to read (in bytes) : "+ fis.available());
			int content;
			while ((content = fis.read()) != -1) {
				System.out.print((char) content);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Reader reader = new Reader();
		reader.bufferReader();
		reader.inputStream();
	}
}
