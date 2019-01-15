/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 17:32:57 GMT 2019
 */

package org.apache.commons.math.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import org.apache.commons.math.fraction.Fraction;
import org.apache.commons.math.fraction.ProperFractionFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProperFractionFormat_ESTest extends ProperFractionFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      Fraction fraction0 = Fraction.ONE;
      String string0 = properFractionFormat0.format((Object) fraction0);
      assertEquals("1 0 / 1", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      Fraction fraction0 = new Fraction(0.0);
      StringBuffer stringBuffer0 = new StringBuffer(0);
      FieldPosition fieldPosition0 = new FieldPosition((Format.Field) null, (-1681));
      properFractionFormat0.format(fraction0, stringBuffer0, fieldPosition0);
      assertEquals(5, stringBuffer0.length());
      assertEquals("0 / 1", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      Fraction fraction0 = (Fraction)properFractionFormat0.parseObject("1 0 / 1");
      assertEquals(1L, fraction0.longValue());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("");
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(choiceFormat0);
      ParsePosition parsePosition0 = new ParsePosition(1239);
      Fraction fraction0 = properFractionFormat0.parse("!'vt^{Ay5o YI5x`", parsePosition0);
      assertEquals((short)0, fraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      ParsePosition parsePosition0 = new ParsePosition(0);
      properFractionFormat0.parse("k4q82DF 4I", parsePosition0);
      assertEquals("java.text.ParsePosition[index=0,errorIndex=0]", parsePosition0.toString());
      assertEquals(0, parsePosition0.getIndex());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("overflow: mul");
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance();
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(choiceFormat0, numberFormat0, (NumberFormat) null);
      ParsePosition parsePosition0 = new ParsePosition(47);
      properFractionFormat0.parse("[CHCPbkg<6;", parsePosition0);
      assertEquals(45, parsePosition0.getErrorIndex());
      assertEquals("java.text.ParsePosition[index=47,errorIndex=45]", parsePosition0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      DecimalFormat decimalFormat0 = new DecimalFormat("1 0 / 1", decimalFormatSymbols0);
      properFractionFormat0.setWholeFormat(decimalFormat0);
      Fraction fraction0 = (Fraction)properFractionFormat0.parseObject("1 0 / 1");
      assertEquals((short)1, fraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      String[] stringArray0 = new String[3];
      stringArray0[0] = "whole format can not be null.";
      stringArray0[1] = "whole format can not be null.";
      stringArray0[2] = "";
      ChoiceFormat choiceFormat0 = new ChoiceFormat(doubleArray0, stringArray0);
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(choiceFormat0, choiceFormat0, choiceFormat0);
      try { 
        properFractionFormat0.parse("r)WM6E{O");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable fraction number: \"r)WM6E{O\"
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      DecimalFormat decimalFormat0 = new DecimalFormat("1 0 / 1");
      properFractionFormat0.setDenominatorFormat(decimalFormat0);
      try { 
        properFractionFormat0.parseObject("1 0 / 1");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Format.parseObject(String) failed
         //
         verifyException("java.text.Format", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = null;
      try {
        properFractionFormat0 = new ProperFractionFormat((NumberFormat) null, (NumberFormat) null, (NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // whole format can not be null.
         //
         verifyException("org.apache.commons.math.fraction.ProperFractionFormat", e);
      }
  }
}