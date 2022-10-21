public class Comedy extends Play {
    public Comedy(String name) {
        super(name);
    }

    @Override
    public int price(int audience) {
        int amount = 300;
        if (audience > 20) {
            amount += 100 + 5 * (audience - 20);
        }
        amount += 3 * audience;
        return amount;
    }

    @Override
    public int bonus(int audience) {
        return (int) (Math.max(audience - 30, 0) + Math.floor(audience / 5));
    }
}
