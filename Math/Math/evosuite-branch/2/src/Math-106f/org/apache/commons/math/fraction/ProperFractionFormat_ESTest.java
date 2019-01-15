/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 21:59:31 GMT 2019
 */

package org.apache.commons.math.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;
import org.apache.commons.math.fraction.Fraction;
import org.apache.commons.math.fraction.ProperFractionFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProperFractionFormat_ESTest extends ProperFractionFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      ParsePosition parsePosition0 = new ParsePosition(0);
      properFractionFormat0.parse("k<kceH)9i5OUl\"#n", parsePosition0);
      assertEquals("java.text.ParsePosition[index=0,errorIndex=0]", parsePosition0.toString());
      assertEquals(0, parsePosition0.getIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      Fraction fraction0 = Fraction.ZERO;
      StringBuffer stringBuffer0 = new StringBuffer();
      FieldPosition fieldPosition0 = new FieldPosition(0);
      properFractionFormat0.format(fraction0, stringBuffer0, fieldPosition0);
      assertEquals("java.text.FieldPosition[field=0,attribute=null,beginIndex=4,endIndex=5]", fieldPosition0.toString());
      assertEquals("0 / 1", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      Integer integer0 = new Integer((-22));
      String string0 = properFractionFormat0.format((Object) integer0);
      assertEquals("-22 0 / 1", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance(locale0);
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(numberFormat0);
      Fraction fraction0 = (Fraction)properFractionFormat0.parseObject("0");
      assertEquals(0.0F, fraction0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      ParsePosition parsePosition0 = new ParsePosition(1);
      properFractionFormat0.parse("-22 0 / 1", parsePosition0);
      assertEquals("java.text.ParsePosition[index=9,errorIndex=3]", parsePosition0.toString());
      assertEquals(9, parsePosition0.getIndex());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      NumberFormat numberFormat0 = NumberFormat.getInstance(locale0);
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(numberFormat0);
      ParsePosition parsePosition0 = new ParsePosition(1);
      properFractionFormat0.parse("48sF>mZuw", parsePosition0);
      assertEquals("java.text.ParsePosition[index=1,errorIndex=2]", parsePosition0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      ChoiceFormat choiceFormat0 = new ChoiceFormat("-46 0 / 1");
      properFractionFormat0.setWholeFormat(choiceFormat0);
      ParsePosition parsePosition0 = new ParsePosition(0);
      properFractionFormat0.parse("-46 0 / 1", parsePosition0);
      assertEquals("java.text.ParsePosition[index=0,errorIndex=0]", parsePosition0.toString());
      assertEquals(0, parsePosition0.getErrorIndex());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      Locale locale0 = Locale.TAIWAN;
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols(locale0);
      DecimalFormat decimalFormat0 = new DecimalFormat("47 0 / 1", decimalFormatSymbols0);
      properFractionFormat0.setWholeFormat(decimalFormat0);
      ParsePosition parsePosition0 = new ParsePosition(0);
      properFractionFormat0.parse("47 0 / 1", parsePosition0);
      assertEquals("java.text.ParsePosition[index=8,errorIndex=2]", parsePosition0.toString());
      assertEquals(8, parsePosition0.getIndex());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      String[] stringArray0 = new String[4];
      stringArray0[0] = "?n{";
      stringArray0[1] = "PCV{W]QBM^/L8\"G";
      stringArray0[2] = "4#~g\"$ d&^$|_/";
      stringArray0[3] = ",AQ.#zH4 ~ %t ((y";
      ChoiceFormat choiceFormat0 = new ChoiceFormat(doubleArray0, stringArray0);
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(choiceFormat0);
      ParsePosition parsePosition0 = new ParsePosition(1);
      Fraction fraction0 = properFractionFormat0.parse("PCV{W]QBM^/L8\"G", parsePosition0);
      assertNull(fraction0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      NumberFormat numberFormat0 = NumberFormat.getCurrencyInstance();
      properFractionFormat0.setDenominatorFormat(numberFormat0);
      ParsePosition parsePosition0 = new ParsePosition(1);
      properFractionFormat0.parse("-22 0 / 1", parsePosition0);
      assertEquals("java.text.ParsePosition[index=1,errorIndex=8]", parsePosition0.toString());
      assertEquals(8, parsePosition0.getErrorIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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