package ATMState;

import DesignATM.ATM;
import DesignATM.Card;
import AmountWithdrawal.CashWithdrawProcessor;
import AmountWithdrawal.TwoThousandWithdrawProcessor;
import AmountWithdrawal.OneHundredWithdrawProcessor ;
import AmountWithdrawal.FiveHundredWithdrawProcessor ;
public class CashWithdrawalState extends ATMState {
	
	public CashWithdrawalState() {
		System.out.println("Please Enter the Withdrawal  Amount. ");
	}
	
	@Override
	public void cashWithdrawal(ATM atm , Card card , int withdrawAmount) {
		if(atm.getAtmBalance() < withdrawAmount) {
			 System.out.println("Insufficient fund in the ATM Machine");
	            exit(atm);
		}
		else if(card.getBankBalance() < withdrawAmount) {
			System.out.println("Insufficient fund in the your Bank Account");
            exit(atm);
		}
		else {
			card.deductBankBalance(withdrawAmount);
			atm.deductATMBalance(withdrawAmount);
			
			//using chain of responsibility for this logic, how many 2000 Rs notes, how many 500 Rs notes etc, has to be withdrawal
			CashWithdrawProcessor withdrawProcessor  = new TwoThousandWithdrawProcessor(new FiveHundredWithdrawProcessor(new OneHundredWithdrawProcessor(null)));
			withdrawProcessor.withdraw(atm, withdrawAmount);
            exit(atm);

		}
	}
	@Override
	public void exit(ATM atm) {
		returnCard();
		atm.setCurrentATMState(new IdleState());
		System.out.println("Exi happens.");
	}
	@Override
	public void returnCard() {
		System.out.println("Please Collect Your Card.");
	}
	
}
