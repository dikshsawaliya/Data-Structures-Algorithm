public class InsertionSort {

    //need to make 3 methods
    //1 for inset function
    //2 for print function
    //3 for main function

    void insert (int a[])
    {
        int i,j,temp; //initialise i,j and temp as int variables
        int n =  a.length;  // to find the length of an array
        for (i=0;i<n;i++) //running a for loop for array indexes in i anf then breaking it with the condition of i<n that is the current value if the index
        {
            temp = a[i]; //temp is created to fix it in the array of index i
            j = i - 1;  //then index of the array i.e, j is sent one index back

            while (j>=0 && temp<=a[j])   // we run the while loop for 1. j is at the beginning of the array 2. it reached to the current index
            {
                a[j+1] =a[j]; //we are shifting the left index to the right index by adding 1 to the index of the array
                j=j-1; // then we decrement the value of j by 1 so that it keeps moving toward the left of the array
            }
            a[j+1] = temp; //then finally the removed index piece will be settled to the before temp
        }
    }

    void printArr(int arr[] ) //function to print the arrays
    {
        int i;
        int n = arr.length;
        for (i=0;i<n;i++)       //for loop to print the arrays
        {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main (String[]args)
    {
        int arr[] = {12,23,34,43,1,23,122};
        InsertionSort i1 = new InsertionSort();
        System.out.println("\n Before sorting indexes are - ");
        i1.printArr(arr);   //print the arrays before running the method
        i1.insert(arr);     //running the method to sort the method
        System.out.println("\n After sorting the indexes are - ");
        i1.printArr(arr);   //print the arrays after running the method
        System.out.println();
    }
    
}
