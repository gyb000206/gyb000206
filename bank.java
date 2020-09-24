


import java.util.Scanner;

//import static java.lang.System.*;

//定义ID 和 passWord常量
abstract class constInt {
    public static final int fadt_ID = 123;
    public static final int fast_passWord = 321;
}


public class bank {
    private static boolean isTrue;            //判断是否正确
    private static double Balance=Math.random()*1000;          //账户余额
    private static double Deposit;          //取钱模块
    private static double Withdrawal;       //存钱模块

    //查询函数
    static void Inquire() {

        System.out.println("您账户的当前余额为：" + Balance);
    }

    //取款函数
    static void Withdrawal() {
        System.out.println("请输入取款数目");
        Scanner in = new Scanner(System.in);
        double User_Deposit = in.nextDouble();
//        while () {
        rest:if (Balance >= User_Deposit) {
            System.out.println("当前余额:" + (Balance - User_Deposit));         //显示剩余余额
            return;
        } else {
            System.out.println("余额不足，请重新输入");
            break rest;
        }
//        }
    }

    //存钱函数
    static void Deposit() {
        System.out.println("请输入存款数目");
        Scanner in = new Scanner(System.in);
        double User_Withdrawal = in.nextDouble();
        System.out.println("账户余额为：" + (User_Withdrawal + Balance));
    }

    //用户自定义操作函数
    static void User_Inter() {
        System.out.println("1.查询账户");
        System.out.println("2.存款");
        System.out.println("3.取款");
        System.out.println("4.退出");
        System.out.println("请选择您的业务");
        Scanner in = new Scanner(System.in);
        int Inter = in.nextInt();
        //当boolean判断为true
//        while () {
        switch (Inter) {                 //switch选择自定义操作
            case 1:
                Inquire();//查询函数
                break;
            case 2:
                Deposit();//存款函数
                break;
            case 3:
                Withdrawal();//取款函数
                break;
            case 4:
                System.out.println("感谢使用，欢迎下次光临!");
                System.exit(0);      //退出程序
        }
//        }
    }


    public static void main(String[] args) {
        System.out.println("**********欢迎使用中国银行ATM**********");

        System.out.println("请输入你的ID,密码");

        Scanner in = new Scanner(System.in);
        System.out.print("ID=");
        int ID = in.nextInt();          //输入银行卡号
        System.out.print("passWord=");
        int passWord = in.nextInt();        //输入密码

        int error_Number = 0;               //定义密码输入错误次数

        while (error_Number <= 3) {
            if (ID == constInt.fadt_ID && passWord == constInt.fast_passWord) {       //判断是否正确
                User_Inter();//用户自定义操作函数
                boolean True = true;//判断为true
            } else {                          //若密码输入错误
                System.out.println("密码输入错误，请重新输入");
                error_Number++;             //错误次数累计
                if (error_Number >= 3) {       //超过3次自动退出程序
                    System.out.println("密码输入错误超过3次，禁止操作");
                    System.exit(0);     //退出
                }
            }
        }
    }
}

