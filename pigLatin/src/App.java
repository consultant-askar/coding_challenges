
public class App {

   
    public static void main(String[] args) throws Exception {
    char c;
    String s1;    
    String s = "piglatin";
    StringBuilder sb = new StringBuilder(s);
    c = s.charAt(0);
    sb = sb.append(c).append("ay");
    s1 = sb.toString(); 
    s1 = s1.substring(1);   
    System.out.println(s1);
    

    }


}
