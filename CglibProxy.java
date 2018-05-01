/**  
 * @Title:  CglibProxy.java   
 * @Package myCglibDemo   
 * @Description:    TODO  
 * @author: 
 * @date:   2018��1��5�� ����10:31:34   
 * @version V1.0 
 */
package myCglibDemo;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**   
 * @ClassName:  CglibProxy   
 * @Description:TODO
 * @author: 
 * @date:   2018��1��5�� ����10:31:34     
 */
/**   
 * @ClassName:  CglibProxy   
 * @Description:TODO
 * @author: 
 * @date:   2018��1��5�� ����11:11:46     
 */
public class CglibProxy implements MethodInterceptor{
    Object target;
    
    
	/**   
	 * @Title: createProxy   
	 * @Description: TODO
	 * @param: @param target
	 * @param: @return      
	 * @return: Object      
	 * @throws   
	 */
	public Object createProxy(Object target) {
		 this.target=target;
		 Enhancer enhancer=new Enhancer();
		 enhancer.setSuperclass(SimpleDemo.class);
		 enhancer.setCallback(this);
		 //enhancer.setClassLoader(SimpleDemo.class.getClassLoader());
		 return enhancer.create();
	}

	/**   
	 * <p>Title: intercept</p>   
	 * <p>Description: </p>   
	 * @param arg0  �������
	 * @param arg1  ���صķ���
	 * @param arg2  ���صķ����Ĳ���
	 * @param arg3  ������
	 * @return
	 * @throws Throwable   
	 * @see net.sf.cglib.proxy.MethodInterceptor#intercept(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], net.sf.cglib.proxy.MethodProxy)   
	 */
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		System.out.println("--- before ---");
		System.out.println(arg0.getClass().getName());
		Object result=arg3.invokeSuper(arg0, arg2);
		//Object result=arg1.invoke(target,arg2);
		System.out.println("--- after ---");
		return result;
	}	
}
