package lab1.concordence;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class ConcordenceSetup {
	
	public ConcordenceSetup() {
		setup();
	}
	
	private void setup() {
		
		File inputFile = new File("home/safir/labb1/ut");
		
		BufferedReader br = new BufferedReader(new FileReader(inputFile));
		
		while(!EOF(br)) {
			Byte testByte = br.read();
		}
		
	}
	
	private boolean EOF(BufferedReader br) {
		if(br.readLine() == null) {
			return true;
		} else {
			return false;
		}
	}
}
