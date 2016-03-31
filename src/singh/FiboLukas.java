package singh;

public class FiboLukas {
	public int lukasRec(int n) {
		if (n < 0) {
			throw new IllegalArgumentException();
		}
		if (n == 0)
			return 2;
		if (n == 1)
			return 1;
		return lukasRec(n - 1) + lukasRec(n - 2);
	}

	static int max = 100;
	static long[] arr = new long[max];

	public static void Array() {
		arr = new long[max + 1];
		fibArr(max);
	}

	public static long fibArr(int n) {

		if (n < 0) {
			throw new IllegalArgumentException();
		}
		long f;
		if (n < 2)
			f = n;
		else if (arr[n] != 0)
			return arr[n];
		else
			f = fibArr(n - 1) + fibArr(n - 2);
		arr[n] = f;
		return f;
	}

	public static void main(String[] args) {
		FiboLukas f = new FiboLukas();

		for (int i = 0; i <= 25; i++)
			System.out.println(i + ":\t" + f.lukasRec(i));
		System.out.println("");

		Array();
		for (int i = 0; i <= max; i++)
			System.out.println(i + " " + arr[i]);
	}
}
