/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 12:47:01 GMT 2018
 */

package org.apache.commons.math.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import org.apache.commons.math.fraction.Fraction;
import org.apache.commons.math.fraction.FractionFormat;
import org.apache.commons.math.fraction.ProperFractionFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProperFractionFormat_ESTest extends ProperFractionFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      ParsePosition parsePosition0 = new ParsePosition(0);
      properFractionFormat0.parse("KF<B'B]", parsePosition0);
      assertEquals("java.text.ParsePosition[index=0,errorIndex=0]", parsePosition0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      Fraction fraction0 = Fraction.ZERO;
      StringBuffer stringBuffer0 = new StringBuffer(0);
      FieldPosition fieldPosition0 = new FieldPosition(0);
      properFractionFormat0.format(fraction0, stringBuffer0, fieldPosition0);
      assertEquals(5, fieldPosition0.getEndIndex());
      assertEquals("0 / 1", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("/");
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(choiceFormat0);
      Fraction fraction0 = new Fraction((-255.7254573238));
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "");
      FieldPosition fieldPosition0 = new FieldPosition(0);
      // Undeclared exception!
      try { 
        properFractionFormat0.format(fraction0, stringBuffer0, fieldPosition0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("java.text.ChoiceFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      String[] stringArray0 = new String[7];
      stringArray0[0] = "p[%1K8r?";
      stringArray0[1] = "X'$/*+j7Lx";
      stringArray0[2] = "[:SYI4XV}";
      stringArray0[3] = "W6l_fxl$ud'xbWhL]T";
      stringArray0[4] = "overflow: numerator too large after multiply";
      stringArray0[5] = "-AkjR#>zxiL 1;NFkv";
      stringArray0[6] = "";
      ChoiceFormat choiceFormat0 = new ChoiceFormat(doubleArray0, stringArray0);
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(choiceFormat0, choiceFormat0, choiceFormat0);
      ParsePosition parsePosition0 = new ParsePosition(31);
      properFractionFormat0.parse("", parsePosition0);
      assertEquals(30, parsePosition0.getIndex());
      assertEquals(30, parsePosition0.getErrorIndex());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("?U");
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      properFractionFormat0.setWholeFormat(choiceFormat0);
      ParsePosition parsePosition0 = new ParsePosition(0);
      properFractionFormat0.parse("KF<B'B]", parsePosition0);
      assertEquals("java.text.ParsePosition[index=0,errorIndex=0]", parsePosition0.toString());
      assertEquals(0, parsePosition0.getIndex());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat(" / ");
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(choiceFormat0);
      DecimalFormat decimalFormat0 = new DecimalFormat();
      properFractionFormat0.setDenominatorFormat(decimalFormat0);
      try { 
        properFractionFormat0.parse(" / ");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable fraction number: \" / \"
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ParsePosition parsePosition0 = new ParsePosition(0);
      DecimalFormat decimalFormat0 = new DecimalFormat("0)A/r379ns-8m5p9");
      NumberFormat numberFormat0 = FractionFormat.getDefaultNumberFormat();
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(decimalFormat0, numberFormat0, decimalFormat0);
      properFractionFormat0.parse("0)A/r379ns-8m5p9", parsePosition0);
      assertEquals("java.text.ParsePosition[index=16,errorIndex=1]", parsePosition0.toString());
      assertEquals(1, parsePosition0.getErrorIndex());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("");
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(choiceFormat0);
      ParsePosition parsePosition0 = new ParsePosition(0);
      Fraction fraction0 = properFractionFormat0.parse("KF<B'B]", parsePosition0);
      assertNull(fraction0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
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
