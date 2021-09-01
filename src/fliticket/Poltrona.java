package fliticket;

public class Poltrona {

	private String id;
	private boolean status;
	private User user;
	public Poltrona() {}
	public Poltrona(String id, boolean status, User user) {
		super();
		this.id = id;
		this.status = status;
		this.user = user;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
