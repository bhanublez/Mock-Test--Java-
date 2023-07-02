import java.util.*;
public class Average{
    public static void main(String ar){
        Scanner sc=new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        int n,a=1;
        do {
            System.out.print("Enter a number  and any charcter to calculate average");
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