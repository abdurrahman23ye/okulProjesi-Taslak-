package okulProjesi;

public class OgretmenIslemleri extends AnaMenu {

    static String  JavaInstruction="Ahmet BulutluOz";
    static String JavaAdvanced="Haluk bilgin";
   static  String JavaBasic="Elif Hanım";
   static String JavaProject="Haluk bilgin";

    public static void main(String[] args) {

         ogretmenIslemleri();



    }




    protected static void ogretmenIslemleri() {

        System.out.println("Lütfen yapmak istediğiniz işlemi belirtiniz. \n1.Öğretmen listesi\n2.Öğretmen değişikliği\n3.Çıkış\n4.AnaMenu");

        int ogTercih=scan.nextInt();

        switch (ogTercih){

            case 1:
                System.out.println("JavaInstruction = " + JavaInstruction);
                System.out.println("JavaAdvanced = " + JavaAdvanced);
                System.out.println("JavaBasic = " + JavaBasic);
                System.out.println("JavaProject = " + JavaProject);
                break;
            case 2:
                System.out.println("Lütfen öğretmen değişikliği yapmak istediğiniz dersin numarasını giriniz.\n1.Java Instruction\n2.Java Advanced\n3.Java Basic\n4.Java project\n5.Çıkış\n6.Ana menu");
               int otercih1=scan.nextInt();

               switch (otercih1){

                   case 1:
                       System.out.println("Yeni atanacak Öğretmenin adını giriniz.");
                       JavaInstruction=scan.next();
                       System.out.println("Yeni atanacak Öğretmenin adını giriniz.");
                       JavaInstruction=scan.next();

                       break;
                   case 2:
                       System.out.println("Yeni atanacak Öğretmenin adını giriniz.");
                       JavaAdvanced=scan.next();
                       System.out.println("Yeni atanacak Öğretmenin soyadını giriniz.");
                       JavaAdvanced=scan.next();break;
                   case 3:
                       System.out.println("Yeni atanacak Öğretmenin adını giriniz.");
                       JavaBasic=scan.next();
                       System.out.println("Yeni atanacak Öğretmenin soyadını giriniz.");
                       JavaBasic=scan.next();break;
                   case 4:
                       System.out.println("Yeni atanacak Öğretmenin adını giriniz.");
                       JavaProject=scan.next();
                       System.out.println("Yeni atanacak Öğretmenin adını giriniz.");
                       JavaProject=scan.next(); break;
                   case 5:
                       System.out.println("Hoşçakalın."); break;
                   case 6: anaMenu();
                   default:  System.out.println("Hatalı işlem yaptınız. Üst menuye yönlendiriliyorsunuz");
                   ogretmenIslemleri();
               }
            case 3: System.out.println("Hoşçakalın.");break;
            case 4:anaMenu(); break;

            default:
                System.out.println("Hatalı giriş yaptınız. Ust menuye yönlendiriliyorsunuz.");
        ogretmenIslemleri();}


    }
}
