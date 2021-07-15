import java.math.*;

public class finalVar {
	
	final int speedlimit = 90;
	
}

class something {
	
	public static void main (String[] args) {
		finalVar fv = new finalVar();
		
		//you can't change the value of a final variable
		fv.speedlimit = 30;
	}
}