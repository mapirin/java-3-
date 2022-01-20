package pack3;

import java.util.Calendar;
import java.util.Date;
public class Mondai2 {
	public static void main(String[] args) {
		Date now=new Date();
		Calendar c=Calendar.getInstance();
		c.setTime(now);
		//System.out.println(c.getTime());
		
		//現在の時間をカレンダークラスで取得
		int hour=c.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour);
		if(hour>=8 && hour<=11) {
			System.out.println("おはようございます。今日も一日頑張りましょう");
		}else if(hour>=12 && hour<=15) {
			System.out.println("こんにちは。居眠りしないように");
		}else if(hour>=16 && hour<=18) {
			System.out.println("あと少し頑張りましょう");
		}else if(hour>=19 && hour<=21) {
				System.out.println("お疲れ様。また明日");
		}else {
			System.out.println("頑張りすぎです。休みましょう");
		}
	}
}
