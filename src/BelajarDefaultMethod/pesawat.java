package BelajarDefaultMethod;

public interface pesawat extends defMethod{

    void drive();

    int getTire();

    default boolean isBig(){
        return false;
    }
// butuh solved


}
