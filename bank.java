

/**
 * 1.用户登录界面,若用户输入ID passWord和预定义初始化ID相符，进入用户自定义操作界面 User_Inter()
 * 2.Switch分支,进入不同的分系统,查询,存款,取款,退出
 * 3.查询:系统输出存款,初始化存款由Math.random()方法随机生成,结束后返回User_Inter()
 * 4.存款:用户输入存款数额,进行存款自增计算,并更新存款数据,结束后返回User_Inter()
 * 5.取款:判断，若取款数额大于账户存款数额,则重新执行用户输入,若取款成功，则执行存款自减计算,并更新存款数据,结束后返回User_Inter()
 * 6.退出,利用延时算法,线程休眠2000ms后执行System。exit(0);并最终退出整个程序
 */

import java.util.Scanner;

//import static java.lang.System.*;

//定义ID 和 passWord常量
//abstract class constInt {
//    public static final int fadt_ID = 123;
//    public static final int fast_passWord = 321;
//}


public class bank {
    private static boolean isTrue;            //判断是否正确
    private static double Balance = Math.random() * 1000;          //账户余额
    private static double Deposit;          //取钱模块
    private static double Withdrawal;       //存钱模块
    private static String fadt_ID = "123";                //初始化ID
    private static String fast_passWord = "321";          //初始化passWord

    //查询函数
    static void Inquire() {
        System.out.println("您账户的当前余额为：" + Balance);
        User_Inter();
    }


    //取款函数
    static void Withdrawal() {
        System.out.println("欢迎进入取款页面，请输入取款金额");
        Scanner in = new Scanner(System.in);
        while (true) {
            //获取存款金额
            System.out.println("请输入您要取出的金额：");

            double Withdrawal = in.nextDouble();


            if (Balance <= Withdrawal) {
                System.out.println("余额不足，请重新输入");
                break;
            }
            Balance = Balance - Withdrawal;

            System.out.println("您取出了" + Withdrawal + "元" + "现在共有存款" + Balance);         //显示剩余余额

            System.out.println("继续请输入1,退出请输入0");         //获取是否继续存款1或者0
            Scanner sc = new Scanner(System.in);
            int jx = sc.nextInt();
            if (jx == 0) {
                return;
            } else {
                Withdrawal();
            }
            User_Inter();
        }
    }

    //存钱函数
    static void Deposit() {
        while (true) {
            System.out.println("欢迎进入存款页面，请输入取款金额");
            Scanner in = new Scanner(System.in);
            double Deposit = in.nextDouble();
            Balance = Balance + Deposit;
            System.out.println("您存入了" + Deposit + "元" + "现在共有存款" + Balance);
            System.out.println("继续请输入1,退出请输入0");         //获取是否继续存款1或者0
            Scanner sc = new Scanner(System.in);
            int jx = sc.nextInt();
            if (jx == 0) {
                return;
            } else {
                Deposit();
            }
            User_Inter();
        }
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
//        while (true) {

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
                System.out.println("感谢使用，系统将在两秒后自动退出，欢迎下次光临!");

                try {        //延时2秒，线程停滞
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
// TODO Auto-generated catch block
                    e.printStackTrace();
                }


                System.exit(0);      //退出程序
        }
//        }
    }


    public static void main(String[] args) {
        System.out.println("**********欢迎使用中国银行ATM**********");

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入你的ID:");
            Scanner in = new Scanner(System.in);
            String ID = in.next();
            System.out.println("请输入你的密码:");
            Scanner s = new Scanner(System.in);
            String passWord = s.next();

            if (ID.equals(fadt_ID) && passWord.equals(fast_passWord)) {
                System.out.println("恭喜你!登陆成功!");
                User_Inter();
                break;
            } else {
                System.out.println("密码错误!请重新输入!您还有" + (2 - i) + "次机会!");
            }
        }
    }
}

