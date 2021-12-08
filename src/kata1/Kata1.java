
package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
       
        Person person = new Person("Lola ", new Date(65,11,8));
        System.out.println(person.getName() + "tiene "+person.getAge()+ " años.");
        
        
        
    }
    
}

