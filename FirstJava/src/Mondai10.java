
public class Mondai10 {
	public static void main(String[] args) {
		/**
		 * 処理概要：varを使った変数の宣言と代入
		 * および、キャストと代入
		 */
		
		/**
		 * float型の変数hensu1を宣言し、
		 * 「2147483648.234」の値を代入
		 */
		var hensu1=2147483648.234f;
		/**
		 * 変数hensu2を宣言し
		 * hensu1の値をキャスト
		 */
		var hensu2=(long)hensu1;
		System.out.println(hensu2);
	}
}
