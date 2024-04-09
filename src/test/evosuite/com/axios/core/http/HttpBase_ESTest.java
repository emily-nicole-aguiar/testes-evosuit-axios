/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 05 01:28:26 GMT 2024
 */

package com.axios.core.http;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.axios.core.http.HttpRequest;
import com.axios.header.RequestHeader;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HttpBase_ESTest extends HttpBase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.patch("X0!@");
      RequestHeader requestHeader0 = RequestHeader.ETAG;
      HttpRequest httpRequest1 = httpRequest0.header(requestHeader0, "X0!@");
      assertEquals("HTTP/1.1", httpRequest1.httpVersion());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.get("C");
      // Undeclared exception!
      try { 
        httpRequest0.removeHeader((RequestHeader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.http.HttpBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.head("gAdww%");
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      hashMap0.put("! x_;|P&WGb-F5Z", (List<String>) null);
      // Undeclared exception!
      try { 
        httpRequest0.header((Map<String, List<String>>) hashMap0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HttpRequest httpRequest0 = new HttpRequest("Sy9");
      // Undeclared exception!
      try { 
        httpRequest0.charset("Sy9");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // Sy9
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.options("OKJL,(2");
      HttpRequest httpRequest1 = httpRequest0.removeHeader("OKJL,(2");
      assertEquals("HTTP/1.1", httpRequest1.httpVersion());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.patch("*e@~|Vo><kyx");
      HttpRequest httpRequest1 = httpRequest0.header(httpRequest0.headers, true);
      assertEquals("HTTP/1.1", httpRequest1.httpVersion());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HttpRequest httpRequest0 = new HttpRequest("Sy9");
      HttpRequest httpRequest1 = httpRequest0.header("%20", "%20", false);
      assertEquals("HTTP/1.1", httpRequest1.httpVersion());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.put("?5T");
      HttpRequest httpRequest1 = httpRequest0.header("Accept", "Accept", false);
      assertEquals("HTTP/1.1", httpRequest1.httpVersion());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.patch("com.axios.core.http.url.UrlPath");
      HttpRequest httpRequest1 = httpRequest0.header("    ", (String) null, false);
      assertEquals("HTTP/1.1", httpRequest1.httpVersion());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.patch("ljb$RhDj<");
      HttpRequest httpRequest1 = httpRequest0.header("", "FfI_", true);
      assertEquals("HTTP/1.1", httpRequest1.httpVersion());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.get("C");
      RequestHeader requestHeader0 = RequestHeader.ACCEPT_ENCODING;
      String string0 = httpRequest0.header(requestHeader0);
      assertEquals("gzip, deflate", string0);
      assertEquals("HTTP/1.1", httpRequest0.httpVersion());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.get("User-Agent");
      httpRequest0.headerList("");
      assertEquals("HTTP/1.1", httpRequest0.httpVersion());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.options("Request Body: ");
      httpRequest0.headerList("CZ4.>7ku'E|l7+iGdz");
      assertEquals("HTTP/1.1", httpRequest0.httpVersion());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HttpRequest httpRequest0 = new HttpRequest("}33Xt");
      httpRequest0.header("Accept-Language");
      assertEquals("HTTP/1.1", httpRequest0.httpVersion());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.get("C");
      // Undeclared exception!
      try { 
        httpRequest0.header((RequestHeader) null, "V");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.http.HttpBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.put("O(rx$9y?a");
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      HttpRequest httpRequest1 = httpRequest0.header((Map<String, List<String>>) hashMap0);
      assertEquals("HTTP/1.1", httpRequest1.httpVersion());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.put("O(rx$9y?a");
      httpRequest0.toString();
      assertEquals("HTTP/1.1", httpRequest0.httpVersion());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.patch("=EuT");
      // Undeclared exception!
      try { 
        httpRequest0.charset("HTTP/1.1");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // HTTP/1.1
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.put("O(rx$9y?a");
      HttpRequest httpRequest1 = httpRequest0.charset((String) null);
      assertEquals("HTTP/1.1", httpRequest1.httpVersion());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.get("User-Agent");
      Charset charset0 = Charset.defaultCharset();
      HttpRequest httpRequest1 = httpRequest0.charset(charset0);
      assertEquals("HTTP/1.1", httpRequest1.httpVersion());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.patch("Request Headers: ");
      HttpRequest httpRequest1 = httpRequest0.charset((Charset) null);
      assertEquals("HTTP/1.1", httpRequest1.httpVersion());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.head("4AdwwkOT");
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      HttpRequest httpRequest1 = httpRequest0.addHeaders(hashMap0);
      assertEquals("HTTP/1.1", httpRequest1.httpVersion());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HttpRequest httpRequest0 = new HttpRequest("1y;KvP#8S");
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("HTTP/1.1", "HTTP/1.0");
      HttpRequest httpRequest1 = httpRequest0.addHeaders(hashMap0);
      assertEquals("HTTP/1.1", httpRequest1.httpVersion());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.patch("4f5K#1z5I`BFU{5");
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      HttpRequest httpRequest1 = httpRequest0.header((Map<String, List<String>>) hashMap0, false);
      assertEquals("HTTP/1.1", httpRequest1.httpVersion());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HttpRequest httpRequest0 = new HttpRequest("}33Xt");
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      HttpRequest httpRequest1 = httpRequest0.headerMap(hashMap0, true);
      assertEquals("HTTP/1.1", httpRequest1.httpVersion());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.patch("3@");
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("HTTP/1.0", "HTTP/1.1");
      HttpRequest httpRequest1 = httpRequest0.headerMap(hashMap0, true);
      assertEquals("HTTP/1.1", httpRequest1.httpVersion());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HttpRequest httpRequest0 = new HttpRequest("*e@~|Vo><kyx");
      // Undeclared exception!
      try { 
        httpRequest0.header(httpRequest0.headers, false);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.put("O(rx$9y?a");
      HttpRequest httpRequest1 = httpRequest0.header((String) null, (String) null, true);
      assertEquals("HTTP/1.1", httpRequest1.httpVersion());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.get("C");
      httpRequest0.header((RequestHeader) null);
      assertEquals("HTTP/1.1", httpRequest0.httpVersion());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.get("$");
      HttpRequest httpRequest1 = httpRequest0.clearHeaders();
      assertEquals("HTTP/1.1", httpRequest1.httpVersion());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.get("C");
      Map<String, List<String>> map0 = httpRequest0.headers();
      assertEquals("HTTP/1.1", httpRequest0.httpVersion());
      assertEquals(4, map0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.get("C");
      RequestHeader requestHeader0 = RequestHeader.ACCEPT_ENCODING;
      HttpRequest httpRequest1 = httpRequest0.removeHeader(requestHeader0);
      assertEquals("HTTP/1.1", httpRequest1.httpVersion());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.patch("*e@~|Vo><kyx");
      httpRequest0.httpVersion("nk5r@?q");
      assertEquals("nk5r@?q", httpRequest0.httpVersion());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HttpRequest httpRequest0 = HttpRequest.patch("com.axios.core.http.url.UrlPath");
      HttpRequest httpRequest1 = httpRequest0.header("com.axios.core.http.url.UrlPath", "HTTP/1.0");
      assertEquals("HTTP/1.1", httpRequest1.httpVersion());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HttpRequest httpRequest0 = new HttpRequest("I>LsGT)D<rV&,");
      RequestHeader requestHeader0 = RequestHeader.CONNECTION;
      httpRequest0.header(requestHeader0, "YWOYz6\"}B9p}J*KF", true);
      httpRequest0.isKeepAlive();
      assertEquals("HTTP/1.1", httpRequest0.httpVersion());
  }
}
