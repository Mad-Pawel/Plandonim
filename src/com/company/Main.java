package com.company;

public class Main {

    static void czyZdanieJestPlandonimem(String x)
    {
        boolean isPl = false;
        for(int i = 0; i < x.length();i++)
        {
            for (int j =x.length(); j >0; j--)
            {
                if(x[i] == x[j])
                    isPl = true;
                else
                {
                    isPl = false;
                    break;
                }

            }
            if(!isPl)
                break;
        }
    }

    public static void main(String[] args) {

	String nazwa =  "Ala";



    }
}
