import java.util.Scanner;

public class Main {
    /*机位分配*/
    public static void PC_numbers(int i) {
        System.out.println("你的机位是" + i + "号");
    }

    /*找钱模块*/
    public static void back_money(int Int, int val) {
        int pay_val = 0;
        pay_val = Int - val;
        System.out.println("找您" + pay_val + "元");
    }

    /*支付控制模块*/
    public static void pay_Int(int mon) {
        Scanner in = new Scanner(System.in);
        System.out.println("请支付" + mon + "元");
        int Int = in.nextInt();
        if (Int >= mon) {
            System.out.println("开票成功");
            back_money(Int, 6);

        } else {
            System.out.println("钱不够");
        }
    }

    /*用户选择模块*/
    public static void adult() {
        Scanner in = new Scanner(System.in);
        System.out.println("选择你的上网时间");
        System.out.println("1---2小时");
        System.out.println("2---包时");
        System.out.println("3---夜机");
        int time = in.nextInt();
        switch (time) {
            case 1: {
//                System.out.println("请支付6元");
                pay_Int(6);
                break;
            }
            case 2: {
//                System.out.println("请支付10元");
                pay_Int(10);
                break;
            }
            case 3: {
//                System.out.println("请支付20元");
                pay_Int(20);
                break;
            }
            default:
//                throw new IllegalStateException("Unexpected value: " + time);
        }
    }


    public static void main(String[] args) {
//        System.out.println("Hello World");
        Scanner in = new Scanner(System.in);
        int i = 0;
        System.out.println("欢迎登陆网吧前台管理系统");
        while (true) {
            System.out.println("请输入年龄");
            int age = in.nextInt();
            i++;
            if (age >= 18) {
                if (i <= 2) {
                    adult();
                    PC_numbers(i);
                } else {
                    System.out.println("机位不够");
                }
            } else {
                System.out.println("未成年人禁止上网");
            }
        }
    }
}
