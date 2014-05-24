package study.debug;

import org.apache.log4j.Logger;

public class Debuug {

	private static final Logger logger = Logger.getLogger(Debuug.class);

	public static void main(String[] args) {
		DebaDeba();
	}

	public static void DebaDeba() {

		String[] suzi = {"a","b","c"};
		for (String hi : suzi) {
			System.out.println(hi);
		}
		logger.debug(suzi[1]);
	}
//
}
