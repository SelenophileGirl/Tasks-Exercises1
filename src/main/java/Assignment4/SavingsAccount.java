package Assignment4;

public class SavingsAccount {

    /**SavingsAccount class instance variables*/
    private static double annualInterestRate;
    private double savingsBalance;

    /**method that calculates Monthly Interest as (savingsBalance * annualInterestRate) / 12 and then add it to the previous savingsBalance*/
    public void calculateMonthlyInterest(){
        this.savingsBalance += (this.savingsBalance * annualInterestRate) / 12;
    }

    /**method for setting a new annualInterestRate*/
    public static void modifyInterestRate(double newAnnualInterestRate){
        annualInterestRate = newAnnualInterestRate;
    }

    public void setSavingsBlanace(double savingsBlanace) {
        this.savingsBalance = savingsBlanace;
    }

    public double getSavingsBlanace() {
        return savingsBalance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }
}
