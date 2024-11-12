package tn.esprit.employeeangular.RestControler;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.employeeangular.Entity.employee;
import tn.esprit.employeeangular.Service.IemployeeServ;

import java.util.List;

//@Tag(name="Gestion employee")
@RestController
@AllArgsConstructor
@RequestMapping("/employee")
public class employeeRestC {
    IemployeeServ iemployeeServ ;
    @PostMapping("/add-employee")
    public ResponseEntity<employee> addemployee(@RequestBody employee e) {
        employee newEmployee = iemployeeServ.addemployee(e);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }
    //@Operation(description = "recuperer toutes les Blocs de la base de données")
    @GetMapping("/retrieve-all-Employee")
    public List<employee> getemployee() {
        List<employee> listEmployee = iemployeeServ.retrieveAllemployee();
        return new ResponseEntity<>(listEmployee, HttpStatus.OK).getBody();
    }
    @DeleteMapping("/remove-Employee/{Employee-id}")
    public void removeBloc(@PathVariable("Employee-id") Long chId) {
        iemployeeServ.removeemployee(chId);
    }
    @PutMapping("/modify-Employee")
    public employee modifyemployee(@RequestBody employee e) {
        employee Employee = iemployeeServ.modifyemployee(e);
        return Employee;
    }
    @GetMapping("/retrieve-Employee/{Employee-id}")
    public employee retrieveemployee(@PathVariable("Employee-id") Long chId) {
        employee Employee = iemployeeServ.retriveEmployee(chId);
        return Employee;
    }
    }
