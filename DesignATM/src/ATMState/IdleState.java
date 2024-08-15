package ATMState;

import DesignATM.ATM;
import DesignATM.Card;

public class IdleState extends ATMState {
	
	public void insertCard(ATM atm , Card card) {
		System.out.println("Card is inserted");
		atm.setCurrentATMState(new HasCardState());
	}
}
