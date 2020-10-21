import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.util.Scanner;

/**
 * 定义一个客户类
 */
class Customer {
    String name;
    /**
     * 姓名
     */
    int age;
    /**
     * 年龄
     */
    int selectItem;
    /**
     * 客户选择的项目
     */
    int PalCast;
    /**
     * 用户支付数额
     */
}

/**
 * 定义一个上网服务项目的类
 */
class Item {
    int time;
    /**
     * 上网时间
     */
    int Price;
    /**
     * 上网费用
     */
    public static int pcNumber_MAX = 100;
    /**
     * 网吧机位
     */

}

/**
 * @author 高宇博2503190213
 */
public class Modify {
    static Scanner in = new Scanner(System.in);
    static Customer customer = new Customer();
    static Item item = new Item();
    private static boolean isTrue;
    private static int pcNumber;
    private static boolean Goon;


    /**
     * 分配机位方法
     */
    static void computer(int pcNumber) {

        pcNumber = (int) Math.random() * 100 * 10;
        if (pcNumber < Item.pcNumber_MAX) {
            isTrue = true;
        } else {
            isTrue = false;
        }

    }

    /**
     * 找零方法
     */
    static void Change(int PAl, int Price) {
        if (PAl > Price) {
            //若PAL>price,则计算找零
            System.out.println("找零" + (PAl - Price) + "元");
        }
        return;
    }

    /**
     * 支付方法
     */
    static void Pal(int time, int price) {

        computer(pcNumber);
        //先进行网吧机位的判断，若机位够，则返回true;否则返回false
        item.time = time;
        item.Price = price;
        System.out.println("上机时间为" + item.time + "小时,需支付" + item.Price + "元");
        System.out.println("请支付:");
        customer.PalCast = in.nextInt();
        if (customer.PalCast < price) {
            System.out.println("您支付了" + customer.PalCast + "元,钱不够，支付失败，请重新支付！");
            Pal(time, price);
        } else if (isTrue == false) {
            System.out.println("网吧机位不够，开票失败");
            return;
        } else if (customer.PalCast >= price && (isTrue == true)) {
            System.out.println("开票成功");
            Change(customer.PalCast, price);
            //判断是否需要找零
            System.out.println("您的机位为" + pcNumber + "号,祝您上机愉快！！");


        }
    }

    /**
     * 开票方法
     */
    static void Billing() {
//        Scanner in = new Scanner(System.in);
//        Customer customer = new Customer();
//        Item item = new Item();
        System.out.println("选择你的上网时间");
        System.out.println("1---2小时");
        System.out.println("2---包时");
        System.out.println("3---夜机");
        customer.selectItem = in.nextInt();
        //使用switch分支结构进行用户选择

        switch (customer.selectItem) {
            case 1: {
                Pal(2, 6);
                //调用Pal方法,将上网时长和所需费用传递
                break;
            }
            case 2: {
                Pal(4, 10);
                break;
            }
            case 3: {
                Pal(8, 20);
                break;
            }
        }
    }

    //系统菜单方法
    public static void Menu() {
        Customer customer = new Customer();
        int AgeLimit = 18;
        //规定上网的年龄限制为18岁
        System.out.println("----欢迎登陆网吧前台管理系统----");
        System.out.println("请输入您的姓名");
        customer.name = in.nextLine();
        //输入客户姓名
        System.out.println("请输入您的年龄");
        customer.age = in.nextInt();
        //输入客户年龄
        if (customer.age < AgeLimit) {
            //判断客户的年龄，若小于18岁，则退出程序。
            System.out.println("未成年人禁止上网！！");
            return;
        }
        Billing();
        //年龄大于18岁，可以上网
        //  开票
    }

    public static void main(String[] args) {
        Menu();
        //调用菜单函数Menu()
    }


}
