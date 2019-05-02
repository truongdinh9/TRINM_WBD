package vn.com.model;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.*;

@Entity
@Table
@Component
public class Customer implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "provinceId")
    private Province province;

    public Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    @Override
    public boolean supports(Class<?> clazz) { // phuong thuc xac dinh class nay duoc validate
        return Customer.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) { // xac dinh Ob va tra ve loi neu co
        Customer customer = (Customer) target;
        String firstName = customer.getFirstName();
        String lastName = customer.getLastName();
        ValidationUtils.rejectIfEmpty(errors,"firstName", "firstName.empty");
        ValidationUtils.rejectIfEmpty(errors,"lastName","lastName.empty");
        if (firstName.length()< 10){
            errors.rejectValue("firstName","firstName.length");
        }
        if (lastName.length()<10){
            errors.rejectValue("lastName","lastName.length");
        }
    }
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", province=" + province +
                '}';
    }
}
