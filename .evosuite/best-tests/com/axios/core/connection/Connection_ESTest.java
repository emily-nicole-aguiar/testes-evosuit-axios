/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 04:47:00 GMT 2024
 */

package com.axios.core.connection;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.axios.core.config.ssl.CustomProtocolsSSLFactory;
import com.axios.core.config.ssl.TrustAnyHostnameVerifier;
import com.axios.core.connection.Connection;
import com.axios.core.requestMethod.RequestMethod;
import com.axios.header.RequestHeader;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.UnknownServiceException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Connection_ESTest extends Connection_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = Connection.create(uRL0, (Proxy) null);
      Connection connection1 = connection0.setChunkedStreamingMode(0);
      assertSame(connection1, connection0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = Connection.create(uRL0, (Proxy) null);
      Connection connection1 = connection0.setReadTimeout(0);
      assertSame(connection1, connection0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = Connection.create(uRL0, (Proxy) null);
      Connection connection1 = connection0.setConnectTimeout(0);
      assertSame(connection0, connection1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>(5984);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add((String) null);
      hashMap0.put("fg{B=j>U^q", linkedList0);
      Connection connection1 = connection0.header(hashMap0, true);
      assertSame(connection0, connection1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = Connection.create(uRL0, (Proxy) null);
      connection0.connect();
      int int0 = connection0.responseCode();
      assertEquals(404, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://www.someFakeButWellFormedURL.org/fooExample");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      Connection connection0 = Connection.create(uRL0, (Proxy) null);
      int int0 = connection0.responseCode();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = Connection.create(uRL0, (Proxy) null);
      RequestHeader requestHeader0 = RequestHeader.REFERER;
      String string0 = connection0.header(requestHeader0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      // Undeclared exception!
      try { 
        connection0.setMethod((RequestMethod) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.connection.Connection", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      connection0.connect();
      RequestMethod requestMethod0 = RequestMethod.PATCH;
      // Undeclared exception!
      try { 
        connection0.setMethod(requestMethod0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Already connected
         //
         verifyException("java.net.URLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      connection0.connect();
      // Undeclared exception!
      try { 
        connection0.setCookie("fg{Bhn>I^:[q");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Already connected
         //
         verifyException("java.net.URLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      connection0.connect();
      // Undeclared exception!
      try { 
        connection0.setChunkedStreamingMode(259);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Can't set streaming mode: already connected
         //
         verifyException("java.net.HttpURLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      connection0.connect();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>(6016);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add((String) null);
      hashMap0.put((String) null, linkedList0);
      // Undeclared exception!
      try { 
        connection0.header(hashMap0, true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Already connected
         //
         verifyException("java.net.URLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      // Undeclared exception!
      try { 
        connection0.header((String) null, (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key is null
         //
         verifyException("java.net.URLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      Connection connection1 = connection0.connect();
      // Undeclared exception!
      try { 
        connection1.header("", "", true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Already connected
         //
         verifyException("java.net.URLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      // Undeclared exception!
      try { 
        connection0.header((RequestHeader) null, "fg{B=n>^q", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.connection.Connection", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      connection0.connect();
      RequestHeader requestHeader0 = RequestHeader.SET_COOKIE;
      // Undeclared exception!
      try { 
        connection0.header(requestHeader0, "H*CA>`+c1}[`C+MF", false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Already connected
         //
         verifyException("java.net.URLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://www.someFakeButWellFormedURL.org/fooExample");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      connection0.getInputStream();
      // Undeclared exception!
      try { 
        connection0.disableCache();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Already connected
         //
         verifyException("java.net.URLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Proxy proxy0 = Proxy.NO_PROXY;
      // Undeclared exception!
      try { 
        Connection.create(uRL0, proxy0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.UnsupportedOperationException: Method not implemented.
         //
         verifyException("com.axios.core.connection.Connection", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      // Undeclared exception!
      try { 
        Connection.create((String) null, proxy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Url is blank !
         //
         verifyException("com.axios.core.assertion.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Proxy proxy0 = Proxy.NO_PROXY;
      Connection connection0 = null;
      try {
        connection0 = new Connection(uRL0, proxy0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.UnsupportedOperationException: Method not implemented.
         //
         verifyException("com.axios.core.connection.Connection", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      Connection connection0 = null;
      try {
        connection0 = new Connection(uRL0, (Proxy) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.connection.Connection", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Proxy.Type proxy_Type0 = Proxy.Type.SOCKS;
      InetAddress inetAddress0 = MockInetAddress.getByName("");
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(inetAddress0, 0);
      Proxy proxy0 = new Proxy(proxy_Type0, mockInetSocketAddress0);
      Connection connection0 = null;
      try {
        connection0 = new Connection("H*QzNOhDL45k'{t", proxy0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no protocol: H*QzNOhDL45k'{t
         //
         verifyException("com.axios.core.tool.UrlTool", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = Connection.create(uRL0, (Proxy) null);
      Connection connection1 = connection0.disconnect();
      assertSame(connection0, connection1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = Connection.create(uRL0, (Proxy) null);
      Connection connection1 = connection0.setReadTimeout(404);
      assertSame(connection0, connection1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = Connection.create(uRL0, (Proxy) null);
      Connection connection1 = connection0.setConnectTimeout(404);
      assertSame(connection0, connection1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      Connection connection1 = connection0.header("v(6n#J[k7bKk", "Y+|", false);
      assertSame(connection1, connection0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      String string0 = connection0.getCharsetName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      Connection connection1 = connection0.initConn();
      assertSame(connection1, connection0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      Connection connection0 = null;
      try {
        connection0 = new Connection("", proxy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Url is blank !
         //
         verifyException("com.axios.core.assertion.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      RequestMethod requestMethod0 = connection0.getMethod();
      assertEquals(RequestMethod.GET, requestMethod0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      try { 
        connection0.responseCode();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = Connection.create(uRL0, (Proxy) null);
      InputStream inputStream0 = connection0.getErrorStream();
      assertNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = Connection.create(uRL0, (Proxy) null);
      try { 
        connection0.getInputStream();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      connection0.connect();
      // Undeclared exception!
      try { 
        connection0.getOutputStream();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Already connected
         //
         verifyException("java.net.URLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      Connection connection1 = connection0.setChunkedStreamingMode((-851));
      assertSame(connection1, connection0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      Connection connection1 = connection0.setCookie((String) null);
      assertSame(connection1, connection0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      Connection connection1 = connection0.setReadTimeout((-691));
      assertSame(connection0, connection1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      Connection connection1 = connection0.setConnectTimeout((-487));
      assertSame(connection1, connection0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      TrustAnyHostnameVerifier trustAnyHostnameVerifier0 = new TrustAnyHostnameVerifier();
      String[] stringArray0 = new String[8];
      CustomProtocolsSSLFactory customProtocolsSSLFactory0 = new CustomProtocolsSSLFactory(stringArray0);
      Connection connection1 = connection0.setHttpsInfo(trustAnyHostnameVerifier0, customProtocolsSSLFactory0);
      assertSame(connection0, connection1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>(6016);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add((String) null);
      hashMap0.put((String) null, linkedList0);
      // Undeclared exception!
      try { 
        connection0.header(hashMap0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key is null
         //
         verifyException("java.net.URLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>(6016);
      Connection connection1 = connection0.header(hashMap0, true);
      assertSame(connection0, connection1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      RequestMethod requestMethod0 = RequestMethod.HEAD;
      Connection connection1 = connection0.setMethod(requestMethod0);
      assertSame(connection1, connection0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      RequestMethod requestMethod0 = RequestMethod.PATCH;
      // Undeclared exception!
      try { 
        connection0.setMethod(requestMethod0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid HTTP method: PATCH
         //
         verifyException("com.axios.core.connection.Connection", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      RequestMethod requestMethod0 = RequestMethod.PUT;
      Connection connection1 = connection0.setMethod(requestMethod0);
      assertSame(connection0, connection1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = Connection.create(uRL0, (Proxy) null);
      RequestMethod requestMethod0 = RequestMethod.DELETE;
      Connection connection1 = connection0.setMethod(requestMethod0);
      assertSame(connection0, connection1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      RequestMethod requestMethod0 = RequestMethod.POST;
      Connection connection1 = connection0.setMethod(requestMethod0);
      assertSame(connection1, connection0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = Connection.create(uRL0, (Proxy) null);
      Charset charset0 = connection0.getCharset();
      assertNull(charset0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      Proxy proxy0 = connection0.getProxy();
      assertNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      Connection connection1 = connection0.setInstanceFollowRedirects(false);
      assertSame(connection1, connection0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = Connection.create(uRL0, (Proxy) null);
      Connection connection1 = connection0.setConnectionAndReadTimeout(82);
      assertSame(connection0, connection1);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      RequestHeader requestHeader0 = RequestHeader.CONNECTION;
      Connection connection1 = connection0.header(requestHeader0, "fg{B=n>U^q", false);
      assertSame(connection1, connection0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      String string0 = connection0.header((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = Connection.create(uRL0, (Proxy) null);
      HttpURLConnection httpURLConnection0 = connection0.getHttpURLConnection();
      assertTrue(httpURLConnection0.getDoInput());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = Connection.create(uRL0, (Proxy) null);
      Connection connection1 = connection0.disableCache();
      assertSame(connection0, connection1);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      // Undeclared exception!
      try { 
        Connection.create("J", (Proxy) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no protocol: J
         //
         verifyException("com.axios.core.tool.UrlTool", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = new Connection(uRL0, (Proxy) null);
      // Undeclared exception!
      try { 
        connection0.header((RequestHeader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.connection.Connection", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = Connection.create(uRL0, (Proxy) null);
      try { 
        connection0.getOutputStream();
        fail("Expecting exception: UnknownServiceException");
      
      } catch(UnknownServiceException e) {
         //
         // protocol doesn't support output
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = Connection.create(uRL0, (Proxy) null);
      Connection connection1 = connection0.disconnectQuietly();
      assertSame(connection0, connection1);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = Connection.create(uRL0, (Proxy) null);
      Map<String, List<String>> map0 = (Map<String, List<String>>)connection0.headers();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = Connection.create(uRL0, (Proxy) null);
      URL uRL1 = connection0.getUrl();
      assertSame(uRL0, uRL1);
  }
}
