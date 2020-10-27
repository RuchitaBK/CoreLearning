// Given n as input :  print N to 1 . ex n=10 
public class Main {
     static void testinput(int n){
            if(n==1){
                System.out.println(n);
                 return;
            }
            System.out.print(n+ " ");
            testinput(n-1);
           
        }
    public static void main(String args[]) {
           int n=10;
          testinput(n);
    }
}

//Output 
//10 9 8 7 6 5 4 3 2 1