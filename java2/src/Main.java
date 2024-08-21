
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("int max=" + Integer.MAX_VALUE);
        System.out.println("float max=" + Float.MAX_VALUE);
        System.out.println("Byte min=" + Byte.MIN_VALUE);
        System.out.println("byte kapasite=" + Byte.SIZE + "bit");
        System.out.println("int kapasite=" + Integer.SIZE + "bit");
    /*neden integer da bit yazdik derseniz bit olma sebebi burada istenilen
       ifade string yani metin olmasi bize int kapasitesini sormus int
       kapasitesi de bir metin olacagindan bit dedik
     */

    }
}
/*en tartisilan konuya el atmak isterim neden byte neden -128 den +127 e
kadar cunku bilgisayar sis ikilik sistemkerden olusuyor 0 yada 1 lerden
 1 BYTE 8 bit ve biz en fazla ikilik sistemden 2 uzeri 8 dersek toplamda
 256 farkli degeri temsil eder degil mi o zaman -128 den -1 e kadar negatif
 0 dan 127 e kadar pozitif degerleri temsil eder neden 0 dan 127 cunku
 0 dan 127 e kadar 128 deger var -128 den -1 e kadar 128 deger var toplami
 256 deger vardir bu yuzden -128 den 127 e kadardir
 */
// bu arada bit 2li binary sistemdir 8bit =1 Byte dir//