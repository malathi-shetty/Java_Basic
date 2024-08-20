package conditional_statement;

public class Break {

	public static void main(String[] args) {
		int n = 1;
		while(n<=15)
		{
			System.out.println("\n" + n);
			n++;
			if(n == 7)
			{
				break;
			}
		}

	}

}
