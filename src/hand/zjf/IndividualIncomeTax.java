package hand.zjf;

import java.util.Scanner;

public class IndividualIncomeTax {
	public static void main(String[] args){
		float tex = 0;
		float salary = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入工资:");	
		salary = input.nextFloat();
		tex = salary(salary);
		System.out.print("所需要纳税的税费为："+tex);
	}
	
	public static float salary(float salary){
		float num=0;
		if(salary<=1500){
			num += 1500*0.03;
		}else if(salary>1500&&salary<=4500){
			num += (salary-1500)*0.1;
		}else if(salary>4500&&salary<=9000){
			num += (salary-4500)*0.2;
		}else if(salary>9000&&salary<=35000){
			num += (salary-9000)*0.25;
		}else if(salary>35000&&salary<=55000){
			num += (salary-35000)*0.3;
		}else if(salary>55000&&salary<=80000){
			num += (salary-55000)*0.35;
		}else{
			num += (salary-80000)*0.45;
		}
		return num;	
	}
}
