package kadai_021;

import java.util.HashMap;
import java.util.Map;

public class Dictionary_Chapter21 {

    public void searchWords(String[] words) {
        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウイ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (dictionary.containsKey(word)) {
                System.out.println(word + "の意味は" + dictionary.get(word));
            } else {
                System.out.println(word + "は辞書に存在しません");
            }
        }
    }
}
