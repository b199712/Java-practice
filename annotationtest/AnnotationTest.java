package annotationtest;

import static java.lang.System.out;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//get class annotatino value
//		Class a=Color.class;
//		Annotation annotation=a.getAnnotation(Shin.class);
//		if(annotation!=null){
//			Shin shin=(Shin)annotation;
//			out.println("color: "+shin.color());
//		}
		
		//get methed annotation value
//		try {
//			Method method=Color.class.getMethod("a");
//			if(method.isAnnotationPresent(Shin.class)){
////				Annotation[] annotations=method.getDeclaredAnnotations();
////				
////				for(Annotation annotation:annotations){
////					if(annotation instanceof Shin){
////						Shin shin=(Shin)annotation;
////						out.println("color: "+shin.color());
////					}
////				}
//				out.println("is set");
//				Shin shin=method.getAnnotation(Shin.class);
//				out.println("Color: "+shin.color());
//			}else{
//				out.println("No set");
//			}
//			
//			Annotation[] annotations=method.getAnnotations();
//			for(Annotation annotation:annotations){
//				out.println(annotation.annotationType().getName());
//			}
//		} catch (NoSuchMethodException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SecurityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
