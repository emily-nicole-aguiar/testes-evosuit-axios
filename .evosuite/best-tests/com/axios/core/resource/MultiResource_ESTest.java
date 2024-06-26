/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 02:02:46 GMT 2024
 */

package com.axios.core.resource;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.axios.core.resource.BytesResource;
import com.axios.core.resource.FileResource;
import com.axios.core.resource.MultiFileResource;
import com.axios.core.resource.MultiResource;
import com.axios.core.resource.Resource;
import java.io.File;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultiResource_ESTest extends MultiResource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Resource[] resourceArray0 = new Resource[1];
      MultiResource multiResource0 = new MultiResource(resourceArray0);
      MultiResource multiResource1 = new MultiResource((Collection<Resource>) null);
      multiResource1.iterator();
      MultiResource multiResource2 = multiResource0.add(multiResource1);
      MultiResource multiResource3 = multiResource0.add(multiResource2);
      multiResource3.reset();
      MultiResource multiResource4 = new MultiResource((Collection<Resource>) null);
      MultiResource multiResource5 = multiResource0.add(multiResource4);
      resourceArray0[0] = (Resource) multiResource5;
      // Undeclared exception!
      try { 
        multiResource5.readBytes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.resource.MultiResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArrayList<File> arrayList0 = new ArrayList<File>();
      String string0 = "bmp: %R<+-G}s;SH";
      File file0 = MockFile.createTempFile("bmp: %R<+-G}s;SH", "bmp: %R<+-G}s;SH");
      arrayList0.add(file0);
      MultiFileResource multiFileResource0 = new MultiFileResource(arrayList0);
      multiFileResource0.reset();
      multiFileResource0.next();
      // Undeclared exception!
      try { 
        multiFileResource0.getName();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<File> linkedList0 = new LinkedList<File>();
      MultiFileResource multiFileResource0 = new MultiFileResource(linkedList0);
      Charset charset0 = null;
      MockFile mockFile0 = new MockFile("[\"Gs*/Y:.\"", "[\"Gs*/Y:.\"");
      // Undeclared exception!
      try { 
        multiFileResource0.getStream();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Resource[] resourceArray0 = new Resource[0];
      MultiResource multiResource0 = new MultiResource(resourceArray0);
      multiResource0.hasNext();
      // Undeclared exception!
      try { 
        multiResource0.readStr((Charset) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayList<Resource> arrayList0 = new ArrayList<Resource>();
      arrayList0.iterator();
      MultiResource multiResource0 = new MultiResource(arrayList0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      multiResource0.forEach(consumer0);
      // Undeclared exception!
      try { 
        multiResource0.readBytes();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<Resource> linkedList0 = new LinkedList<Resource>();
      MultiResource multiResource0 = new MultiResource(linkedList0);
      multiResource0.reset();
      ArrayList<File> arrayList0 = new ArrayList<File>();
      MultiFileResource multiFileResource0 = new MultiFileResource(arrayList0);
      MultiFileResource multiFileResource1 = multiFileResource0.add((Collection<File>) arrayList0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      multiFileResource1.forEachRemaining(consumer0);
      MultiFileResource[] multiFileResourceArray0 = new MultiFileResource[7];
      multiFileResourceArray0[0] = multiFileResource0;
      multiFileResourceArray0[1] = multiFileResource0;
      multiFileResourceArray0[2] = multiFileResource1;
      multiFileResourceArray0[3] = multiFileResource1;
      multiFileResourceArray0[4] = multiFileResource0;
      multiFileResourceArray0[5] = multiFileResource0;
      multiFileResourceArray0[6] = multiFileResource0;
      arrayList0.toArray(multiFileResourceArray0);
      multiResource0.add(multiFileResource1);
      // Undeclared exception!
      try { 
        multiFileResource0.readUtf8Str();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      File[] fileArray0 = new File[3];
      File file0 = MockFile.createTempFile("~0~?ZpyqEATiH~~*2xV", "~0~?ZpyqEATiH~~*2xV");
      fileArray0[0] = file0;
      MockFile mockFile0 = new MockFile(file0, "~0~?ZpyqEATiH~~*2xV");
      fileArray0[1] = (File) mockFile0;
      MockFile mockFile1 = new MockFile("~0~?ZpyqEATiH~~*2xV", "~0~?ZpyqEATiH~~*2xV");
      fileArray0[2] = (File) mockFile1;
      MultiFileResource multiFileResource0 = new MultiFileResource(fileArray0);
      LinkedList<File> linkedList0 = new LinkedList<File>();
      MultiFileResource multiFileResource1 = multiFileResource0.add((Collection<File>) linkedList0);
      multiFileResource1.getStream();
      Charset charset0 = Charset.defaultCharset();
      linkedList0.add((File) mockFile0);
      File file1 = MockFile.createTempFile("\"kOKSG7QmL0VJ~dN", "~0~?ZpyqEATiH~~*2xV", (File) mockFile1);
      linkedList0.add(file1);
      multiFileResource0.add((Resource) multiFileResource1);
      multiFileResource0.readStr(charset0);
      multiFileResource0.getStream();
      multiFileResource1.hasNext();
      multiFileResource1.remove();
      multiFileResource1.getName();
      // Undeclared exception!
      try { 
        multiFileResource0.readStr(charset0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.tool.io.IoTool", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<File> linkedList0 = new LinkedList<File>();
      MultiFileResource multiFileResource0 = new MultiFileResource(linkedList0);
      multiFileResource0.reset();
      Charset charset0 = Charset.defaultCharset();
      char[] charArray0 = new char[1];
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)18;
      byteArray0[3] = (byte) (-94);
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte)0;
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0, (int) (byte)0, (int) (byte)0);
      charset0.decode(byteBuffer0);
      charArray0[0] = '7';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0, 0, 0);
      linkedList0.subList(0, 0);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      charset0.encode(charBuffer1);
      // Undeclared exception!
      try { 
        multiFileResource0.getReader(charset0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MultiResource multiResource0 = new MultiResource((Collection<Resource>) null);
      String string0 = "\"Z-";
      // Undeclared exception!
      try { 
        multiResource0.remove();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArrayList<Resource> arrayList0 = new ArrayList<Resource>();
      arrayList0.stream();
      Predicate<Object> predicate0 = Predicate.isEqual((Object) arrayList0);
      Object object0 = new Object();
      Predicate<Object> predicate1 = Predicate.isEqual(object0);
      File file0 = MockFile.createTempFile("com.axios.core.resource.MultiFileResource", "~/q90-Ds=~V2");
      predicate1.test(file0);
      Predicate<Object> predicate2 = predicate0.and(predicate1);
      predicate0.or(predicate2);
      predicate0.and(predicate1);
      predicate0.negate();
      arrayList0.removeIf(predicate0);
      arrayList0.add((Resource) null);
      arrayList0.ensureCapacity(0);
      MultiResource multiResource0 = new MultiResource(arrayList0);
      // Undeclared exception!
      try { 
        multiResource0.getStream();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.resource.MultiResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArrayList<File> arrayList0 = new ArrayList<File>();
      MultiFileResource multiFileResource0 = new MultiFileResource(arrayList0);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)22;
      byteArray0[2] = (byte) (-91);
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte) (-1);
      multiFileResource0.reset();
      BytesResource bytesResource0 = new BytesResource(byteArray0);
      MultiFileResource multiFileResource1 = multiFileResource0.add((Resource) bytesResource0);
      MultiFileResource multiFileResource2 = multiFileResource1.add((Resource) multiFileResource0);
      multiFileResource1.getReader((Charset) null);
      multiFileResource0.spliterator();
      multiFileResource1.getUrl();
      multiFileResource0.getStream();
      multiFileResource1.readBytes();
      multiFileResource2.reset();
      multiFileResource2.readBytes();
      multiFileResource1.add(multiFileResource0);
      multiFileResource1.getUrl();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArrayList<File> arrayList0 = new ArrayList<File>();
      MultiFileResource multiFileResource0 = new MultiFileResource(arrayList0);
      byte[] byteArray0 = new byte[5];
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      arrayList0.forEach(consumer0);
      byteArray0[0] = (byte)0;
      byte byte0 = (byte)0;
      Consumer<Object> consumer1 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      multiFileResource0.forEachRemaining(consumer1);
      // Undeclared exception!
      try { 
        multiFileResource0.getUrl();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArrayList<File> arrayList0 = new ArrayList<File>();
      MultiFileResource multiFileResource0 = new MultiFileResource(arrayList0);
      File[] fileArray0 = new File[1];
      String string0 = "P\\Zu-=%|8.Z";
      multiFileResource0.spliterator();
      MockFile mockFile0 = new MockFile("PZu-=%|8.Z", "com.axios.core.resource.FileResource");
      fileArray0[0] = (File) mockFile0;
      MultiFileResource multiFileResource1 = multiFileResource0.add(fileArray0);
      multiFileResource0.iterator();
      MultiFileResource multiFileResource2 = multiFileResource1.add((Resource) multiFileResource0);
      multiFileResource2.iterator();
      multiFileResource2.add((Collection<File>) arrayList0);
      // Undeclared exception!
      try { 
        multiFileResource0.readUtf8Str();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.tool.io.IoTool", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      File[] fileArray0 = new File[2];
      File file0 = MockFile.createTempFile("BjwP?", "4q-q#");
      MockFile mockFile0 = new MockFile(file0, "4q-q#");
      fileArray0[0] = (File) mockFile0;
      mockFile0.mkdir();
      File file1 = MockFile.createTempFile("4q-q#", "com.axios.core.tool.io.FastByteArrayOutputStream");
      fileArray0[1] = file1;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      MultiFileResource multiFileResource0 = new MultiFileResource(fileArray0);
      MultiFileResource multiFileResource1 = multiFileResource0.add(fileArray0);
      multiFileResource0.next();
      multiFileResource1.readBytes();
      Charset charset0 = Charset.defaultCharset();
      mockFile0.setReadable(true);
      multiFileResource1.readStr(charset0);
      multiFileResource0.next();
      multiFileResource1.next();
      multiFileResource1.readBytes();
      multiFileResource0.iterator();
      multiFileResource1.iterator();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      mockFile0.setExecutable(false);
      multiFileResource0.forEachRemaining(consumer0);
      // Undeclared exception!
      try { 
        multiFileResource1.readStr(charset0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4, Size: 4
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      File[] fileArray0 = new File[0];
      MultiFileResource multiFileResource0 = new MultiFileResource(fileArray0);
      LinkedList<File> linkedList0 = new LinkedList<File>();
      MockFile mockFile0 = new MockFile("", "");
      linkedList0.add((File) mockFile0);
      MultiFileResource multiFileResource1 = multiFileResource0.add((Collection<File>) linkedList0);
      multiFileResource0.getUrl();
      MockPrintStream mockPrintStream0 = new MockPrintStream("5f&|fz%8yt*G]qX('");
      multiFileResource1.getReader((Charset) null);
      mockPrintStream0.println((-1.0));
      mockPrintStream0.println();
      mockPrintStream0.println(0);
      PrintStream printStream0 = mockPrintStream0.append('T');
      multiFileResource0.reset();
      mockPrintStream0.print((Object) linkedList0);
      linkedList0.pop();
      // Undeclared exception!
      try { 
        multiFileResource1.writeTo(printStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // InputStream is null !
         //
         verifyException("com.axios.core.assertion.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<File> linkedList0 = new LinkedList<File>();
      MultiFileResource multiFileResource0 = new MultiFileResource(linkedList0);
      MultiFileResource multiFileResource1 = multiFileResource0.add((Collection<File>) linkedList0);
      File[] fileArray0 = new File[1];
      File file0 = MockFile.createTempFile("y=0H#=Df(/v%UWl1@9W", "y=0H#=Df(/v%UWl1@9W");
      fileArray0[0] = file0;
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/y=0H#=Df(/v%UWl1@9W0y=0H#=Df(/v%UWl1@9W");
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)25;
      byteArray0[1] = (byte) (-88);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)40;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)93;
      byteArray0[6] = (byte) (-54);
      byteArray0[7] = (byte)4;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      MultiFileResource multiFileResource2 = multiFileResource1.add(fileArray0);
      Charset charset0 = Charset.defaultCharset();
      multiFileResource2.readStr(charset0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      multiFileResource2.forEachRemaining(consumer0);
      // Undeclared exception!
      try { 
        multiFileResource0.next();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.resource.MultiResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ArrayList<File> arrayList0 = new ArrayList<File>();
      MultiFileResource multiFileResource0 = new MultiFileResource(arrayList0);
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)1;
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)22;
      byteArray0[2] = (byte) (-91);
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte) (-1);
      multiFileResource0.reset();
      BytesResource bytesResource0 = new BytesResource(byteArray0);
      MultiFileResource multiFileResource1 = multiFileResource0.add((Resource) bytesResource0);
      multiFileResource1.add((Resource) multiFileResource0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/emily.aguiar/axios");
      FileSystemHandling.createFolder(evoSuiteFile0);
      multiFileResource1.getReader((Charset) null);
      multiFileResource0.spliterator();
      multiFileResource1.getUrl();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("ih^Us`?h5_cGwP");
      bytesResource0.writeTo(mockFileOutputStream0);
      multiFileResource0.getStream();
      multiFileResource1.getName();
      String string0 = "";
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream("ih^Us`?h5_cGwP", "");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // 
         //
         verifyException("java.io.PrintStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Resource[] resourceArray0 = new Resource[1];
      LinkedList<File> linkedList0 = new LinkedList<File>();
      MultiFileResource multiFileResource0 = new MultiFileResource(linkedList0);
      URI uRI0 = MockURI.URI("9.9");
      URI uRI1 = MockURI.resolve(uRI0, uRI0);
      MockURI.resolve(uRI1, "9.9");
      MockFile mockFile0 = new MockFile("9.9", "9.9");
      mockFile0.deleteOnExit();
      MockFile.createTempFile("UdFQaR", "9.9", (File) mockFile0);
      MockFile.createTempFile("9.9", "UdFQaR");
      MultiResource multiResource0 = new MultiResource(resourceArray0);
      multiFileResource0.add(multiResource0);
      Charset charset0 = null;
      // Undeclared exception!
      try { 
        multiFileResource0.getUrl();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.resource.MultiResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      File[] fileArray0 = new File[1];
      String string0 = "~!_Jcq6=5v";
      File file0 = MockFile.createTempFile("~!_Jcq6=5v", "~!_Jcq6=5v", (File) null);
      fileArray0[0] = file0;
      MultiFileResource multiFileResource0 = new MultiFileResource(fileArray0);
      MockFile mockFile0 = new MockFile("~!_Jcq6=5v", "~!_Jcq6=5v");
      Path path0 = mockFile0.toPath();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/~!_Jcq6=5v0~!_Jcq6=5v");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "~!_Jcq6=5v");
      FileResource fileResource0 = new FileResource(path0);
      MultiResource multiResource0 = multiFileResource0.add(fileResource0);
      multiResource0.readUtf8Str();
      multiResource0.remove();
      fileResource0.getUrl();
      multiFileResource0.iterator();
      multiResource0.getName();
      // Undeclared exception!
      try { 
        multiResource0.readBytes();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // InputStream is null !
         //
         verifyException("com.axios.core.assertion.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      File[] fileArray0 = new File[1];
      String string0 = "~!_Jcq6=5v";
      File file0 = MockFile.createTempFile("~!_Jcq6=5v", "~!_Jcq6=5v", (File) null);
      fileArray0[0] = file0;
      MultiFileResource multiFileResource0 = new MultiFileResource(fileArray0);
      MockFile mockFile0 = new MockFile("~!_Jcq6=5v", "~!_Jcq6=5v");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp");
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)12;
      byteArray0[1] = (byte)127;
      byteArray0[2] = (byte)19;
      byteArray0[3] = (byte)113;
      byteArray0[4] = (byte)12;
      byteArray0[5] = (byte)110;
      byteArray0[6] = (byte) (-1);
      byteArray0[7] = (byte) (-101);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      Path path0 = mockFile0.toPath();
      FileResource fileResource0 = new FileResource(path0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      MultiResource multiResource0 = multiFileResource0.add(fileResource0);
      try { 
        multiResource0.readUtf8Str();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Simulated IOException
         //
         verifyException("com.axios.core.tool.io.IoTool", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Resource[] resourceArray0 = new Resource[9];
      LinkedList<File> linkedList0 = new LinkedList<File>();
      File file0 = MockFile.createTempFile(".JB.0ZTh#. u?zT", "Gc;M}b8^htWWNC");
      MockFile mockFile0 = new MockFile(file0, "Gc;M}b8^htWWNC");
      mockFile0.getAbsolutePath();
      linkedList0.add((File) mockFile0);
      MultiFileResource multiFileResource0 = new MultiFileResource(linkedList0);
      URI uRI0 = MockURI.URI("9.9");
      URI uRI1 = MockURI.resolve(uRI0, uRI0);
      MockURI.resolve(uRI1, "9.9");
      MockFile mockFile1 = new MockFile("9.9", "9.9");
      MockFile mockFile2 = new MockFile(".JB.0ZTh#. u?zT", ".JB.0ZTh#. u?zT");
      MockFile.createTempFile("9.9", "Bg,I/\"/fg@B]3");
      MultiResource multiResource0 = new MultiResource(resourceArray0);
      multiResource0.next();
      // Undeclared exception!
      try { 
        multiResource0.readUtf8Str();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.resource.MultiResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MultiResource multiResource0 = new MultiResource((Collection<Resource>) null);
      MultiResource multiResource1 = multiResource0.add((Resource) null);
      multiResource1.iterator();
      // Undeclared exception!
      try { 
        multiResource1.getStream();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.resource.MultiResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MultiResource multiResource0 = new MultiResource((Collection<Resource>) null);
      multiResource0.spliterator();
      // Undeclared exception!
      try { 
        multiResource0.next();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.resource.MultiResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      File[] fileArray0 = new File[1];
      String string0 = "~!_Jcq6=5v";
      File file0 = MockFile.createTempFile("~!_Jcq6=5v", "~!_Jcq6=5v", (File) null);
      fileArray0[0] = file0;
      MultiFileResource multiFileResource0 = new MultiFileResource(fileArray0);
      MockFile mockFile0 = new MockFile("~!_Jcq6=5v", "~!_Jcq6=5v");
      Path path0 = mockFile0.toPath();
      FileResource fileResource0 = new FileResource(path0);
      MultiResource multiResource0 = multiFileResource0.add(fileResource0);
      multiResource0.readUtf8Str();
      multiResource0.remove();
      fileResource0.getUrl();
      multiResource0.getName();
      // Undeclared exception!
      try { 
        multiResource0.readBytes();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // InputStream is null !
         //
         verifyException("com.axios.core.assertion.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MultiResource multiResource0 = new MultiResource((Collection<Resource>) null);
      File[] fileArray0 = new File[5];
      String string0 = "M[U=SXz/V/}";
      try { 
        MockURI.URI("M[U=SXz/V/}");
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Illegal character in path at index 1: M[U=SXz/V/}
         //
         verifyException("java.net.URI$Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedList<File> linkedList0 = new LinkedList<File>();
      MultiFileResource multiFileResource0 = new MultiFileResource(linkedList0);
      MultiFileResource multiFileResource1 = multiFileResource0.add((Collection<File>) linkedList0);
      File[] fileArray0 = new File[1];
      File file0 = MockFile.createTempFile("y=0H#=Df(/v%UWl1@9W", "y=0H#=Df(/v%UWl1@9W");
      fileArray0[0] = file0;
      MultiFileResource multiFileResource2 = multiFileResource1.add(fileArray0);
      Charset charset0 = Charset.defaultCharset();
      multiFileResource2.readStr(charset0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      multiFileResource2.forEachRemaining(consumer0);
      // Undeclared exception!
      try { 
        multiFileResource0.next();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.resource.MultiResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Resource[] resourceArray0 = new Resource[3];
      ArrayList<File> arrayList0 = new ArrayList<File>();
      MultiFileResource multiFileResource0 = new MultiFileResource(arrayList0);
      resourceArray0[0] = (Resource) multiFileResource0;
      MultiFileResource multiFileResource1 = new MultiFileResource(arrayList0);
      resourceArray0[1] = (Resource) multiFileResource1;
      FileResource fileResource0 = new FileResource("f\"6~");
      resourceArray0[2] = (Resource) fileResource0;
      MultiResource multiResource0 = new MultiResource(resourceArray0);
      multiResource0.reset();
      // Undeclared exception!
      try { 
        Charset.forName("f\"6~");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // f\"6~
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ArrayList<File> arrayList0 = new ArrayList<File>();
      MultiFileResource multiFileResource0 = new MultiFileResource(arrayList0);
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)1;
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)22;
      byteArray0[2] = (byte) (-91);
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte) (-1);
      multiFileResource0.reset();
      BytesResource bytesResource0 = new BytesResource(byteArray0);
      MultiFileResource multiFileResource1 = multiFileResource0.add((Resource) bytesResource0);
      multiFileResource1.add((Resource) multiFileResource0);
      multiFileResource1.getReader((Charset) null);
      multiFileResource0.spliterator();
      multiFileResource1.getUrl();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("ih^Us`?h5_cGwP");
      bytesResource0.writeTo(mockFileOutputStream0);
      multiFileResource0.getStream();
      String string0 = "";
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream("ih^Us`?h5_cGwP", "");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // 
         //
         verifyException("java.io.PrintStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Resource[] resourceArray0 = new Resource[1];
      LinkedList<File> linkedList0 = new LinkedList<File>();
      MultiFileResource multiFileResource0 = new MultiFileResource(linkedList0);
      URI uRI0 = MockURI.URI("9.9");
      URI uRI1 = MockURI.resolve(uRI0, uRI0);
      MockURI.resolve(uRI1, "9.9");
      MockFile mockFile0 = new MockFile("9.9", "9.9");
      MockFile.createTempFile("UdFQaR", "9.9", (File) mockFile0);
      MockFile.createTempFile("9.9", "UdFQaR");
      MultiResource multiResource0 = new MultiResource(resourceArray0);
      multiResource0.next();
      // Undeclared exception!
      try { 
        multiResource0.getReader((Charset) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ArrayList<File> arrayList0 = new ArrayList<File>();
      MultiFileResource multiFileResource0 = new MultiFileResource(arrayList0);
      File[] fileArray0 = new File[0];
      MultiFileResource multiFileResource1 = multiFileResource0.add(fileArray0);
      MultiResource multiResource0 = multiFileResource1.add(multiFileResource0);
      MultiResource multiResource1 = multiFileResource1.add(multiResource0);
      multiResource1.next();
      // Undeclared exception!
      try { 
        Charset.forName("");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // 
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }
}
