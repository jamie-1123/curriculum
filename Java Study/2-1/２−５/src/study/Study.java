package study;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;


public class Study {
	public static final String SHOP_SHOHIN_00 = "バナナ";
    public static final String SHOP_SHOHIN_01 = "牛乳";
    public static final String SHOP_SHOHIN_02 = "豚肉";
    public static final String SHOP_SHOHIN_03 = "コロッケ";



    public static void main(String args[]) {

        // ① 定数を全て使って、String型のListを記述してください。
    	ArrayList<String> shohinList = new ArrayList<String>();
    	shohinList.add(SHOP_SHOHIN_00);
    	shohinList.add(SHOP_SHOHIN_01);
    	shohinList.add(SHOP_SHOHIN_02);
    	shohinList.add(SHOP_SHOHIN_03);








        // ② 以下の「shopMap.put(shohinList.get(1), 180);」の処理について、コメントを記述してください。
        /*
         * [shopMapに入っている、牛乳配列１に入れ、１８０と合わせる]
         *
         */
        LinkedHashMap<String, Integer> shopMap = new LinkedHashMap<String, Integer>();
        shopMap.put(shohinList.get(0), 125);
        shopMap.put(shohinList.get(1), 180);
        shopMap.put(shohinList.get(2), 350);
        shopMap.put(shohinList.get(3), 100);

        // ③ カリキュラムを参考に拡張for文を使って、課題の画像と同じ表示になるよう記述してください。
        // 「shohinList」と「shopMap」が保持する値を上手く利用しましょう。
        for(Map.Entry<String, Integer> entry : shopMap.entrySet()) {
        	 System.out.println(entry.getKey() + "=" + + entry.getValue() + "になります！");

        }





    }

}


