package study.object;

public class Matango {
	int hp;
	final int LEVEL = 10;
	char suffix;

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}


	void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
	}

}
