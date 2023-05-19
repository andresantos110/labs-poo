package main;

import stockmarket.Stockmarket;
import stockmarket.Share;
import stockmarket.Corporation;
import stockmarket.Stockowner;

public class Main
{
    public static void main(String[] args)
    {
        Stockmarket teste = new Stockmarket();

        Corporation mc = new Corporation("McDonalds", 30000, 50);
        Corporation bk = new Corporation("Burger King", 20000, 30);
        Corporation kfc = new Corporation("KFC", 25000, 40);

        mc.createShare(200);
        bk.createShare(100);
        kfc.createShare(150);

        teste.placeInMarket(mc, mc, 200);
        teste.placeInMarket(bk, bk, 100);
        teste.placeInMarket(kfc, kfc, 150);

        Stockowner owner1 = new Stockowner("John Doe", 4000);
        Stockowner owner2 = new Stockowner("Jane Doe", 6000);
        Stockowner owner3 = new Stockowner("James Bond", 5000);

        System.out.println("Teste:");
        System.out.println(owner1);
        System.out.println(owner2);
        System.out.println(owner3);

        teste.buy(owner1, mc, 20);
        teste.buy(owner2, bk, 10);
        teste.buy(owner3, kfc, 15);

        System.out.println("Depois de comprar:");
        System.out.println(owner1);
        System.out.println(owner2);
        System.out.println(owner3);


        teste.placeInMarket(owner1, mc, 10);
        teste.placeInMarket(owner1, mc, 5);
        teste.placeInMarket(owner1, mc, 8);

        System.out.println("Depois de colocar à venda:");
        System.out.println(owner1);
        System.out.println(owner2);
        System.out.println(owner3);

        teste.buy(owner1, mc, 500);
        teste.buy(owner2, bk, 500);
        teste.buy(owner3, kfc, 500);

        System.out.println("Depois de tentar comprar mais do que há:");
        System.out.println(owner1);
        System.out.println(owner2);
        System.out.println(owner3);

        return;

    }


}
