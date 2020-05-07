#include<iostream>
#include<Windows.h>
#define max 2

using namespace std;		//定义命名空间

int PC_numbers(int i)
{
	cout << "你的机位是" << i << "号";
	return 0;
}
int back_money(int Int, int* money)
{
	int back = 0;
	back = *money - Int;
	cout << "缴费成功" << endl;
	cout << "应找您" << back << "元" << endl;
	Sleep(2000);		//线程休眠
	system("cls");		//清屏
	return 0;
}

int adult(void)
{
	int time = 0;
	int money = 0;
	
	cout << "选择上网时间" << endl;
	cout << "1---2小时，6元" << endl;
	cout << "2---4小时，10元" << endl;
	cout << "包夜,20元" << endl;	 
	cin >> time;
	switch (time)
	{
		case 1:
		{
			cout << "请缴费，6元" << endl;
			cin >> money;
			if (money < 6)
			{
				cout << "钱不够" << endl;
			}
			else
			{
				back_money(6,&money);
				/*cout << "应找您" << back_money_1 << endl;*/
			}
			break;
		}
		case 2:
		{
			cout << "请缴费，10元" << endl;
			cin >> money;
			if (money < 10)
			{
				cout << "钱不够" << endl;
			}
			else
			{
				back_money(10,&money);
				/*cout << "应找您" << back_money_1 << endl;*/
			}
			break;
		}
		case 3:
		{
			cout << "请缴费，20元" << endl;
			cin >> money;
			if (money < 20)
			{
				cout << "钱不够" << endl;
			}
			else
			{
				back_money(20,&money);
				/*cout << "应找您" << back_money_1 << endl;*/
			}
			break;
		}
		default:
			break;
	}
	return 0;
}
int main(void)
{
	int age = 0;
	cout << "欢迎登陆网咖柜台系统" << endl;
	int i = 0;
	while (true)
	{
		i++;
		cout << "输入年龄" << endl;
		cin >> age;
		if (age > 18)
		{
			if (i<max)
			{
				adult();
				PC_numbers(i);
			}
			
		}
		else
		{
			cout << "小屁孩上啥网，回家吃奶去吧" << endl;
		}
	}
	return 0;
}

