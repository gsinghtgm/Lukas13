package singh;
import static org.junit.Assert.*;

import org.junit.Test;
public class Check1 {
	double a=(1+(Math.sqrt(5)))/2;
	double b=(1-(Math.sqrt(5)))/2;
	@Test
	public void test1() {
		FiboLukas f= new FiboLukas();
		int f1=f.lukasRec(10);
		double l=(Math.pow(a, 10))+(Math.pow(b, 10));
		 assertSame(f1, l);
	}
	@Test
	public void test2() {
		FiboLukas f= new FiboLukas();
		double f1=f.lukasRec(19);
		double l=(Math.pow(a, 19))+(Math.pow(b, 19));
		 assertSame(f1, l);
	}
}
