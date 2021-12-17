
public class RecursionCh12 {

	public static int sum(int target) {
		if ( target <= 0) 
			return 0;
		else
			return target + sum(target - 1);
	}
	
	
	public static int fib(int n) {
		if (n <= 1)
			return n;
		else 
			return (fib(n-1)  + fib(n-2));
	}
	
	
	public static void main(String[] args)  {
		int n =  5;
		int result = sum(n);
		System.out.println(result);
		System.out.print(fib(6));
	}
	//Write a recursive method that will calculate the product of all numbers from 1 up to a target
}
