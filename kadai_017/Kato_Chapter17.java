package kadai_017;
    
  public abstract  class Kato_Chapter17 {
	 
	protected static String familyName= "加藤"; 
	protected static String givenName; 
	protected static String address = "東京都中野区〇✕";
	
	abstract  void method1();
	
	
	static void commonIntoroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
	
	    System.out.println("住所は" + address + "です");	
	}
	    
	
	    
 public void execIntroduce() {
	 commonIntoroduce();
	 method1();
	 System.out.println();
	
 }
	 
 }
 
 