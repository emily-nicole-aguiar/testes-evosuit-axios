/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 05:27:21 GMT 2024
 */

package com.axios.core.map;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.axios.core.map.CaseInsensitiveMap;
import java.nio.CharBuffer;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CaseInsensitiveMap_ESTest extends CaseInsensitiveMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CaseInsensitiveMap<Object, Integer> caseInsensitiveMap0 = new CaseInsensitiveMap<Object, Integer>(16, 16);
      assertEquals(0, caseInsensitiveMap0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CaseInsensitiveMap<Integer, Object> caseInsensitiveMap0 = new CaseInsensitiveMap<Integer, Object>();
      Object object0 = caseInsensitiveMap0.customKey((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CaseInsensitiveMap<Object, Object> caseInsensitiveMap0 = null;
      try {
        caseInsensitiveMap0 = new CaseInsensitiveMap<Object, Object>((Map<?, ?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.map.CaseInsensitiveMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CaseInsensitiveMap<Object, String> caseInsensitiveMap0 = null;
      try {
        caseInsensitiveMap0 = new CaseInsensitiveMap<Object, String>(0, (-998.4F));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal load factor: -998.4
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CaseInsensitiveMap<CharBuffer, String> caseInsensitiveMap0 = null;
      try {
        caseInsensitiveMap0 = new CaseInsensitiveMap<CharBuffer, String>((-4999));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -4999
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CaseInsensitiveMap<CharBuffer, Object> caseInsensitiveMap0 = null;
      try {
        caseInsensitiveMap0 = new CaseInsensitiveMap<CharBuffer, Object>(1440.8651F, (Map<? extends CharBuffer, ?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.map.CaseInsensitiveMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CaseInsensitiveMap<String, Integer> caseInsensitiveMap0 = new CaseInsensitiveMap<String, Integer>();
      CaseInsensitiveMap<String, Object> caseInsensitiveMap1 = null;
      try {
        caseInsensitiveMap1 = new CaseInsensitiveMap<String, Object>((-174.836F), caseInsensitiveMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal load factor: -174.836
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CaseInsensitiveMap<Object, Object> caseInsensitiveMap0 = new CaseInsensitiveMap<Object, Object>(0);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "java.util.HashMap@0000000007");
      Object object0 = caseInsensitiveMap0.customKey(charBuffer0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CaseInsensitiveMap<CharBuffer, String> caseInsensitiveMap0 = new CaseInsensitiveMap<CharBuffer, String>();
      CaseInsensitiveMap<CharBuffer, String> caseInsensitiveMap1 = new CaseInsensitiveMap<CharBuffer, String>(caseInsensitiveMap0);
      assertTrue(caseInsensitiveMap1.equals((Object)caseInsensitiveMap0));
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CaseInsensitiveMap<Integer, Integer> caseInsensitiveMap0 = new CaseInsensitiveMap<Integer, Integer>();
      CaseInsensitiveMap<Integer, Integer> caseInsensitiveMap1 = new CaseInsensitiveMap<Integer, Integer>(16, caseInsensitiveMap0);
      assertTrue(caseInsensitiveMap1.equals((Object)caseInsensitiveMap0));
  }
}
