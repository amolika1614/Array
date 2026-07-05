class COUNT {
    public static int subarraySum(int[] nums, int k) {

        int cnt=0;
         for(int i=0 ; i<nums.length ; i++)
         {
            int sum=0;
            for(int j=i ; j<nums.length ; j++)
            {
                sum+=nums[j];
                if(sum==k) cnt++;
            }
         }

         return cnt;
        
    }

 public static void main(String gg[])
{
   int k=subarraySum(new int[]{2,1,-3,3,1,1,1,4,2,1},3);

System.out.println(k);

}
}