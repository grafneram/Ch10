//Ashley Grafner
//CSC 10606080, Computer Science 1 (Java)
//10/13/2022
//
import java.util.*;
public class Main {
    public static void main(String[] args) { //main method
      class Ewok {
        String name = "UghUgh";
        int age = 0;
    
       
        public String getName() { //return name when set
          return name;
        }
        public void setName(String name) { //allows to set name 
          this.name= name;
        }
        
        
        public int getAge(){ //return age when set
          return this.age;
        }
        public void setAge(int age){ //allows to set age
           this.age= age;
        }
        

        public String makeNoise(){ 
          String[] ewokNoises = {"Grrrr","Rawr","Boooo!","Woah"};
          
        //finds length of array, sets random int in length for array
          Random random = new Random();
          int index = random.nextInt(ewokNoises.length); 
          String noise = ewokNoises[index];
          
          return noise; //must return a string
        }
      }
  
  //example code
	Ewok e1 = new Ewok();
		e1.setAge(7);
    e1.setName("Ashley");
		System.out.println("Ewok 1's age is "+e1.getAge());
    System.out.println("Ewok 1's name is "+e1.getName());

	Ewok e2 = new Ewok();
		e2.setAge(3);
    e2.setName("Doug");
		System.out.println("Ewok 2's age is "+e2.getAge());
    System.out.println("Ewok 1's name is "+e2.getName());

      
		System.out.println("Ewok 1 is making the noise: "+e1.makeNoise());
    System.out.println("Ewok 1 is making the noise: "+e2.makeNoise());
	}
}


      
    


