package Interface;

public interface Vehicle {
	int a=20;
	static void print() {
		System.out.println("hi");
	}
	public String licensePlate = "kar007";
	public void start();
    public void stop();
    default void blowHorn(){
      System.out.println("Blowing horn");
        
       
    	  
      
    }
}
