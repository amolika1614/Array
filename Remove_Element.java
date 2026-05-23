/*Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.*/
import java.util.*;
class RemoveElement
{
  public static int removeElement(int [] nums,int val)
{
        int k=0;

 for(int i=0 ; i<nums.length ; i++)
{
      if(nums[i]!=val)
{       int temp=nums[i];
       nums[i]=nums[k];
       nums[k]=temp;
        k++;
}
}

return k;
}
public static void main(String gg[])
{
      Scanner sc= new Scanner(System.in);
     int n=sc.nextInt();

      int [] arr=new int[n];
      for(int i=0 ; i<n ; i++)
{
       System.out.print("Enter element : ");
       arr[i]=sc.nextInt();
}
 System.out.print("Enter element to be removed : ");
int val=sc.nextInt();

int m=removeElement(arr,val);
System.out.println(m);


}
}