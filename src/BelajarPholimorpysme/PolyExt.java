package BelajarPholimorpysme;

public class PolyExt {
    String name;
    int age;
    String address;

    PolyExt( String nami,
            int agel,
            String addressl){
        String name=nami;
        int age=agel;
        String address=addressl;

    }

    public PolyExt(String nama) {
    }

    void coPanggil(){

       System.out.println("nama saya "+name +" usia saya "+age+"alamat saya "+address);
   }

}
