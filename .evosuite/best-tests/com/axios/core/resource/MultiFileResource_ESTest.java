/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 05:24:42 GMT 2024
 */

package com.axios.core.resource;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.axios.core.resource.MultiFileResource;
import com.axios.core.resource.Resource;
import java.io.File;
import java.net.URI;
import java.util.Collection;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultiFileResource_ESTest extends MultiFileResource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<File> linkedList0 = new LinkedList<File>();
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      linkedList0.offer(mockFile0);
      MultiFileResource multiFileResource0 = new MultiFileResource(linkedList0);
      assertTrue(multiFileResource0.hasNext());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      File[] fileArray0 = new File[0];
      MultiFileResource multiFileResource0 = new MultiFileResource(fileArray0);
      assertFalse(multiFileResource0.hasNext());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<File> linkedList0 = new LinkedList<File>();
      MultiFileResource multiFileResource0 = new MultiFileResource(linkedList0);
      File[] fileArray0 = new File[1];
      File file0 = MockFile.createTempFile("EC{p7`vf>1<%\"y##", "EC{p7`vf>1<%\"y##");
      fileArray0[0] = file0;
      multiFileResource0.add(fileArray0);
      assertTrue(multiFileResource0.hasNext());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MultiFileResource multiFileResource0 = null;
      try {
        multiFileResource0 = new MultiFileResource((Collection<File>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.resource.MultiFileResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<File> linkedList0 = new LinkedList<File>();
      MultiFileResource multiFileResource0 = new MultiFileResource(linkedList0);
      MultiFileResource multiFileResource1 = multiFileResource0.add((Collection<File>) linkedList0);
      assertSame(multiFileResource0, multiFileResource1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<File> linkedList0 = new LinkedList<File>();
      MultiFileResource multiFileResource0 = new MultiFileResource(linkedList0);
      File[] fileArray0 = new File[1];
      // Undeclared exception!
      try { 
        multiFileResource0.add(fileArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.resource.FileResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LinkedList<File> linkedList0 = new LinkedList<File>();
      MultiFileResource multiFileResource0 = new MultiFileResource(linkedList0);
      linkedList0.add((File) null);
      // Undeclared exception!
      try { 
        multiFileResource0.add((Collection<File>) linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.resource.FileResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LinkedList<File> linkedList0 = new LinkedList<File>();
      MultiFileResource multiFileResource0 = new MultiFileResource(linkedList0);
      File[] fileArray0 = new File[0];
      MultiFileResource multiFileResource1 = multiFileResource0.add(fileArray0);
      assertSame(multiFileResource0, multiFileResource1);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LinkedList<File> linkedList0 = new LinkedList<File>();
      MultiFileResource multiFileResource0 = new MultiFileResource(linkedList0);
      MultiFileResource multiFileResource1 = multiFileResource0.add((Resource) multiFileResource0);
      MultiFileResource multiFileResource2 = multiFileResource1.add((Collection<File>) linkedList0);
      assertSame(multiFileResource2, multiFileResource0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      File[] fileArray0 = new File[2];
      MultiFileResource multiFileResource0 = null;
      try {
        multiFileResource0 = new MultiFileResource(fileArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.resource.FileResource", e);
      }
  }
}
