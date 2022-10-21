abstract class Play {

    public String name;

    private final int price = 0;

    Play(String name) {
        this.name = name;
    }

    public abstract int price(int audience);

    public int bonus(int audience) {
        return Math.max(audience - 30, 0);
    }


}
