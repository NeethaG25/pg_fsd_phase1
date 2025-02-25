package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeDemo {

	public static void main(String[] args) {
		try(FileInputStream fis =  new FileInputStream("serialize.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			CreditCard cc = (CreditCard) ois.readObject();
			System.out.println(cc);
			
		}catch(IOException e) {
			System.out.println(e);
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}

	}

}
