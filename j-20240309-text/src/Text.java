import java.util.Arrays;
import java.util.Scanner;
class Solution {
    public int firstMissingPositive(int[] nums) {
        //MAX = 100;
        int m = 0;
        int n = 0;
        int i = 0;
        //int j = 1;
        for(i = 0;i < nums.length;i++){
            if (nums[i] == i) {
                i++;
            }
            //System.out.println(i);
        }
        return i;
    }
}
/*class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int res = 1;
        for(int num : nums){
            if(num == res) {
                res++;
            }
        }
        return res;
    }
}*/
public class Text {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num = new int[]{3,4,-1,1};
        int a = 0;
        a = sol.firstMissingPositive(num);
        System.out.println(a);
        /*Scanner sc = new Scanner(System.in);
        int len = 0;
        int target = 0;
        int[] brr = new int[2];
        System.out.println("请输入目标值:");
        target = sc.nextInt();
        System.out.println("请输入这个数组的长度");
        len = sc.nextInt();
        int[] num = new int[len];
        System.out.println("请输入整形数组");
        for(int i = 0;i < len;i++){
            num[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        brr = sol.twoSum(num,target);
        System.out.println("下标为:");
        System.out.println(Arrays.toString(brr));*/
    }
}
