package com.java.jaxb.Models;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class XMLToJavaObjectConversion {
	public static void main(String[] args) throws JAXBException {

		Employee employee = new Employee();
		employee.setId(10110050);
		employee.setEname("Bhaskar");
		employee.setSal(10003.0);

		Address address = new Address();
		address.setHouseNo(10 - 01);
		address.setAddress("GuttakindaPalli");
		address.setLocality("MPL");
		address.setHvAadhar(true);
		employee.setAdd(address);

		Set<String> projects = new HashSet<String>();
		projects.add("Gofounders");
		projects.add("Onpassive");
		projects.add("SupportAdmin");
		employee.setProjs(projects);

		Map<String, Integer> versions = new HashMap<String, Integer>();
		versions.put("Gofounders", 3);
		versions.put("Onpassive", 2);
		versions.put("SupportAdmin", 1);
		employee.setVersions(versions);
		
		//JavaObject-To-XML Conversion
		JAXBContext context=JAXBContext.newInstance(Employee.class);
		Marshaller createMarshaller = context.createMarshaller();
		createMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
		createMarshaller.marshal(employee,System.out);
		
		
		//XML-To-JavaObject Conversion
		File file=new File("employee.xml");
		JAXBContext context1=JAXBContext.newInstance(Employee.class);
		Unmarshaller createUnmarshaller = context1.createUnmarshaller();
		Employee unmarshal = (Employee) createUnmarshaller.unmarshal(file);
		System.err.println(unmarshal);
		
		
	}
}
