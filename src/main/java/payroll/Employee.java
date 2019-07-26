package payroll;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class Employee {
	
  private @Id @GeneratedValue Long id;
  private String food;
  private String count;
  private String date;


  Employee() {}

  Employee(String food, String count, String date) {
    this.food = food;
    this.count = count;
    this.date = date;
  }
}
