/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 04:42:38 GMT 2024
 */

package com.axios.core.tool.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.axios.core.tool.text.StrJoiner;
import java.io.CharArrayWriter;
import java.io.PipedWriter;
import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;
import java.nio.charset.Charset;
import java.sql.BatchUpdateException;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLInvalidAuthorizationSpecException;
import java.sql.SQLWarning;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.function.Function;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StrJoiner_ESTest extends StrJoiner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StrJoiner strJoiner0 = StrJoiner.of((CharSequence) null);
      StrJoiner strJoiner1 = strJoiner0.setEmptyResult((String) null);
      String string0 = strJoiner1.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(859);
      CharBuffer charBuffer0 = charset0.decode(byteBuffer0);
      StrJoiner strJoiner0 = StrJoiner.of((CharSequence) charBuffer0);
      String[] stringArray0 = new String[6];
      Function<String, String> function0 = Function.identity();
      StrJoiner strJoiner1 = strJoiner0.append(stringArray0, (Function<String, ? extends CharSequence>) function0);
      assertSame(strJoiner1, strJoiner0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        StrJoiner.of((StrJoiner) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.tool.text.StrJoiner", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(4211);
      StrJoiner strJoiner0 = new StrJoiner(charBuffer0, charBuffer0);
      CharBuffer[] charBufferArray0 = new CharBuffer[3];
      Function<CharBuffer, CharBuffer> function0 = Function.identity();
      // Undeclared exception!
      try { 
        strJoiner0.append(charBufferArray0, (Function<CharBuffer, ? extends CharSequence>) function0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(4211);
      StrJoiner strJoiner0 = new StrJoiner(charBuffer0, charBuffer0);
      CharBuffer[] charBufferArray0 = new CharBuffer[3];
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      charBufferArray0[1] = charBuffer1;
      Function<CharBuffer, CharBuffer> function0 = Function.identity();
      // Undeclared exception!
      try { 
        strJoiner0.append(charBufferArray0, (Function<CharBuffer, ? extends CharSequence>) function0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[4];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      StrJoiner strJoiner0 = new StrJoiner(charBuffer1, charBuffer0);
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        strJoiner0.append(stringArray0);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(5);
      StrJoiner strJoiner0 = new StrJoiner(charBuffer0, charBuffer0, charBuffer0, charBuffer0);
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        strJoiner0.append(stringArray0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrJoiner strJoiner0 = new StrJoiner((CharSequence) null, (CharSequence) null, (CharSequence) null);
      Iterator<BatchUpdateException> iterator0 = (Iterator<BatchUpdateException>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iterator0).hasNext();
      doReturn((Object) null).when(iterator0).next();
      // Undeclared exception!
      try { 
        strJoiner0.append((Iterator<BatchUpdateException>) iterator0, (Function<BatchUpdateException, ? extends CharSequence>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.tool.text.StrJoiner", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrJoiner strJoiner0 = StrJoiner.of((CharSequence) "NULL_STRING");
      LinkedList<SQLWarning> linkedList0 = new LinkedList<SQLWarning>();
      ListIterator<SQLWarning> listIterator0 = linkedList0.listIterator();
      SQLInvalidAuthorizationSpecException sQLInvalidAuthorizationSpecException0 = new SQLInvalidAuthorizationSpecException(">FBC>x/cX", "NULL_STRING", 1);
      SQLWarning sQLWarning0 = new SQLWarning("com.axios.exception.IORuntimeException", sQLInvalidAuthorizationSpecException0);
      linkedList0.add(sQLWarning0);
      // Undeclared exception!
      try { 
        strJoiner0.append((Iterator<SQLWarning>) listIterator0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[1] = 'Y';
      charArray0[2] = 'z';
      charArray0[3] = 'w';
      charArray0[4] = ';';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      StrJoiner strJoiner0 = new StrJoiner(charBuffer1, charBuffer1, charBuffer1);
      StrJoiner strJoiner1 = strJoiner0.append((CharSequence) charBuffer0);
      charBuffer0.flip();
      StrJoiner.of((CharSequence) charBuffer1);
      StrJoiner strJoiner2 = strJoiner1.setWrapElement(true);
      StrJoiner strJoiner3 = StrJoiner.of((CharSequence) charBuffer1);
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(iterator0).hasNext();
      doReturn((Object) null).when(iterator0).next();
      StrJoiner strJoiner4 = strJoiner3.append((Iterator<Integer>) iterator0);
      String string0 = null;
      strJoiner4.setEmptyResult(string0);
      int int0 = 0;
      charBuffer0.position(int0);
      String string1 = "";
      StrJoiner strJoiner5 = strJoiner2.setEmptyResult(string1);
      Iterable<SQLWarning> iterable0 = null;
      Function<SQLWarning, String> function0 = null;
      strJoiner5.append((Iterable<SQLWarning>) iterable0, (Function<SQLWarning, ? extends CharSequence>) function0);
      StrJoiner.of(strJoiner2);
      char char0 = 's';
      // Undeclared exception!
      try { 
        strJoiner2.append(char0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[2];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StrJoiner strJoiner0 = new StrJoiner(charBuffer0, charBuffer0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        strJoiner0.append(object0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrJoiner strJoiner0 = new StrJoiner((CharSequence) null);
      LinkedList<BatchUpdateException> linkedList0 = new LinkedList<BatchUpdateException>();
      int[] intArray0 = new int[1];
      BatchUpdateException batchUpdateException0 = new BatchUpdateException("94EPZpq{j77uz", "W4qS/$s\u0000b7Vpwj+}\"m", 0, intArray0);
      linkedList0.offerLast(batchUpdateException0);
      // Undeclared exception!
      try { 
        strJoiner0.append((Iterable<BatchUpdateException>) linkedList0, (Function<BatchUpdateException, ? extends CharSequence>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.tool.text.StrJoiner", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFile mockFile0 = new MockFile("-rwpJE");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      StrJoiner strJoiner0 = new StrJoiner(mockPrintStream0, "-rwpJE");
      // Undeclared exception!
      try { 
        strJoiner0.append((CharSequence) "", (-487), (-487));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StrJoiner strJoiner0 = new StrJoiner((CharSequence) null);
      // Undeclared exception!
      try { 
        strJoiner0.append((CharSequence) null, 410, 410);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.axios.core.tool.text.StrJoiner", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(3337);
      StrJoiner strJoiner0 = StrJoiner.of((CharSequence) charBuffer0, (CharSequence) charBuffer0, (CharSequence) charBuffer0);
      // Undeclared exception!
      try { 
        strJoiner0.append((CharSequence) charBuffer0, 1, (-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.HeapCharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      char[] charArray0 = new char[5];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StrJoiner strJoiner0 = new StrJoiner(pipedWriter0, charBuffer0, charBuffer0, charBuffer0);
      // Undeclared exception!
      try { 
        strJoiner0.append((CharSequence) charBuffer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("com.axios.core.tool.text.StrJoiner", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      char[] charArray0 = new char[2];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0, 0, 0);
      StrJoiner strJoiner0 = new StrJoiner(charBuffer0, charBuffer0, charBuffer0, charBuffer0);
      // Undeclared exception!
      try { 
        strJoiner0.append((CharSequence) null);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(4211);
      StrJoiner strJoiner0 = new StrJoiner(charBuffer0, charBuffer0);
      strJoiner0.append('s');
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      // Undeclared exception!
      try { 
        strJoiner0.append((CharSequence) charBuffer1);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[7];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      charBuffer0.put(charArray0);
      StrJoiner strJoiner0 = StrJoiner.of((CharSequence) charBuffer1, (CharSequence) charBuffer0, (CharSequence) charBuffer0);
      // Undeclared exception!
      try { 
        strJoiner0.append((CharSequence) charBuffer1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      char[] charArray0 = new char[4];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      StrJoiner strJoiner0 = new StrJoiner(charBuffer1, charBuffer0);
      // Undeclared exception!
      try { 
        strJoiner0.append('{');
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char[] charArray0 = new char[5];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      StrJoiner strJoiner0 = new StrJoiner(charBuffer0, charBuffer1);
      StrJoiner strJoiner1 = strJoiner0.append((CharSequence) charBuffer1);
      // Undeclared exception!
      try { 
        strJoiner1.append('P');
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      char[] charArray0 = new char[1];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StrJoiner strJoiner0 = new StrJoiner(charArrayWriter0, charBuffer0);
      strJoiner0.setWrapElement(true);
      strJoiner0.append((CharSequence) charBuffer0);
      assertEquals("\u0000\u0000", charArrayWriter0.toString());
      assertEquals(2, charArrayWriter0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StrJoiner strJoiner0 = new StrJoiner((CharSequence) null);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Iterator<Object> iterator0 = linkedList0.descendingIterator();
      StrJoiner strJoiner1 = strJoiner0.append((Iterator<Object>) iterator0, (Function<Object, ? extends CharSequence>) null);
      assertSame(strJoiner0, strJoiner1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      char[] charArray0 = new char[4];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StrJoiner strJoiner0 = new StrJoiner(charBuffer0, charBuffer0, charBuffer0);
      Function<CharBuffer, CharBuffer> function0 = Function.identity();
      StrJoiner strJoiner1 = strJoiner0.append((Iterator<CharBuffer>) null, (Function<CharBuffer, ? extends CharSequence>) function0);
      assertSame(strJoiner1, strJoiner0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      StrJoiner strJoiner0 = new StrJoiner(charBuffer0, charBuffer0, charBuffer0);
      Stack<Integer> stack0 = new Stack<Integer>();
      StrJoiner strJoiner1 = strJoiner0.append((Object) stack0);
      assertSame(strJoiner0, strJoiner1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      StrJoiner strJoiner0 = new StrJoiner(charBuffer0, charBuffer0);
      // Undeclared exception!
      try { 
        strJoiner0.append('-');
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char[] charArray0 = new char[3];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StrJoiner strJoiner0 = new StrJoiner((Appendable) null, charBuffer0, charBuffer0, charBuffer0);
      strJoiner0.append((Object) null);
      String string0 = strJoiner0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(497);
      StrJoiner strJoiner0 = new StrJoiner(charBuffer0, charBuffer0);
      StrJoiner strJoiner1 = strJoiner0.setWrapElement(true);
      String string0 = strJoiner1.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[4];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StrJoiner strJoiner0 = new StrJoiner(charBuffer0, charBuffer0, charBuffer0);
      strJoiner0.setWrapElement(true);
      StrJoiner strJoiner1 = strJoiner0.append((CharSequence) charBuffer0);
      assertSame(strJoiner1, strJoiner0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StrJoiner strJoiner0 = StrJoiner.of((CharSequence) null);
      StrJoiner.NullMode strJoiner_NullMode0 = StrJoiner.NullMode.TO_EMPTY;
      StrJoiner strJoiner1 = strJoiner0.setNullMode(strJoiner_NullMode0);
      StrJoiner strJoiner2 = strJoiner1.append((CharSequence) null);
      assertSame(strJoiner1, strJoiner2);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StrJoiner strJoiner0 = new StrJoiner((CharSequence) null);
      StrJoiner.NullMode strJoiner_NullMode0 = StrJoiner.NullMode.IGNORE;
      StrJoiner strJoiner1 = strJoiner0.setNullMode(strJoiner_NullMode0);
      StrJoiner strJoiner2 = strJoiner0.append((CharSequence) null);
      assertSame(strJoiner2, strJoiner1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) stringBuffer0);
      StrJoiner strJoiner0 = StrJoiner.of((CharSequence) charBuffer0, (CharSequence) charBuffer0, (CharSequence) charBuffer0);
      StrJoiner strJoiner1 = strJoiner0.append((Iterator<SQLException>) null);
      assertSame(strJoiner0, strJoiner1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) stringBuffer0);
      StrJoiner strJoiner0 = StrJoiner.of((CharSequence) stringBuffer0, (CharSequence) stringBuffer0, (CharSequence) charBuffer0);
      StrJoiner strJoiner1 = strJoiner0.append((SQLIntegrityConstraintViolationException[]) null);
      assertSame(strJoiner0, strJoiner1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(497);
      StrJoiner strJoiner0 = new StrJoiner(charBuffer0, charBuffer0);
      strJoiner0.setDelimiter(charBuffer0);
      assertEquals(497, charBuffer0.remaining());
      assertTrue(charBuffer0.hasRemaining());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      char[] charArray0 = new char[1];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StrJoiner strJoiner0 = new StrJoiner(charArrayWriter0, charBuffer0);
      strJoiner0.append((CharSequence) charBuffer0, 0, 0);
      assertEquals(1, charArrayWriter0.size());
      assertEquals("\u0000", charArrayWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(497);
      StrJoiner strJoiner0 = new StrJoiner(charBuffer0, charBuffer0);
      StrJoiner strJoiner1 = StrJoiner.of(strJoiner0);
      strJoiner1.toString();
      assertNotSame(strJoiner1, strJoiner0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      char[] charArray0 = new char[2];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StrJoiner strJoiner0 = StrJoiner.of((CharSequence) charBuffer0);
      // Undeclared exception!
      try { 
        strJoiner0.append((SQLException[]) null, (Function<SQLException, ? extends CharSequence>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.reflect.Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      StrJoiner strJoiner0 = new StrJoiner(charBuffer0, charBuffer0, charBuffer0);
      StrJoiner strJoiner1 = strJoiner0.setPrefix(charBuffer0);
      assertSame(strJoiner0, strJoiner1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(497);
      StrJoiner strJoiner0 = new StrJoiner(charBuffer0, charBuffer0);
      strJoiner0.setSuffix(charBuffer0);
      //  // Unstable assertion: assertFalse(charBuffer0.hasRemaining());
      //  // Unstable assertion: assertEquals(0, charBuffer0.length());
  }
}
