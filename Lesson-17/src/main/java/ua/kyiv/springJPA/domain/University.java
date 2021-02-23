package ua.kyiv.springJPA.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class University {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String name;

	@Column(name = "accreditation_level")
	private Integer accreditationLevel;

	@Column(name = "institutes_count")
	private Integer institutesCount;

	@Column(name = "students_count")
	private Integer studentsCount;

	@Column
	private String address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAccreditationLevel() {
		return accreditationLevel;
	}

	public void setAccreditationLevel(Integer accreditationLevel) {
		this.accreditationLevel = accreditationLevel;
	}

	public Integer getInstitutesCount() {
		return institutesCount;
	}

	public void setInstitutesCount(Integer institutesCount) {
		this.institutesCount = institutesCount;
	}

	public Integer getStudentsCount() {
		return studentsCount;
	}

	public void setStudentsCount(Integer studentsCount) {
		this.studentsCount = studentsCount;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", accreditationLevel=" + accreditationLevel
				+ ", institutesCount=" + institutesCount + ", studentsCount=" + studentsCount + ", address=" + address
				+ "]";
	}
}
