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
        long s = 350000;
        float h = 8.56f;
        double p = 3.1456;
        System.out.println("Значение переменной d с типом int "+d);
        System.out.println("Значение переменной k с типом byte "+k);
        System.out.println("Значение переменной l с типом short "+l);
        System.out.println("Значение переменной s с типом long "+s);
        System.out.println("Значение переменной h с типом float "+h);
        System.out.println("Значение переменной p с типом double "+p);
        float g = 27.12f;
        long q = 987678965549L;
        float r = 2.786f;
        short n = 569;
        short w = -159;
        int o = 27897;
        byte t = 67;

        byte L = 23;
        byte A = 27;
        byte E = 30;
        int S = 480/(L+A+E);
        System.out.println("На каждого ученика расчитано "+S+" листов бумаги");

        byte B = 16;//производительность 16 бутылок за 2 минуты
        int M = B*10;//20min
        int D = B*30*24;//day
        int W = B*30*24*3;//3day
        int X = B*30*24*30;//mounth
        System.out.println("За 20 минут машина произвела "+M+" штук бутылок");
        System.out.println("За сутки машина произвела "+D+" штук бутылок");
        System.out.println("За 3 дня машина произвела "+W+" штук бутылок");
        System.out.println("За месяц машина произвела "+X+" штук бутылок");

        byte color = 120;
        byte room = 2;//white
        byte room2 = 4;//black
        int sum = color/(room+room2)*room;//sum white
        int sum2 = color/(room+room2)*room2;//sum brown
        System.out.println("В школе, где 20 классов, нужно "+sum+" белой краски и "+sum2+" банок коричневой краски");

        //Задача №6
        byte banana = 80;//1 banana weight
        byte sumBanana = 5;
        byte milk = 105;//100ml milk
        byte sumMilk = 2;
        byte iceCream = 100;//1 iceCream
        byte sumIceCream = 2;
        byte agg = 70;// 1 agg
        byte sumAgg = 4;
        int weight = (banana*sumBanana)+(milk*sumMilk)+(iceCream*sumIceCream)+(agg*sumAgg);// weight gr
        double weightKg = weight*0.001;// weight kg
        System.out.println("Вес завтрака "+weight+" граммов, что соответствует "+weightKg+" килограмм");

        //task7
        byte weights = 7;
        short weightDay = 250;
        short weightDay2 = 500;
        int days = (weights*1000/weightDay);
        int days2 = (weights*1000/weightDay2);
        int days3 = (weights*1000)/(250+500)*2;
        System.out.println("Если спортсмен будет терять ежедневно по 250 гр., то ему потребуется "+days+" дней для похудения, а если по 500 гр., то потребуется "+days2+" дней. А в среднем для похудения потребуется "+days3+" дней.");

        //task8
        int masha = 67760;
        int deniz = 83690;
        int kristina = 76230;
        long mashaNew = (masha*10)/100+masha;
        long mashaYear = masha*12;
        long mashaYearNew = mashaNew*12;
        long difMasha = mashaYearNew-mashaYear;
        System.out.println("Маша теперь получает "+mashaNew+" рублей. Годовой доход вырос на "+difMasha+" рублей");

        long denizNew = (deniz*10)/100+deniz;
        long denizYear = deniz*12;
        long denizYearNew = denizNew*12;
        long difDeniz = denizYearNew-denizYear;
        System.out.println("Денис теперь получает "+denizNew+" рублей. Годовой доход вырос на "+difDeniz+" рублей");

        long kristinaNew = (kristina*10)/100+kristina;
        long kristinaYear = kristina*12;
        long kristinaYearNew = kristinaNew*12;
        long difKristina = kristinaYearNew-kristinaYear;
        System.out.println("Кристина теперь получает "+kristinaNew+" рублей. Годовой доход вырос на "+difKristina+" рублей");

























    }
    }
