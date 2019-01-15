/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 12:18:06 GMT 2018
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NumericEntityUnescaper_ESTest extends NumericEntityUnescaper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      char[] charArray0 = new char[14];
      charArray0[5] = '&';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      String string0 = numericEntityUnescaper0.translate((CharSequence) charBuffer0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000&\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      char[] charArray0 = new char[9];
      charArray0[5] = '&';
      charArray0[6] = '#';
      charArray0[7] = 'x';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      // Undeclared exception!
      try { 
        numericEntityUnescaper0.translate((CharSequence) charBuffer0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      char[] charArray0 = new char[14];
      charArray0[10] = ';';
      charArray0[5] = '&';
      charArray0[6] = '#';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      String string0 = numericEntityUnescaper0.translate((CharSequence) charBuffer0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000&#\u0000\u0000\u0000;\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      char[] charArray0 = new char[14];
      charArray0[10] = ';';
      charArray0[5] = '&';
      charArray0[6] = '#';
      charArray0[7] = 'X';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      String string0 = numericEntityUnescaper0.translate((CharSequence) charBuffer0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000&#X\u0000\u0000;\u0000\u0000\u0000", string0);
  }
}
