package haivo.DaDaCar;

/**
 * 皮卡（风骏，拓路者）
 * Created by haivo on 2016/3/24.
 */
public class PickUp extends Car {
    public PickUp(String name,int busLoad,int trunkLoad,int price){
        this.name = name;
        this.busLoad = busLoad;
        this.trunkLoad = trunkLoad;
        this.price = price;
    }
    @Override
    public String toString() {
        return String.format("%3s\t%d%s\t\t%d%s\t\t%d%s", name,busLoad,"人",trunkLoad,"吨",price,"元/天");
    }
}
