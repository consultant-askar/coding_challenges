import java.util.*;
public class App {

    public static String evenOrOdd(int x) {
        String result;
       if (x % 2 == 0){
        result = "Even";
        return result;
       }else {
        result = "Odd";
        return result;
       }
    }

    public static void main(String[] args) throws Exception {
        
        int number;
        String result;
        Scanner myObj = new Scanner (System.in);
        System.out.println("Enter a number :\n");
        number =Integer.parseInt(myObj.nextLine());
        result =evenOrOdd(number);
        System.out.println("you entered :" + number);
        System.out.println(number + " is an " + result+ " number");

        //System.out.println(input + " is "  + envenOrOdd(input) + " number");
        myObj.close();


        
    }
}
