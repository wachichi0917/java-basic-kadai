package kadai_008;

public class price_Chapter08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int userAge = 30;
		int sarviceCost=0;
		
		sarviceCost = switch(userAge){
			
			case 10 -> 1000;
			case 20 -> 2000;
			case 30 -> 3000;
			case 40 -> 4000;
			case 50 -> 5000;
			case 60 -> 6000;
			case 70 -> 7000;
			case 80 -> 8000;
			default -> 500;
		};
			
			
		
		System.out.println(userAge+"代の料金は"+sarviceCost+"円");
		

	}

}
