package com.company;

public class Main {

    static void czyZdanieJestPlandonimem(String x)
    {
        String nazwa = x.toLowerCase();
        boolean isPl = false;
        int j = nazwa.length() -1;
        for(int i = 0; i < nazwa.length();i++)
        {

            if(nazwa.charAt(i) == nazwa.charAt(j))
                isPl = true;
            else
            {
                isPl = false;
                break;
            }

            if(!isPl)
                break;
            j--;
        }
    }

    public static void main(String[] args) {

	String nazwa =  "Ala";

        czyZdanieJestPlandonimem(nazwa);

    }
}
