package zaman;

public class Time1 {
	private int hour;
	private int minute;
	private int second;
	public void setTime(int hour,int minute,int second) {
		if(hour<0 || hour>23 || minute<0 || minute>59 || second<0 || second>59) {
			System.out.println("yanlıs saat degeri girdiniz");
		}
		this.hour=hour;
		this.minute= minute;
		this.second=second;
	}
	public String  saat () {
		return String.format("%02d:%02d:%02d",hour,minute,second);
	}
	public static int getCount() {
		return count;
	}

}
