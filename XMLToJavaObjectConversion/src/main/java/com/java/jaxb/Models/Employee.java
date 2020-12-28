package com.java.jaxb.Models;

import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
	@XmlElement(name = "Employee-Id")
	private Integer id;
	@XmlElement(name = "Employee-Name")
	private String ename;
	@XmlElement(name = "Employee-Salary")
	private Double sal;
	@XmlElement(name = "Employee-Address")
	private Address add;
	@XmlElementWrapper(name = "Projects")
	@XmlElement(name = "Projects-Names")
	private Set<String> projs;
	@XmlElement(name = "Project-Versions")
	private Map<String, Integer> versions;

}
