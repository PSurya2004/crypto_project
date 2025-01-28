import java.io.*;
import java.util.Scanner;
class euclidian
{
      static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    static int modInverse(int A, int M) {
        if (gcd(A, M) > 1) {
            return -1;
        }
        for (int X = 1; X < M; X++)
            if (((A % M) * (X % M)) % M == 1)
                return X;
        return 1;
    }
    public static void main(String args[])
    {
        int A,M;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        A=sc.nextInt();
        System.out.print("enter the modulus:");
        M=sc.nextInt();
        System.out.println("Multiplicative inverse of "+A+" with respect to mod "+M+" is: "+modInverse(A, M));
    }
}