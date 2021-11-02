package com.iiht.training.college.dto;

public class DepartmentDto {

	private Long departmentId;
	private String name;
	private Integer numberOfLecturers;
	private String headName;

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumberOfLecturers() {
		return numberOfLecturers;
	}

	public void setNumberOfLecturers(Integer numberOfLecturers) {
		this.numberOfLecturers = numberOfLecturers;
	}

	public String getHeadName() {
		return headName;
	}

	public void setHeadName(String headName) {
		this.headName = headName;
	}

}
