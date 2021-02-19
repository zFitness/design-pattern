package 设计原则.calc;

import java.util.Scanner;

/**
 * @author zheng
 * @description 用面向对象语言实现一个计算器控制台程序, 输入两个数和符号，返回结果
 *
 * 没有使用面向对象思想的垃圾程序
 *
 * @date 2021/1/23
 */
public class Calc1 {
    public static void main(String[] args) {
        System.out.println("输入两个数和符号:");
        Scanner sc = new Scanner(System.in);
        String o1 = sc.next();
        String o2 = sc.next();
        String pre = sc.next();

        // 判断 o1, o2 是否为数字
        try {
            double oi1 = Double.parseDouble(o1);
            double oi2 = Double.parseDouble(o2);

            switch (pre) {
                case "+":
                    System.out.printf("%s %s %s = %s", o1, pre, o2, (oi1 + oi2));
                    break;
                case "-":
                    System.out.printf("%s %s %s = %s", o1, pre, o2, (oi1 - oi2));
                    break;
                case "*":
                    System.out.printf("%s %s %s = %s", o1, pre, o2, (oi1 * oi2));
                    break;
                case "/":
                    System.out.printf("%s %s %s = %s", o1, pre, o2, (oi1 / oi2));
                    break;
                default:
                    System.out.println("请输入正确的运算符");
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("请输入数字");
        }


    }
}
