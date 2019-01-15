/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 21:54:39 GMT 2019
 */

package org.apache.commons.math.complex;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import org.apache.commons.math.complex.Complex;
import org.apache.commons.math.complex.ComplexFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ComplexFormat_ESTest extends ComplexFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ComplexFormat complexFormat0 = null;
      try {
        complexFormat0 = new ComplexFormat("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // imaginaryCharacter must be a non-empty string.
         //
         verifyException("org.apache.commons.math.complex.ComplexFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ComplexFormat complexFormat0 = new ComplexFormat();
      Complex complex0 = complexFormat0.parse("0 + 1i");
      assertNotNull(complex0);
      assertEquals(1.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ComplexFormat complexFormat0 = new ComplexFormat("mV!W~B~V8fm");
      ParsePosition parsePosition0 = new ParsePosition(0);
      complexFormat0.parseObject(",8eP2SYE<;Mg", parsePosition0);
      assertEquals("java.text.ParsePosition[index=0,errorIndex=2]", parsePosition0.toString());
      assertEquals(0, parsePosition0.getIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Complex complex0 = new Complex((-124.065), (-124.065));
      String string0 = ComplexFormat.formatComplex(complex0);
      assertEquals("-124.06 - 124.06i", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      String string0 = ComplexFormat.formatComplex(complex0);
      assertEquals("(NaN) + (NaN)i", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ComplexFormat complexFormat0 = new ComplexFormat();
      Short short0 = new Short((short) (-1529));
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "i");
      FieldPosition fieldPosition0 = new FieldPosition((short) (-1529));
      complexFormat0.format((Object) short0, stringBuffer0, fieldPosition0);
      assertEquals(7, stringBuffer0.length());
      assertEquals("i-1,529", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getInstance();
      ComplexFormat complexFormat0 = new ComplexFormat(numberFormat0, numberFormat0);
      // Undeclared exception!
      try { 
        complexFormat0.formatToCharacterIterator(numberFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot format given Object as a Date
         //
         verifyException("org.apache.commons.math.complex.ComplexFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Complex complex0 = Complex.INF;
      String string0 = ComplexFormat.formatComplex(complex0);
      assertEquals("(Infinity) + (Infinity)i", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ComplexFormat complexFormat0 = new ComplexFormat("mV!W~B~V8fm");
      try { 
        complexFormat0.parse("(NaN) + (NaN)i");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable complex number: \"(NaN) + (NaN)i\"
         //
         verifyException("org.apache.commons.math.complex.ComplexFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getInstance();
      ComplexFormat complexFormat0 = new ComplexFormat("~6K[N>T(mhYeK/+%T;W", numberFormat0, numberFormat0);
      Complex complex0 = (Complex)complexFormat0.parseObject("-1");
      assertEquals(1.0, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ComplexFormat complexFormat0 = ComplexFormat.getInstance();
      try { 
        complexFormat0.parse("1+?m0iLaX49:8Lu");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable complex number: \"1+?m0iLaX49:8Lu\"
         //
         verifyException("org.apache.commons.math.complex.ComplexFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ComplexFormat complexFormat0 = ComplexFormat.getInstance();
      complexFormat0.setImaginaryCharacter("j");
      try { 
        complexFormat0.parse("(NaN) + (NaN)i");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable complex number: \"(NaN) + (NaN)i\"
         //
         verifyException("org.apache.commons.math.complex.ComplexFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ComplexFormat complexFormat0 = ComplexFormat.getInstance();
      ParsePosition parsePosition0 = new ParsePosition(2);
      complexFormat0.parse(" + ", parsePosition0);
      assertEquals(2, parsePosition0.getErrorIndex());
      assertEquals(2, parsePosition0.getIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getPercentInstance();
      ComplexFormat complexFormat0 = null;
      try {
        complexFormat0 = new ComplexFormat((String) null, numberFormat0, numberFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // imaginaryCharacter must be a non-empty string.
         //
         verifyException("org.apache.commons.math.complex.ComplexFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ComplexFormat complexFormat0 = null;
      try {
        complexFormat0 = new ComplexFormat("uEci8", (NumberFormat) null, (NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // imaginaryFormat can not be null.
         //
         verifyException("org.apache.commons.math.complex.ComplexFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ComplexFormat complexFormat0 = new ComplexFormat();
      // Undeclared exception!
      try { 
        complexFormat0.setRealFormat((NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // realFormat can not be null.
         //
         verifyException("org.apache.commons.math.complex.ComplexFormat", e);
      }
  }
}
