/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 05:27:08 GMT 2024
 */

package com.axios.request;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.axios.request.Request;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Request_ESTest extends Request_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Request request0 = new Request();
      request0.add("", "");
      String string0 = request0.toParam();
      assertEquals("=%27%27", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Request request0 = new Request();
      request0.add("", "");
      Map<String, Object> map0 = request0.getParams();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Request request0 = new Request();
      request0.add("", (Object) null);
      // Undeclared exception!
      try { 
        request0.toBody();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Request request0 = new Request();
      String string0 = request0.toBody();
      assertEquals("}", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Request request0 = new Request();
      request0.add("", "");
      String string0 = request0.toBody();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Request request0 = new Request();
      Map<String, Object> map0 = request0.getParams();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Request request0 = new Request();
      String string0 = request0.toParam();
      assertEquals("", string0);
  }
}
