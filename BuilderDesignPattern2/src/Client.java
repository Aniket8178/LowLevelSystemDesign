
public class Client {
	
	  public static void main(String[] args) {
	        // Gaming computer
	        GamingComputerBuilder gamingBuilder = new GamingComputerBuilder();
	        ComputerDirector director = new ComputerDirector();

	        director.construct(gamingBuilder);
	        Computer gamingComputer = gamingBuilder.getResult();
	        gamingComputer.displayInfo();

	        // Office computer
	        OfficeComputerBuilder officeBuilder = new OfficeComputerBuilder();
	        director.construct(officeBuilder);
	        Computer officeComputer = officeBuilder.getResult();
	        officeComputer.displayInfo();
	    }
}
