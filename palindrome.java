public class palindrome {
    public static void main (String[] args){
        int n = 121, reverse = 0; 
        int duplicate = n; 
        while(n != 0)   
        {  
        int remainder = n % 10;  
        reverse = reverse * 10 + remainder;  
        n = n/10;  
        }  
        System.out.println("The reverse of the given number is: " + reverse); 
        if(duplicate == reverse){
            System.out.println("The no is palindrome");
        }else {
            System.out.println("The no is not palindrome");
        }

    }
        
    }

