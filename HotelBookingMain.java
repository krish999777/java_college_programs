import java.util.*;
interface Room{
	double roomCharges();
}
interface FoodService{
	double foodCharges();
}
class HotelBooking implements Room,FoodService{
	int days,persons;
	double roomRate;
	void setHotelBooking(){
		System.out.println("Enter number of days,persons,room rate");
		Scanner sc=new Scanner(System.in);
		days=sc.nextInt();
		persons=sc.nextInt();
		roomRate=sc.nextDouble();
	}
	void getHotelBooking(){
		System.out.println("Days="+days);
		System.out.println("Number of people="+persons);
		System.out.println("Room rate="+roomRate);
	}
	public double roomCharges(){
		return days*roomRate;
	}
	public double foodCharges(){
		return days*persons*500;
	}
	double getTotal(){
		return (roomCharges()+foodCharges())*1.18;
	}
}

class HotelBookingMain{
	public static void main(String[] args) {
		HotelBooking h=new HotelBooking();
		h.setHotelBooking();
		h.getHotelBooking();
		System.out.println("Total="+h.getTotal());
	}
}