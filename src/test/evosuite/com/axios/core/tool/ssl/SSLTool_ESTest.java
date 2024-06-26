/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 05:22:09 GMT 2024
 */

package com.axios.core.tool.ssl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.axios.core.manager.DefaultTrustManager;
import com.axios.core.tool.ssl.SSLTool;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SSLTool_ESTest extends SSLTool_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SSLContext sSLContext0 = SSLTool.createSSLContext("");
      assertNotNull(sSLContext0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      KeyManager[] keyManagerArray0 = new KeyManager[1];
      try { 
        SSLTool.createSSLContext(",(", keyManagerArray0, (TrustManager[]) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.security.NoSuchAlgorithmException: ,( SSLContext not available
         //
         verifyException("com.axios.core.tool.ssl.SSLContextBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultTrustManager defaultTrustManager0 = new DefaultTrustManager();
      try { 
        SSLTool.createSSLContext("M(N|~.iwBP*^{bfTb", (KeyManager) null, (TrustManager) defaultTrustManager0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.security.NoSuchAlgorithmException: M(N|~.iwBP*^{bfTb SSLContext not available
         //
         verifyException("com.axios.core.tool.ssl.SSLContextBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TrustManager[] trustManagerArray0 = new TrustManager[0];
      SSLContext sSLContext0 = SSLTool.createSSLContext("", (KeyManager[]) null, trustManagerArray0);
      assertNotNull(sSLContext0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SSLContext sSLContext0 = SSLTool.createSSLContext((String) null, (KeyManager) null, (TrustManager) DefaultTrustManager.INSTANCE);
      assertNotNull(sSLContext0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      KeyManager keyManager0 = mock(KeyManager.class, new ViolatedAssumptionAnswer());
      SSLContext sSLContext0 = SSLTool.createSSLContext((String) null, keyManager0, (TrustManager) null);
      assertNotNull(sSLContext0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SSLTool sSLTool0 = new SSLTool();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      try { 
        SSLTool.createSSLContext("M[~#0%Z@KCa7{");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.security.NoSuchAlgorithmException: M[~#0%Z@KCa7{ SSLContext not available
         //
         verifyException("com.axios.core.tool.ssl.SSLContextBuilder", e);
      }
  }
}
