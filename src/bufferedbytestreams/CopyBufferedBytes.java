package bufferedbytestreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBufferedBytes {
	public static void main(String[] args) throws IOException {
		BufferedInputStream inputStream = null;
		BufferedOutputStream outputStream = null;
		
		try {
			inputStream = new BufferedInputStream(new FileInputStream("xanadu.txt"));
			outputStream = new BufferedOutputStream(new FileOutputStream("bufferedoutagain.txt"));
			
			int c;
			
			while((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		} finally {
			if(inputStream != null) {
				inputStream.close();
			}
			
			if(outputStream != null) {
				outputStream.close();
			}
		}
	}
}
