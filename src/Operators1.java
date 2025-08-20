public class Operators1 {


    String name;

    public Operators1(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        // expression is combination of one or more values, operators and method invocation that prodcues result
        //two types, primary and complex
        // primary expresssion are simplest expressions
        //3.4, false, isValid
        System.out.println(false);
        System.out.println(3.4);
        //complex expressions are made by using operators to combine primary expressions
        // int a = 30;
        boolean var = true;
        System.out.println(var);

        // Assignment operator , binary operator,
        // right associative because it is evaluated from right to left
        // Associativty of operators refers to order in which operators of same precedence (priority) are evaluated in expression
        int c = 20;// c and 20 are operands
        boolean isvalid = true;
        int var1,var2,var3;
        var1=var2=var3=30;
        System.out.println(var1);

        Operators1 obj1 = new Operators1("Akhila");
        Operators1 obj2 = new Operators1("durga");
        System.out.println(obj1.name);
        obj1=obj2;
        System.out.println(obj1.name);
        //declaration int a;
        // initialization int a=10; assigning value at timeof declaration
        // asssignment a=10; is assigning value fater declaration




    }
}
