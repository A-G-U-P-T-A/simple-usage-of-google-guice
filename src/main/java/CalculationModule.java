import com.google.inject.Inject;

public class CalculationModule {

    private final TaxCalculator taxCalculator;

    @Inject
    public CalculationModule(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public int calculate(int Salary) {
        //double totalAfterDiscount = shoppingCartTotal - (shoppingCartTotal * discountable.getDiscount());
        //System.out.printf("%nShopping cart initially [$%.2f] with a discount of %.2f%% = [$%.2f]%n%n",
        //        shoppingCartTotal,
        //        discountable.getDiscount() * 100,
        //       totalAfterDiscount);
        int tax = taxCalculator.calculateTax();

        return tax;
    }

}
