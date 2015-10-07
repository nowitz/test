package cz.extended.model;

public class Child extends People {
	
	private String sport;

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	@Override
	public String toString() {
		return "Child [sport=" + sport + ", toString()=" + super.toString()
				+ "]" + this.getTmpextended();
	}
	
	

}
