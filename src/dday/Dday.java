package dday;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dday {

	public static void main(String[] args) {
		Date date = new Date();
		printDate(date);
		printDate(Calendar.getInstance());
		
	}
	
	private static void printDate(T t) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(d));
	}

}
