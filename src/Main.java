import java.util.*;
public class Main
{
    public static void main(String[]args)
    {
        System.out.println("курс валют на сегодняшний день:");
        System.out.println("доллар=61.77 рублей\nевро=63.8рублей\nюань=0.11 рубля");
        System.out.println("Действия");
        System.out.println("1: dollar\n2:yuany\n3:euro\n4:ruble");
        System.out.println("выберит номер вашего действия") ;
      Scanner qwr = new Scanner (System.in);
      int vbr;
        System.out.println("вы ввели:"+ vbr);
        double chislo;
        double dollar,yuany,euro,ruble;
        System.out.println("Введите сумму которую хотите перевести");
        chislo =qwr.nextFloat();
        System.out.println("вы выбрали "+chislo);
      vbr = qwr.nextInt();
      if (vbr ==1)
      {
          yuany=chislo* 7.02;
          System.out.println( chislo + " долларов ="   + yuany + " юаней");
          euro =chislo * 0.95;
          System.out.println( chislo + "долларов =" + euro + " евро");
          ruble = chislo * 61.77;
          System.out.println( chislo + "долларов =" + ruble + " рублей");
      }
      else if (vbr ==2)
      {
          dollar=chislo * 0.142;
          System.out.println( chislo + " юаней ="   + dollar + " долларов");
          euro =chislo * 0.135;
          System.out.println( chislo + "юаней =" + euro + " евро");
          ruble = chislo * 8.91;
          System.out.println( chislo + "юаней =" + ruble + " рублей");
      }
        else if (vbr ==3)
        {
          dollar = chislo * 1.05;
          System.out.println(chislo + " евро =" + dollar + " долларов");
          yuany = chislo * 7.38;
          System.out.println(chislo + "евро =" + yuany + " юаней");
          ruble = chislo * 63.8;
          System.out.println(chislo + "евро =" + ruble + " рублей");
         }
      else if (vbr ==4)
      {
          dollar = chislo * 0.016;
          System.out.println(chislo + " рублей =" + dollar + " долларов");
          yuany = chislo * 0.0112;
          System.out.println(chislo + "рублей =" + yuany + " юаней");
          euro = chislo * 0.015;
          System.out.println(chislo + "рублей  =" + euro + " евро");
      }
         else
             System.out.println("вы неправильно ввели число");
         System.out.println("Хотите продолжить?");
         System.out.println("1-да  2-нет");
         double a;
         a = scanner.nextDouble();


      }

    }




