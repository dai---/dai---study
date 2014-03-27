package test.properties.pkg;

import java.io.InputStream;
import java.util.Properties;

public class Testproperties {

	/**
	 * @param args
	 */
    public void run() throws Exception {
    	String aaa;
    	String bbb;
        // message.properties ファイル
        final InputStream inputStream = this.getClass().getClassLoader()
                .getResourceAsStream("messages.properties");

        if (inputStream == null) {
            bbb = "nullです";
        } else {
        	bbb = "nullではありません。";
        }
        System.out.println(bbb);

        Properties props = new Properties();
        // ファイルをロードする
        props.load(inputStream);

        // シンプルなメッセージ出力
//        System.out.println(props.getProperty("a8tax.txt"));
        aaa = props.getProperty("a8tax.txt");
        if ( aaa != null ) {
        	System.out.println(aaa);
        } else {
        	System.out.println("nullです");
        }
    }
}
