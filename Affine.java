import java.util.*;
public class Affine
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=7;
        b=13;
        System.out.print("Enter the plaintext: ");
        String str=sc.nextLine();
        str=str.toLowerCase();
        System.out.println("plaintext : "+str);
        StringBuilder sb1= new StringBuilder(str);
        char temp;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' '){
            temp=sb1.charAt(i);
            temp%=97;
            temp*=a;
            temp+=b;
            temp%=26;
            temp+=97;
            sb1.setCharAt(i,temp);
            }
        }
        str=sb1.toString();
        str=str.toUpperCase();
        System.out.println("ciphertext : "+str);
        str=str.toLowerCase();
        StringBuilder sb2= new StringBuilder(str);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' '){
            temp=sb2.charAt(i);
            temp%=97;
            temp*=15;
            temp+=13;
            temp%=26;
            temp+=97;
            sb2.setCharAt(i,temp);
            }
        }
        str=sb2.toString();
        System.out.println("decrypted ciphertext: "+str);
    }
}