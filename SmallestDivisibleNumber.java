import java.util.Scanner;


public class SmallestDivisibleNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N1 = in.nextLong();
        long N2 = in.nextLong();
        in.close();

        long smallestDivisible = LCM(N1, N2);
        System.out.println(smallestDivisible);

    }
//Product of two numbers = HCF * LCM
//    A*B = HCF(A,B) * LCM(A,B)
//    GCD and HCF are same
    private static long LCM(long n1, long n2) {
        return (n1*n2)/gcd(n1,n2);
    }
    private static long gcd(long a,long b){
//         greatest common divisor (GCD) of two integers a and b using the Euclidean algorithm
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
}
/*
you are given 2 numbers as N1,N2.write a program to calculate the smallest number which is divisible by these two numbers.
Take the following as input.

A number (N1) A number (N2)

Write a function which returns the smallest number divisible by N1 and N2. Print the value returned. Input Format

Constraints
0 < N1 < 1000000000
0 < N2 < 1000000000


Sample Input 4
6


Sample Output 12


 */