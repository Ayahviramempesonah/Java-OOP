package BelajarConstructorLagi;

public class BelajarConsApp {
    public static void main(String[] args) {
    /* kita membuat object dari class seperti contoh
        BelajarConstructorLagi kita jadikan sebagai
        object, dan kita bisa membuat banyhak object darinya */



        BelajarConstructorLagi dataSatu=new BelajarConstructorLagi("yusup",18);
        BelajarConstructorLagi dataDua=new BelajarConstructorLagi("bolang",8);

                // dibawah ini adalah cara kita untuk merubah
                // datanya
       // dataDua.name="airin";
        //dataDua.usia=15;
              //  dataSatu.name=" wahyu";
                //dataSatu.usia=17;
               // cara panggilnya adalah nama objectnya kemudian titik kemudian nama methodnya
                  dataSatu.cPanggil();
                  dataDua.cPanggil();



    }
}
