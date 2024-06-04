//package Data-Structure-Algorithms.array&string;

public class SquareOfSortedArray {
  public int[] sortedSquares(int[] nums) {
    int l=0, r= nums.length-1;
    int[] res = new int[nums.length];
    for(int i = nums.length-1; i >=0; i--){
        if(Math.abs(nums[r]) >= Math.abs(nums[l]) ){
            res[i] = nums[r] * nums[r];
            r--;
        }else{
            res[i] = nums[l] * nums[l];
            l++;
        }
    }
    return res;
  }
  public static void main(String[] args){
    int[] nums = new int[]{-4,-1,0,3,10};
    SquareOfSortedArray ob = new  SquareOfSortedArray();
    int[] res = ob.sortedSquares(nums);
    for(int i=0; i<res.length; i++){
      System.out.print(res[i] + " ");
    }


  }
  
}
