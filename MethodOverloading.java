package assignment;

public class MethodOverloading {

	private static final int INT_MAX = 0;

	public static void main(String[] args) {		// TODO Auto-generated method stud
  int arr[] = null ;
  int arr_size = 10;
		
		    int i, first, second;
		 
		    /* There should be atleast two elements */
		    if (arr_size< 2)
		    {
		        System.out.println(" Invalid Input ");
		        return;
		    }
		 
		    first = second = INT_MAX;
		    for (i = 0; i < arr_size ; i ++)
		    {
		        /* If current element is smaller than first 
		           then update both first and second */
		        if (arr[i] < first)
		        {
		            second = first;
		            first = arr[i];
		        }
		 
		        /* If arr[i] is in between first and second 
		           then update second  */
		        else if (arr[i] < second && arr[i] != first)
		            second = arr[i];
		    }
		    if (second == INT_MAX)
		        System.out.println("There is no second smallest element\n");
		    else{
		        System.out.println("The smallest element is %d and second " );
		      System.out.println ("Smallest element is %d\n"+ first+ second);
		    }}}

