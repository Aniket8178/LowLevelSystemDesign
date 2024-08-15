package ATMState;

import javax.management.remote.TargetedNotification;

import DesignATM.ATM;
import DesignATM.Card;
import DesignATM.TransactionType;

public class SelectOperationState extends ATMState {
	
	public SelectOperationState() {
		showOperations();
	}
	
	@Override
	public void selectoperation(ATM atm , Card crad , TransactionType txnType) {
		switch(txnType) {
		   
		    case CASH_WITHDRAWAL:
		    	atm.setCurrentATMState(new CashWithdrawalState());
		    	break;
		    case BALANCE_CHECK:
		    	atm.setCurrentATMState(new CheckBalanceState());
		    	break;
		    default:{
		    	System.out.println("Invalid Otpion...");
		    	exit(atm);
		    }
		    	
		}
	}
	@Override
	public void exit(ATM atm) {
		returnCard();
		atm.setCurrentATMState(new IdleState());
		System.out.println("Exit Happens...");
	}
	@Override
	public void returnCard() {
		System.out.println("Please Collect the Card...");
	}
	private void showOperations() {
		System.out.println("Please select the Operation...");
		TransactionType.showAllTransactionTypes();
	}
}
