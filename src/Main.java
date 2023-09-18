public class Main
{
    public static void main(String[] args)
    {
        final double INTEREST_RATE = 0.17;
        double balance = 5000.0;
        double firstMonthInterest = 0;
        double secondMonthInterest = 0;

        firstMonthInterest = balance * INTEREST_RATE;
        balance += firstMonthInterest;

        System.out.println("The interest due after the first month is $" + firstMonthInterest + " which makes the balance after the first month $" + balance);

        secondMonthInterest = balance * INTEREST_RATE;
        balance += secondMonthInterest;

        System.out.println("The interest due after the second month is $" + secondMonthInterest + " which makes the balance after the second month $" + balance);
    }
}