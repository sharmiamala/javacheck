package javacheck;

public class Publication {
	
	  private static int nextPublicationNumber = 0;

	    static int getNewPublicationNumber() {
	        int newNumber = nextPublicationNumber;
	        nextPublicationNumber++;
	        return newNumber;
	    }
	   
	   
	private int id;
	private String title;

	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public void setId() {
		this.id = getNewPublicationNumber();
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	

}
