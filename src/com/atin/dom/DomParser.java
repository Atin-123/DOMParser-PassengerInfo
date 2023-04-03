package com.atin.dom;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.atin.data.Passenger;

public class DomParser {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		/*-------Create parser----------*/
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = factory.newDocumentBuilder();
		Document document = documentBuilder.parse(ClassLoader.getSystemResourceAsStream("xml/Passenger.xml"));
	
		
		/*-----Create instance of Passenger Class-----*/
		Passenger passenger = new Passenger();
		
		
		/*----------Get Element by document parser------------*/
		//Get Nodelist of passenger
		NodeList nameList = document.getElementsByTagName("tns:name");
		//Takeout single Node from nodelist
		Node name = nameList.item(0);
		//save node data to our java object
		passenger.setName(name.getTextContent());
		
		//Get Nodelist of dob
		NodeList dobList = document.getElementsByTagName("tns:dob");
		//Takeout single dob from doblist
		Node dob = dobList.item(0);
		//save node data to our java object
		passenger.setDob(dob.getTextContent());
		
		//Get Nodelist of seat no
		NodeList seatnoList = document.getElementsByTagName("tns:seatno");
		//Takeout single seatno from seatnoList
		Node seatNo = seatnoList.item(0);
		//save node data to our java object
		passenger.setSeatno(seatNo.getTextContent());
		
		//Get Nodelist of gender
		NodeList genderList = document.getElementsByTagName("tns:gender");
		//Takeout single gender out of genderList
		Node gender = genderList.item(0);
		//save node data to our java object 
		passenger.setGender(gender.getTextContent());
		
		
		
		System.out.println(passenger.getName());
		System.out.println(passenger.getDob());
		System.out.println(passenger.getSeatno());
		System.out.println(passenger.getGender());
		
		
		
	
	}

}
