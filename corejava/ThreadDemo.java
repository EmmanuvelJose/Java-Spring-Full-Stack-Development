package threadpack;

public class ThreadDemo extends Thread{

	public void run(){
		System.out.println(" ia am in thread run method...");
	}
	public static void main(String[] args){
		ThreadDemo obj=new ThreadDemo();
		
		obj.start();
		}
	}