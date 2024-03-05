package Recursion;

public class PrintHelloNTimesRecursively {

	public static void main(String[] args) {
		int n=5;
		print(0,n);
	}

	private static void print(int i, int n) {
		if(i==n)
			return;
		System.out.println("hello");
		print(i+=1,n);
	}

}
