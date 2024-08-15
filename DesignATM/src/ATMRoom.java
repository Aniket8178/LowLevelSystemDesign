import DesignATM.ATM;
import DesignATM.Card;
import DesignATM.TransactionType;
import DesignATM.UserBankAccount;

public class ATMRoom {
	User user;
	ATM atm;
	public static void main(String[] args) {
		System.out.println("Devloping the ATM Machine");
		
		ATMRoom atmRoom = new ATMRoom();
		atmRoom.intialize();
		
		atmRoom.atm.printCurrentATMStatus();
		atmRoom.atm.getCurrentATMState().insertCard(atmRoom.atm, atmRoom.user.card);
		atmRoom.atm.getCurrentATMState().authenticatePin(atmRoom.atm, atmRoom.user.card, 112211);
		atmRoom.atm.getCurrentATMState().selectoperation(atmRoom.atm, atmRoom.user.card, TransactionType.CASH_WITHDRAWAL);
        atmRoom.atm.getCurrentATMState().cashWithdrawal(atmRoom.atm, atmRoom.user.card, 2700);
        atmRoom.atm.printCurrentATMStatus();

		
		
	}

	
	private void intialize() {
		//create ATM
		 atm = ATM.getATMObject();
		 atm.setAtmBalance(3500 , 1 , 2 , 5);
		 
		
		//Create User
		this.user = CreateUser();
		
	}
	private User CreateUser() {
		User user = new User();
		user.setCard(createCard());
		return user;
	}
	private Card createCard() {
		Card card = new Card();
		card.setBankAccount(CreateBankAccount());
		return card;
	}
	private UserBankAccount CreateBankAccount() {
		UserBankAccount bankAccount = new UserBankAccount();
		bankAccount.balance = 3000;
		return bankAccount;
	}
}
