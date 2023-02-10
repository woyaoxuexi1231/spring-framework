package org.springframework.bean;

import org.springframework.TestBean;
import org.springframework.stereotype.Component;

@Component
public class Season {

	private String name;

	private boolean aBoolean;

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

	public boolean isaBoolean() {
		return aBoolean;
	}

	public void setaBoolean(boolean aBoolean) {
		this.aBoolean = aBoolean;
	}

	@Override
	public String toString() {
		return "Season{" +
				"name='" + name + '\'' +
				'}';
	}
}
