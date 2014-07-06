package study.object;

import rensyu.object.Cleric;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "dai";
		h.hp = 500;

		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';

		Matango m2 = new Matango();
		m2.setHp(50);
		m2.suffix = 'B';

		Cleric cle = new Cleric();
		cle.setName("eri");

		h.slip();
//		m1.run();
//		m2.run();
		cle.sli();
		cle.slip();
		h.sleep();
		int kaihuku = cle.pray(5);
		System.out.println(cle.getName() + "は、祈った！" + kaihuku + "MP回復した！");
		cle.selfAid();
//		h.run();
	}
}
