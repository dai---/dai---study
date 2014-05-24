package hello.world;


public class Jouken {

	public static void main(String[] args) {

		String value = "夕日";
		String value2 = "夕日";


		if ( value == "夕日") {
			System.out.println("変数valueは夕日です。1");
		}
		if ( value.equals("夕日")) {
			System.out.println("変数valueは夕日です。2");
		}
		if ( value.equals(value2)) {
			System.out.println("変数valueは夕日です。3");
		}

/*		if ( ( age >= 18 && gender == 1) || ( age >= 16 && gender == 0) ) {
		}*/
		int age = 10;
		if ( !( age == 10 )) {
		}
//
	}
}
