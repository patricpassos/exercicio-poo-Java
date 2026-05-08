package entities;

import java.util.Objects;

public class Students {

	private Integer studentCode;

	public Students(Integer studentCode) {
		this.studentCode = studentCode;
	}

	public Integer getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(Integer studentCode) {
		this.studentCode = studentCode;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return Objects.equals(studentCode, other.studentCode);
	}
	
}
