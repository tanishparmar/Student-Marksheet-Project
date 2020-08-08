package grade;
import java.util.InputMismatchException;



public class MarksAvg{
	  private int phy;
	  private int chem;
	  private int maths;
	  private float total;
	  private String grd;
	  private float avg;
	  
	  
 public MarksAvg() {
		  
	  }
 public int getPhy() {
	
	try { 
	 if (!(phy<=100 && phy>=0)) {
			
			System.out.println("Error:Enter number in range");
		}
		
	} 
catch (InputMismatchException e) {
System.out.println("Error:Enter Integer only");
}
	return phy;
	}
	public void setPhy(int phy)
	{
		this.phy = phy;
		
	}
				
	
	public int getChem()
	{
    try {
		if (!(chem<=100 && chem>=0)) {
			
			System.out.println("Error:Enter number in range");
		}
		
	} 
catch (InputMismatchException e) {
System.out.println("Error:Enter Integer only");
}
		 
		return chem;
	}

	public void setChem(int chem)
	{
		this.chem = chem;
	}
	public int getMaths() 
	{
		try {
		if (!(maths<=100 && maths>=0)) {
			
			System.out.println("Error:Enter number in range");
		}
		
	} 
catch (InputMismatchException e) {
System.out.println("Error:Enter Integer only");
}
		 
		return maths;
	}
	public void setMaths(int maths) 
	{
		this.maths = maths;
	}
	public float getTotal() 
	{
		 
		return total;
	}
	public void setTotal(float total) 
	{
		this.total =total;
	}
	public String getGrd() 
	{
		avg=total/3;
		if (avg>=80) {
			System.out.println(" A ");
			}
			else if (avg<=80&&avg>=50) {
			System.out.println(" B ");
			}
			else if (avg<=50 &&avg>0) {
			System.out.println(" C ");
			}
			else{
				System.out.println("Invalid Input");
			}
		 
		return grd;
	}
	
	
		
	
	public void setGrd(String grd) {
		
		this.grd =grd;
		
	}
	
	
}