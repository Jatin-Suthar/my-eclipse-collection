package OOpss;

public class Data {
	int name;
	int email;
	int phone;
	private static int libraryId;
	
	public Data() {
		int id = getLibraryId();
	}
	public Data(int name, int email, int phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.name = libraryId;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public int getEmail() {
		return email;
	}
	public void setEmail(int email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public void setLibraryId(int name) {
		this.name = libraryId;
	}
	public static int getLibraryId() {
		return libraryId;
	}
}
