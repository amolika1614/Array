/*Given an integer array nums, handle multiple queries of the following type:

Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
Implement the NumArray class:

NumArray(int[] nums) Initializes the object with the integer array nums.
int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).*/
class NumArray
{
      public int [] prefixSum;
     public NumArray(int [] num)
    {
                     for(int i=1 ; i<num.length ; i++)
                    {
                             num[i]+=num[i-1];
                    }
              this.prefixSum=num;
     }

    public int sumRange(int left, int right) {
      if(left==0)
      {
        return prefixSum[right];
      }

      return prefixSum[right]-prefixSum[left-1];
    }

}

class Main
{
   public static void main (String gg[])
{
    int [] arr={-2,0,3,-5,2,-1};
     NumArray n=new NumArray(arr);
  int ans=  n.sumRange(0,2);

System.out.println(ans);

}
}