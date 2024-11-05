public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
      System.out.println("Задание 1");
      int a = 400000;
      byte b = 27;
      short c = 30000;
      long d = 1000000000L;
      float e = 3.75F;
      double f = 3.123456789;
        System.out.println( "Значение переменной a с типом int равно " + a);
        System.out.println( "Значение переменной b с типом byte равно " + b);
        System.out.println( "Значение переменной c с типом short равно " + c);
        System.out.println( "Значение переменной d с типом long равно " + d);
        System.out.println( "Значение переменной e с типом float равно " + e);
        System.out.println( "Значение переменной f с типом double равно " + f);

      System.out.println("Задание 2");
        float aB = 27.12F;
        long bC = 987678965549L ;
        float cD = 2.786F ;
        short dE = 569 ;
        short eF = -159 ;
        short fG = 27897 ;
        byte gH = 67 ;

      System.out.println("Задание 3");
        byte teacher1 = 23 ;
        byte teacher2 = 27 ;
        byte teacher3 = 30 ;
        short sheets = 480 ;
        int students = teacher1 + teacher2 + teacher3;
        System.out.println("На каждого ученика расчитано " + sheets / students + " листов бумаги " );

      System.out.println("Задание 4");
        byte bottle = 16 ;
        byte min = 2 ;
        int productivity = bottle / min ;
        byte minutes = 20;
        int day = 24*60;
        int threeDay = day * 3 ;
        int month = day * 30 ;
        System.out.println("За 20 минут машина произвела " + minutes * productivity +" штук бутылок");
        System.out.println("За 1 сутки машина произвела " + day * productivity +" штук бутылок");
        System.out.println("За 3 дня машина произвела " + threeDay * productivity +" штук бутылок");
        System.out.println("За 1 месяц машина произвела " + month * productivity +" штук бутылок");



      System.out.println("Задание 5");
      byte totalCans = 120 ;
      byte white = 2 ;
      byte brown = 4 ;
      int oneClass = white + brown ;
      int allClass = totalCans / oneClass ;
      int allBrown = allClass * brown ;
      int allWhite = allClass * white ;
      System.out.println("В школе , где " + allClass + " , классов , нужно " + allWhite + " банок белой краски и " + allBrown + " банок коричневой краски. ");


      System.out.println("Задание 6");
      byte banana = 80 ;
      int bananas = banana * 5 ;
      byte milk = 105 ;
      int milks = milk * 2 ;
      byte ice = 100 ;
      int ices = ice * 2 ;
      byte egg = 70 ;
      int eggs = egg * 4 ;
      int allMg = bananas + milks + ices + eggs ;
      float allKg = 1000 ;
      System.out.println( allMg + " граммов. " ) ;
      System.out.println( allMg / allKg + " килограммов. " ) ;

      System.out.println("Задание 7");
      byte lessKg = 7 ;
      int lessGram = lessKg * 1000 ;
      int lessMin = 250 ;
      int lessMax= 500;
      System.out.println(lessGram / lessMin);
      System.out.println(lessGram / lessMax);

      System.out.println("Задание 8");
      int masha = 67760 ;
      int denis = 83690 ;
      int kristina = 76230 ;
      int mashaUp = masha / 10 ;
      int denisUp =denis / 10 ;
      int kristinaUp = kristina / 10 ;
      int mashaNew = masha + mashaUp ;
      int denisNew = denis + denisUp ;
      int kristinaNew = kristina + kristinaUp ;
      int mont = 12 ;
      int mashaYear = masha * mont ;
      int denisYear = denis * mont ;
      int kristinaYear = kristina * mont ;
      int mashaYearUp = mashaNew * mont ;
      int denisYearUp = denisNew * mont ;
      int kristinaYearUp = kristinaNew * mont ;
      int mashaDifference = mashaYearUp - mashaYear ;
      int denisDifference = denisYearUp - denisYear ;
      int kristinaDifference = kristinaYearUp - kristinaYear;
      System.out.println("Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на " + mashaDifference + " рублей." );
      System.out.println("Денис теперь получает " + denisNew + " рублей. Годовой доход вырос на " + denisDifference + " рублей." );
      System.out.println("Кристина теперь получает " + kristinaNew+ " рублей. Годовой доход вырос на " + kristinaDifference + " рублей." );





























    }
}