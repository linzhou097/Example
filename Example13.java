public class Example13 {

	public static void main(String[] args) {
		  Ticket2 ticket =new Ticket2();
    	  new Thread (ticket,"线程一").start();
    	  new Thread (ticket,"线程二").start();
	}
}
class Ticket2 implements Runnable{
	private int tickets=10;
	public void run(){
		while (true){
			saleTicket();
			if(tickets<=0)
			{
				break;
			}
		}
	}

private synchronized void saleTicket(){
	if(tickets>0){
		try{
			Thread.sleep(10);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"---卖出的票"+tickets--);
	}
}
}