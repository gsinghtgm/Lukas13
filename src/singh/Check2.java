package singh;
import static org.junit.Assert.*;

import org.junit.Test;
public class Check2 {
	@Test
	public void test1() {
		FiboLukas f= new FiboLukas();
		double f1=2*Math.pow(f.fibArr(10+1),2)-Math.pow(f.fibArr(10),2)+2*Math.pow(f.fibArr(10-1),2);
		double f2=25*Math.pow(f.fibArr(10),2);
		 assertSame(f1, f2);
	}
	@Test
	public void test2() {
		FiboLukas f= new FiboLukas();
		double f1=2*Math.pow(f.fibArr(19+1),2)-Math.pow(f.fibArr(19),2)+2*Math.pow(f.fibArr(19-1),2);
		double f2=25*Math.pow(f.fibArr(19),2);
		 assertSame(f1, f2);
	}
}
