package com.hjz.page.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ע�͵�ǰ�ֶ������Ƿ�Ҫ��д������ϵ������
 *
 *
 */
@Deprecated
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface BackField {
	public boolean value() default true;
}
