/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 10:15:40 GMT 2018
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NumericEntityUnescaper_ESTest extends NumericEntityUnescaper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      char[] charArray0 = new char[27];
      charArray0[2] = '&';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      String string0 = numericEntityUnescaper0.translate((CharSequence) charBuffer0);
      assertEquals("\u0000\u0000&\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      char[] charArray0 = new char[9];
      charArray0[7] = '&';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      String string0 = numericEntityUnescaper0.translate((CharSequence) charBuffer0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000&\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      char[] charArray0 = new char[6];
      charArray0[2] = '&';
      charArray0[3] = '#';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charBuffer0.put(4, 'x');
      String string0 = numericEntityUnescaper0.translate((CharSequence) charBuffer0);
      assertEquals("\u0000\u0000&#x\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      char[] charArray0 = new char[5];
      charArray0[2] = '&';
      charArray0[3] = '#';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charBuffer0.put(4, 'X');
      String string0 = numericEntityUnescaper0.translate((CharSequence) charBuffer0);
      assertEquals("\u0000\u0000&#X", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      char[] charArray0 = new char[5];
      charArray0[2] = '&';
      charArray0[3] = '#';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charBuffer0.put(4, 'd');
      String string0 = numericEntityUnescaper0.translate((CharSequence) charBuffer0);
      assertEquals("\u0000\u0000&#d", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      char[] charArray0 = new char[5];
      charArray0[2] = '&';
      charArray0[3] = '#';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charBuffer0.put(4, '8');
      String string0 = numericEntityUnescaper0.translate((CharSequence) charBuffer0);
      assertEquals("\u0000\u0000\b", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      char[] charArray0 = new char[5];
      charArray0[2] = '&';
      charArray0[3] = '#';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charBuffer0.put(4, 'k');
      String string0 = numericEntityUnescaper0.translate((CharSequence) charBuffer0);
      assertEquals("\u0000\u0000&#k", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      char[] charArray0 = new char[5];
      charArray0[2] = '&';
      charArray0[3] = '#';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charBuffer0.put(4, 'A');
      String string0 = numericEntityUnescaper0.translate((CharSequence) charBuffer0);
      assertEquals("\u0000\u0000&#A", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      char[] charArray0 = new char[6];
      charArray0[2] = '&';
      charArray0[3] = '#';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charBuffer0.put(4, '8');
      String string0 = numericEntityUnescaper0.translate((CharSequence) charBuffer0);
      assertEquals("\u0000\u0000\b\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      char[] charArray0 = new char[27];
      charArray0[2] = '&';
      charArray0[3] = '#';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charBuffer0.put(5, ';');
      charBuffer0.put(4, '9');
      String string0 = numericEntityUnescaper0.translate((CharSequence) charBuffer0);
      assertEquals("\u0000\u0000\t\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }
}
