package org.springframework;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @projectName: spring
 * @package: org.springframework
 * @className: TestBean
 * @description:
 * @author: h1123
 * @createDate: 2022/11/19 13:09
 * @updateUser: h1123
 * @updateDate: 2022/11/19 13:09
 * @updateRemark:
 * @version: v1.0
 * @see :
 */
@ComponentScan(basePackages = {"org.springframework.bean"})
public class TestBean implements ApplicationListener<TestApplicationEven> {

	private String test;

	private TestBean testBean;

	public TestBean getTestBean() {
		return testBean;
	}

	public void setTestBean(TestBean testBean) {
		this.testBean = testBean;
	}

	@Override
	@DoneTime
	public void onApplicationEvent(TestApplicationEven event) {
		System.out.println("事件进来了");
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}


}
