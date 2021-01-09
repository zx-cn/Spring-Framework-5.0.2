package run;

import model.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainClass {

	public static void main(String[] args) {


		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.start();
		Student student=context.getBean(Student.class);
		System.out.println("Dubbo service start...");
		System.out.println("Student "+student.getName()+student.getAge());
		try {
			Thread.sleep(100000000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
