package DAY_1.Assignment1;

public class Reverse_Array
{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6,7,8};
        int left= 0;
        int right=arr.length-1;
        System.out.println(right);

        while(left<right)
        {
           int temp=arr[left];
           arr[left]=arr[right];
           arr[right]=temp;
           left++;
           right--;
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

}
