public class Example03 {
	public static void main(String[]args){
		MThread mThread=new MThread();
		Thread thread=new Thread(mThread);
		thread.start();
		while(true){
			System.out.println("main()方法在运行");
		}
	}
}
class MThread implements Runnable{
	public void run(){
		while(true){
			System.out.println("MyThread类的run（）方法在运行");
		}
	}
}