package tn.esprit.employeeangular.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.employeeangular.Entity.employee;

@Repository
public interface employeeRepo extends JpaRepository<employee , Long> {
}
