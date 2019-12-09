package interfaceexp;

interface sum
{
	int add(int a,int b);
}
public class Testv 
{
	public static void main(String[] args) 
	{
		sum f=(a,b) -> a+b;
		int j =f.add(20, 40);
		System.out.println("sum is:"+j);
	}
}
