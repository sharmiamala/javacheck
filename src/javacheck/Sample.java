package javacheck;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("All is well");
		Publication p=new Publication();
		p.setId();
		p.setTitle("title one");
		System.out.println(" P= "+p.getId()+" - "+p.getTitle());
		Publication p1=new Publication();
		p1.setId();
		p1.setTitle("title two");
		System.out.println(" P1= "+p1.getId()+" - "+p1.getTitle());
		System.out.println(p.toString());
	}

}
