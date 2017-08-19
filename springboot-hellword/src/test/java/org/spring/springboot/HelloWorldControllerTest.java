package org.spring.springboot;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import org.spring.springboot.controller.HelloWorldController;

import static org.junit.Assert.assertEquals;

/** 
* HelloWorldController Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 19, 2017</pre> 
* @version 1.0 
*/ 
public class HelloWorldControllerTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: sayHello() 
* 
*/
@Test
public void testSayHello() throws Exception {
    assertEquals("Hello,World!",new HelloWorldController().sayHello());
} 


} 
