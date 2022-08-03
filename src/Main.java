import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args)
    {// Задание 1

        byte apple = 5;
        int banana = 12;
        long orange = 33L;
        short fruit = 6;
        double milkWeigth = 2.0;
        float juiceWeigth = 1.5f;
        boolean appleisAdult = apple > 10;
        char a = 35;


        // Задание 2

        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weigthAllOfBoxers = boxer1 + boxer2;
        double weigthDifference = boxer2 - boxer1;

        System.out.println("Общий вес боксеров " + weigthAllOfBoxers);
        System.out.println("Разница в весе боксеров " + weigthDifference);

        // Задание 3

        byte bananasWiegth = 80;
        byte milkWiegth = 105;
        byte ice_cremWiegth = 100;
        byte eggsWiegth = 70;

        int weigthAllOfIngredients = (bananasWiegth*5) + (milkWiegth*2) + (ice_cremWiegth*2) + (eggsWiegth*4);
        int grPerKg = 1000;
        float weigthKg = weigthAllOfIngredients/ (float)grPerKg;

        System.out.println("Общий вес спорт-завтрака " + weigthAllOfIngredients + " грамм");
        System.out.println(weigthKg + " киллограмм");

        // Задание 4

        byte kg = 7;
        int gr_Per_Kg = 1000;
        int weigth_Kg = kg * gr_Per_Kg;
        short oneDiet = 250;
        short twoDiet = 500;

        int daysToLoseWeigth1 = weigth_Kg/ oneDiet;
        int daesToLoseWeigth2 = weigth_Kg/ twoDiet;
        int averageAmountDays = (daysToLoseWeigth1 + daesToLoseWeigth2) /2;

        System.out.println("если терять по 250 грамм, то понадобиться " + daysToLoseWeigth1 + " дней");
        System.out.println("если терять по 500 грамм,  то понадобиться " + daesToLoseWeigth2 + " дней");
        System.out.println("в среднем может потребоваться " + averageAmountDays + " день");

        // Задание 5

        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;

        float upSalaryMashaProcent = Masha * 0.1f;
        float upSalaryDenisProcent = Denis * 0.1f;
        float upSalaryKristinaProcent = Kristina * 0.1f;

        float upSalaryMasha = Masha + upSalaryMashaProcent;
        float upSalaryDenis = Denis + upSalaryDenisProcent;
        float upSalaryKristina = Kristina + upSalaryKristinaProcent;

        float annualIncomeMasha = (upSalaryMasha * 12) - (Masha * 12);
        float annualIncomeDenis = (upSalaryDenis * 12) - (Denis *12);
        float annualIncomeKristina = (upSalaryKristina * 12) - (Kristina *12);

        System.out.println("Маша теперь получает " + upSalaryMasha + " рублей. Годовой доход вырос на " + annualIncomeMasha + " рублей");
        System.out.println("Денис теперь получает " + upSalaryDenis + " рублей. Годовой доход вырос на " + annualIncomeDenis + " рублей");
        System.out.println("Кристина теперь получает " + upSalaryKristina + " рублей. Годовой доход вырос на " + annualIncomeKristina + " рублей");


    }
}