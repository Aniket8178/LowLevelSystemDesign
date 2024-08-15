
public class OfficeComputerBuilder implements Builder {
	
	 private Computer computer;

	    public OfficeComputerBuilder() {
	        this.computer = new Computer();
	    }

	    public void buildCPU() {
	        computer.setCPU("Office CPU");
	    }

	    public void buildRAM() {
	        computer.setRAM("8GB DDR4");
	    }

	    public void buildStorage() {
	        computer.setStorage("512GB SSD");
	    }

	    public Computer getResult() {
	        return computer;
	    }
}
