class RunnableThread implements Runnable{
	
	public static void main(String[] args){
		Thread t = new Thread(new RunnableThread());
		t.start();

	}
	public void run(){
		System.out.println("RubbableThread running");}

}
