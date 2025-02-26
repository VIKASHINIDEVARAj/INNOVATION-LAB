public class Person
 {
             String name;
             int age;
             public void introduce( String myname,int myage)
              {
                this.name=myname;
                this.age=myage;
             
                System.out.println(name);
                System.out.println(age);
              }
                    public static void main(String[] args)
                    {
                        Person obj1 = new Person();
                        obj1.introduce("mirdhula",19);
                        Person obj2 = new Person();
                        obj2.introduce("vikashini",20);
                 
                    }
    
}
