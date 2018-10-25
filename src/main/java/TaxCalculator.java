import com.google.inject.ImplementedBy;

@ImplementedBy(TaxForLessThan5000.class)
public interface TaxCalculator {
    int calculateTax();
}
