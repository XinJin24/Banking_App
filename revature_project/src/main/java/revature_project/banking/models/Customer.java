package revature_project.banking.models;

public class Customer {
	private Integer customer_id;
	private String customer_name;
	private Integer customer_age;
	private Integer cusotmer_card;
	private String customer_password;
	
	public Customer() {	super();}
	
	public Customer(Integer customer_id, String customer_name, Integer customer_age, Integer cusotmer_card,
			String customer_password) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_age = customer_age;
		this.cusotmer_card = cusotmer_card;
		this.customer_password = customer_password;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cusotmer_card == null) ? 0 : cusotmer_card.hashCode());
		result = prime * result + ((customer_age == null) ? 0 : customer_age.hashCode());
		result = prime * result + ((customer_id == null) ? 0 : customer_id.hashCode());
		result = prime * result + ((customer_name == null) ? 0 : customer_name.hashCode());
		result = prime * result + ((customer_password == null) ? 0 : customer_password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (cusotmer_card == null) {
			if (other.cusotmer_card != null)
				return false;
		} else if (!cusotmer_card.equals(other.cusotmer_card))
			return false;
		if (customer_age == null) {
			if (other.customer_age != null)
				return false;
		} else if (!customer_age.equals(other.customer_age))
			return false;
		if (customer_id == null) {
			if (other.customer_id != null)
				return false;
		} else if (!customer_id.equals(other.customer_id))
			return false;
		if (customer_name == null) {
			if (other.customer_name != null)
				return false;
		} else if (!customer_name.equals(other.customer_name))
			return false;
		if (customer_password == null) {
			if (other.customer_password != null)
				return false;
		} else if (!customer_password.equals(other.customer_password))
			return false;
		return true;
	}

	public Integer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public Integer getCustomer_age() {
		return customer_age;
	}

	public void setCustomer_age(Integer customer_age) {
		this.customer_age = customer_age;
	}

	public Integer getCusotmer_card() {
		return cusotmer_card;
	}

	public void setCusotmer_card(Integer cusotmer_card) {
		this.cusotmer_card = cusotmer_card;
	}

	public String getCustomer_password() {
		return customer_password;
	}

	public void setCustomer_password(String customer_password) {
		this.customer_password = customer_password;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_name=" + customer_name + ", customer_age="
				+ customer_age + ", cusotmer_card=" + cusotmer_card + ", customer_password=" + customer_password + "]";
	}
	
	
	
	
	
	

	
	

}
