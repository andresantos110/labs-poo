package stockmarket;

public class Share
{
    int quantity;
    Corporation corporation;
    Stockowner stockowner;

    Share(int a, Corporation b, Stockowner c)
    {
        quantity = a;
        corporation = b;
        stockowner = c;
    }

    @Override
    public String toString() {
        return ("Nome: "+corporation.name+" Quantity: "+quantity);
    }
}
