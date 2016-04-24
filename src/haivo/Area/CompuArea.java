package haivo.Area;

import java.util.Scanner;

/**
 * Created by haivo on 2016/4/22.
 */
public class CompuArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请问要计算哪个的面积 1.矩形 2.三角形 3.正方形 4.圆形");
        int inChoose = scanner.nextInt();
        float inputLength,inputWide;
        switch (inChoose){
            case 1: System.out.print("请输入长和宽：");
                inputLength = scanner.nextFloat();
                inputWide = scanner.nextFloat();
                Rectangle rectangle = new Rectangle(inputLength,inputWide);
                System.out.print("面积为："+rectangle.area);
                break;
            case 2: System.out.print("请输入长和高：");
                inputLength = scanner.nextFloat();
                inputWide = scanner.nextFloat();
                Triangle triangle = new Triangle(inputLength,inputWide);
                System.out.print("面积为："+triangle.area);
                break;
            case 3:System.out.print("请输入边长：");
                inputLength = scanner.nextFloat();
                Square square = new Square(inputLength);
                System.out.print("面积为："+square.area);
                break;
            case 4:System.out.print("请输入直径：");
                inputLength = scanner.nextFloat();
                Circle circle = new Circle(inputLength);
                System.out.print("面积为："+circle.area);
                break;
                default:
                    System.out.println("输入错误");
        }
    }
}
class Rectangle{
    public float length;
    public float wide;
    public float area;
    public Rectangle(){};
    public Rectangle(float inLength,float inWide){
        length = inLength;
        wide = inWide;
        area = inLength * inWide;
    }}

    class Triangle extends Rectangle{
        Triangle(float inLength,float inWide){
            length = inLength;
            wide = inWide;
            area = 0.5f * inLength * inWide;
        }
    }
    class Square extends Rectangle{
        public Square(){}
        public Square(float inLength){
            length = inLength;
            area = inLength * inLength;
        }
    }
    class Circle extends Square{
        public final float PI = 3.14f;
        public Circle(float inLength){
            length = inLength;
            area = 0.5f * PI * (inLength/2) * (inLength/2);
        }

    }