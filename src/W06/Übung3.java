package W06;
public class Übung3
{
    public static void rotateLeft(int array[], int d, int n)
    {
        for (int i = 0; i < d; i++)
            rotateArrayByOne(array, n);
    }
    public static void rotateArrayByOne(int array[], int n)
    {
        int i, temp;
        temp = array[0];
        for (i = 0; i < n - 1; i++)
            array[i] = array[i + 1];
        array[i] = temp;
    }
    public static void main(String args[])
    {
        int array[] = {5,9,6,10,12,7,3,5,4,2};
        int r = 1;
        int n = array.length;
        rotateLeft(array, r, n);
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(array[i]);
        }
    }
}