import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int mini =0;
        int min = Integer.MAX_VALUE;
 
        int n = sc.nextInt();
        int nums[] =new int[n];
 
        for(int i =0;i<nums.length;i++) {
            nums[i] = sc.nextInt();
        }
 
        for(int i =0;i<nums.length;i++) {
 
                if(nums[i] >0) {
                    mini = nums[i]-0;
                }
                else{
                    mini = 0-nums[i];
                }
 
                if(mini < min ) {
                    min = mini;
 
                }
 
        }
 
        System.out.println(min);
 
    }
}