package org.springframework;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.time.Clock;

/**
 * @projectName: spring
 * @package: org.springframework
 * @className: TestApplicationEven
 * @description:
 * @author: h1123
 * @createDate: 2022/11/19 18:46
 * @updateUser: h1123
 * @updateDate: 2022/11/19 18:46
 * @updateRemark:
 * @version: v1.0
 * @see :
 */
@Component
public class TestApplicationEven extends ApplicationEvent implements Serializable {

	private static final long serialVersionUID = 1000000000000000000L;



	public TestApplicationEven(Object source) {
		super(source);
	}
}
