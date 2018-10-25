import java.util.*;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String args[]) throws Exception{
        System.out.println("----Code Begins----\n\n");
        int salary;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter salary please !!!");
            salary = sc.nextInt();
            try{
                if(salary<2500||salary>10000)
                    throw new Exception();
                else{
                    Injector guice = Guice.createInjector(new CalculationBinder(salary));
                    CalculationModule calculationModule = guice.getInstance(CalculationModule.class);
                    System.out.println("Tax to be deducted from your salary is "+calculationModule.calculate());
                }
            }
            catch(Exception e){
                System.err.println("Salary should be between 2500 and 10000");
            }
        }
        catch (Exception e){
            System.err.println("Corrupted Input");
        }
        System.out.println("\n\n----Code Ends----");
    }
}
