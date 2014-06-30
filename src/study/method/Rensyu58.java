package study.method;

public class Rensyu58 {


	public static void introduceOneself() {
		String nameString = "dai";
		int nenrei = 28;
		double shincho = 173.5;
		char sex = 0;

		System.out.println("私の名前は" + nameString + "です");
		System.out.println("年齢は" + nenrei + "です");
		System.out.println("身長は" + shincho + "です");
		if (sex == 0) {
			System.out.println("性別は男です");
		} else if (sex == 1){
			System.out.println("性別は女です");
		}
	}

	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：「" + title + "」");
		System.out.println("本文：「" + text + "」");
	}
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：「" + text + "」");
	}

	public static double calcTriangleArea(double bottom, double height) {
		double result = bottom * height /2;
		return result;
	}
	public static double calcCircleArea(double radius) {
		double result = radius * radius * 3.14;
		return result;
	}

	public static void main(String[] args) {
		introduceOneself();
		email("ワールドカップについて", "lab_dai@yahoo.co.jp", "お世話になっております。");
		email("lab_dai@yahoo.co.jp", "お世話になっております。");
		System.out.println(calcTriangleArea(10.0, 5.0) + "平方センチメートルです");
		System.out.println(calcCircleArea(5.0) + "平方センチメートルです");

	}

}
