/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;
@ManagedBean(name = "userData", eager = true)
@SessionScoped
public class UserData implements Serializable {
    private Employee employee;
    
    private static final List<Employee> employees = new ArrayList<>(Arrays.asList(
            new Employee("John", "Marketing", 30, 2000.00),
            new Employee("Robert", "Marketing", 35, 3000.00),
            new Employee("Mark", "Sales", 25, 2500.00),
            new Employee("Chris", "Marketing", 33, 2500.00),
            new Employee("Peter", "Customer Care", 20, 1500.00)
    ));
    public UserData() {
        employee = new Employee();
    }   
    
    public List<Employee> getEmployees() {
        return employees;
    }
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
   
    public String addEmployee() {
      employees.add(employee);
      employee = new Employee();
      return null;
   }
    
}