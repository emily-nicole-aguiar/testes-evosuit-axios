/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 05 02:06:48 GMT 2024
 */

package com.axios.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import com.axios.exception.NoResourceException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NoResourceException_ESTest extends NoResourceException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NoResourceException noResourceException0 = new NoResourceException("");
      NoResourceException noResourceException1 = new NoResourceException(noResourceException0);
      assertFalse(noResourceException1.equals((Object)noResourceException0));
  }
}
