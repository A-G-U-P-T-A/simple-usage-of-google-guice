import com.google.inject.Inject;

public class CalculationModule {

    private final TaxCalculator taxCalculator;

    @Inject
    public CalculationModule(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public int calculate() {
        int tax = taxCalculator.calculateTax();

        return tax;
    }

}
