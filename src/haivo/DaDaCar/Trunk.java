package haivo.DaDaCar;

/**
 * 卡车（东风，解放）
 * Created by haivo on 2016/3/24.
 */
public class Trunk extends Car{
    public Trunk(String name,int trunkLoad,int price){
        this.name = name;
        this.trunkLoad = trunkLoad;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s\t\t%s\t\t%d%s\t\t%d%s", name,"-",trunkLoad,"吨",price,"元/天");
    }
}
