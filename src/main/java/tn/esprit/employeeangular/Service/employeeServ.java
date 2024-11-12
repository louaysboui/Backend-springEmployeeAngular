package tn.esprit.employeeangular.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.employeeangular.Entity.employee;
import tn.esprit.employeeangular.Exception.UserNotFoundException;
import tn.esprit.employeeangular.Repository.employeeRepo;

import java.util.List;


@Service
@AllArgsConstructor
public class employeeServ implements IemployeeServ{
      employeeRepo EmployeeRepo ;

    public employee addemployee(employee e) {
        return EmployeeRepo.save(e);
    }

    @Override
    public List<employee> retrieveAllemployee() {
        return null;
    }
    @Override
    public void removeemployee(Long id) {
        EmployeeRepo.deleteById(id);
    }
    public employee modifyemployee(employee Employee) {
        return EmployeeRepo.save(Employee);
    }
    //public employee retriveEmployee(Long id) { return EmployeeRepo.findById(id).get(); }
    public employee retriveEmployee(Long id) {
        return EmployeeRepo.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }
}
