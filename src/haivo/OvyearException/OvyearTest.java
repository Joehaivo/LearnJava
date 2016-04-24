package haivo.OvyearException;

import java.util.Scanner;

/**
 * 测试自定义异常
 * Created by haivo on 2016/3/30.
 */
public class OvyearTest {
    public static void main(String[] args) {
        OvyearTest ot = new OvyearTest();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input year: ");
        int keyBoardInputYear = scanner.nextInt();
        ot.age(keyBoardInputYear);
    }

    public void OutOfYear(int year) throws Ovyear {
        if (year > 2016 || year < 1900) {
            throw new Ovyear("年份错误");
        } else {
            System.out.println("年龄：" + (2016 - year));
        }
    }

    public void age(int inputYear) {
        try {
            OutOfYear(inputYear);
        } catch (Ovyear o) {
            o.printMsg();
        }
    }
}
