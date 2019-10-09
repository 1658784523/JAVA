package sample;


import java.util.Scanner;

class complexOperating {
    double realNumber;
    double virtualNumber;
    String virtualNumberI;

    //创建类对象的时候的构造函数
    complexOperating(double realNumber,String virtualNumberI){
        this.realNumber=realNumber;
        this.virtualNumber= Double.parseDouble(virtualNumberI.substring(0,(virtualNumberI.length()-1)));
    }

    //返回类对象时候的构造函数
    complexOperating(double realNumber,double virtualNumber){
        this.realNumber=realNumber;
        this.virtualNumber=virtualNumber;
        this.virtualNumberI= new String (this.virtualNumber+"i");
    }


    //复数相加
    public  complexOperating  add(complexOperating V){
        double a=realNumber+V.realNumber;
        double b=virtualNumber+V.virtualNumber;
        return new complexOperating(a,b);
    }

    //复数相减
    public complexOperating sub(complexOperating V){
        double a=realNumber-V.realNumber;
        double b=virtualNumber-V.virtualNumber;
        return new complexOperating(a,b);
    }

    //复数相乘
    public complexOperating multiply(complexOperating V){
        double a=realNumber*V.realNumber-virtualNumber*V.virtualNumber;
        double b=realNumber*V.virtualNumber+virtualNumber*V.realNumber;
        return new complexOperating(a,b);
    }

    //复数相除
    public complexOperating division(complexOperating V){
        double a=(realNumber*V.realNumber+virtualNumber*V.virtualNumber)/(V.realNumber*V.realNumber+V.virtualNumber*V.virtualNumber);
        double b=(virtualNumber*V.realNumber-realNumber*V.virtualNumber)/(V.realNumber*V.realNumber+V.virtualNumber*V.virtualNumber);
        return new complexOperating(a,b);
    }

    //表示结果
    public void show(){
        System.out.print("结果:"+realNumber+"+"+virtualNumberI);
    }

}



class 复数操作{
    public static void main(String args[]){
        int input1=0,input2=0;
        String inputS1=null,inputS2=null,choice;
        Scanner input=new Scanner(System.in);
        System.out.print("输入你选择的操作方式 + — * /:");
        choice=input.nextLine();
        System.out.print("输入第一个复数:");
        input1=input.nextInt();
        inputS1=input.nextLine();
        System.out.print("输入第一个复数:");
        input2=input.nextInt();
        inputS2=input.nextLine();

        complexOperating A=new complexOperating (input1,inputS1);
        complexOperating B=new complexOperating(input2,inputS2);
        complexOperating C;

        switch(choice){
            case "+":C=A.add(B); C.show();break;
            case "-":C=A.sub(B); C.show();break;
            case "*":C=A.multiply(B); C.show();break;
            case "/":C=A.division(B);C.show();break;
            default:break;

        }


    }
}
























