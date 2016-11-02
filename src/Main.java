
public class Main 
{

	public static void main(String[] args)
	{
		int n = 10;
		for (int p = 1; p < 20; p++){
			System.out.println("Avec n = " + n + " et p = " + p + " : " + nbIterations(n, p));
		}
	}
	
	public static long nbIterations(int n, int p)
	{
			long total = 0;
			for (int k = 0; k < n; k++)
				total += y(k,p);
			return total;
	}
	
	public static int y(int n, int p)
	{
		if (n > 0)
		{
			int result = 0;
			for (int k = 0; k <= p; k++)
				result += y(n-1, p-k);
			return result;
		}
		return 1;
	}
}
