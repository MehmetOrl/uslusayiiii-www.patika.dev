import java.util.Scanner;
public class donguCalismasi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


       int i,sayi,adet=0;
       double ortalama,toplam=0;
        System.out.println("Sayi giriniz.:");
        sayi=input.nextInt();
       for(i=0;i<=sayi;i++)
       {
           if(i%3==0||i %4==0){
               if(i==0)
               {
                   continue;
               }

               System.out.println(i+" ");
               adet++;
               toplam+=i;

       }
       }
        ortalama=(toplam/adet);
        System.out.println("Adetleri.:"+adet);
        System.out.println("Toplamları.:"+toplam);
        System.out.println("ortalaması.:"+ortalama);


    }
}

