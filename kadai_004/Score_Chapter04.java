package kadai_004;

public class Score_Chapter04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
    String [] names = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
    int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int sum  = 10+20+30+40+50+60+70+80+90+100;
    for(int i = 0; i< scores.length; i++) {
    	System.out.println(names[i]+"さんの点数は"+scores[i]+"点");
   
    	
    }
    	int average= sum/scores.length;
    	System.out.println("テストの平均点は"+average+"点");
    }

}

