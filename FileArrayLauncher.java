import java.io.IOException;

public class FileArrayLauncher  {

	public static void main(String[] args) throws IOException{
		//creates 2 arrays. 1 empty and 1 with information on it
		int[] array1 = {25, 30, 33};
		int[] array2 = new int[3];
		//holds the binary file name
		String filename = "C:\\Nathan\\nathan.bin";
		//prints out the first array
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + "\n");
		}
		System.out.print("\n\n\n");
		//copies the first array to the file
		FileArray.FileArray(filename, array1);
		//copies the file to the 2nd array
		FileArray.ReadArray(filename, array2);
		//prints out the 2nd array
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + "\n");
		}
	}

}
