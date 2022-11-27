import java.util.Scanner;
public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int yil;
        System.out.print("Yıl giriniz.:");
        yil=inp.nextInt();
        if(yil%100==0)
        {
            if(yil%400==0)
            {
                System.out.println("artık yıl");
            }
            else System.out.println("artık yıl değildir...");
        }
        else if (yil%4==0)
        {
            System.out.println("artık yıldır.");
        }
        else
            System.out.println("artık yıl değildir.:");


    }



}