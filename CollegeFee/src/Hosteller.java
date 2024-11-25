public class Hosteller extends Student {
    private int roomNumber;
    private char blockName;
    private String roomType;
 
    // Parameterized constructor
    public Hosteller(int studentId, String studentName, String department, String gender, String category, double collegeFee,
                     int roomNumber, char blockName, String roomType) {
        super(studentId, studentName, department, gender, category, collegeFee);
        this.roomNumber = roomNumber;
        this.blockName = blockName;
        this.roomType = roomType;
    }
 
    // Getters and Setters
    public int getRoomNumber() { return roomNumber; }
    public char getBlockName() { return blockName; }
    public String getRoomType() { return roomType; }
 
    public void setRoomNumber(int roomNumber) { this.roomNumber = roomNumber; }
    public void setBlockName(char blockName) { this.blockName = blockName; }
    public void setRoomType(String roomType) { this.roomType = roomType; }
 
    @Override
    public double calculateTotalFee() {
        double hostelFee = 0;
        double roomTypeAmount = 0;
 
        switch (blockName) {
            case 'A':
                hostelFee = 60000;
                break;
            case 'B':
                hostelFee = 50000;
                break;
            case 'C':
                hostelFee = 40000;
                break;
        }
 
        if (roomType.equals("AC")) {
            switch (blockName) {
                case 'A':
                    roomTypeAmount = 8000;
                    break;
                case 'B':
                    roomTypeAmount = 5000;
                    break;
                case 'C':
                    roomTypeAmount = 2500;
                    break;
            }
        }
 
        return collegeFee + hostelFee + roomTypeAmount;
    }
}
 
