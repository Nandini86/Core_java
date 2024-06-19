package Interface;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon a=new NonPrime();
		Amazon np=new Prime();
		Amazon.aboutUs();
		np.welcome();
		np.display();
		//a.serviceCharge();
		
	}

}
