package rensyu.object;

import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	int MAXHP = 50;
	int mp = 10;
	int MAXMP = 10;

	void selfAid() {
		this.mp -= 5;
		this.hp = MAXHP;
		System.out.println(this.name + "は、全回復した。");
	}

	int pray(int sec) {
		Random rnd = new Random();
		int ran = rnd.nextInt(3);
		int kaihukuMp = sec + ran;
		this.mp += kaihukuMp;
		int sabun = 0;
		if (this.mp > this.MAXMP) {
			sabun = this.mp - this.MAXMP;
			this.mp = this.MAXMP;
		}
		kaihukuMp -= sabun;
		return kaihukuMp;
	}
}
