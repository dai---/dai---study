package study.map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class StudyListMap {

	private List<Map<String, String>> bannerTags;
	/**
     * bannerTagsを取得する。
     * @return bannerTags
     */
    public final List<Map<String, String>> getBannerTags() {
        return bannerTags;
    }

    /**
     * bannerTagsを設定する。
     * @param pBannerTags セットする bannerTags
     */
    public final void setBannerTags(List<Map<String, String>> pBannerTags) {
        bannerTags = pBannerTags;
    }

	public static void main(String[] args) {

		List<Map<String, String>> tagList = new ArrayList<Map<String, String>>();

		String htmlvalue = "http://aaaa.com";
		String html2value = "https://bbbb.com";

		for (int i = 0; i<10; i++) {
			Map<String, String> tagMap = new LinkedHashMap<String, String>();
//			System.out.println(i);
			tagMap.put("html", htmlvalue);
			tagMap.put("html2", html2value);
			tagList.add(tagMap);

			htmlvalue = htmlvalue + "★";
			html2value = html2value + "★";
		}
		//System.out.println(tagMap);
		//System.out.println(tagList);
		for (int i = 0; i < tagList.size(); i++) {
			System.out.println(tagList.get(i));
		}

	}

}
