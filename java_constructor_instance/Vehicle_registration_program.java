package week2_Assignment2;


class Vehicle {
	String ownerName;
	String vehicleType;
	static double registrationFee = 0;
	
	
	Vehicle(String ownerName, String vehicleType){
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	
	
	void displayVehicleDetails() {
		System.out.println("Owner Name : "+ownerName);
		System.out.println("Vehicle Type : "+vehicleType);
		System.out.println("Registration Fee : ₹"+registrationFee);
	}
	
	static void updateRegistrationFee(double newRegistrationFee) {
		registrationFee = newRegistrationFee;
	}
	
}


public class Vehicle_registration_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v1 = new Vehicle("Nazim","FourWheeler");
		
		v1.displayVehicleDetails();
		System.out.println();
		
		
		Vehicle.updateRegistrationFee(2000);
		
		v1.displayVehicleDetails();
		

	}

}
