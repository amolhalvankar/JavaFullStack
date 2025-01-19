
public class stringMethodsDemo {
    public static void main(String[] args) {
       String firstname= "Amol";
       String lastname= "Halvankar  ";
       String demoname="amol";
       
       //string concatination
        System.out.println(firstname.concat(lastname));
        
        //find length
        System.out.println(firstname.length());
        
        //contains method
        System.out.println(firstname.contains("Am"));
        
        //uppercase & lowercase
        System.out.println(firstname.toUpperCase());
        System.out.println(lastname.toLowerCase());
        
        //equals method
        System.out.println(firstname.equals(demoname));
        
        //trim method
        System.out.println(lastname.trim());
        
        
        //indexof method
        System.out.println(lastname.indexOf('n'));
    }
    
    
    
}
