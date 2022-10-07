import java.util.*;

public class Invoice {

  public String customer;
  public ArrayList<Performance> performances;

  public Invoice(String customer, ArrayList<Performance> performances) {
    this.customer = customer;
    this.performances = performances;
  }
}
