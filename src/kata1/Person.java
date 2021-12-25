package kata1;

import java.time.LocalDate;
import java.time.Period;

public class Person {
  private final String name;
  private final LocalDate birthdate;
  private final LocalDate today = LocalDate.parse("2021-12-25"); 
    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
  
    public int getAge(){
        Period period = Period.between(birthdate,today);
        int edad = (int) period.getYears();
        return edad;
        
    }
  
  
}
