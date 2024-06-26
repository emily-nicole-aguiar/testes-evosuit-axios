/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 05:20:25 GMT 2024
 */

package com.axios.core.tool.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.axios.core.tool.io.StreamCopier;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StreamCopier_ESTest extends StreamCopier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StreamCopier streamCopier0 = new StreamCopier();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte) (-1);
      int int0 = (-102);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-102), (byte)1);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      pipedOutputStream0.close();
      // Undeclared exception!
      try { 
        streamCopier0.copy((InputStream) byteArrayInputStream0, (OutputStream) pipedOutputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StreamCopier streamCopier0 = new StreamCopier(0, 0);
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      // Undeclared exception!
      try { 
        streamCopier0.copy((InputStream) pipedInputStream0, (OutputStream) pipedOutputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("com.axios.core.tool.io.StreamCopier", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StreamCopier streamCopier0 = new StreamCopier(0, 0L);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StreamCopier streamCopier0 = new StreamCopier((-527), 1L);
      File file0 = MockFile.createTempFile("#rWrilJo`1y#jyC:le!", "#rWrilJo`1y#jyC:le!");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(pipedOutputStream0);
      streamCopier0.copy((InputStream) pipedInputStream0, (OutputStream) objectOutputStream0);
      streamCopier0.copy((InputStream) mockFileInputStream0, (OutputStream) pipedOutputStream0);
      streamCopier0.copy((InputStream) pipedInputStream0, (OutputStream) objectOutputStream0);
      objectOutputStream0.writeBoolean(false);
      streamCopier0.copy((InputStream) pipedInputStream0, (OutputStream) pipedOutputStream0);
      streamCopier0.copy((InputStream) pipedInputStream0, (OutputStream) pipedOutputStream0);
      streamCopier0.copy((InputStream) mockFileInputStream0, (OutputStream) pipedOutputStream0);
      streamCopier0.copy((InputStream) pipedInputStream0, (OutputStream) objectOutputStream0);
      streamCopier0.copy((InputStream) mockFileInputStream0, (OutputStream) objectOutputStream0);
      streamCopier0.copy((InputStream) pipedInputStream0, (OutputStream) pipedOutputStream0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StreamCopier streamCopier0 = new StreamCopier();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      // Undeclared exception!
      try { 
        streamCopier0.copy((InputStream) null, (OutputStream) byteArrayOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // InputStream is null !
         //
         verifyException("com.axios.core.assertion.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StreamCopier streamCopier0 = new StreamCopier(0, 0);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)27;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-44);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        streamCopier0.copy((InputStream) byteArrayInputStream0, (OutputStream) filterOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StreamCopier streamCopier0 = new StreamCopier(1, 0L);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)102;
      byteArray0[1] = (byte)86;
      byteArray0[2] = (byte)111;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)25;
      byteArray0[5] = (byte) (-1);
      byteArray0[6] = (byte)83;
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte)0;
      pipedOutputStream0.write(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(dataInputStream0);
      // Undeclared exception!
      streamCopier0.copy((InputStream) bufferedInputStream0, (OutputStream) pipedOutputStream0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StreamCopier streamCopier0 = new StreamCopier(1173, 1173);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)127;
      byteArray0[1] = (byte) (-19);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        streamCopier0.copy((InputStream) dataInputStream0, (OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // OutputStream is null !
         //
         verifyException("com.axios.core.assertion.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      StreamCopier streamCopier0 = new StreamCopier(2142);
  }
}
