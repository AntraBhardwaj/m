package number;

import java.util.*;

public class Reversenum
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       int N,reverse=0,n;
       Scanner s = new Scanner(System.in);
       N =s.nextInt();
       s.close();
       while(N!=0)
       {   
       n=N%10;
       reverse =reverse*10 + n;
       N=N/10;
       System.out.println(reverse);
       }
	}

}
