package okulProjesi;

public class NotIslemleriDepo extends AnaMenu {

    static double javaInsSozKat=12.0/18.0/5.0;
    static double javaBasSozKat=2.0/18.0/5.0;
    static double javaAdSozKat=2.0/18.0/5.0;
    static double javaProSozKat=2.0/18.0/5.0;
    static double javaInsYazKat=(12.0/18.0)*(4.0/5.0);
    static double javaBasYazKat=2.0/18.0*4.0/5.0;
    static double javaAdYazKat=2.0/18.0*4.0/5.0;
    static double javaProYazKat=2.0/18.0*4.0/5.0;



        static double javaInstructionSozlu=0.0;
        static double javaInstructionYazili=0.0;
        static double javaBasicYazili=0.0;
        static double javaBasicSozlu=0.0;
        static double javaAdvancedSozlu=0.0;
        static double javaAdvancedYazılı=0.0;
        static double javaProYazılı=0.0;
        static double javaProSozlu=0.0;

    public static void main(String[] args) {

       notGirme();

        notHesaplama(javaAdvancedSozlu,javaAdvancedYazılı,javaBasicSozlu,javaBasicYazili,javaProSozlu,javaProYazılı,javaInstructionSozlu,javaInstructionYazili);

    }

    protected static void notGirme() {
        System.out.println("Lütfen notları sırayla giriniz:");

        System.out.println("java Ins. Sozlu = "); double javaInstructionSozlu=scan.nextDouble();
        System.out.println("java Ins. Yazılı = "); double javaInstructionYazili=scan.nextDouble();
        System.out.println("java Basic Yazılı = "); double javaBasicYazili=scan.nextDouble();
        System.out.println("java Basic Sozlu = "); double javaBasicSozlu=scan.nextDouble();
        System.out.println("java Advanced Sozlu = "); double javaAdvancedSozlu=scan.nextDouble();
        System.out.println("java Advanced yazılı = "); double javaAdvancedYazılı=scan.nextDouble();
        System.out.println("java Project yazılı = "); double javaProYazılı=scan.nextDouble();
        System.out.println("java Project sözlü = "); double javaProSozlu=scan.nextDouble();
        notHesaplama(javaAdvancedSozlu,  javaAdvancedYazılı, javaBasicSozlu,  javaBasicYazili, javaProSozlu,  javaProYazılı,  javaInstructionSozlu, javaInstructionYazili);
    }

    protected static void notHesaplama(double javaAdvancedSozlu, double javaAdvancedYazılı, double javaBasicSozlu, double javaBasicYazili, double javaProSozlu, double javaProYazılı, double javaInstructionSozlu, double javaInstructionYazili) {
        System.out.println("Java Instruction notu:"+(javaAdvancedYazılı*8.0/10+javaInstructionSozlu*2.0/10.0));
        System.out.println("Java Basic notu:"+(javaBasicYazili*8.0/10+javaBasicYazili*2.0/10.0));
        System.out.println("Java Advanced notu:"+(javaAdvancedYazılı*8.0/10+javaAdvancedSozlu*2.0/10.0));
        System.out.println("Java Project notu:"+(javaProYazılı*8.0/10+javaProSozlu*2.0/10.0));

        System.out.println("Ağırlıklı ortalama not="); double  agirlikliOrtalamaNot= javaAdvancedYazılı*javaAdYazKat+javaAdvancedSozlu*javaAdSozKat+javaBasicYazili*javaBasYazKat+
                javaBasicSozlu*javaBasSozKat+javaProSozlu*javaProSozKat+javaProYazılı*javaProYazKat+javaInstructionSozlu*javaInsSozKat+
                javaInstructionYazili*javaBasYazKat;

        if(agirlikliOrtalamaNot>50.0) {System.out.println("Geçti");}else{ System.out.println("Başarısız");}

        System.out.println("İşleminiz tamamlandı ana menuye yönlendiriliyorsunuz.");

        anaMenu();



    }
}
