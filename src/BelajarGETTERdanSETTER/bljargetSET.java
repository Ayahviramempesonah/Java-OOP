package BelajarGETTERdanSETTER;

public class bljargetSET {

    private String id;

    private boolean expensive;

    public  String getId(){


        return id;
    }



    public void setId(String id ){
        if (id != null){
            this.id=id;
        }



    }

    public boolean isExpensive(){

        return this.expensive;
    }


    public void setExpensive(boolean expensive){
        this.expensive=expensive;


    }








}
