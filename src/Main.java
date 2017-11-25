



public class Main {

    public static void main(String[] args) {
        System.out.println("Testing recursion functions.");
        
        RecursionSolver r = new RecursionSolver();
        
        int n = 8;
        System.out.println("Factorial: " + n + "! = " + r.factorial(n));
        
        String str = "AbbA";
        System.out.println("Palindrome: " + str + " is palindrome: " + r.isPalindrome(str));
        str = "AbcdbA";
        System.out.println("Palindrome: " + str + " is palindrome: " + r.isPalindrome(str));
        
        
        // Towers of Hanoi
        // https://www.mathsisfun.com/games/towerofhanoi.html
        int N=3;
        r.towerOfHanoi(N,"A","C","B");
     
        
    }
    
}
