import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    task4();
    task5();

    }
    public static void task1 () {

        byte apple = 5;
        int banana = 12;
        long orange = 33L;
        short fruit = 6;
        double milkWeigth = 2.0;
        float juiceWeigth = 1.5f;
        boolean appleisAdult = apple > 10;
        char a = 35;

    }
    public static void task2 () {

        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weigthAllOfBoxers = boxer1 + boxer2;
        double weigthDifference = boxer2 - boxer1;

        System.out.println("Общий вес боксеров " + weigthAllOfBoxers);
        System.out.println("Разница в весе боксеров " + weigthDifference);

    }
    public static void task3 () {

        int bananas = 5;
        int bananasWiegth = 80;

        int milk = 200/ 100;
        int milkWiegth = 105;

        int iceCrem = 2;
        int ice_cremWiegth = 100;

        int eggs = 4;
        int eggsWiegth = 70;

        int weigthAllOfIngredients = (bananas * bananasWiegth) + (milk * milkWiegth) + (iceCrem * ice_cremWiegth) + (eggs * eggsWiegth);

        int grPerKg = 1000;

        double weigthKg = weigthAllOfIngredients/ (double) grPerKg;

        System.out.println("Общий вес спорт-завтрака " + weigthAllOfIngredients + " грамм");
        System.out.println(weigthKg + " киллограмм");

    }

    public static void task4 () {

        int kg = 7;
        int gr_Per_Kg = 1000;
        int weigth_Kg = kg * gr_Per_Kg;

        int oneDiet = 250;
        int twoDiet = 500;

        int daysToLoseWeigth1 = weigth_Kg/ oneDiet;
        int daesToLoseWeigth2 = weigth_Kg/ twoDiet;
        int averageAmountDays = (daysToLoseWeigth1 + daesToLoseWeigth2) / 2;

        System.out.println("если терять по 250 грамм, то понадобиться " + daysToLoseWeigth1 + " дней");
        System.out.println("если терять по 500 грамм,  то понадобиться " + daesToLoseWeigth2 + " дней");
        System.out.println("в среднем может потребоваться " + averageAmountDays + " день");

    }
    public static void task5 () {


        int procent = 10;
        double upProcent = procent / (100 * 1.0);

        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;


        int upSalaryMasha = (int) (Masha + (Masha * upProcent));
        int upSalaryDenis = (int) (Denis + (Denis * upProcent));
        int upSalaryKristina = (int) (Kristina + (Kristina * upProcent));

        int annualIncomeMasha = (upSalaryMasha - Masha) * 12;
        int annualIncomeDenis = (upSalaryDenis - Denis) *12;
        int annualIncomeKristina = (upSalaryKristina - Kristina) *12;

        System.out.println("Маша теперь получает " + upSalaryMasha + " рублей. Годовой доход вырос на " + annualIncomeMasha + " рублей");
        System.out.println("Денис теперь получает " + upSalaryDenis + " рублей. Годовой доход вырос на " + annualIncomeDenis + " рублей");
        System.out.println("Кристина теперь получает " + upSalaryKristina + " рублей. Годовой доход вырос на " + annualIncomeKristina + " рублей");


    }
}