import java.util.*;
class Solution {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> ans=new ArrayList<>();
        
        long res=1;
        ans.add((int)res);
        for(int i=1 ; i<rowIndex+1 ; i++)
        {
             res=res*(rowIndex+1-i);
             res=res/(i);
             ans.add((int)res);
        }

        return ans;

        
    }

public static void main(String gg[])
{
     System.out.print("Enter row number :");
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();

   List<Integer> ans=new ArrayList<>();
ans=getRow(n);

System.out.println(ans);

}
}