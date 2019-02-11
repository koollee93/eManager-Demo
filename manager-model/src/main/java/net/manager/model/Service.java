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
@Table(name = "service")
@BatchSize(size = 100)
public class Service implements Identifiable {


	private Long serviceId;
	private String name;

	@Transient
	@Override
	public Long getIdentifier() {
		return serviceId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Service service = (Service) o;
		return Objects.equals(serviceId, service.serviceId) &&
				Objects.equals(name, service.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(serviceId, name);
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "service_id")
	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
