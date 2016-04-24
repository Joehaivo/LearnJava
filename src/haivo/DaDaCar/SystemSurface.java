package haivo.DaDaCar;

import java.util.Scanner;

/**
 * Created by haivo on 2016/3/24.
 */
public class SystemSurface {
    public static void main(String[] args) {

        Trunk donfFeng = new Trunk("东风", 10, 400);
        Trunk jieFang = new Trunk("解放", 15, 500);
        Bus xueFuLan = new Bus("雪佛兰", 6, 200);
        Bus benz = new Bus("奔驰", 4, 300);
        PickUp fengJun = new PickUp("风骏", 4, 3, 200);
        PickUp tuoLuZhe = new PickUp("拓路者", 4, 5, 260);
        Car car[] = new Car[]{donfFeng,jieFang,xueFuLan,benz,fengJun,tuoLuZhe};
        String[] carInfo = new String[]{
                donfFeng.toString(),
                jieFang.toString(),
                xueFuLan.toString(),
                benz.toString(),
                fengJun.toString(),
                tuoLuZhe.toString()
        };

        System.out.println("欢迎使用达达租车系统.");
        System.out.println("以下是价目表：\n");
        System.out.println("序号\t\t汽车名称\t载客量\t载货量\t租金\t");
        for(int num =0;num<=carInfo.length-1;num++) {
            System.out.println(" "+(num+1)+"\t\t"+carInfo[num]);
        }
        System.out.println("您要租几辆车？");
        Scanner scanner = new Scanner(System.in);
        int carNumber = scanner.nextInt();//租车数量carNum
        int chooseNo[] = new int[20]; //要租的车的序号chooseNo数组保存
        for(int i=1;i<=carNumber;i++){
            System.out.print("请输入第"+i+"辆车的序号：");
            chooseNo[i] = scanner.nextInt();
        }
        int subPrice = 0;
        for(int i=1;i<=carNumber;i++){
            subPrice = subPrice + car[(chooseNo[i])-1].price;
        }
        System.out.println("您需要支付的金额是："+subPrice);
    }
}
