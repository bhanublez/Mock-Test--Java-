
import java.util.*;
public class signChecking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n>0){
            System.out.println("Number "+n+" is positive");
        }else if(n<0){
            System.out.println("Number "+n+" is Negative");
        }else{
            System.out.println("Number "+n+" is Zeros");
        }
        sc.close();
    }
}
