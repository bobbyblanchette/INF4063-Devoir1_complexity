
public class Main 
{

	public static void main(String[] args)
	{
		int n = 10;
		for(int i = 0; i < 10; i++)
			System.out.println("i = " + i + " : " + nbIterations(n, i-1) + " x " + (double)nbIterations(n, i)/nbIterations(n, i-1) + " = " + nbIterations(n, i));
		
		
	}
	public static long nbIterations(int n, int i)
	{
			long total = 0;
			for (int m = 0; m < n; m++)
				total += y(m,i);
			return total;
	}
	public static int y(int n, int i)
	{
		if (n > 0)
		{
			int result = 0;
			for (int k = 0; k <= i; k++)
				result += y(n-1, i-k);
			return result;
		}
		return 1;
	}
}
