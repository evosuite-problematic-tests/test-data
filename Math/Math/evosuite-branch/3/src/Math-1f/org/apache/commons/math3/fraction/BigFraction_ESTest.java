/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 14:28:59 GMT 2019
 */

package org.apache.commons.math3.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.math3.fraction.BigFraction;
import org.apache.commons.math3.fraction.BigFractionField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BigFraction_ESTest extends BigFraction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_THIRD;
      int int0 = bigFraction0.THREE_FIFTHS.intValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_QUARTER;
      BigInteger bigInteger0 = bigFraction0.getNumerator();
      assertEquals((byte)1, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(0);
      BigFraction bigFraction1 = bigFraction0.add(bigFraction0);
      assertSame(bigFraction1, bigFraction0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.FOUR_FIFTHS;
      BigFractionField bigFractionField0 = bigFraction0.ONE.getField();
      assertNotNull(bigFractionField0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(0L);
      BigFraction bigFraction1 = bigFraction0.subtract(220);
      assertEquals((byte)36, bigFraction1.byteValue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_QUARTER;
      int int0 = bigFraction0.getNumeratorAsInt();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_FIFTHS;
      BigFraction bigFraction1 = bigFraction0.divide((-1840));
      assertFalse(bigFraction1.equals((Object)bigFraction0));
      assertEquals((byte)0, bigFraction1.byteValue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(Integer.MAX_VALUE, Integer.MAX_VALUE);
      BigFraction bigFraction1 = bigFraction0.ONE_QUARTER.add(0);
      assertEquals((byte)0, bigFraction1.byteValue());
      assertEquals((short)1, bigFraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_QUARTER;
      BigFraction bigFraction1 = bigFraction0.ONE_FIFTH.subtract((-1820L));
      assertEquals((byte)28, bigFraction1.byteValue());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO;
      int int0 = bigFraction0.compareTo(bigFraction0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_QUARTER;
      BigFraction bigFraction1 = bigFraction0.add(1475L);
      assertEquals((short)1475, bigFraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_QUARTER;
      BigDecimal bigDecimal0 = bigFraction0.ONE_FIFTH.bigDecimalValue();
      assertEquals((short)0, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(768.256, 505.5011561616, 2149);
      bigFraction0.TWO_FIFTHS.getDenominatorAsInt();
      assertEquals((short)768, bigFraction0.shortValue());
      assertEquals((byte)0, bigFraction0.byteValue());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(Integer.MAX_VALUE, Integer.MAX_VALUE);
      double double0 = bigFraction0.percentageValue();
      assertEquals(100.0, double0, 0.01);
      assertEquals((short)1, bigFraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_QUARTER;
      long long0 = bigFraction0.getDenominatorAsLong();
      assertEquals(4L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_FIFTHS;
      bigFraction0.FOUR_FIFTHS.hashCode();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(1453, 1420);
      BigInteger bigInteger0 = bigFraction0.getDenominator();
      assertEquals((short)1420, bigInteger0.shortValue());
      assertEquals((byte)1, bigFraction0.byteValue());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(Integer.MAX_VALUE, Integer.MAX_VALUE);
      BigFraction bigFraction1 = bigFraction0.MINUS_ONE.abs();
      assertEquals((short)1, bigFraction0.shortValue());
      assertEquals((byte)1, bigFraction1.byteValue());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(Integer.MAX_VALUE, Integer.MAX_VALUE);
      bigFraction0.MINUS_ONE.longValue();
      assertEquals((byte)1, bigFraction0.byteValue());
      assertEquals((short)1, bigFraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_QUARTER;
      BigFraction bigFraction1 = bigFraction0.ONE_FIFTH.multiply(100);
      assertEquals((short)20, bigFraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      BigFraction bigFraction0 = new BigFraction(bigInteger0);
      // Undeclared exception!
      try { 
        bigFraction0.bigDecimalValue(4, 1067);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid rounding mode
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_FIFTHS;
      // Undeclared exception!
      try { 
        bigFraction0.bigDecimalValue((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid rounding mode
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(0L);
      BigFraction bigFraction1 = bigFraction0.ONE_FIFTH.multiply(0L);
      assertEquals((short)0, bigFraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((double) 1453, 2);
      assertEquals((byte) (-83), bigFraction0.byteValue());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_QUARTER;
      BigFraction bigFraction1 = bigFraction0.divide((long) 1150);
      assertFalse(bigFraction1.equals((Object)bigFraction0));
      assertEquals((byte)0, bigFraction1.byteValue());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BigFraction bigFraction0 = null;
      try {
        bigFraction0 = new BigFraction((-1213L), 0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // denominator must be different from 0
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_THIRD;
      long long0 = bigFraction0.getNumeratorAsLong();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_FIFTHS;
      double double0 = bigFraction0.TWO_THIRDS.pow((-1196.2854966));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(1.0267179012298584);
      assertEquals((short)1, bigFraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BigFraction bigFraction0 = null;
      try {
        bigFraction0 = new BigFraction(Double.NaN);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot convert NaN value
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(0.0);
      String string0 = bigFraction0.toString();
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-37.8044736541));
      assertEquals((byte) (-37), bigFraction0.byteValue());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(1.7976931348623157E308);
      assertEquals((byte)0, bigFraction0.byteValue());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BigFraction bigFraction0 = null;
      try {
        bigFraction0 = new BigFraction(2.5904487437231458E96, 2.5904487437231458E96, 1078);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Overflow trying to convert 2,590,448,743,723,145,800,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000 to fraction (9,223,372,036,854,775,807/1)
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(5.278759515330048E-8, 5.278759515330048E-8, 1183);
      assertEquals((byte)0, bigFraction0.byteValue());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BigFraction bigFraction0 = null;
      try {
        bigFraction0 = new BigFraction(3.060737220976933E-278, 3.060737220976933E-278, (-277));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BigFraction bigFraction0 = null;
      try {
        bigFraction0 = new BigFraction((-1.0), (-2644));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Overflow trying to convert -1 to fraction (-9,223,372,036,854,775,806/9,223,372,036,854,775,807)
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BigFraction bigFraction0 = null;
      try {
        bigFraction0 = new BigFraction(2597.6715924691307, 0.0, (-1));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Unable to convert 2,597.672 to fraction after -1 iterations
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(1776.459971243, 1183);
      assertEquals((short)1776, bigFraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.getReducedFraction((-398), 1);
      assertEquals((short) (-398), bigFraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.getReducedFraction(0, 0);
      BigFraction bigFraction1 = bigFraction0.add(bigFraction0);
      assertSame(bigFraction1, bigFraction0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(768.256, 505.5011561616, 2149);
      bigFraction0.THREE_FIFTHS.abs();
      assertEquals((short)768, bigFraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(1, 1);
      // Undeclared exception!
      try { 
        bigFraction0.ZERO.add((BigFraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fraction
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.getReducedFraction(0, 0);
      BigInteger bigInteger0 = BigInteger.ONE;
      BigFraction bigFraction1 = bigFraction0.TWO_THIRDS.pow(bigInteger0);
      BigFraction bigFraction2 = bigFraction0.add(bigFraction1);
      assertFalse(bigFraction1.equals((Object)bigFraction0));
      assertTrue(bigFraction2.equals((Object)bigFraction1));
      assertEquals((byte)0, bigFraction1.byteValue());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      BigFraction bigFraction0 = new BigFraction(bigInteger0, bigInteger0);
      BigFraction bigFraction1 = bigFraction0.add(bigFraction0);
      assertEquals((short)2, bigFraction1.shortValue());
      assertFalse(bigFraction1.equals((Object)bigFraction0));
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_QUARTER;
      // Undeclared exception!
      try { 
        bigFraction0.TWO_QUARTERS.divide((BigInteger) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fraction
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_FIFTH;
      // Undeclared exception!
      try { 
        bigFraction0.divide(0L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // denominator must be different from 0
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(768.256, 505.5011561616, 2149);
      BigFraction bigFraction1 = bigFraction0.divide(bigFraction0);
      assertEquals((short)768, bigFraction0.shortValue());
      assertEquals((byte)1, bigFraction1.byteValue());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.FOUR_FIFTHS;
      // Undeclared exception!
      try { 
        bigFraction0.divide((BigFraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fraction
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_QUARTERS;
      BigFraction bigFraction1 = BigFraction.ZERO;
      // Undeclared exception!
      try { 
        bigFraction0.ONE.divide(bigFraction1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // denominator must be different from 0
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(768.256, 505.5011561616, 2149);
      BigFraction bigFraction1 = bigFraction0.THREE_FIFTHS.pow((long) 2149);
      double double0 = bigFraction1.doubleValue();
      assertEquals(0.0, double0, 0.01);
      assertFalse(bigFraction1.equals((Object)bigFraction0));
      assertEquals((short)768, bigFraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(768.256, 505.5011561616, 2149);
      Object object0 = new Object();
      boolean boolean0 = bigFraction0.TWO_FIFTHS.equals(object0);
      assertFalse(boolean0);
      assertEquals((short)768, bigFraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_QUARTER;
      boolean boolean0 = bigFraction0.ONE.equals(bigFraction0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(768.256, 505.5011561616, 2149);
      float float0 = bigFraction0.FOUR_FIFTHS.floatValue();
      assertEquals((short)768, bigFraction0.shortValue());
      assertEquals(0.8F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ZERO;
      BigFraction bigFraction1 = bigFraction0.THREE_FIFTHS.pow(332);
      float float0 = bigFraction1.floatValue();
      assertEquals(0.0F, float0, 0.01F);
      assertFalse(bigFraction1.equals((Object)bigFraction0));
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_QUARTER;
      // Undeclared exception!
      try { 
        bigFraction0.multiply((BigInteger) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.THREE_FIFTHS;
      // Undeclared exception!
      try { 
        bigFraction0.THREE_QUARTERS.multiply((BigFraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fraction
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.getReducedFraction(0, 0);
      BigFraction bigFraction1 = bigFraction0.multiply(bigFraction0);
      assertSame(bigFraction1, bigFraction0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_FIFTHS;
      BigFraction bigFraction1 = bigFraction0.ONE.pow((-1840));
      assertEquals((byte)1, bigFraction1.byteValue());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_THIRDS;
      BigFraction bigFraction1 = bigFraction0.TWO.pow((long) (-1));
      assertFalse(bigFraction1.equals((Object)bigFraction0));
      assertEquals((byte)0, bigFraction1.byteValue());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(0L);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-36);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      // Undeclared exception!
      try { 
        bigFraction0.ZERO.pow(bigInteger0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // denominator must be different from 0
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(2047L);
      // Undeclared exception!
      try { 
        bigFraction0.subtract((BigInteger) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      BigFraction bigFraction0 = new BigFraction(bigInteger0);
      BigFraction bigFraction1 = bigFraction0.subtract(bigFraction0);
      assertSame(bigFraction1, bigFraction0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_THIRD;
      // Undeclared exception!
      try { 
        bigFraction0.subtract((BigFraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fraction
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)58;
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      BigFraction bigFraction0 = new BigFraction(bigInteger0);
      BigFraction bigFraction1 = bigFraction0.subtract(bigFraction0);
      assertEquals((byte)58, bigFraction0.byteValue());
      assertEquals((byte)0, bigFraction1.byteValue());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_QUARTER;
      BigInteger bigInteger0 = BigInteger.TEN;
      BigFraction bigFraction1 = bigFraction0.pow(bigInteger0);
      BigFraction bigFraction2 = bigFraction1.subtract(bigFraction0);
      assertFalse(bigFraction2.equals((Object)bigFraction1));
      assertNotSame(bigFraction2, bigFraction1);
      assertEquals((short)0, bigFraction2.shortValue());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_QUARTER;
      String string0 = bigFraction0.toString();
      assertEquals("1 / 4", string0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(0.0, 0.0, 52);
      String string0 = bigFraction0.toString();
      assertEquals("0", string0);
  }
}
