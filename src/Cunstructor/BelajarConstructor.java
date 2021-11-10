package Cunstructor;

public  class BelajarConstructor {



    BelajarConstructor construk=new BelajarConstructor();
BelajarConstructor satu=new BelajarConstructor();



    String namanya;
    int usianya;
    public static void main(String[] args) {
        BelajarConstructor data=new BelajarConstructor();


    }
}



class  construk {

    String name;
    int usia;

    construk(String nama,int age){
name=nama;
usia=age;
    }


    void pg(String jng){
        System.out.println("nama saya "+jng + " usia saya "+usia);
    }
}