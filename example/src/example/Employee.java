package example;

public class Employee {
		
		private int id;
		private String name;
		private String city;
		private int yearofjoin;
		private double salary;
	 
		public int getId() {
			return id;
		}
	 
		public void setId(int id) {
			this.id = id;
		}
	 
		public String getName() {
			return name;
		}
	 
		public void setName(String name) {
			this.name = name;
		}
	 
		public String getCity() {
			return city;
		}
	 
		public void setCity(String city) {
			this.city = city;
		}
	 
		public int getYearofjoin() {
			return yearofjoin;
		}
	 
		public void setYearofjoin(int yearofjoin) {
			this.yearofjoin = yearofjoin;
		}
	 
		public double getSalary() {
			return salary;
		}
	 
		public void setSalary(double salary) {
			this.salary = salary;
		}
	 
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", yearofjoin=" + yearofjoin + ", salary="
					+ salary + "]";
		}
	 
		public Employee(int id, String name, String city, int yearofjoin, double salary) {
			super();
			this.id = id;
			this.name = name;
			this.city = city;
			this.yearofjoin = yearofjoin;
			this.salary = salary;
		}
	 
		public Employee() {
			super();
		}
	 
	
}
