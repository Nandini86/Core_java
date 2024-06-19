package Interface;
//Program to demonstrate Inter
public interface Amazon {
void welcome();// abstract
void display();// abstract

default void serviceCharge() {
	int amt=100;
	System.out.println("the service charge is"+amt);
	
	
}
static void aboutUs() {
	System.out.println("An online retailer and web service provider");
}

}
