package haivo.Multi;

/**
 * Created by haivo on 2016/3/23.
 */
public class JiuJiu {
    public static void main(String args[]){
        int i,j,k,h;
        for(i=1;i<=9;i++){
            for(h=i;h<=18-i;h++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                k = i * j;
                System.out.print(k+ " ");
            }
            System.out.println();
        }
    }
}
