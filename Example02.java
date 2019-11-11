public class Example02 {
	public static void main(String[]args){
		MeThread meThread=new MeThread();
		meThread.start();
		while(true){
			System.out.println("main()方法在运行");
		}
	}
}
class MeThread extends Thread{
	public void run(){
		while(true){
			System.out.println("MyThread类的run（）方法在运行");
		}
	}
}