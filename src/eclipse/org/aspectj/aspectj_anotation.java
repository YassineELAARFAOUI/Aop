package eclipse.org.aspectj;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class aspectj_anotation {
	
	
	@Pointcut("execution(* *.*.main(..))")
	public void pc1() {}
	@Before("pc1()")
	public void avant() {
		System.out.println("--------------aspect_annotation----");
		System.out.println("avant");
	}
	@After("pc1()")
	public void apres() {
		
		System.out.println("après");
		System.out.println("--------------aspect_annotation----");
	}
}
