/**  
 * @Title:  CglibTest.java   
 * @Package myCglibDemo   
 * @Description:    TODO  
 * @author: 
 * @date:   2018年1月5日 下午10:41:45   
 * @version V1.0 
 */
package myCglibDemo;

/**   
 * @ClassName:  CglibTest   
 * @Description:TODO
 * @author: 
 * @date:   2018年1月5日 下午10:41:45     
 */
public class CglibTest {

	/**   
	 * @Title: main   
	 * @Description: TODO
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {		
		  SimpleDemo sDemo=new SimpleDemo();
		  CglibProxy cp=new CglibProxy();
		  SimpleDemo sd = (SimpleDemo)cp.createProxy(sDemo);
		  sd.sayHello();
	}

}
