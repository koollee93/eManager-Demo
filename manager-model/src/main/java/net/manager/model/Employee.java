package net.manager.model;

import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.util.Objects;

@Entity
@BatchSize(size = 100)
@Table(name = "employee")
public class Employee implements Identifiable{

    private Long _employeeId;
    private String _name;
    private Boolean _active;

    public Employee() {
        _active = true;
    }

    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getEmployeeId() {
        return _employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        _employeeId = employeeId;
    }

    @Column(nullable = false, unique = true, name = "name")
    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    @Column(nullable = false, name = "active")
    public Boolean getActive() {
        return _active;
    }

    public void setActive(Boolean active) {
        _active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(_name, employee._name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_name);
    }

    @Override
    @Transient
    public Long getIdentifier() {
        return _employeeId;
    }
}
