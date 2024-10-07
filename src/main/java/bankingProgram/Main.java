package bankingProgram;

public class Main {
    public static void main(String[] args) {
        ZenithBank newZenith = new ZenithBank();
        newZenith.bankName();
        newZenith.interestRate() ;

        UnitedBankOfAfrica newUba = new UnitedBankOfAfrica();
        newUba.bankName();
        newUba.interestRate();

        GuarantyTrustBank newGtb = new GuarantyTrustBank();
        newGtb.bankName();
        newGtb.interestRate();
    }
}
