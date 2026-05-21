import java.util.*;
class LongestCommonPrefix
{
    public static String prefix(String [] strs)
    {
         StringBuilder ans=new StringBuilder();
         Arrays.sort(strs);
         String first=strs[0];
         String last=strs[strs.length-1];
         for(int i=0 ; i<Math.min(first.length(),last.length()) ; i++)
         {
               if(first.charAt(i)!=last.charAt(i))
               {
                        return ans.toString();
                }
              ans.append(first.charAt(i));
         }

      return ans.toString();
    }

public static void main(String gg[])
{
             Scanner sc=new Scanner(System.in);
             System.out.print("Enter number of elements: ");
             int n = sc.nextInt();
             sc.nextLine();
              String[] arr = new String[n];
             System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++)
       {
            arr[i] = sc.nextLine(); 
        }
       
       String ans=prefix(arr);
       System.out.println(ans);
}
}