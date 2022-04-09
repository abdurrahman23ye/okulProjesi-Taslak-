package okulProjesi;


public class NotIslemleri extends NotIslemleriDepo{


    public static void main(String[] args) {
        ogrenciNotVerme();
    }

    protected static void ogrenciNotVerme() {

        System.out.println("Lütfen not vermek istediğiniz öğrencinin adını yazınız.");

        String oNot=scan.next();
        System.out.println("Lütfen not vermek istediğiniz öğrencinin soyadını yazınız.");

        String oNot2=scan.next();

        String isimSoyisim=oNot.concat(" ").concat(oNot2);
       int sayac=0;

        if(true){for (int i = 0; i <QE.size() ; i++) {
            if(QE.contains(isimSoyisim)){sayac++;}}}

        else if(true){

        for (int i = 0; i <developer.size() ; i++) {
            if(QE.contains(isimSoyisim)){sayac++;}

        }}

        notgosterme(isimSoyisim);



        if(sayac<1){
            System.out.println("Hatalı giriş yaptınız. Öğrenci listesinden not vermek istediğiniz öğrencinin ismini kontrol ediniz.");

            System.out.println("QE="+QE);
            System.out.println("Developer="+developer);

            System.out.println("Lütfen listeden not vermek istediğiniz öğrencinin adını kontrol edip yazınız");
            oNot=scan.next();
            System.out.println("Lütfen listeden not vermek istediğiniz öğrencinin adını kontrol edip yazınız");
            oNot2=scan.next();

            notgosterme(isimSoyisim);





        }

    }

    protected static void notgosterme(String isimSoyisim) {

        System.out.println(isimSoyisim+" notlarını giriniz.");

        notGirme();

    }
}
