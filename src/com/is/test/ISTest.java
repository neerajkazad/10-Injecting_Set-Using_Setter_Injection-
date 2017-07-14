package com.is.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.is.beans.Course;

public class ISTest {
	public static void main(String[] args) {
		Course course = null;
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/is/common/application-context.xml"));
		course = factory.getBean("bTechCS", Course.class);
		course.showFaculties();
	}
}
