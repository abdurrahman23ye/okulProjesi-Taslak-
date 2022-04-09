package okulProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnaMenu {

    static Scanner scan=new Scanner(System.in);
    protected static List<String>QE=new ArrayList<>();
    protected static List<String>developer=new ArrayList<>();


    public static void main(String[] args) {



       anaMenu();





    }

    protected static void anaMenu() {

        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz \n1.Öğrenci işlemleri\n2.Öğretmen işlemleri\n3.Not işlemleri\n4.Çıkış");

      int  tercih1= scan.nextInt();

        switch (tercih1){

            case 1: OgrenciIslemleri.ogrenciIslemleri(); break;
            case 2: OgretmenIslemleri.ogretmenIslemleri(); break;
            case 3: NotIslemleri.ogrenciNotVerme();break;
            case 4:
                System.out.println("Hoşçakalın"); break;
            default:
                System.out.println("Hatalı giriş yaptınız. Tekrar deneyiniz");

                anaMenu();
        }
    }
}
