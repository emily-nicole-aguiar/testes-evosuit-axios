/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 05 01:55:08 GMT 2024
 */

package com.axios.core.config.global;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.axios.core.config.global.GlobalCookieManager;
import com.axios.core.connection.Connection;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.net.Proxy;
import java.net.URL;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GlobalCookieManager_ESTest extends GlobalCookieManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      List<HttpCookie> list0 = GlobalCookieManager.getCookies(connection0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GlobalCookieManager.setCookieManager((CookieManager) null);
      CookieManager cookieManager0 = GlobalCookieManager.getCookieManager();
      assertNull(cookieManager0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        GlobalCookieManager.store((Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.config.global.GlobalCookieManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        GlobalCookieManager.add((Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.config.global.GlobalCookieManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GlobalCookieManager.setCookieManager((CookieManager) null);
      GlobalCookieManager.store((Connection) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      GlobalCookieManager.store(connection0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      GlobalCookieManager.add(connection0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GlobalCookieManager.setCookieManager((CookieManager) null);
      GlobalCookieManager.add((Connection) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CookieManager cookieManager0 = GlobalCookieManager.getCookieManager();
      assertNotNull(cookieManager0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GlobalCookieManager globalCookieManager0 = new GlobalCookieManager();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        GlobalCookieManager.getCookies((Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.config.global.GlobalCookieManager", e);
      }
  }
}
