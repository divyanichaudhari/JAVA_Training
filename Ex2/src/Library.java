
public class Library {
	public String validateMembershipDetails(String libraryCardNumber, String membershipType, String password) throws InvalidLibraryException {
		String r ="Regular";
		String p ="Premium";
		String v = "VIP";
		if(libraryCardNumber.length() !=6 || !libraryCardNumber.matches("^[A-Z]{3}[0-9]{4}$") ) {
			throw new InvalidLibraryException("Invalid Libarary card Number");
		}
		if(!membershipType.equals(r) && !membershipType.equals(p) && !membershipType.equals(v)){
			throw new InvalidLibraryException("Invalid Membership type");
		}
		else if(password.length() !=8 || !password.matches("^[A-Z]{5}[0-9]{3}$")) {
			throw new InvalidLibraryException("Invalid Password");
		}else {
			return "Validation Successful";
		}
	}
		
		public double calculateMembershipFee(String membershipType) {
			if(membershipType.equals("Regular")) {
				return 100;
			}else if(membershipType.equals("Premium")) {
				return 250;
			}else {
				return 300;
			}
		
	}
}
