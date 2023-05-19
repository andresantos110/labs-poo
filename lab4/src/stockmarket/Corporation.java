package stockmarket;

public class Corporation extends Stockowner
{
    private float value;

    public Corporation(String a, float b, float c)
    {
        super(a, b);
        value = c;
    }

    public Share createShare(int a)
    {
        Share share = new Share(a, this,this);
        this.addShare(share);
        return share;
    }

    public float getValue()
    {
        return value;
    }


}
