import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int nums[][] = new int[5][5];
        int count =0;
 
        for(int i = 0; i <5; i++){
            for(int j = 0; j < 5 ;j++) {
                nums[i][j] = sc.nextInt();
            }
        }
 
        for(int i =0; i<5; i++) {
            for(int j =0; j<5; j++) {
                if(nums[i][j]==1) {
                    if(i <=2) {
                        count+=2-i;
                    }
                    else{
                        count += i-2;
                    }
 
                    if(j <=2) {
                        count+=2-j;
                    }
                    else{
                        count += j-2;
                    }
                }
 
            }
        }
 
 
        System.out.println(count);
 
    }
}