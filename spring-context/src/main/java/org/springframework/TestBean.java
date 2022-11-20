package org.springframework;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
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
@Component
public class TestBean implements ApplicationListener<TestApplicationEven> {

	private String test;

	@Override
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
