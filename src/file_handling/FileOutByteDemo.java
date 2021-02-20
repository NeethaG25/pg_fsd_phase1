package file_handling;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutByteDemo {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos= new FileOutputStream("bytedemo.txt", true);
			bos = new BufferedOutputStream(fos);
			String message = "\nThis message should be written in the file";
			byte b[] = message.getBytes();
			bos.write(b);
			System.out.println("File created successfully");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				bos.flush();
				fos.close();
				bos.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

	}

}
