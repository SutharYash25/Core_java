package collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputInputStream {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos =new FileOutputStream("data.txt");
		String s = "file input output stream";
		byte b[] = s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println("data inserted");
		
		FileInputStream fis = new FileInputStream("data.txt");
		int i;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
	}
}
