class SimpleThread extends Thread

{
    int i;
    public SimpleThread(int i){
        this.i=i;
    }
    public static void main(String[] args)
    {
        SimpleThread st = new SimpleThread(1); // LINE A
        st.start(); // LINE B
        SimpleThread t2 = new SimpleThread(2);
        t2.start();
    }
    
    public void run()
    {
        System.out.println("Thread running..." + this.i);
    }
    
}
