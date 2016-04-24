package haivo.DaDaCar;

/**
 * 小轿车（奔驰，雪佛兰）
 * Created by haivo on 2016/3/24.
 */
public class Bus extends Car {
    public Bus(String name,int busLoad,int price){
        this.name = name;
        this.busLoad = busLoad;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%3s\t%d%s\t\t%s\t\t%d%s", name,busLoad,"人","-",price,"元/天");
    }
}
