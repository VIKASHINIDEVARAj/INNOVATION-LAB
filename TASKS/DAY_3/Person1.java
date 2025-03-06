
public class Person1
{     
	String name;     
	int age;     
	public void introduce(String myname, int myage);
	{    
   		this.name=myname;    
		this.age=myage;       
		System.out.println(name); 
	        System.out.println(age);           
	}          
		public static void main(String[] args) 
		 {   
		         Person a1 = new Person();        
			 a1.introduce("Vikashini",18);               
   		 }
 }  