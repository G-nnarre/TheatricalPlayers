import java.text.NumberFormat;
import java.util.*;

public class StatementPrinter {

    static String print(Invoice invoice) {
        int totalAmount = 0;
        int volumeCredits = 0;
        StringBuilder result = new StringBuilder(String.format("Statement for %s\n", invoice.customer));

        NumberFormat frmt = NumberFormat.getCurrencyInstance(Locale.US);

        for (Performance perf : invoice.performances) {
            Play play = perf.play;
            totalAmount += play.price(perf.audience);
            volumeCredits += play.bonus(perf.audience);
            // print line for this order
            result.append(String.format("  %s: %s (%s seats)\n", play.name, frmt.format(play.price(perf.audience)), perf.audience));
        }
        result.append(String.format("Amount owed is %s\n", frmt.format(totalAmount)));
        result.append(String.format("You earned %s credits\n", volumeCredits));
        return result.toString();
    }

}
