class WordCounter implements Runnable{
	Thread t;
	String name;
	String sentance;
	WordCounter(String threadname,String s){
		name=threadname;
		sentance=s;
		t=new Thread(this,name);
		t.start();
	}
	public void run(){
		try{
			int counter=1;
			for(int i=0;i<sentance.length();i++){
				char c=sentance.charAt(i);
				if(c==' '){
					counter++;
					Thread.sleep(50);
				}
			}
			System.out.println(name+"-> words="+counter);
		}catch(InterruptedException e){
			System.out.println(name+" thread interruped");
		}
		System.out.println(name+" thread exiting");
	}
}
class WordCounterDemo{
	public static void main(String[] args) {
		WordCounter t1=new WordCounter("First","Hi my name is krish i am a student at bhagubai");
		WordCounter t2=new WordCounter("Second","Krish");
		try{
			t1.t.join();
			t2.t.join();
		}catch(InterruptedException e){
			System.out.println("Main thread interrupted");
		}
		System.out.println("Exited main thread");
	}
}