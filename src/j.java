
public class j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long totalMillseconds = System.currentTimeMillis();
		long totalSeconds = totalMillseconds/1000;
		long currentSecond = totalSeconds%60;
		long totalMinutes = totalSeconds/60;
		long currentMinutes = totalMinutes%60;
		long totalHours = totalMinutes/60;
		long currentHour = totalHours%24;
		System.out.println("Current time is "+currentHour+":"+currentMinutes+" : "+currentSecond+" GMT");
				
	}

}
