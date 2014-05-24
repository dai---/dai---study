package study.method;



public class Method {
/*	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello();
		System.out.println("メソッドの呼び出しが終わりました");
	}
	public static void hello() {
		System.out.println("田中さん、こんにちは");
	}*/

/*	public static void methodA() {
		System.out.println("methodA");
		methodB();
	}
	public static void methodB() {
		System.out.println("methodB");
	}
	public static void main(String[] args) {
		methodA();
	}*/

	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello("田中");
		hello("佐藤");
		hello("高橋");
		add( 100, 20 );
		add( 100, 50 );
		System.out.println("メソッドの呼び出しを終わります");
	}
	public static void hello(String name) {
		System.out.println( name + "さん、こんにちは");
	}
	public static void add( int x , int y ) {
		int ans = x + y;
		System.out.println(  x + "+" + y + "=" + ans);
	}

}
