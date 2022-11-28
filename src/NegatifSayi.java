import java.util.Scanner;
public class NegatifSayi {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int sayi,toplam=0,adet2=0,adet=0;
        do {
            System.out.print("sayi giriniz.:");
            sayi=in.nextInt();
            if(sayi%2==0 && sayi%4==0)
            {
                toplam+=sayi;
                adet++;
            }
            else if(sayi%4!=0&&sayi%2==0)
            {
                adet2++;
            }
           }
        while(sayi%2==0);
        if(adet>1)
        {
            System.out.println("toplamlari.:"+toplam);
        }
        else
        {
            System.out.println("4 e bölünen saynız yok");
        }
    }
}
