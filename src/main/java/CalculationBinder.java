//import java.util.Random;
public class CalculationBinder  extends com.google.inject.AbstractModule{

    int salary;

    CalculationBinder(int salary){
        this.salary = salary;
    }

    @Override
    protected void configure() {

        if(salary > 5000)
            bind(TaxCalculator.class).to(TaxForGreaterThan5000.class);
        else
            bind(TaxCalculator.class).to(TaxForLessThan5000.class);

    }

}