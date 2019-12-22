package service;

import dao.EmployeeDao;
import java.util.List;
import java.util.stream.Collectors;
import model.Employee;

public class EmployeeService {

  public List<Employee> getAdultEmployee() {
    EmployeeDao employeeDao = new EmployeeDao();
    List<Employee> allEmployee = employeeDao.getAllEmployee();
    List<Employee> adultEmployee = allEmployee.stream().filter(e -> e.getAge() >= 18).collect(Collectors.toList());
    return adultEmployee;
  }
}