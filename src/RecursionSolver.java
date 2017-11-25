
/**
 *
 * @author Dr. Baharav
 */
public class RecursionSolver {

    public int factorial(int n) {
        if (n<=0) return 0;
        if (n==1) return 1;
        return n*factorial(n-1);
    }
    
    public boolean isPalindrome(String str) {
        if (str.length() <=1) return true;
        if (str.charAt(0) != str.charAt(str.length()-1)) return false;
        return isPalindrome(str.substring(1,str.length()-1));
    }
    
    
    public void towerOfHanoi(int n, String from, String to, String aux) {
        if (n==1)
            System.out.println("Move " + from + " ==> " + to);
        else {
            //move n-1 disks 'from' ==> 'aux'
            towerOfHanoi(n-1,from,aux,to);
            //move 1 disk    'from' ==> 'to'
            System.out.println("Move " + from + " ==> " + to);
            //move n-1 disks  'aux' ==> 'to'
            towerOfHanoi(n-1,aux,to,from);
        }


    }

}
