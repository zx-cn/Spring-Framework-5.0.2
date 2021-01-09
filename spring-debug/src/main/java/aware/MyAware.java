package aware;

import org.springframework.beans.factory.BeanNameAware;

public class MyAware implements BeanNameAware {
	@Override
	public void setBeanName(String name) {

		System.out.println("MyAware be called"+name);
	}
}
