package org.katheer.test;

import org.katheer.bean.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("org/katheer/resource/applicationContext.xml");

        Course courses = (Course) context.getBean("courses");
        System.out.println(courses.getCourses());
    }
}
