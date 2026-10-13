class EvenThread implements Runnable{
	String name;
	Thread t;
	int start,end;
	EvenThread(String tn,int s,int e){
		name=tn;
		start=s;
		end=e;
		t=new Thread(this,name);
		t.start();
	}
	public void run(){
		try{
			for(int i=start;i<=end;i++){
				if(i%2==0){
					System.out.println(name+"->"+i);
					Thread.sleep(50);
				}
			}
		}catch(InterruptedException e){
			System.out.println(name+" thread interrupted");
		}
	}
	System.out.println(" thread exiting");
}
class OddThread implements Runnable{
	String name;
	Thread t;
	int start,end;
	OddThread(String tn,int s,int e){
		name=tn;
		start=s;
		end=e;
		t=new Thread(this,name);
		t.start();
	}
	public void run(){
		try{
			for(int i=start;i<=end;i++){
				if(i%2!=0){
					System.out.println(name+"->"+i);
					Thread.sleep(50);
				}
			}
		}catch(InterruptedException e){
			System.out.println(name+" thread interrupted");
		}
	}
	System.out.println(" thread exiting");
}
class DivisibleThreadsDemo{
	public static void main(String[] args) {
		EvenThread t1=new EvenThread("First",1,20);
		OddThread t2=new OddThread("Second",1,20);
		try{
			t1.t.join();
			t2.t.join();
		}catch(InterruptedException e){
			System.out.println("Main thread interrupted");
		}
		System.out.println("Exited main thread");
	}
}