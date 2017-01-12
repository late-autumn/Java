package Day05;

import java.util.Scanner;

public class Exam02 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int year, month,week,days,total=0;
	do{
	System.out.print("년도를 입력하세요:");
	year = sc.nextInt();
	System.out.print("월을 입력하세요:");
	month = sc.nextInt();
	}while(month<1 ||month>12);
	
	days = 31;
	if(month == 4 || month ==6 || month ==9 || month==11){
		days =30;
	}
	if(month ==2){
		if(year%4 ==0&&year%100!=0||year%400==0){
			days=29;
		}
		else {
			days =28;
		}
	}
	
	int n;
	
	/*for(int i=1;i<=month;i++){
		n = 31;
		if(i==4||i==6||i==9||i==11) n =30;
		if(i==2){
			if(year%4 ==0&&(year%100!=0||year%400==0)){
				n=29;
			}
			else {
				n =28;
			}
		}
		total +=n;
	}*/
	total = ((year-1)*365 + (year-1)/4 -(year-1)/100 + (year-1)/400) % 7;

	week = total % 7;

	System.out.printf("\n\t%d년 %d월 \n",year,month);
	System.out.println("월\t월\t화\t수\t목\t금\t토");
	System.out.println("===================================");

	for(int i=0;i<week;i++){
		System.out.print("\t");
	}
	for(int i=1;i<=days;i++){
		System.out.printf("%d\t",i);
		if(++week %7 ==0)
		{
			System.out.println();
		}
	}
	if(week%7!=0)
		System.out.println();
	
	System.out.println("===================================");
	}
}
