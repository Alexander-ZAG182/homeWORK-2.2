public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
      int a = 400000;
      byte b = 27;
      short c = 30000;
      long d = 1000000000L;
      float e = 3.75F;
      double f = 3.123456789F;
        System.out.println( "Значение переменной a с типом int равно " + a);
        System.out.println( "Значение переменной b с типом byte равно " + b);
        System.out.println( "Значение переменной c с типом short равно " + c);
        System.out.println( "Значение переменной d с типом long равно " + d);
        System.out.println( "Значение переменной e с типом float равно " + e);
        System.out.println( "Значение переменной f с типом double равно " + f);


        float ab = 27.12F;
        long bc = 987678965549L ;
        float cd = 2.786F ;
        short de = 569 ;
        short ef = -159 ;
        short fg = 27897 ;
        byte gh = 67 ;


        byte lP = 23 ;
        byte aS = 27 ;
        byte eA = 30 ;
        short sheets = 480 ;
        int students = lP + aS + eA;
        System.out.println("На каждого ученика расчитано " + sheets / students + " листов бумаги " );


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





















    }
}