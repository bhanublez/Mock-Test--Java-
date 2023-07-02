import java.util.*;
public class largest{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three digits ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is largest");
        }else if(b>a && b>c){
            System.out.println(b+" is largest");  
        }else if(c>a && c>b){
            System.out.println(c+" is largest");
        }
        sc.close();
    }
}