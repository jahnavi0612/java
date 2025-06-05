import java.util.*;
public class palindrome3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String input=sc.nextLine();
int count=0;
int len=input.length();
System.out.println("Palindromic substrings:");
for(int i=0;i<len;i++)
{
for(int j=i+1;j<=len;j++)
{
String sub=input.substring(i,j);
if(isPalindrome(sub))
{
System.out.println(sub);
count++;
}
}
}
System.out.println("Palindromic count: "+count);
sc.close();
}
public static boolean isPalindrome(String str)
{
int left=0;
int right=str.length()-1;
while(left<right)
{
if(str.charAt(left)!=str.charAt(right)){
return false;
}
left++;
right--;
}
return true;
}
}
