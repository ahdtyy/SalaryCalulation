package hello;

import java.util.Scanner;

public class SalaryCalculation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("*********酷酷的薪水计算器********");
        System.out.println("1.输入88，退出程序\n2.输入66,计算下一个年薪");

        while(true){
            System.out.println("请输入月薪：");
            int monthSalary  = s.nextInt();
            System.out.println("请输入一年几薪：");
            int monthNumberinYear = s.nextInt();
            int yearSalary = monthSalary*monthNumberinYear;   //年薪

            System.out.println("年薪是"+yearSalary);

            if(yearSalary>10000000){
                System.out.println("牛逼，B操不完！");
            }else if (yearSalary>1000000){
                System.out.println("还不错，有很多B能操！");
            }else{
                System.out.println("细狗，好可怜！");
            }

            System.out.println("输入88,大侠重新来过！输入66,就地重启！其他，没长小鸡鸡！！！");

            int command =s.nextInt();
            if (command == 88){
                System.out.println("88了，大侠，你未1000来的妻子将被我疼爱！！！哈哈");
                break;
            }else if (command ==66){
                System.out.println("唉，绿帽，何必呢，看我骑你老婆爽吗！！！哈哈");
                continue;
            }
        }
    }
}
