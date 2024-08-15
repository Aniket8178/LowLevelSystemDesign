
public class GamingComputerBuilder implements Builder {
	
    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    public void buildCPU() {
        computer.setCPU("Gaming CPU");
    }

    public void buildRAM() {
        computer.setRAM("16GB DDR4");
    }

    public void buildStorage() {
        computer.setStorage("1TB SSD");
    }

    public Computer getResult() {
        return computer;
    }
}
