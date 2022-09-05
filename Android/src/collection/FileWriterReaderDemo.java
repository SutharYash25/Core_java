package collection;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fr= new FileWriter("data1.txt");
		String s = "file input output stream";
		fr.write(s);
		fr.flush();
		fr.close();
		System.out.println("data inserted");
		
		FileReader f = new FileReader("data1.txt");
		int i;
		while((i=f.read())!=-1) {
			System.out.print((char)i);
		}
	}
}
