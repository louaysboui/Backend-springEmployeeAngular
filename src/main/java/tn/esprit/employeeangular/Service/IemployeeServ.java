package tn.esprit.employeeangular.Service;

import tn.esprit.employeeangular.Entity.employee;

import java.util.List;

public interface IemployeeServ {

    employee addemployee(employee e);
    List<employee> retrieveAllemployee();
     void removeemployee(Long id);
     employee modifyemployee(employee Employee);
     employee retriveEmployee(Long id);
}
