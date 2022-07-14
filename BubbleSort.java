public class BubbleSort {
    static void print(int a[])
    {
        int n = a.length;
        int i;
        for (i =0;i<n;i++)
        {
            System.out.print(a[i] + " ");
        }
    }

    static void bubbleSort(int a[])
    {
        int n = a.length;
        int i,j,temp;

        for (i =0;i<n;i++)
        {
            for (j =0;j<n;j++)
            {
                if (a[j]< a[i])
                {
                    temp = a[i];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

    public static void main(String args[])
    {
        int a[] = {12,23,43,1,2,45,21,45};
        BubbleSort b1 = new BubbleSort();
        System.out.println("Array without sorting");
        b1.print(a);
        b1.bubbleSort(a);
        System.out.println();
        System.out.println("Array after sorting");
        b1.print(a);
    }
}
