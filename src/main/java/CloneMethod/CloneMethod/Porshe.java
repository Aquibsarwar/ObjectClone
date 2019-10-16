package CloneMethod.CloneMethod;

public class Porshe implements Cloneable{

	private String ownerName;
	public Porshe(String ownerName) {
		// TODO Auto-generated constructor stub
		this.ownerName = ownerName;
	}
	
	public void sellto(String ownerName) {
		// TODO Auto-generated constructor stub
		this.ownerName = ownerName;
	}	
	
	public String asString() {
		return "Porshe of " +ownerName;
	}
	
	@Override
	public Porshe clone() { 
		try {
			return (Porshe) super.clone();	
		}catch(CloneNotSupportedException e) {
			throw new AssertionError();
		}
	
	}

	public String toString() {
		return getClass().getSimpleName() +" "+ownerName;
		
	}



} 