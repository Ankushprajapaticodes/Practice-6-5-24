import java.util.*;

public class Main {
	static int sumOfDigi(int n) {
        //Write code here
        if(n==0){
            return 0;
        }
        int rem = n%10;
        int smallans = sumOfDigi(n/10);
        int ans = rem+smallans;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int result = sumOfDigi(n);
        System.out.println(result);
        sc.close();
    }
}