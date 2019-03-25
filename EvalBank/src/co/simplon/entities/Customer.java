package co.simplon.entities;

public class Customer {
	
	private int IdCust;
	private String Name;
	private String FirstName;
	
	public Customer(int idCust, String name, String firstName) {
		this.IdCust = idCust;
		this.Name = name;
		this.FirstName = firstName;
	}

	@Override
	public String toString() {
		return "customer [Customer number=" + IdCust + ",Customer Name=" + Name + ",Customer firstname=" + FirstName+ "]";
	}

	public int getIdCust() {
		return IdCust;
	}

	public void setIdCust(int IdCust) {
		this.IdCust = IdCust;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName =FirstName;
	}	

}
