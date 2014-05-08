package study.map;

import java.util.HashMap;
import java.util.Map;

public class StudyMap {

	static Map<String, String> studyDaiMap = new HashMap<String, String>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		studyDaiMap.put("aaa", "あああ");
		studyDaiMap.put("bbb", "いいい");
		studyDaiMap.put("ccc", "ううう");
		studyDaiMap.put("ddd", "えええ");

		getMapKey();
		getMapValues();
		getMapKeyValues();
	}

	public static void getMapValues() {
		for (String string : studyDaiMap.values()) {
			System.out.println(string);
		}
		//System.out.println(studyDaiMap.get("aaa"));
	}

	public static void getMapKey() {
		for (String string : studyDaiMap.keySet()) {
			System.out.println(string);
		}
	}

	public static void getMapKeyValues() {
		for (Map.Entry<String, String> e : studyDaiMap.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}

}
