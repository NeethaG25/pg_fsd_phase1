package file_handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadNewDemo {

	public static void main(String[] args) {
		try(FileReader fr = new FileReader("chardemo.txt");
				BufferedReader br = new BufferedReader(fr);){
			String s = null;
			while((s=br.readLine())!=null){
				System.out.println(s);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
