/**
 * Lab 10 Car class
 * @author Jada Bryan
 *
 */

public class Car extends Vehicle {
	private int numDoors;
	private int numPassengers;
	
	public Car(String aMake, String aModel, String aPlate, int aDoors, int aPassengers){
		super(aMake, aModel, aPlate);
		this.numDoors = aDoors;
		this.numPassengers = aPassengers;
	}
	
	public int getDoors(){
		return this.numDoors;
	}
	
	public int getPassengers(){
		return this.numPassengers;
	}
	
	public String toString(){
		String result = String.format("%d-door %s %s with license %s.", this.numDoors, this.getMake(), this.getPlate());
		return result;
	}
	
	public boolean equals(Object other){
		if(!(other instanceof Vehicle)){
			return false;
		}
		
		Car otherCar = (Car) other;
		
		if(this.numDoors == otherCar.getDoors()){
			if(this.numPassengers == otherCar.getPassengers()){
				return super.equals(other);
			}
		}
		return false;
	}
	
	public Car copy(){
		String aMake = this.getMake();
		String aModel = this.getModel();
		String aPlate = this.getPlate();
		int numDoors = this.getDoors();
		int numPassengers = this.getPassengers();
		
		Car copy = new Car(aMake, aModel, aPlate, numDoors, numPassengers);
		
		return copy;
	}
}