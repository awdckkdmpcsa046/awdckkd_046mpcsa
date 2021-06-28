public class Main5
{
  public static void main (String[]args)
  {
    int n = 123;
    int evenCount = 0, oddCount = 0;
    while (n > 0)
      {
	int rem = n % 10;
	if (rem % 2 == 0)
	  evenCount++;
	  else
	  oddCount++;
	  n = n /10;
      }
    System.out.println ("EvenCount=" + evenCount);
    System.out.println ("OddCount=" + oddCount);
  }
}

OUTPUT:
EvenCount=1
OddCount=2