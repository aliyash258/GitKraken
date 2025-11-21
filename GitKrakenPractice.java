import java.io.*;

public class GitKrakenPractice
{
	public static void main(String[] args)
	{
		MyThread[] threads = new MyThread[1000];
	}
}

class MyThread implements Runnable
{
	public void run()
	{
		int sum = 0;
		for(int i = 1; i <= 1000000; i++)
			sum += i;
	}
}