package org.springframework.bean;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Season {

	private String name;

	private boolean aBoolean;

	private TestBean testBean;

	JustInterfaceImpl justInterface;

	// @Resource
	// DoneTimeAspect doneTimeAspect;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TestBean getTestBean() {
		return testBean;
	}

	@Resource
	public void setTestBean(TestBean testBean) {
		this.testBean = testBean;
	}

	public boolean isaBoolean() {
		return aBoolean;
	}

	public void setaBoolean(boolean aBoolean) {
		this.aBoolean = aBoolean;
	}

	public JustInterfaceImpl getJustInterface() {
		return justInterface;
	}

	@Resource
	public void setJustInterface1(JustInterfaceImpl justInterface) {
		this.justInterface = justInterface;
	}

	@Override
	public String toString() {
		return "Season{" +
				"name='" + name + '\'' +
				", aBoolean=" + aBoolean +
				", testBean=" + testBean +
				", justInterface=" + justInterface +
				'}';
	}
}
