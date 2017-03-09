
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileArray {

	public FileArray() {
		
	}
	/**
	 * static method that takes the name of the file and an array and writes
	 * the array to the file
	 * @param name
	 * @param array
	 * @throws IOException
	 */
	public static void FileArray(String name, int[] array) throws IOException {

		FileOutputStream file = new FileOutputStream(name);
		DataOutputStream outputFile = new DataOutputStream(file);
		
		for(int i = 0; i < array.length; i++)
		{
			outputFile.writeInt(array[i]);
		}
		
		outputFile.close();
	}
	/**
	 * static method that takes the name of the file and an array and reads the
	 * file to the array 
	 * @param name
	 * @param array
	 * @throws IOException
	 */
	public static void ReadArray(String name, int[] array) throws IOException{
		FileInputStream file = new FileInputStream(name);
		DataInputStream inputFile = new DataInputStream(file);
		
		for(int i = 0; i < array.length; i++)
		{
			array[i] = inputFile.readInt();
		}
		
		inputFile.close();
	}

}
