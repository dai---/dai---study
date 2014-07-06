package rensyu.object;

import java.util.Random;

public class Cleric {
	private String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;

	public void selfAid() {
		System.out.println(this.getName() + "は、セルフエイドを唱えた！");
		this.mp -= 5;
		this.hp = MAX_HP;
		System.out.println("HPが最大まで回復した。");
	}

	public int pray(int sec) {
		Random rnd = new Random();
		int kaihukuMp = sec + rnd.nextInt(3);
		this.mp += kaihukuMp;
		int sabun = 0;
		if (this.mp > this.MAX_MP) {
			sabun = this.mp - this.MAX_MP;
			this.mp = this.MAX_MP;
		}
		kaihukuMp -= sabun;
		return kaihukuMp;
	}

	public void slip() {
		this.hp -= 10;
		System.out.println(this.name + "は転んで10のダメージ！");
	}
	public void sli() {
		this.mp -= 10;
		System.out.println(this.name + "は10MP吸い取られた！");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
