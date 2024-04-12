/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 04:56:44 GMT 2024
 */

package com.axios.core.http.url;

import org.junit.Test;
import static org.junit.Assert.*;
import com.axios.core.http.url.URLDecoder;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class URLDecoder_ESTest extends URLDecoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)37;
      byteArray0[1] = (byte)51;
      byteArray0[2] = (byte)56;
      byte[] byteArray1 = URLDecoder.decode(byteArray0, false);
      assertArrayEquals(new byte[] {(byte)56, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)37;
      byteArray0[1] = (byte)48;
      byteArray0[2] = (byte)48;
      byte[] byteArray1 = URLDecoder.decode(byteArray0, true);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)37;
      byteArray0[1] = (byte)48;
      byte[] byteArray1 = URLDecoder.decode(byteArray0, true);
      assertArrayEquals(new byte[] {(byte)37, (byte)48, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      String string0 = URLDecoder.decodeForPath("", charset0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = URLDecoder.decode(byteArray0, true);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = URLDecoder.decode((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = URLDecoder.decode(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      String string0 = URLDecoder.decode((String) null, charset0, true);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      byteArray0[9] = (byte)43;
      byte[] byteArray1 = URLDecoder.decode(byteArray0, true);
      assertEquals(20, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = URLDecoder.decode((byte[]) null, false);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      String string0 = URLDecoder.decode("", charset0, false);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = URLDecoder.decode("BeK=sMiDJ", (Charset) null, true);
      assertEquals("BeK=sMiDJ", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[7] = (byte)37;
      byteArray0[8] = (byte)98;
      byte[] byteArray1 = URLDecoder.decode(byteArray0, false);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)37, (byte)98}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[6] = (byte)37;
      byte[] byteArray1 = URLDecoder.decode(byteArray0, true);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)37}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      byteArray0[9] = (byte)43;
      byte[] byteArray1 = URLDecoder.decode(byteArray0, false);
      assertEquals(20, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[12];
      byteArray0[7] = (byte)43;
      byte[] byteArray1 = URLDecoder.decode(byteArray0);
      assertEquals(12, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      String string0 = URLDecoder.decodeForPath((String) null, charset0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      String string0 = URLDecoder.decodeForPath("G", charset0);
      assertEquals("G", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byteArray0[1] = (byte)37;
      byte[] byteArray1 = URLDecoder.decode(byteArray0, false);
      assertArrayEquals(new byte[] {(byte)0, (byte)37, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      URLDecoder uRLDecoder0 = new URLDecoder();
  }
}