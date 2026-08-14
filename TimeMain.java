class Time{
	int hour,minute;
	Time(){}
	Time(int hour,int minute){
		this.hour=hour;
		this.minute=minute;
	}
	void getTime(){
		System.out.println(hour+":"+minute);
	}
	Time addTime(Time t){
		Time temp=new Time();
		temp.hour=hour+t.hour;
		int minuteSum=minute+t.minute;
		if(minuteSum>=60){
			temp.hour++;
			minuteSum-=60;
		}
		temp.minute=minuteSum;
		return temp;
	}
}
class TimeMain{
	public static void main(String[] args) {
		Time t1=new Time(5,45);
		Time t2=new Time(3,30);
		t1.getTime();
		t2.getTime();
		Time t3=t1.addTime(t2);
		t3.getTime();
	}
}