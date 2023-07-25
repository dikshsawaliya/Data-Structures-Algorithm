public class BubbleSort {
	
    public static void print(int a[])  //function to print the algo
    {
        int n = a.length;
        int i;
        for (i =0;i<n;i++)
        {
            System.out.print(a[i] + " ");
        }
    }

    static void bubbleSort(int a[]) //driver code for bubble sort algo
    {
        int n = a.length;
        int i,j,temp;

        for (i =0;i<n;i++)  //first loop for the array index of i
        {
            for (j =0;j<n;j++)  //second loop for the array index of j
            {
                if (a[j]< a[i]) //condition to check if the next number is smaller than the previous one
                {
                    temp = a[i];    // temp is a temporary variable used here to shift the places of the arrays
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

    public static void main(String args[])
    {
        int a[] = {12,23,43,1,2,45,21,45};  //initialising the array
        BubbleSort b1 = new BubbleSort();
        System.out.println("Array without sorting");    //printing the array without sorting
        b1.print(a);    //printing the non-sorted array
        b1.bubbleSort(a);   //sorting the array
        System.out.println();   //blank line
        System.out.println("Array after sorting");  //printing the sorted array
        b1.print(a);
    }
}
