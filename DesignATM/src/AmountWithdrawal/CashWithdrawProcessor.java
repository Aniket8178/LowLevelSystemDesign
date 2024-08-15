package AmountWithdrawal;

import DesignATM.ATM;

public abstract class CashWithdrawProcessor {
	
	CashWithdrawProcessor nextCashWithdrawalProcessor;
	
	CashWithdrawProcessor(CashWithdrawProcessor CashWithdrawalProcessor){
		this.nextCashWithdrawalProcessor = CashWithdrawalProcessor;
	}
	
	public void withdraw(ATM atm , int remainingAmount) {
		if(nextCashWithdrawalProcessor != null) {
			nextCashWithdrawalProcessor.withdraw(atm, remainingAmount);
		}
	}
}
