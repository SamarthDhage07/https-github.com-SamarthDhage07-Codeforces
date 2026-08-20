import java.util.*;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String s = sc.nextLine();
 
        char nums[] = new char[(s.length()/2)+1];
        int j =0;
 
        for(int i =0;i<nums.length;i++) {
            nums[i]=s.charAt(j);
            j+=2;
        }
        Arrays.sort(nums);
 
        for (int i =0;i<nums.length-1;i++) {
            sb.append(nums[i]);
            sb.append("+");
        }
        sb.append(nums[nums.length-1]);
        for(int i =0;i<sb.length();i++) {
            System.out.print(sb.charAt(i));
        }
    }
}