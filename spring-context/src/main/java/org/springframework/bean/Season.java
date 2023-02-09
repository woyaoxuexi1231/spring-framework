package org.springframework.bean;

import org.springframework.TestBean;
import org.springframework.stereotype.Component;

@Component
public class Season {

	private String name;

	private TestBean testBean;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TestBean getTestBean() {
		return testBean;
	}

	public void setTestBean(TestBean testBean) {
		this.testBean = testBean;
	}

	@Override
	public String toString() {
		return "Season{" +
				"name='" + name + '\'' +
				'}';
	}
}
