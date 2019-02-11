package net.manager.model;

import org.hibernate.annotations.BatchSize;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Objects;

@Entity
@Table(name = "customer")
@BatchSize(size = 100)
public class Customer implements Identifiable {

	private Long _customerId;
	private String _name;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id")
	public Long getCustomerId() {
		return _customerId;
	}

	public void setCustomerId(Long customerId) {
		_customerId = customerId;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	@Transient
	@Override
	public Long getIdentifier() {
		return _customerId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Customer customer = (Customer) o;
		return Objects.equals(_customerId, customer._customerId) &&
				Objects.equals(_name, customer._name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(_customerId, _name);
	}


}
