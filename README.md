Computer Programming II				   Instructor: Greg Shaw
COP 3337							    	


Programming Assignment #7

(Recursion)


This assignment is to write some methods that perform simple array operations recursively.

For this assignment you will write the bodies for 3 recursive methods of the ArrayRecursion class, available on the class web page in file ArrayRecursionTest.java

You are to make NO other changes to the ArrayRecursion class other than writing the 3 method bodies.  Also make no changes to the test class.

Note that the public methods of ArrayRecursion – reverse(), sort(), and getIndexOfLargest() – cannot be recursive because they have no parameters.  Each of these methods calls a private recursive “helper” method that does the work recursively.  You will write the bodies of these recursive helper methods.

Remember that recursion is not merely another way to implement a loop. Recursive algorithms always have one or more “base” or “trivial” cases that are solved nonrecursively, and each recursive call must be made for a “reduced case” of the problem that gets closer to the trivial case.  Therefore, to receive credit you must implement the algorithms given below.

reverseRecurse - reverse the order of the values stored in the array, using this algorithm:

Swap the first element value with the last. Then, recursively reverse that portion of the array containing all but the first and last elements

recursiveGetIndexOfLargest - return the index of the largest value stored in the array, using this algorithm:

Find the largest value in that portion of the array containing all but the last element.  Compare that value to the value in the last element and return the index of the larger of the two.  

recursiveSort – sort the array in ascending order, using the selection sort algorithm and the recursiveGetIndexOfLargest method you wrote in 2.

Find the largest value in the array and swap it with the last element. Then, repeat the process for that portion of the array containing all but the last element.


Due Date:  Thursday, December 7th

What to Upload

Upload a zip file containing your NetBeans project folder and the output

No credit will be given for any method that uses a loop.  Loops are not necessary and if you use one you are missing the point of the assignment 



