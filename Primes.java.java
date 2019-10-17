class PrimesThread implements Runnable{
	
	private int num;
	private int[] prime;

	public PrimesThread(int num) {
		if (num < 2)
			throw new IllegalArgumentException();
		this.num = num;
	}
	
	public void run() {
		if(num>=2)
			System.out.print("2 ");
		for(int x=2;x<num;x++)
		{	
			int a=1;
			for(int i=2;i<Math.sqrt(x)+1;i++) //¿ì½Ý
			{
			if (x%i==0)
			a=0;	
			}
			if (a==1)
				System.out.print(x+" ");
		}	
	}
}


public class Primes{
	public static void main(String args[]) {
		if (args.length == 0) {
			System.out.println("Usage: Summation <integer value>");
			System.exit(0);
		}
		else
			new Thread(new	PrimesThread(Integer.parseInt(args[0]))).start();
	}
	}