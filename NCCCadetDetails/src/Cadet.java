

public class Cadet {
	
	private String cadetNumber;
	private String cadetName;
	private String groupName;
	private String gender;
	private int age;
	
	public Cadet(){
	    super();
	}
	
	public Cadet(String cadetNumber, String cadetName, String groupName, String gender, int age) {
		super();
		this.cadetNumber = cadetNumber;
		this.cadetName = cadetName;
		this.groupName = groupName;
		this.gender = gender;
		this.age = age;
		
	}
	public String getCadetNumber() {
		return cadetNumber;
	}
	public void setCadetNumber(String cadetNumber) {
		this.cadetNumber = cadetNumber;
	}
	public String getCadetName() {
		return cadetName;
	}
	public void setCadetName(String cadetName) {
		this.cadetName = cadetName;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cadet [cadetNumber=" + cadetNumber + ", cadetName=" + cadetName + ", groupName=" + groupName
				+ ", gender=" + gender + ", age=" + age + "]";
	}
	
	

}
