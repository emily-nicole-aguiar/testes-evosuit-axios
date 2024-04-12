/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 05:16:42 GMT 2024
 */

package com.axios.core.tool.ssl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.axios.core.tool.ssl.SSLContextBuilder;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SSLContextBuilder_ESTest extends SSLContextBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SSLContextBuilder sSLContextBuilder0 = new SSLContextBuilder();
      sSLContextBuilder0.setProtocol("U)A5glRLAMX5");
      try { 
        sSLContextBuilder0.buildQuietly();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.security.NoSuchAlgorithmException: U)A5glRLAMX5 SSLContext not available
         //
         verifyException("com.axios.core.tool.ssl.SSLContextBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SSLContextBuilder sSLContextBuilder0 = new SSLContextBuilder();
      SSLContext sSLContext0 = sSLContextBuilder0.build();
      assertNotNull(sSLContext0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SSLContextBuilder sSLContextBuilder0 = new SSLContextBuilder();
      SecureRandom secureRandom0 = SecureRandom.getInstanceStrong();
      SSLContextBuilder sSLContextBuilder1 = sSLContextBuilder0.setSecureRandom(secureRandom0);
      assertSame(sSLContextBuilder0, sSLContextBuilder1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SSLContextBuilder sSLContextBuilder0 = SSLContextBuilder.create();
      SSLContextBuilder sSLContextBuilder1 = sSLContextBuilder0.setSecureRandom((SecureRandom) null);
      assertSame(sSLContextBuilder1, sSLContextBuilder0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SSLContextBuilder sSLContextBuilder0 = new SSLContextBuilder();
      KeyManager[] keyManagerArray0 = new KeyManager[1];
      SSLContextBuilder sSLContextBuilder1 = sSLContextBuilder0.setKeyManagers(keyManagerArray0);
      assertSame(sSLContextBuilder0, sSLContextBuilder1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SSLContextBuilder sSLContextBuilder0 = new SSLContextBuilder();
      SSLContextBuilder sSLContextBuilder1 = sSLContextBuilder0.setKeyManagers((KeyManager[]) null);
      assertSame(sSLContextBuilder0, sSLContextBuilder1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SSLContextBuilder sSLContextBuilder0 = SSLContextBuilder.create();
      TrustManager[] trustManagerArray0 = new TrustManager[12];
      SSLContextBuilder sSLContextBuilder1 = sSLContextBuilder0.setTrustManagers(trustManagerArray0);
      assertSame(sSLContextBuilder1, sSLContextBuilder0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SSLContextBuilder sSLContextBuilder0 = new SSLContextBuilder();
      sSLContextBuilder0.setProtocol("b&kAJ_0.g");
      try { 
        sSLContextBuilder0.build();
        fail("Expecting exception: NoSuchAlgorithmException");
      
      } catch(NoSuchAlgorithmException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SSLContextBuilder sSLContextBuilder0 = new SSLContextBuilder();
      SSLContextBuilder sSLContextBuilder1 = sSLContextBuilder0.setProtocol("");
      assertSame(sSLContextBuilder1, sSLContextBuilder0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SSLContextBuilder sSLContextBuilder0 = SSLContextBuilder.create();
      SSLContextBuilder sSLContextBuilder1 = sSLContextBuilder0.setTrustManagers((TrustManager[]) null);
      assertSame(sSLContextBuilder1, sSLContextBuilder0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SSLContextBuilder sSLContextBuilder0 = new SSLContextBuilder();
      SSLContext sSLContext0 = sSLContextBuilder0.buildQuietly();
      assertNotNull(sSLContext0);
  }
}