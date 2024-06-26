package org.springframework;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @projectName: study-demo
 * @package: com.hundsun.dubbodemo.common.annotation
 * @className: DoneTime
 * @description:
 * @author: h1123
 * @createDate: 2022/5/22 16:42
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DoneTime {
}
