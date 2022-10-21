import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.approvaltests.Approvals.verify;

public class StatementPrinterTests {

    @Test
    void exampleStatement() {


        Invoice invoice = new Invoice("BigCo", List.of(new Performance(new Tragedy("Hamlet"), 55), new Performance(new Comedy("As You Like It"), 35), new Performance(new Tragedy("Othello"), 40)));

        var result = StatementPrinter.print(invoice);

        verify(result);
    }

    /*@Test
    void statementWithNewPlayTypes() {
        Invoice invoice = new Invoice("BigCo", List.of(
                new Performance(new History("Henry V"), 53),
                new Performance(new Pastoral("As You Like It"), 55)));

        Assertions.assertThrows(Error.class, () -> {
            StatementPrinter.print(invoice);
        });
    }*/
}