/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 05 02:04:54 GMT 2024
 */

package com.axios.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import com.axios.exception.IORuntimeException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IORuntimeException_ESTest extends IORuntimeException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IORuntimeException iORuntimeException0 = new IORuntimeException("");
      IORuntimeException iORuntimeException1 = new IORuntimeException(iORuntimeException0);
      assertFalse(iORuntimeException1.equals((Object)iORuntimeException0));
  }
}
