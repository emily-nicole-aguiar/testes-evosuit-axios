/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 04:53:39 GMT 2024
 */

package com.axios.core.type;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.axios.core.type.ContentType;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ContentType_ESTest extends ContentType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ContentType[] contentTypeArray0 = ContentType.values();
      assertEquals(7, contentTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ContentType contentType0 = ContentType.valueOf("FORM_URLENCODED");
      assertEquals("application/x-www-form-urlencoded", contentType0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ContentType contentType0 = ContentType.get("[Assertion failed] - this argument +s required; it must not be null");
      String string0 = contentType0.toString(charset0);
      assertEquals("application/json;charset=UTF-8", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = ContentType.isFormUrlEncode("application/x-www-form-urlencoded");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      String string0 = ContentType.build("!%st/SQeh)1Q~u*3^", charset0);
      assertEquals("!%st/SQeh)1Q~u*3^;charset=UTF-8", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        ContentType.build((ContentType) null, charset0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.type.ContentType", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ContentType contentType0 = ContentType.XML;
      String string0 = contentType0.toString();
      assertEquals("application/xml", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ContentType contentType0 = ContentType.XML;
      String string0 = contentType0.getValue();
      assertEquals("application/xml", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        ContentType.build("!g$2S", (Charset) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.type.ContentType", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = ContentType.isFormUrlEncode((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ContentType.get("_prK\"%}0BUK%74w*I");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ContentType contentType0 = ContentType.get("{BynMV-`M'");
      assertEquals(ContentType.JSON, contentType0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ContentType contentType0 = ContentType.get("<%Y$vdTtXM'");
      assertEquals(ContentType.XML, contentType0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ContentType.get("");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = ContentType.isDefault("application/x-www-form-urlencoded");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = ContentType.isDefault("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = ContentType.isDefault((String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ContentType contentType0 = ContentType.XML;
      // Undeclared exception!
      try { 
        contentType0.toString((Charset) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.type.ContentType", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ContentType contentType0 = ContentType.get("[Assertion failed] - this argument +s required; it must not be null");
      String string0 = ContentType.build(contentType0, charset0);
      assertEquals("application/json;charset=UTF-8", string0);
  }
}
