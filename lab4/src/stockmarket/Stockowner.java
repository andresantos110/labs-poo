package stockmarket;
import java.util.List;
import java.util.ArrayList;

public class Stockowner
{
    String name;
    float money;

    protected List<Share> shares;

    public Stockowner(String a, float b)
    {
        name = a;
        money = b;
        shares = new ArrayList<Share> ();
    }

    public void addMoney(float a)
    {
        money+=a;
    }

    public void removeMoney(float a)
    {
        money-=a;
    }

    public void addShare(Share a)
    {
        Share aux = getShare(a.corporation);
        if(aux == null) //nao encontrou
        {
            shares.add(a);
        }
        else
        {
            a.quantity += aux.quantity;
        }
    }

    public void removeShare(Share a)
    {
        shares.remove(a);
    }

    Share getShare(Corporation a)
    {
        for(Share i:shares)
        {
            if(i.corporation.equals(a)) return i;
        }
        return null;
    }

    @Override
    public String toString() {
        return ("Nome: "+name+" Money: "+money+" Shares:"+shares.toString());
    }
}
