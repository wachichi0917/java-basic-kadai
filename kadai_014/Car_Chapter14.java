package kadai_014;

//車クラス
public class Car_Chapter14 {
	//フィールド
	   private int gear  =  1;
	   private int speed = 10;
	   
	   //メソッド
	   public  void gearChange(int afterGear) {
		   System.out.println("ギア" +gear + "から" +afterGear + "に切り替えました");
		   gear=afterGear;
	}
	   public void run() {	
		  
		   if(gear <= 5) {
			   speed= gear * 10;
		   }else{
			   speed = 10;
			   }
		    System.out.println("速度は時速" + speed + "kmです" );
		   }
	   }


