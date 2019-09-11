package sample;
import java.util.Scanner;

class Main{
    public static  void main(String args[]){
        Scanner input=new Scanner(System.in);
        double x1,x2,x,ds,section,sum=0;
        System.out.println("输入变量x1,x2:");
        x1=input.nextDouble();
        x2=input.nextDouble();
        section=(x2-x1)/100;
        x=x1;
        for(int i=0;i<100;i++){
            ds=section*(x+section)*(x+section);
            sum=sum+ds;
            x=x+section;
        }

        System.out.print(sum);

    }
}