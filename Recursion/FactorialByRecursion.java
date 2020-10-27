// Given n as input :  print the factorial of that no . ex n =5 
public class Main {
     static int testinput(int n){
            if(n==1){
             return 1;
            }
            System.out.print(n+ "* ");
           return n*testinput(n-1);
       
        }
    public static void main(String args[]) {
           int n=5;
         int value= testinput(n);
       System.out.print("Answer is: "+value);
    }
}

//Output 
//5* 4* 3* 2* 1
//Answer is: 120