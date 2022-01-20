package pack3;

import java.util.Calendar;
import java.util.Date;

public class Mondai3 {
	public static void main(String[] args) {
		Date now=new Date();
		Calendar c=Calendar.getInstance();
		c.setTime(now);
		
		int hour=c.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour);
		switch(hour) {
		case 8:
		case 9:
		case 10:
		case 11:
			System.out.println("おはようございます。今日も一日頑張りましょう");
			break;
		case 12:
		case 13:
		case 14:
		case 15:
			System.out.println("こんにちは。居眠りしないように");
			break;
		case 16:
		case 17:
		case 18:
			System.out.println("あと少し頑張りましょう");
			break;
		case 19:
		case 20:
		case 21:
			System.out.println("お疲れ様。また明日");
			break;
		default:
			System.out.println("頑張りすぎです。休みましょう");
			break;
		}
		
	}
}
