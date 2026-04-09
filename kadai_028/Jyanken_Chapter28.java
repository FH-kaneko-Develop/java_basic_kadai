package kadai_028;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("自分のじゃんけんの手を入力しましょう");
                System.out.println("グーはrockのrを入力しましょう");
                System.out.println("チョキはscissorsのsを入力しましょう");
                System.out.println("パーはpaperのpを入力しましょう");
                String s = scanner.nextLine().trim();
                if (s.equals("r") || s.equals("s") || s.equals("p")) {
                    return s;
                }
                System.out.println("エラーです。もう一度入力してください。");
            }
    }

    public String getRandom() {
        String[] hands = {"r", "s", "p"};
        return hands[(int) Math.floor(Math.random() * 3)];
    }

    public void playGame(String myChoice, String opponentChoice) {
        Map<String, String> map = new HashMap<>();
        map.put("r", "グー");
        map.put("s", "チョキ");
        map.put("p", "パー");

        System.out.println(
                "自分の手は" + map.get(myChoice) + ",対戦相手の手は" + map.get(opponentChoice));

        if (myChoice.equals(opponentChoice)) {
            System.out.println("あいこです");
        } else if (myChoice.equals("r") && opponentChoice.equals("s")
                || myChoice.equals("s") && opponentChoice.equals("p")
                || myChoice.equals("p") && opponentChoice.equals("r")) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}
