package ch08.ex01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)//scope�� ������, source������ �����ϰڴ�.
@Target(ElementType.TYPE) //elementType �� enumŸ��
public @interface Type {
	//�Ӽ����� Ÿ��
	String name();
	int value();
}

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD) //����������� ����
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