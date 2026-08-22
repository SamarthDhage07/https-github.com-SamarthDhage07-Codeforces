import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        String S1 = sc.nextLine();
        String S2 = sc.nextLine();
        String S3 = sc.nextLine();
        boolean isYes = true;
 
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        int freq3[] = new int[26];
        int freq4[] = new int[26];
 
 
        for(int i =0 ; i<S1.length();i++) {
            freq1[S1.charAt(i)-'A']++;
        }
 
        for(int i =0 ; i<S2.length();i++) {
            freq2[S2.charAt(i)-'A']++;
        }
 
        for(int i =0 ; i<S3.length();i++) {
            freq3[S3.charAt(i)-'A']++;
        }
 
        for(int i =0;i<26;i++) {
            freq4[i] = freq1[i]+freq2[i];
        }
 
 
        for(int i =0;i<26;i++) {
            if(freq4[i] != freq3[i]) {
                isYes = false;
                break;
            }
        }
 
        if(isYes == true){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
 
 
    }
}