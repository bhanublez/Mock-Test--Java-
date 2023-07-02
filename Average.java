import java.util.*;
public class Average{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        int n,a=1;
         System.out.print("Enter a numbers to lsit for caculating average and any charcter to start calculating average");
        do {
            try{
            n= sc.nextInt();
            nums.add(n);
            }catch(Exception e){
                a=0;
            }
               
            
        } while (a!=0);
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        double avg = (double) sum / nums.size();
        
        System.out.println("Average is: " + avg);
        
        sc.close();
    }
}
