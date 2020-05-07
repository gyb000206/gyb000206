#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>
#define N 100
int S1 = 0, S2 = 0, S3 = 0, man = 0, woman = 0, pl = 0, g = 0; //定义s为诊室，p1指针
int k;
struct hos
{
	char name[15]; //患者姓名
	char sex[10];  //患者性别
	char num[10];  //挂号单编号
	char year[10]; //患者年龄
	int room;      //被分到的诊室号
};

struct hos h[N];
struct hos* p = &h[0];
int introduce() //功能介绍introduce（）函数
{

	printf("	                    \n◎ 功 能 选 择 ◎                       \n");
	printf("┌──────────────────────────────┐\n");
	printf("│ ●1-挂号                                                   │\n");
	printf("│ ●2-叫号                                                   │\n");
	printf("│ ●3－分诊室                                                │\n");
	printf("│ ●4－显示各诊室队列信息                                    │\n");
	printf("│ ●5－统计当天就诊患者情况(要求按性别和任意年龄区段进行统计 │\n");
	printf("│ ●6－结束程序                                              │\n");
	printf("└──────────────────────────────┘\n");
	return 0;
}
int run()
{
	void introduce();
	void input();
	void jiaohao();
	void fp();
	void statistic();
	void type_statistic();
	char function = '1', j[10];
	while (function)
	{
		switch (function)
		{
		case '1':
			input();
			break;
		case '2':
			jiaohao();
			break;
		case '3':
			fp();
			break;
		case '4':
			statistic();
			break;
		case '5':
			type_statistic();
			break;
		case '6':
			exit(0);
			break;
		default:
			system("cls"); //清屏
			printf("\n\terror\n\n请重新输入: ");
		}
		printf("请选择功能");
		introduce();
		function = getchar();
		gets(j);
		while (isdigit(function) == 0) //isdigit(function):判断function字符是不是数字
		{
			printf("您输入有误,请重新输入");
			function = getchar();
			gets(j);
		}
	}
	return 0;
}

int input()
{
	int change(char);
	//	int d;
	char i, j[8], s[15];
	printf("请输入需要挂号的病人人数(请输入0到9之间的数):");
	i = getchar();
	gets(j);

	while (isdigit(i) == 0) //isdigit(i):判断i字符是不是数字
	{
		printf("您输入有误,请重新输入");
		i = getchar();
		gets(j);
	}
	printf("请输入%d位病人的个人信息\n", change(i));

	for (k = 1; k <= change(i); k++)
	{
		printf("第%2d位病人:\n", k);
		printf("姓名 :");
		strcpy(p[pl].name, gets(s));
		printf("编号 :");
		strcpy(p[pl].num, gets(s));
		/*	for(d=pl;d>=0;d--)
				{
					if(p[pl].num==p[d].num&&pl!=d)
					printf("error");
				}*/
		printf("性别 :");
		strcpy(p[pl].sex, gets(s));
		printf("年龄 :");
		strcpy(p[pl].year, gets(s));
		pl++;
	}

	printf("已经挂号的病人\n");

	for (k = g; k < pl; k++)
		printf("第%2d位 姓名： %s			挂号号码%s\n", k + 1 - g, p[k].name, p[k].num);
	system("pause"); //暂停
	system("cls");   //清屏
	return 0;
}

int jiaohao()
{
	if (g == pl)
	{
		system("cls");
		printf("所有病人都已经分配完毕\n");
		return;
	}
	printf("病人%s已前往就诊 挂号号码:%5s\n\n", p[g].name, p[g].num);
	g++;
	printf("剩余%2d位等待叫号的病人\n", pl - g);

	for (k = g; k < pl; k++)
		printf("挂号排序第%2d位 姓名：%s		挂号号码: %5s\n", k + 1 - g, p[k].name, p[k].num);
	system("pause");
	system("cls");
	return 0;
}

int fp() //分配诊室：fp（）函数
{

	S1 = 0;
	S2 = 0;
	S3 = 0;
	for (k = 0; k < g; k++)
	{
		if (atoi(p[k].year) >= 35)
		{
			S1++;
			p[k].room = 1;
		} //其中35(含35)岁以上的患者在第一诊室
		else if (strcmp(p[k].sex, "man") == 0)
		{
			S2++;
			p[k].room = 2;
		} //35岁以下男患者进第二诊室
		else
		{
			S3++;
			p[k].room = 3;
		} //其它的患者进第三诊室
		printf("病人%s被分配在第%d诊室\n", p[k].name, p[k].room, p[k].num);
	}
	system("pause");
	system("cls");
	return 0;
}

int  statistic() //病人信息输出：statistic( )函数
{
	for (k = 0; k < g; k++)
	{
		printf(" 第%2d名患者      姓名：%s		挂号编号：%s      诊室：第%d诊室\n", k + 1, p[k].name, p[k].num, p[k].room);
	}
	printf(" 第一诊室%2d人\n", S1);
	printf(" 第二诊室%2d人\n", S2);
	printf(" 第三诊室%2d人\n", S3);
	system("pause");
	system("cls");
	return 0;
}

int  type_statistic() //统计功能：type_statistic()函数
{
	int year, high = 0, low = 0;
	man = 0;
	woman = 0;

	for (k = 0; k < g; k++)
	{
		if (strcmp(p[k].sex, "man") == 0)
			man++;
		else
			woman++;
	}
	printf("请输入一个界限年龄:");
	scanf_s("%d", &year);

	for (k = 0; k < g; k++)
	{
		if (atoi(p[k].year) >= year)
			high++;
		else
			low++;
	}
	printf("共有%2d位患者就诊.\n", g);
	printf("其中男性患者有%2d位,", man);
	printf("女性患者有%2d位.\n", woman);
	printf("年纪大于等于%d的患者有%2d位,", year, high);
	printf("年纪小于%d的患者有%2d位.\n", year, low);
	system("pause");
	system("cls");
	return 0;
}

int main()
{
	system("color 70");
	introduce();
	run();
	return 0;
}
int change(char ch)     //将单个字符型数字转化为整形
{
	int i;
	i = ch - 48;
	return (i);
}
#endif
