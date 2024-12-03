package eclipse.org.aspectj;

public aspect Aspectj {
//pointcut test():execution(public static void main(String []));
	pointcut test():execution(* *.*.*(..));

before(): test(){
	System.out.println("-----------------------aspect-----");
	System.out.println("avant");
}
after(): test(){
	System.out.println("-----------------------aspect-----");
	System.out.println("apres");
}

}
