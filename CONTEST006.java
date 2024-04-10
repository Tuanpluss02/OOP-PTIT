class Money {
    private int euros;
    private int cents;

    public Money(int euros, int cents) {
        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }
        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money added) {
        return new Money(this.euros + added.euros, this.cents + added.cents);
    }

    public boolean lessThan(Money compared) {
        return this.euros < compared.euros || (this.euros == compared.euros && this.cents < compared.cents);
    }

    public Money minus(Money decremented) {
        int newEuros = this.euros - decremented.euros;
        int newCents = this.cents - decremented.cents;
        if (newCents < 0) {
            newEuros--;
            newCents += 100;
        }
        if (newEuros < 0) {
            newEuros = 0;
            newCents = 0;
        }
        return new Money(newEuros, newCents);
    }

    @Override
    public String toString() {
        return euros + "." + (cents < 10 ? "0" + cents : cents) + "e";
    }

}

public class Main {
    public static void main(String[] args) {
        Money a = new Money(10, 8);
        Money b = new Money(5, 5);

        Money c = a.plus(b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Money u = new Money(10, 0);
        Money y = new Money(3, 0);
        Money w = new Money(5, 0);

        System.out.println(u.lessThan(y));
        System.out.println(y.lessThan(w));

        Money m = new Money(10, 0);
        Money n = new Money(3, 50);
        Money o = m.minus(n);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        o = o.minus(m);
        System.out.println(o);
    }
}