// Program to find particular element of Pascal's Triangle given row number and column number.
import java.util.*;

class psp
{
      public static  int ncr(int n,int r)
     {
              int res=1;
            for(int i=0 ; i<r ; i++)
           {
               res=res*(n-i);
               res=res/(i+1);
           }

            return res;
     }

public static void main(String gg[])
{
        int n=Integer.parseInt(gg[0]);
        int r=Integer.parseInt(gg[1]);

     int m=ncr(n-1,r-1);
     System.out.println(m);
}


}