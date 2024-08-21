//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int elma =50;
        double nar =23.5;
        float sakiz =0.25f;
        byte muz =120;
        //toplami tanimlamadik neyle tanimlayalim ondalik olsun double//
        double Toplam;
        Toplam =elma+nar+sakiz+muz;
        System.out.println("Toplam"+Toplam);

    }
}
/* en onemli konu neden float daf harfini koydum ve neden koydum
float ondalikli sayilari temsil eder ancak javada ondalık ondalık sayı
varsayılan tur double dır double float agore hassas sayıyı float tanımlamak
ıstıyorsak javada belırtmek gerekır ve buyuk yada kucuk harf olması onemlı
degıldır 0.25F yada 0.25f yazilabilir eger eklemz isek kodumuz calismaz hata verir
 */