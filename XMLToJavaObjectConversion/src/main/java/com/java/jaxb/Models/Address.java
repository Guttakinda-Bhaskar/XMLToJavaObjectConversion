package com.java.jaxb.Models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Address {
	@XmlElement(name = "House-No")
private Integer houseNo;
	@XmlElement(name = "House-Address")
private String address;
	@XmlElement(name = "House-Locality")
private String locality;
	@XmlElement(name = "Have-You-Aadhar-Card")
private boolean hvAadhar;
}
