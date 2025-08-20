import java.io.FilterOutputStream;

public class OperatorsArithmetic {
    public static void main(String[] args) {
        //Artihmetic +,-,*,/,%, = unary plus, - unary minus,++,--,+=,-=,*=,/=,%=
        //operates on datatypes byte,short,char,long,float,double
        // dont support boolean or reference types as operands
        byte b1=111;
        byte b2=112;
        int c=b1+b2;
        byte b3;
        b3=2+3; // unique sscenario = int+int = int but it is stored in byte as 5 fits in byte range
        // float + int
        System.out.println(3.3f+4); //int + float =float value
        System.out.println(33.3+4);// double + int = double
        System.out.println('e'+3);// char + int = int
        System.out.println(c);//byte+byte = int
        // String concatenation
        String s = null;
        System.out.println("str"+3);  //str3
        System.out.println(true+"str"); //truestr boolean+string
        System.out.println(s+"str"); // nullstr null string+string , null will be takens as string
        System.out.println(""+3+2);
        //divison - operands are intergers, byte,short,char,int or long, result will always be integer
        System.out.println(21/2);
        System.out.println(21.2345/2.3); //if one is double,then it gives double
        System.out.println(21.3f/2); //if one is float,then it gives float
        //System.out.println(21/0); // artithmetic exception
        System.out.println(21.6f/0);




    }
}
