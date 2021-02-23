package serialization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.imageio.stream.FileImageOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		CreditCard cc = new CreditCard(1234567890123456L, "Neetha G","Master", 134);
		try(FileOutputStream fis =  new FileOutputStream("serialize.txt");
				ObjectOutputStream bis = new ObjectOutputStream(fis);) {
				bis.writeObject(cc);
			
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
