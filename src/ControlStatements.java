public class ControlStatements {
    //statement is code logic
    // 4 types, selection if-else,iteration-while loop,branching-break,continue,exception handling stmts-try-catch
    //  if else
    public static void main(String[] args) {
        int inputNumber = 9;
        if(inputNumber %2 == 0){
            System.out.println("given number is even");

        }else{
            System.out.println("given number is odd");
        }
        // find the day - you can use ifelse or switch
        String whatisToday = "Wednesday";
        if (whatisToday.equals("Monday")){
            System.out.println("this is weekday");
        } else if (whatisToday.equals("Tuesday")) {
            System.out.println("this is weekday");
        }else if (whatisToday.equals("Wednesday")) {
            System.out.println("this is weekday");
        }else if (whatisToday.equals("Thursday")) {
            System.out.println("this is weekday");
        }else if (whatisToday.equals("Friday")) {
            System.out.println("this is weekday");
        }else if (whatisToday.equals("Saturday")) {
            System.out.println("this is weekend");
        }else if (whatisToday.equals("Sunday")) {
            System.out.println("this is weekend");
        }else{
            System.out.println("invalid input");
        }
        // shorten the code above
        if(whatisToday.equals("Monday")||whatisToday.equals("Tuesday")||
                whatisToday.equals("Wednesday")||whatisToday.equals("Thursday")||whatisToday.equals("Friday")){
            System.out.println("this is weekday");
        } else if (whatisToday.equals("Saturday")||whatisToday.equals("Sunday")) {
            System.out.println("this is weekend");
        } else{
            System.out.println("input invalid");
        }
        // sometimes we want to executed even if the condition is false, then use not operator
        // if only one else block or else if block or if block is there, we dont need to put braces but it is not advisory
        //beacuseit doesnot promote readbility
        int number = 9;
        if(!(number==0)){
            System.out.println("number is not equal to zero");
        }else
            System.out.println("number is zero");
        // nested if- if in if
        //nested ifelse - ifelseifelse
        String dayOfweek="Sunday";
        if(dayOfweek.equals("Sunday") || dayOfweek.equals(("Saturday"))){
            System.out.println("weekend vibes");
            if(dayOfweek.equals("Sunday")){
                System.out.println("party vibes");
            }else{System.out.println("resting vibes");
        }}
    }

}





