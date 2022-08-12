public class PigLating {
    public static void main(String[] args)  {
       
      //  public class PigLatin {

   
         //   public static void main(String[] args)  {
            
            
            // char c;
            // String s1;    
            // String s = "piglatin";
            // StringBuilder sb = new StringBuilder(s);
            // c = s.charAt(0);
            // sb = sb.append(c).append("ay");
            // s1 = sb.toString(); 
            // s1 = s1.substring(1);   
            // System.out.println(s1);
            
                // siplit the sentince
            String str = "This is a simple sentence";
            String[] strg = str.split(" ");
            for (String word : strg) {
        
                System.out.print(encode(word) + " ");
            }
        
            }
        
           private static String encode(String word){
            char c;
            String s1;    
            String s = word;
            StringBuilder sb = new StringBuilder(s);
            c = s.charAt(0);
            sb = sb.append(c).append("ay");
            s1 = sb.toString(); 
            s1 = s1.substring(1);   
            //System.out.println(s1);
                return s1;
           }
        
        
       
       
        
    }

