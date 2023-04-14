package com.sg.ppt;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface EdurekaAnnotation{
	String MethodName();
	String Description();
}

public class RetetionAnnotation {
	@EdurekaAnnotation(MethodName="Retention Annotation test",Description="testing annotations")
	public void TestMethod() {
		
	}
	

}
