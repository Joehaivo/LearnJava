package haivo.OvyearException;

/**
 * Created by haivo on 2016/3/30.
 */
public class Ovyear extends Exception {
    Ovyear(String  s){
        super(s);
    }
    public void printMsg(){
        System.out.println(this.getMessage());
    }
}
