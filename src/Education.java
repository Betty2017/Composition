public class Education {
	private String college;
	 
	public Education(String newSchool)  {
		college = newSchool;
		System.out.printf( "the constractor for this %s\n", this); }
	public String toString() {
		return String.format("\n my college is %s", college);
		
	}  
	
}
