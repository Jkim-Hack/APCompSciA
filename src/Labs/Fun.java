package Labs;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.*;

public class Fun {

	
	public static String fToC(double value) {
		double e = ((double)5/9)*(value - 32);
		DecimalFormat df = new DecimalFormat("##.##");
		String s = df.format(e);
		return s;
		
	}
	public static String cToF(double value) {
		double e = ((double)(9/5)*value) + 32;
		String s = null;
		DecimalFormat df = new DecimalFormat("##.##");
		s = df.format(e);
		return s;
	}
	public static String VoloS(double value) {
		double e = ((double)4/3)*Math.PI*(Math.pow(value, 3));
		String s = null;
		DecimalFormat df = new DecimalFormat("##.##");
		s = df.format(e);
		return s;
	}
	public static String Pythag(double val, double bal) {
		double e = (double)Math.sqrt((double)Math.pow(val, 2) + (double)Math.pow(bal, 2));
		String s = null;
		DecimalFormat df = new DecimalFormat("##.##");
		s = df.format(e);
		return s;
	}
	public static void main(String[] args) {
		System.out.println("F to C " + fToC(212));
		System.out.println("C to F " + cToF(-15));
		System.out.println("Volume of Sphere " + VoloS(1.0));
		System.out.println("Pythag " + Pythag(3.0, 4.0));
		
	}
	
}
