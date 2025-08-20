import java.time.chrono.MinguoDate;

public class Operators {
    public static void main(String[] args) {
        //operator is symbol which carries out specific code
        // operand is value or variable  which gets manipulated by operator
        // +,- are operators , variables used instead of literals are operands.
       //Based on no of operands , types of operators, unary, binary , ternary operators
        int a= 5;
        // unary operator
         a++;
        System.out.println(a);
        //binary operator
        int c = a+a;
        System.out.println(c);
        // ternary operator , operator which controls three opeerands at once
        // (condition = operand) ? stmt1=operand : stmt2=operand
        // if condition is true , stmt1 otherwise stmt2 will be printed.
        // syntax operand1 operator1 operand2 operator2 operand3
        String d = (c>a)?"c greater than a":"c lessthan a";
        System.out.println(d);
        // based on type operators, 4 types, arithmetic, relational,logical, bitwise
        //arithemtic operators do mathematical operations on numerical values
        // +,-,*,/,%
        // relational operators compare values and produce boolean result
        //==,>,<,>=,<=
        //logical operators perform logical operations and combine boolean values
        // &&,||,! logical and, logical or , logical not
        // bitwise operators used for bit-level operations on  integral values
        // &,|,^,~,<<,>> bitwise AND, bitwise OR,bitwise XOR, bitwise NOT, left shift, rightshift




    }
}
