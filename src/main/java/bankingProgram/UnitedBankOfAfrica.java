package bankingProgram;

public class UnitedBankOfAfrica extends CentralBankOfNigeria{
    @Override
    public void bankName() {
        System.out.println("UBA: ");
    }

    @Override
    public void interestRate() {
        System.out.println("Interest Rate of 8%");
    }
}
