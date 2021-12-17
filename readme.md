# Given an array of integers {4, 1, 2, 3, 5}
# How can you sort this  array?
# Bubble sort
#Time Complexity: O(n^2) worst case

int temp = arr[j];
arr[j] = arr[j] + arr[j+1]; 
arr[j+1] = arr[j] - arr[j+1];
arr[j] = arr[j] - arr[j+1];

##
a = 5;
b = 7;
a = a+b; 5+7 => 12
b = a-b; 12-7 => 5
a = a-b; 12-5 => 7

##
a = 7; 111
b = 5; 101	 
a = a ^ b; 111 ^ 101 => 010 => 2
b = a ^ b; 010 ^ 101 => 111 => 7
a = a ^ b; 010 ^ 111 => 101 => 5


## Recursion
# Method calling itself
# Base Case:  Ends recursion
# Recursive call

...
	public static int sum(int target) {
		if ( target <= 0) 
			return 0;
		else
			return target + sum(target - 1);
	}
...

(5 + (4 + (3 + (2 + (1 + (0))))))
(5 + (4 + (3 + (2 + (1)))))
(5 + (4 + (3 + (3))))
(5 + (4 + (6)))
(5 + (10))
(15)

## Fibonacci
f(1) = 1
f(n) = f(n-1) + f(m-2)

0 1 2 3 5 8 13 21...


