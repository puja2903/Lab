/*Problem code 3: 
Write a method called addTwoPositive that takes two int 
parameters, and if either value is not positive, throw an 
ArithmeticException, passing the string "Non-positive 
integer sent". to the constructor of the exception.if the
values are both positive, then return the sum of them. */



package Exception;

public class NotPositive extends ArithmeticException{

    public static void main(String[] args) throws ArithmeticException{  //main method throws exception

    	NotPositive ps = new NotPositive();  //creating object 
        System.out.println(ps.addTwoPositive(-5,2));  //passing the value

    }

    public int addTwoPositive(int a, int b) throws ArithmeticException{
        if(a < 0 || b < 0){   //if block
            throw new ArithmeticException("Non-positive integers sent!");

        }
        else{
            return a + b;  //for adding two number
        }

    }

   
    }

