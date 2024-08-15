import ENUMS.SeatCatogery;
public class Seat {
	
	int seatId;
	int row;
	SeatCatogery seatCategory;
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public SeatCatogery getSeatCategory() {
		return seatCategory;
	}
	public void setSeatCategory(SeatCatogery seatCategory) {
		this.seatCategory = seatCategory;
	}
	
	
}
