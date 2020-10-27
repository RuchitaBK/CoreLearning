// Given n as input :  print 1 to N . ex n=7 
public class Main {
     static void testinput(int n){
            if(n==1){
                System.out.println(n);
                 return;
            }
           
            testinput(n-1);
            System.out.println(n);
        }
    public static void main(String args[]) {
           int n=7;
          testinput(n);
    }
}