package org.springframework.bean;

import org.springframework.DoneTime;

/**
 * @projectName: spring
 * @package: org.springframework.bean
 * @className: AClass
 * @description:
 * @author: woaixuexi
 * @createDate: 2024/3/18 23:14
 */


public class AClass {

	BClass bClass;

	public BClass getbClass() {
		return bClass;
	}

	public void setbClass(BClass bClass) {
		this.bClass = bClass;
	}

	@DoneTime
	public void print() {
		System.out.println("aclass");
	}

	;
}
