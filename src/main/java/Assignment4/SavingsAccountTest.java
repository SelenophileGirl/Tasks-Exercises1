package Assignment4;

/**SavingsAccountTest class to test SavingsAccount class and it's methods*/
public class SavingsAccountTest {

    public static void main(String[] args) {

        //creating two new objects from class SavingsAccount using the default constructor
        SavingsAccount sarver1 = new SavingsAccount();
        SavingsAccount sarver2 = new SavingsAccount();

        //setting the savingsBalance of both objects
        sarver1.setSavingsBlanace(2000.00);
        sarver2.setSavingsBlanace(3000.00);

        //setting a new annualInterestRate to 4%
        SavingsAccount.modifyInterestRate(0.4);

        //calculating Monthly Interest for both objects
        sarver1.calculateMonthlyInterest();
        sarver2.calculateMonthlyInterest();

        //printing savingsBlanace for both objects after adding the new monthly Interest
        System.out.println(sarver1.getSavingsBlanace());
        System.out.println(sarver2.getSavingsBlanace());

        //setting a new annualInterestRate to 5%
        SavingsAccount.modifyInterestRate(0.6);

        //calculating Monthly Interest for the next month for both objects
        sarver1.calculateMonthlyInterest();
        sarver2.calculateMonthlyInterest();

        //printing savingsBlanace for both objects after adding the new monthly Interest
        System.out.println(sarver1.getSavingsBlanace());
        System.out.println(sarver2.getSavingsBlanace());

    }
}
