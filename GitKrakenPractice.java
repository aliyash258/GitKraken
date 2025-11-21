import java.io.*;

public class GitKrakenPractice
{
	public static void main(String[] args)
	{
		int[] totals = new int[1000];
		MyThread[] threads = new MyThread[1000];
		for(int i = 0; i < threads.length; i++)
		{
			threads[i] = new MyThread();
			totals[i] = threads[i].getSum();
			try{
				threads[i].join();
			}
			catch(InterruptedException e){
				System.err.println(e);
			}
		}

		int finalTotal = 0;
		for(int i: totals)
		{
			finalTotal += i;
		}
	}
}

class MyThread extends Thread
{
	private int sum;

	public void run()
	{
		for(int i = 1; i <= 1000000; i++)
			sum += i;
	}

	public int getSum()
	{
		return sum;
	}
}