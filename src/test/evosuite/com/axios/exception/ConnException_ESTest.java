/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 05:35:57 GMT 2024
 */

package com.axios.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.axios.exception.ConnException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConnException_ESTest extends ConnException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConnException connException0 = null;
      try {
        connException0 = new ConnException((Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.exception.ConnException", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConnException connException0 = new ConnException("*?)d;iM9|$J'GCe(^>");
      ConnException connException1 = new ConnException(connException0);
      assertFalse(connException1.equals((Object)connException0));
  }
}
