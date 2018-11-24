package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {

	public static void main(String[] args) throws Exception {
		//
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH-mm");
		String d = s.format(new Date());
		System.out.println(d);
		Date date = s.parse("2018-09-06 20-06");
		Timer t = new Timer();
		t.schedule(new Task(),date);
		
		//System.out.println(date);
	}
}

class Task extends TimerTask{

	@Override
	public void run() {
		System.out.println("¹þ¹þ");
	}
	
}