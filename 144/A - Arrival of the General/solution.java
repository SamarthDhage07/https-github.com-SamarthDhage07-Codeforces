import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int count=0;
        int maxI=0;
        int minI=0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
 
        int nums[] = new int[n];
        for(int i =0;i<n;i++) {
            nums[i]=sc.nextInt();
        }
 
        for(int i =0;i<nums.length;i++) {
            if(nums[i] > max) {
                 max = nums[i];
                 maxI=i;
            }
        }
        count+=maxI;
        for(int i =0;i<nums.length;i++) {
            if(nums[i] <= min) {
                min = nums[i];
                minI=i;
            }
        }
        count+=nums.length-minI-1;
        if(minI < maxI) {
            count--;
        }
        System.out.println(count);
 
    }
}