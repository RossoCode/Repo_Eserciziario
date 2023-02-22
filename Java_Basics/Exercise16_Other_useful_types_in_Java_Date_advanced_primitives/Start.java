package Java_Basics.Exercise16_Other_useful_types_in_Java_Date_advanced_primitives;

import java.time.LocalDate;

public class Start {
    public static void main(String[] args) {
        exercise1();
        exercise3();
    }

    /**
     * 1: Write code and fix the program below, you want to accept the questionableFunds
     * into the account!
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        int myBankBalanceEuro = 500;

        String suspiciousEmailMessage =
                """
                            Hello Sir/Madam,
                            
                            I'm a prince here in [redacted] and I need help transferring my billions into 
                            Italy, please provide your bank account details and I will pay you generously.
                            
                            Thanks
                """;

        long questionableFundsEuro = 5_000_000_000l;
        long myBankLongBalance = Long.valueOf(myBankBalanceEuro);
        myBankLongBalance = myBankLongBalance + questionableFundsEuro;
        System.out.println(myBankLongBalance);

        //Add the questionable funds to your bank balance and print it out!
    }

    /**
     * 2: Given the following information, think about the MOST EFFICIENT (which uses least space)
     *    type to use to store such data. Why is this the most efficient?
     *
     *    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     *    double = 16 decimal places
     *    float = 7 decimal places
     *    int = -2,147,483,648 to 2,147,483,647
     *    short = -32,768 to 32,768
     *    byte = -127 to 127
     *
     *    2a: Someone's age
     *    2a: byte perché attualmente nessuna persona al mondo è riuscito ad arrivare ad avere più di 120 anni
     *
     *    2b: The age of a baby in months
     *    2b byte perché superati i 36 mesi non è più un neonato ma un bambino quindi il byte basta e avanza
     *
     *    2c: Money in a hedgefund in euros
     *    2c: double non ho ben capito cosa sia questo hedgefund ma sicuramente avendo in mezzo molti soldi un double
     *        dovrebbe essere ottimo
     *
     *    2d: Price of a good in euros on amazon.com
     *    2d: float direi un float perché un buon prodotto preso da amazon non credo possa superare di tanto le 3/4 cifre
     *
     *    2e: The exact weight of an apple measured by scientific equipment
     *    2e: float le 7 cifre decimali che mette la disposizione il float dovrebbero permettere una precisione
     *        massimo per il peso di una mela
     *
     *    2f: The number of kilometers from any 2 places in the world
     *    2f: float dovrebbe bastare essendo la cironferenza della terra 5 cifre la distanza di un qualsiasi luogo della
     *        terra all'altro non può superare queste 5 cifre quindi un float con le sue 7 cifre è la scelta adatta
     */

    /**
     * 3: Use the LOCALDATE type (LocalDate.now()) to print out the current date
     * <p>
     * Play around with local date! What can you get it to do?
     * Use at least the following methods on myDate().
     * * getDayOfMonth()
     * * getDayOfWeek()
     * * getDayOfYear()
     * * getMonth()
     * * getMonthValue()
     * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
     * create other days
     */
    public static void exercise3() {
        System.out.println("Exercise 3:");
        LocalDate dayMonth = LocalDate.now();
        dayMonth.getDayOfMonth();
        System.out.println("data completa " + dayMonth);
        System.out.println("giorno del mese = " + dayMonth.getDayOfMonth());
        System.out.println("giorno della settimana = " + dayMonth.getDayOfWeek());
        System.out.println("questo e' il " + dayMonth.getDayOfYear() + "esimo giorno dell'anno");
    }
}
