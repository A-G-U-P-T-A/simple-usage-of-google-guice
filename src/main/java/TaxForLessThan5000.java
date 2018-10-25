public class TaxForLessThan5000 implements TaxCalculator {

    @Override
    public int calculateTax(){
        return 250;
    }

}
