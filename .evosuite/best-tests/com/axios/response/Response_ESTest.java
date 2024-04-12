/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 05:30:57 GMT 2024
 */

package com.axios.response;

import org.junit.Test;
import static org.junit.Assert.*;
import com.axios.response.Response;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Response_ESTest extends Response_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Response response0 = new Response();
      response0.setStatus(1407);
      int int0 = response0.getStatus();
      assertEquals(1407, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Response response0 = new Response();
      response0.setStatus((-1));
      int int0 = response0.getStatus();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      Response response0 = new Response(0, hashMap0, "");
      response0.getHeaders();
      assertEquals(0, response0.getStatus());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      Response response0 = new Response((-2066), hashMap0, "+'T!E%|D&{|g2<,G?|");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      hashMap0.put("+'T!E%|D&{|g2<,G?|", linkedList0);
      response0.getHeaders();
      assertEquals((-2066), response0.getStatus());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      Response response0 = new Response(237, hashMap0, "");
      response0.getData();
      assertEquals(237, response0.getStatus());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Response response0 = new Response();
      Map<String, List<String>> map0 = response0.getHeaders();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Response response0 = new Response();
      String string0 = response0.getData();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Response response0 = new Response();
      int int0 = response0.getStatus();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Response response0 = new Response();
      response0.setData(";qUChe\"c_Qb.rn");
      String string0 = response0.getData();
      assertEquals(";qUChe\"c_Qb.rn", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Response response0 = new Response();
      response0.setHeaders((Map<String, List<String>>) null);
      assertNull(response0.getData());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Response response0 = new Response();
      String string0 = response0.toString();
      assertEquals("Response{status=0, headers=null, data='null'}", string0);
  }
}
