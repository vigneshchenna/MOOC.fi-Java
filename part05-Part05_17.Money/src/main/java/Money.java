
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        Money add = new Money(this.euros + addition.euros(), this.cents + addition.cents());
        return add;
    }

    public boolean lessThan(Money compared) {
        if (this.euros() < compared.euros()) {
            return true;
        }

        if (this.euros() == compared.euros() && this.cents() < compared.cents()) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {
        int newCents = this.cents;
        int newEuros = this.euros - decreaser.euros();
        if (this.cents < decreaser.cents()) {
            newEuros--;
            newCents = 100+newCents - decreaser.cents();
            
        }
        
        
        //newEuros = newEuros - decreaser.euros();

        if (newEuros < 0) {
            newEuros = 0;
        }
        if (newCents < 0) {
            newCents = 0;
        }
        
        if(this.lessThan(decreaser)){
            newEuros =0;
            newCents =0;
        }
        Money sub = new Money(newEuros, newCents);
        return sub;
    }
    
//      TMC ANSWER!!!    
//    public Money minus(Money decreaser) {
//        int euros = this.euros - decreaser.euros();
//        int cents = this.cents - decreaser.cents();
// 
//        if (cents < 0) {
//            cents = cents + 100;
//            euros = euros - 1;
//        }
// 
//        // if the value becomes negative, return zero
//        if (euros < 0) {
//            return new Money(0, 0);
//        }
// 
//        return new Money(euros, cents);
//    }

}
