package tn.esprit.employeeangular.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(nullable = false , updatable = false)
    private Long id ;
    private String name;
    private String email;

    private String jobTitle;
    private String phone;
    private String imageUrl;
    //@Column(nullable = false , updatable = false)
    private String employeeCode;


   /* @Override
    public  String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
    '}';


    }*/

}
