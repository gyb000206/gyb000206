

import java.util.Scanner;

import static javax.management.Query.in;

//import static java.lang.System.*;

public class demo {
    private static Scanner in;

    //     final int money=0;
    public static void adult() {
        int money = 0;
        System.out.println("请选择你的上网时间");
        System.out.println("1---2小时");
        System.out.println("2---包时");
        System.out.println("3---夜机");
        int time = in.nextInt();
        switch (time) {
            case 1: {
                System.out.println("支付6元");
                money = in.nextInt();
                if (money == 6) {
                    System.out.println("上机愉快");
                } else if (money <= 6) {
                    System.out.println("没钱上你马呢");
//                        exit(0);
                    break;
                }
            }
            case 2: {
                System.out.println("支付10元");
                money = in.nextInt();
                if (money == 6) {
                    System.out.println("上机愉快");
                } else if (money <= 10) {
                    System.out.println("没钱上你马呢");
//                        exit(0);
                    break;
                }
            }
            case 3: {
                System.out.println("支付20元");
                money = in.nextInt();
                if (money == 6) {
                    System.out.println("上机愉快");
                } else if (money <= 20) {
                    System.out.println("没钱上你马呢");
//                        exit(0);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入年龄");
        int age = in.nextInt();
//        int money = 0;
        if (age > 18) {
            adult();
        }
    }
}
