package com.company;

public class Main {

    static void czyZdanieJestPlandonimem(String x)
    {
        String nazwa = x.toLowerCase();
        boolean isPl = false;
        int j = nazwa.length() -1;
        for(int i = 0; i < nazwa.length() && i!=j;i++)
        {

            if(nazwa.charAt(i) == nazwa.charAt(j))
                isPl = true;
            else
            {
                isPl = false;
                break;
            }

            j--;
        }
        if(isPl)
            System.out.println("Zadnie jest plandonimem");
        else
            System.out.println("Zadnie nie jest plandonimem");
    }

    public static void main(String[] args) {

	String nazwa =  "kajak";

        czyZdanieJestPlandonimem(nazwa);

    }
}
