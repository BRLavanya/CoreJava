package Programs;

public class ReverseAdd {
public static int reverse(int number)
{
	int rem=0;
	int rev=0;
	while(number>0)
	{
		rem=number%10;
		rev+=rem;
		number=number/10;
	}
	return rev;
}
public static boolean palindrome(int number)
{
	int reverse=reverse(number);
	boolean status=false;
	if(reverse==number)
	{
		status=true;
	}
	else
	{
		status=false;
	}
	return status;
}
public static void addAndCheck(int number)
{
	if(palindrome(number))
	{
		 System.out.println("Given Number is already a palindrome");
	}
	else
	{
		while(!palindrome(number))
		{
			int reverse=reverse(number);
			int sum=number+reverse;
			System.out.println(number+"+"+reverse+"="+sum);
			number=sum;
		}
	}
}
public static void main(String[] args) {
	addAndCheck(7325);
}
}
