package autowirewithAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =
    			new ClassPathXmlApplicationContext("autowirewithAnnotation/config.xml");
    	Emp emp = context.getBean("emp",Emp.class);
    	System.out.println(emp);
    	
   
    	((AbstractApplicationContext) context).close();
    }
}