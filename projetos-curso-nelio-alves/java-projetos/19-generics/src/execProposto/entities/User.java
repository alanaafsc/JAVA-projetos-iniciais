package execProposto.entities;

import java.util.HashSet;
import java.util.Set;

public class User {
	private Integer code;
	private Set<Integer> idStudents = new HashSet<>();;

	public User() {
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Set<Integer> getIdStudents() {
		return idStudents;
	}

	public void setIdStudents(Set<Integer> idStudents) {
		this.idStudents = idStudents;
	}

}
