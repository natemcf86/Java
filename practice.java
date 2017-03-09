
public class practice {
public static void rest(int num){
	try {
	    Thread.sleep(num);                
	} catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	}
}
}
