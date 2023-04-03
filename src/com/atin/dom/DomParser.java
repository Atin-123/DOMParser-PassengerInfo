package com.atin.dom;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class DomParser {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		/*-------Create parser----------*/
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = factory.newDocumentBuilder();
		Document document = documentBuilder.parse(ClassLoader.getSystemResourceAsStream("xml/Passenger.xml"));
	
		/*----------Get Element by document parser------------*/
		
	
	}

}
