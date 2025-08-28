public class IterationStmt {

    public static void main(String[] args) {
        //ternary operator
        // if you have only if else condition then you can use ternary s
       // while loop
        // print 1 to 10
        int a = 1;
        while(a <=10){
            System.out.println(a);
            a++;
        }
        for(int b=0;b<3;b++,System.out.println("Hello World"));
        for(int c=1;c<=10;c++){
            int result = 5*c;
            System.out.println("5*"+c+"="+result);
        }
        for(int i = 1,j=1;i<=10;i++,j++){
            System.out.println(i+"*"+j+"="+i*j);
        }
        // Example of an infinite for loop (commented out)
        // for(;;) {
        //     System.out.println("Hi");
        // }
        
        // Example of a nested for loop (prints multiplication table)
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println(); // new line after each row
        }
        int rows = 5;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
