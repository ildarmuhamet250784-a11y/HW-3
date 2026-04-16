//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hoşgeldiniz!");
        int d = 5430;
        byte k = 75;
        short l = 31000;
        long s = 350000L;
        float h = 8.56f;
        double p = 3.1456;
        System.out.println("Значение переменной d с типом int " + d);
        System.out.println("Значение переменной k с типом byte " + k);
        System.out.println("Значение переменной l с типом short " + l);
        System.out.println("Значение переменной s с типом long " + s);
        System.out.println("Значение переменной h с типом float " + h);
        System.out.println("Значение переменной p с типом double " + p);
        float g = 27.12f;
        long q = 987678965549L;
        float r = 2.786f;
        short n = 569;
        short w = -159;
        int o = 27897;
        byte t = 67;

        byte x = 23;
        byte a = 27;
        byte e = 30;
        int perStudent = 480 / (x + a + e);
        System.out.println("На каждого ученика расчитано " + perStudent + " листов бумаги");

        byte capacity2Min = 16;//производительность 16 бутылок за 2 минуты
        int capacity20Min = capacity2Min * 10;//20min
        int capacityDay = capacity2Min * 30 * 24;//day
        int capacity3Day = capacityDay * 3;//3day
        int capacityMounth = capacityDay * 30;//mounth
        System.out.println("За 20 минут машина произвела " + capacity20Min + " штук бутылок");
        System.out.println("За сутки машина произвела " + capacityDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + capacity3Day + " штук бутылок");
        System.out.println("За месяц машина произвела " + capacityMounth + " штук бутылок");

        byte totalCans = 120;
        byte oneClassWhite = 2;//white
        byte oneClassBrown = 4;//brown
        int totalCansWhite = totalCans / (oneClassWhite + oneClassBrown) * oneClassWhite;//sum white
        int totalCansBrown = totalCans / (oneClassWhite + oneClassBrown) * oneClassBrown;//sum brown
        System.out.println("В школе, где 20 классов, нужно " + totalCansWhite + " белой краски и " + totalCansBrown + " банок коричневой краски");

        //Задача №6
        byte banana = 80;//1 banana weight
        byte totalBananas = 5;
        byte milk = 105;//100ml milk
        byte totalMilk = 2;
        byte iceCream = 100;//1 iceCream
        byte totalIceCream = 2;
        byte agg = 70;// 1 agg
        byte totalAgg = 4;
        int weightGr = (banana * totalBananas) + (milk * totalMilk) + (iceCream * totalIceCream) + (agg * totalAgg);// weight gr
        double weightKg = weightGr * 0.001;// weight kg
        System.out.println("Вес завтрака " + weightGr + " граммов, что соответствует " + weightKg + " килограмм");

        //task7
        byte weightLoss = 7;
        short weightLossInADay250 = 250;
        short weightLossInADay500 = 500;
        int numberOfDaysIf250 = (weightLoss * 1000 / weightLossInADay250);
        int numberOfDaysIf500 = (weightLoss * 1000 / weightLossInADay500);
        int averageNumberOfDays = (weightLoss * 1000) / (weightLossInADay250 + weightLossInADay500) * 2;
        System.out.println("Если спортсмен будет терять ежедневно по 250 гр., то ему потребуется " + numberOfDaysIf250 + " дней для похудения, а если по 500 гр., то потребуется " + numberOfDaysIf500 + " дней. А в среднем для похудения потребуется " + averageNumberOfDays + " дней.");

        //task8
        int mashasSalary = 67760;
        int denisSalary = 83690;
        int kristinasSalary = 76230;
        long mashasNewSalary = (mashasSalary * 10) / 100 + mashasSalary;
        long mashasYearSalary = mashasSalary * 12;
        long mashasYearNewSalary = mashasNewSalary * 12;
        long difMashasYearSalary = mashasYearNewSalary - mashasYearSalary;
        System.out.println("Маша теперь получает " + mashasNewSalary + " рублей. Годовой доход вырос на " + difMashasYearSalary + " рублей");

        long denizNewSalary = (denisSalary * 10) / 100 + denisSalary;
        long denizYearSalary = denisSalary * 12;
        long denizYearNewSalary = denizNewSalary * 12;
        long difDenizYearSalary = denizYearNewSalary - denizYearSalary;
        System.out.println("Денис теперь получает " + denizNewSalary + " рублей. Годовой доход вырос на " + difDenizYearSalary + " рублей");

        long kristinaNewSalary = (kristinasSalary * 10) / 100 + kristinasSalary;
        long kristinaYearSalary = kristinasSalary * 12;
        long kristinaYearNewSalary = kristinaNewSalary * 12;
        long difKristinaYearSalary = kristinaYearNewSalary - kristinaYearSalary;
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + difKristinaYearSalary + " рублей");


    }
}
