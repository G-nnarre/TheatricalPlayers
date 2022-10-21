public class Tragedy extends Play {

    public Tragedy(String name) {
        super(name);
    }

    @Override
    public int price(int audience) {
        int amount = 400;
        if (audience > 30) {
            int price = 10;
            amount += price * (audience - 30);
        }
        return amount;
    }
}
