package hello.world;

public class Mainhello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("つしま");
		System.out.println("28歳");
		System.out.println("お酒が好きです。");
		System.out.println("31+31の計算をします");
		System.out.println(31 + 31);
		int x;
		x = 6;
		System.out.println(35 - 10);
		System.out.println(-5 * 2);
		System.out.println(6 * 6 * 3.14);
		System.out.println(x * x * 3.14);
		System.out.println( "こたえは" + 64);
		System.out.println( "3 + 5 のこたえは");
		int ab = 3 + 5;
		System.out.println(ab);

		int age;
		age = 28;
		System.out.println(age + "歳です");
		int result = 9 / 2;
		System.out.println("9わる2は" + result);
		double result2 = 9.0 / 2;
		System.out.println("9わる2は" + result2);
		int result3 = 9 % 2;
		System.out.println(result3);

		int a = 100;
		a++;
		System.out.println(a);

		//String型にint型の数値も代入できる
		String msg = "私の年齢は" + 28 + "歳です";
		System.out.println(msg);

		//System.out.printは改行しない
		String name = "tsushima";
		String message = name + "さん、こんにちは";
		System.out.println(message);
		System.out.println(message);
		System.out.print(message);
		System.out.print(message);
		System.out.println();

		//Math.max(int a, int b)は2つの引数の大きな値を表示する。
		int a1 = 5;
		int b1 = 3;
		int m = Math.max(a1, b1);
		System.out.println(m);
		System.out.println("比較実験：" + a1 + "と" + b1 + "とで大きいほうは" + m + "です");


		//文字列を数値に変換
		String age1 = "28";
		int n = Integer.parseInt(age1);
		System.out.println("あなたは来年" + (n + 1) + "歳になりますね。");
		//んじゃ文字列のままの場合は？
		System.out.println("あなたは来年" + (age1 + 1) + "歳になりますね。");

		//乱数を生み出して代入する命令
		int r = new java.util.Random().nextInt(100);
		System.out.println("あなたはたぶん" + r + "歳ですね？");

		//キーボードから1行の入力を受け取る命令
//		System.out.println("あなたの名前を入力して下さい。");
//		String name1 = new java.util.Scanner( System.in ).nextLine();
//		System.out.println("あなたの年齢を入力して下さい。");
//		int age2 = new java.util.Scanner( System.in ).nextInt();
//		System.out.println("ようこそ、" + age2 + "歳の" + name1 + "さん");

//		System.out.println("ようこそ占いの館へ");
//		System.out.println("あなたの名前を入力してください");
//		String name3 = new java.util.Scanner( System.in ).nextLine();
//		System.out.println("あなたの年齢を入力して下さい。");
//		String ageString = new java.util.Scanner( System.in ).nextLine();
//		int age3 = Integer.parseInt( ageString );
//		int fortune = new java.util.Random().nextInt(3);
//		fortune++;
//		System.out.println("占いの結果がでました！");
//		System.out.println(age3 + "歳の" + name3 + "さん、あなたの運気番号は" + fortune + "です。" );
//		System.out.println("1：大吉　2：中吉　3：吉　4：今日");


















	}
}
