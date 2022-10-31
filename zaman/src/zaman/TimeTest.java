package zaman;

public class TimeTest {

	public static void main(String[] args) {
		/*Time1 saat = new Time1();
		saat.setTime(12,45,50);
		System.out.println(saat.saat());
		saat.setTime(30,60,100);
		System.out.println("set sayisi :"+ Time1.getCount());
		System.out.println(saat.hour);
		System.out.println(Time1.hour);*/
    Time2 saat2=new Time2(9,30);
    saat2.setSaatDakika(9, 30);
System.out.println(saat2.saat());
Time2 saat3 = new Time2(3,45,55);
System.out.println(saat3.saat());
	}

}
