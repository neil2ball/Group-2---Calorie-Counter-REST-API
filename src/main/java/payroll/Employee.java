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
  private String android;


  Employee() {}

  Employee(String food, String count, String date, String android) {
    this.food = food;
    this.count = count;
    this.date = date;
    this.android = android;
  }
}
