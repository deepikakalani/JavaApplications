class Send{
	public Send(){};
	public void sendMessage(String msg)
	{
		System.out.println("Message is:" + msg);
	}
}

class SimpleThread extends Thread{
	public Send s;
	String msg;
  	public SimpleThread(Send obj, String msg){	
		s = obj;
		this.msg = msg;
	};
	public void run(){
		synchronized(s)
		{
			System.out.println("Thread started");
			s.sendMessage(msg);
		}

	}
}
class SimpleSender{
	public SimpleSender(){};
	public static void main(String[] args)
	{
		Send s = new Send();
		SimpleThread st = new SimpleThread(s, "Thread1");
		st.start();
		SimpleThread st1 = new SimpleThread(s, "Thread2");
		st1.start();
		try{
			st.join();
			st1.join();
		}
		catch(Exception e)
		{
			System.out.println("Failed to create threads");
		}
		System.out.println("Message Sent");
		
	}

}
