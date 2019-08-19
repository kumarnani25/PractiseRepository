package samplePractiseproject;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class xmltest 

{

	@Test
	public  void Test23() 
	{
		XmlSuite s=new XmlSuite();
		s.setName("Suite");
		
		XmlTest ts=new XmlTest(s);
		ts.setName("Test");
		
		
		
		List<XmlClass> ls=new ArrayList<XmlClass>();
		XmlClass c=new XmlClass(openbrowser.class);
		ls.add(c);
		
		ts.setXmlClasses(ls);
		
		TestNG tg=new TestNG();
		List<XmlSuite> lst=new ArrayList<XmlSuite>();
		lst.add(s);
		tg.setXmlSuites(lst);
		tg.run();
		
		
				
	}
	
	
}
