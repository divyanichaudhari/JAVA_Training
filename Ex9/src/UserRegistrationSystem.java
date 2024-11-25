import java.util.regex.Pattern;

public class UserRegistrationSystem {

    // Method to validate username
    public boolean validateUsername(String username) throws InvalidDataException {
    	
		if(!username.matches("[a-zA-Z][a-zA-Z0-9_]{4,14}$")) {
			throw new InvalidDataException("Invalid username");
		}
    	
    	return true;
    }

    // Method to validate password
    public boolean validatePassword(String password) throws InvalidDataException {
		if(password.length() < 8 && !password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()]).{8,}$"    )) {
			throw new InvalidDataException("Invalid Password");
		}
    	return true;
        // Write code here
    }

    // Method to validate email
    public boolean validateEmail(String email) throws InvalidDataException {
    	if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
    	    throw new InvalidDataException("Invalid email");
    	}

		return true;
        // Write code here
    }

    // Method to validate age
    public boolean validateAge(int age) throws InvalidDataException {
    	if(age<18 && age>100) {
			throw new InvalidDataException("Invalid age");
    	}
		return true;
        // Write code here
    }
}
