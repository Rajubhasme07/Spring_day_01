package pojo;

public class Customer {

  private int cid;
  private String cname;
  private Address Address;
  
  
  
@Override
public String toString() {
	return "Customer [cid=" + cid + ", cname=" + cname + ", Address=" + Address + "]";
}



public Customer(int cid, String cname) {
	super();
	this.cid = cid;
	this.cname = cname;
}



public Customer(int cid, String cname, pojo.Address address) {
	super();
	this.cid = cid;
	this.cname = cname;
	Address = address;
}



public Customer(String cname, pojo.Address address) {
	super();
	this.cname = cname;
	Address = address;
}



public Customer() {
	super();
	// TODO Auto-generated constructor stub
}



public Customer(int cid, pojo.Address address) {
	super();
	this.cid = cid;
	Address = address;
}



public Customer(pojo.Address address) {
	super();
	Address = address;
}



public Customer(int cid) {
	super();
	this.cid = cid;
}



public Customer(String cname) {
	super();
	this.cname = cname;
}



	
	
}
