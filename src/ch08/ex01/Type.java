package ch08.ex01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)//scope을 결정함, source까지만 유지하겠다.
@Target(ElementType.TYPE) //elementType 은 enum타입
public @interface Type {
	//속성값의 타입
	String name();
	int value();
}

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD) //멤버변수에다 쓸때
@interface Field{
	int value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CONSTRUCTOR)
@interface Constructor{
	int value() default 0;
}

@Target(ElementType.METHOD)
@interface Method{
	
}

@Target(ElementType.PARAMETER)
@interface Param{
	
}

@Target(ElementType.LOCAL_VARIABLE)
@Annotation
@interface Local{
	
}

@Target(ElementType.ANNOTATION_TYPE)
@interface Annotation{
	
}

@Target({ElementType.TYPE, ElementType.FIELD})
@interface Universal{
	
}