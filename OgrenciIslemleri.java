package okulProjesi;

public class OgrenciIslemleri extends AnaMenu {
    public static void main(String[] args) {
        ogrenciIslemleri();

    }

    public static void ogrenciIslemleri() {

        System.out.println("Lütfen yapmak istediğiniz işlemi belirtiniz\n1.Öğrenci kaydı\n2.Öğrenci kayıt silme\n3.Öğrenci listeleri\n4.Çıkış\n5.AnaMenuye Dönüş");

       int oTercih1=scan.nextInt();

       switch (oTercih1){

           case 1:
               System.out.println("Lütfen öğrenciyi kaydetmek istediğiniz kursun numarısnı giriniz. \n1.QE \n2.Developer");

              int oTercih2=scan.nextInt();

              switch (oTercih2){

                  case 1:
                      System.out.println("Lütfen öğrencinin adını giriniz");
                      String isim=scan.next();
                      System.out.println("Lütfen öğrencinin Soyadını giriniz");
                      String soyIsim=scan.next();

                      QE.add(isim.concat(" ").concat(soyIsim));

                      System.out.println("işleminiz tamamlandı.Üst menuye yönlendiriliyorsunuz.");

                      ogrenciIslemleri(); break;

                  case 2:
                      System.out.println("Lütfen öğrencinin adını giriniz");
                      String isim1=scan.next();
                      System.out.println("Lütfen öğrencinin Soyadını giriniz");
                      String soyIsim1=scan.next();

                      developer.add(isim1.concat(" ").concat(soyIsim1));

                      System.out.println("işleminiz tamamlandı.Üst menuye yönlendiriliyorsunuz.");

                      ogrenciIslemleri(); break;

                  default:
                      System.out.println("Hatalı işlem yaptınız. Üst menuye yönlendiriliyorsunuz");

                      ogrenciIslemleri();

              }

           case 2:
               System.out.println("Lütfen silmek istediğiniz öğrencinin hangi kursta olduğunu giriniz \n1.QE \n2.Developer");

               int oTercih3=scan.nextInt();

           switch (oTercih3){

               case 1: if(QE.isEmpty()){
                   System.out.println("Kayıtlı öğrenci mevcut değil üst menuye yönlendiriliyorsunuz."); ogrenciIslemleri();}

                   else{ int sayac=0;
                   for (int i = 0; i <QE.size() ; i++) {

                       System.out.println(sayac+" "+ QE.get(i));


                   }  System.out.println("Lütfen silmek istediğiniz öğrencinin numarasını giriniz.");


                   int oSilme=scan.nextInt();

                   if(oSilme>sayac || oSilme<0){
                       System.out.println("Hatalı işlem yaptınız. Üst menuye yönlendiriliyorsunuz"); ogrenciIslemleri();
                   }

                   QE.remove(oSilme); System.out.println("işlem başarılı üst menüye yönlendiriliyorsunuz.");ogrenciIslemleri();
               }
               case 2:  if(developer.isEmpty()){
                   System.out.println("Kayıtlı öğrenci mevcut değil üst menuye yönlendiriliyorsunuz."); ogrenciIslemleri();}

               else{ int sayac=0;
                   for (int i = 0; i <developer.size() ; i++) {

                       System.out.println(sayac+" "+ developer.get(i));


                   }  System.out.println("Lütfen silmek istediğiniz öğrencinin numarasını giriniz.");


                   int oSilme1=scan.nextInt();

                   if(oSilme1>sayac || oSilme1<0){
                       System.out.println("Hatalı işlem yaptınız. Üst menuye yönlendiriliyorsunuz"); ogrenciIslemleri();
                   }

                   developer.remove(oSilme1);
                   System.out.println("işlem başarılı üst menüye yönlendiriliyorsunuz.");ogrenciIslemleri();
               }

               default:
                   System.out.println("Hatalı işlem yaptınız. Üst menuye yönlendiriliyorsunuz"); ogrenciIslemleri();
           }

           case 3:
               System.out.println("Lütfen listesine ulaşmak istediğiniz sınıfı belirtiniz. \n1.QE \n2.Developer");

               int oliste=scan.nextInt();

               switch (oliste){

                   case 1:
                       System.out.println(QE);
                       System.out.println("Liste oluşturuldu.Üst menuye yönlendirileceksiniz.");ogrenciIslemleri();break;
                   case 2:
                       System.out.println(developer); System.out.println("Liste oluşturuldu.Üst menuye yönlendirileceksiniz.");ogrenciIslemleri(); break;
                   default:
                       System.out.println("Hatalı işlem yaptınız. Üst menuye yönlendiriliyorsunuz"); ogrenciIslemleri();
               break;}
           case 4:
               System.out.println("Hoşçakalın"); break;
           case 5: anaMenu();break;
           default:System.out.println("Hatalı işlem yaptınız. Üst menuye yönlendiriliyorsunuz"); ogrenciIslemleri();}


       }
    }






