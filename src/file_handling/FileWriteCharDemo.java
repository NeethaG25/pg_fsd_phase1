package file_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteCharDemo {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("chardemo.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);){
			bw.write("Hello from me");
			bw.newLine();
			bw.write("How are you?");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
