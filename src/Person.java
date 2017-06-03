public class Person 
		{ 
		   //composition has-a relationship
		private String name;
		private Education school;
		private Job job;
		
		public Person(String theName, Education theSchool){
			name = theName;
			school = theSchool;
		}
		
public String toString() {
	return String.format("my name %s , my shool %s, name,school");
	
}
		
		}
