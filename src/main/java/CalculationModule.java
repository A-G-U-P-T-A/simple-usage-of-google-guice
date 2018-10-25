import com.google.inject.Inject;

public class CalculationModule {

    private final TaxCalculator taxCalculator;

    @Inject
    public CalculationModule(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

     int calculate() {
         return taxCalculator.calculateTax();
    }

}
