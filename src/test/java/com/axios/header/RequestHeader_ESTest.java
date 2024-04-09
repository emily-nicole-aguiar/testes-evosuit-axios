/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 05 02:06:40 GMT 2024
 */

package com.axios.header;

import org.junit.Test;
import static org.junit.Assert.*;
import com.axios.header.RequestHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RequestHeader_ESTest extends RequestHeader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RequestHeader[] requestHeaderArray0 = RequestHeader.values();
      assertEquals(28, requestHeaderArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RequestHeader requestHeader0 = RequestHeader.valueOf("VIA");
      assertEquals("Via", requestHeader0.getValue());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RequestHeader requestHeader0 = RequestHeader.TRAILER;
      String string0 = requestHeader0.getValue();
      assertEquals("Trailer", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RequestHeader requestHeader0 = RequestHeader.ACCEPT_LANGUAGE;
      String string0 = requestHeader0.toString();
      assertEquals("Accept-Language", string0);
  }
}
