package annotationtest;

import java.lang.annotation.Retention;  
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) 
public @interface Shin {

	public String color();
}
