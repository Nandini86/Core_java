package Interface;

public class Loan  implements Home, Education{

	@Override
	public void educationLoan() {
		System.out.println("the rate of intrest is"+10.0f);
		
	}

	@Override
	public void homeLoan() {
		System.out.println("the rate of intrest is"+8.0f);
		
	}

}
