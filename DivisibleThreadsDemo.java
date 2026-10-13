class DivisibleThreads implements Runnable{
	Thread t;
	String name;
	private int start,end,count;
	static int tcount;
	DivisibleThreads(String threadname,int s,int e){
		name=threadname;
		start=s;
		end=e;
		t=new Thread(this,name);
		t.start();
	}
	public void run(){
		try{
			for(int i=start;i<=end;i++){
				int flag=1;
				for(int j=2;j<i;j++){
					if(i%j==0){
						flag=0;
					}
				}
				if(flag==1){
					count++;
					System.out.println(name+"->"+i);
					Thread.sleep(50);
				}
			}
		}catch(InterruptedException e){
			System.out.println(name+" thread interruped");
		}
		tcount+=count;
		System.out.println("Number of prime numbers for "+name+" is "+count);
		System.out.println(name+" thread exiting");
	}
}
class DivisibleThreadsDemo{
	public static void main(String[] args) {
		DivisibleThreads t1=new DivisibleThreads("First",1,150);
		t1.t.setPriority(2);
		DivisibleThreads t2=new DivisibleThreads("Second",151,300);
		try{
			t1.t.join();
			t2.t.join();
		}catch(InterruptedException e){
			System.out.println("Main thread interrupted");
		}
		System.out.println("Total prime numbers="+(DivisibleThreads.tcount));
		System.out.println("Exited main thread");
	}
}