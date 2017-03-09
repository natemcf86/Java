
import java.io.*;         

public class FileEncryption
  {
  public static void main(String [] args) throws IOException{ 
      int[] numbers = { 2, 4, 6, 8, 10, 12, 14 };
      FileOutputStream fstream = new FileOutputStream("C:\\Nathan\\encrypt.dat");
      DataOutputStream outputFile = new DataOutputStream(fstream); 
      for (int i = 0; i < numbers.length; i++) {
            outputFile.writeInt(numbers[i]+10);
      }

      outputFile.close();
    }
}   
