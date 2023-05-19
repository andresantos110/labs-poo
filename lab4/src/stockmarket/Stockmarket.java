package stockmarket;
import java.util.List;
import java.util.ArrayList;

public class Stockmarket
{
    protected List<Share> marketShares;

    public Stockmarket()
    {
        marketShares = new ArrayList<Share>();
    }

    public void placeInMarket(Stockowner a, Corporation b, int q)
    {
        Share aux = a.getShare(b);
        if (aux == null)
        {
            System.out.println("No such stock");
            return;
        }
        if(aux.quantity > q)
        {
            aux.quantity -= q;
            aux = new Share(q, b, a);
        }

        a.removeShare(aux);
        marketShares.add(aux);

        System.out.println("Success.");
    }

    public void buy(Stockowner a, Corporation b, int q)
    {
        if(a.money < b.getValue()*q)
        {
            System.out.println("Money is not enough");
            return;
        }

        int num = 0; //numero de açoes compradas

        for (Share aux=findShare(b); aux!=null && q!=0; aux=findShare(b))
        {
            if(aux.quantity > q) //encontrou stock, quer comprar menos do que há à venda
            {
                aux.quantity -= q;
                aux.stockowner.addMoney(q*b.getValue());
                num += q;
                break;
            }
            else // quer comprar mais do que ha, vai comprar todos
            {
                num += aux.quantity;
                aux.stockowner.addMoney(aux.quantity*b.getValue());
                aux.quantity = 0;
                marketShares.remove(aux);
            }
        }

        if(num != 0) //comprou - tirar dinheiro do comprador, dar-lhe num stocks
        {
            Share aux = new Share(num, b, a);
            a.addShare(aux);
            a.removeMoney(num*b.getValue());
            return;
        }


    }

    private Share findShare(Corporation a)
    {
        for(Share i:marketShares)
        {
            if(i.corporation.equals(a)) return i;
        }
        return null;
    }

}
