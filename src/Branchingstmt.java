public class Branchingstmt {
    public static void main(String[] args) {
        //branching helps you to flow of execution from one part of a program to another
        // 3 types, break , continue,
        // break is used in switches, for loops to break the execution of for loop at the condtion , stops the whole execution of loop
        for(int i=0;i<3;i++){
            if(i==2){
                break;
            }
            System.out.println(i);
        }
       // another example
//        for(int i=0;i<=3;i++){
//            for(int j=1;j<=3;j++){
//                if(j==2){
//                    break;
//                }
//                System.out.println("i="+i+" j="+j);
//            }
//        }
        //by using labels for the loop, we can break outerloop execution from the inner loop.
        //labelled outerloop and innerloop for continue and break
        outerForLoop:
        for(int i = 0; i<=3; i++){
            innerForLoop:
            for(int j=1;j<=3;j++){
                if(j==3) {
                    break outerForLoop;
                }
                System.out.println("i="+i+" j="+j);
            }}

    }
}
