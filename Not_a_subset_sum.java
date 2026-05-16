/*Given a array arr[] of positive integers, find the smallest positive integer such that it cannot be represented as the sum of elements of any subset of the given array set.*/
import java.util.*;
class solution
{
    public static int findSmallest(int [] arr)
{
     Arrays.sort(arr);
     long res=1;

           for(int num : arr)
     {
                      if(num>res)
              {
                     break;
              }

           res+=num;
     }

  return (int) res;
}

public static void main(String gg[])
{
     int [] arr={3,1,2};

  int n= findSmallest(arr);
 System.out.println(n);
}
}