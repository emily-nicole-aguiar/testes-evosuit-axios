/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 05:13:48 GMT 2024
 */

package com.axios.core.tool.mutable;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.axios.core.tool.mutable.MutableObj;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MutableObj_ESTest extends MutableObj_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutableObj<Object> mutableObj0 = new MutableObj<Object>();
      Object object0 = new Object();
      mutableObj0.set(object0);
      Object object1 = mutableObj0.get();
      // Undeclared exception!
      try { 
        object1.toString();
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MutableObj<String> mutableObj0 = new MutableObj<String>(";w[A+.H$@j6FG#N.%");
      MutableObj<Integer> mutableObj1 = new MutableObj<Integer>();
      // Undeclared exception!
      try { 
        mutableObj1.equals(mutableObj0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutableObj<Object> mutableObj0 = new MutableObj<Object>();
      mutableObj0.set("");
      Object object0 = mutableObj0.get();
      // Undeclared exception!
      try { 
        object0.equals(mutableObj0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutableObj<Object> mutableObj0 = new MutableObj<Object>();
      Object object0 = new Object();
      boolean boolean0 = mutableObj0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutableObj<Object> mutableObj0 = new MutableObj<Object>();
      String string0 = mutableObj0.toString();
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutableObj<String> mutableObj0 = new MutableObj<String>(",M'/LO:Sl SL4t\"2L");
      String string0 = mutableObj0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutableObj<Object> mutableObj0 = new MutableObj<Object>();
      mutableObj0.hashCode();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MutableObj<Object> mutableObj0 = new MutableObj<Object>();
      MutableObj<String> mutableObj1 = new MutableObj<String>(",M'/LO:Sl SL4t\"2L");
      mutableObj0.set(mutableObj1);
      mutableObj0.hashCode();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MutableObj<Object> mutableObj0 = new MutableObj<Object>();
      boolean boolean0 = mutableObj0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutableObj<Object> mutableObj0 = new MutableObj<Object>();
      MutableObj<String> mutableObj1 = new MutableObj<String>(",M'/LO:Sl SL4t\"2L");
      mutableObj0.set(mutableObj1);
      Object object0 = mutableObj0.get();
      boolean boolean0 = mutableObj1.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutableObj<Object> mutableObj0 = new MutableObj<Object>();
      Object object0 = mutableObj0.get();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutableObj<MutableObj<Object>> mutableObj0 = new MutableObj<MutableObj<Object>>();
      MutableObj<Object> mutableObj1 = new MutableObj<Object>();
      mutableObj0.set(mutableObj1);
      mutableObj1.set(mutableObj0);
      // Undeclared exception!
      try { 
        mutableObj1.equals(mutableObj0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}