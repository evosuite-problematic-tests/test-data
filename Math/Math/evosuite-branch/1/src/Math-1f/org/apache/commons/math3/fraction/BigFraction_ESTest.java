/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 13:43:18 GMT 2018
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
      BigFraction bigFraction0 = BigFraction.ONE_FIFTH;
      BigFraction bigFraction1 = bigFraction0.ONE_HALF.divide(bigFraction0);
      assertEquals((short)2, bigFraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_FIFTH;
      int int0 = bigFraction0.ONE.intValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_QUARTERS;
      BigInteger bigInteger0 = bigFraction0.getNumerator();
      assertEquals((byte)1, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(0);
      BigFraction bigFraction1 = bigFraction0.add(bigFraction0);
      assertSame(bigFraction1, bigFraction0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      BigFraction bigFraction0 = new BigFraction(bigInteger0);
      assertEquals((byte)0, bigFraction0.byteValue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_QUARTERS;
      BigFractionField bigFractionField0 = bigFraction0.getField();
      assertNotNull(bigFractionField0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-1269L));
      BigDecimal bigDecimal0 = bigFraction0.bigDecimalValue();
      assertEquals((byte)11, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_HALF;
      int int0 = bigFraction0.getNumeratorAsInt();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_FIFTH;
      BigFraction bigFraction1 = bigFraction0.divide(52);
      assertFalse(bigFraction1.equals((Object)bigFraction0));
      assertEquals((byte)0, bigFraction1.byteValue());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_FIFTH;
      BigFraction bigFraction1 = bigFraction0.ONE_QUARTER.add(0);
      assertFalse(bigFraction1.equals((Object)bigFraction0));
      assertEquals((byte)0, bigFraction1.byteValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_THIRDS;
      BigFraction bigFraction1 = bigFraction0.subtract((long) 0);
      assertEquals((byte)0, bigFraction1.byteValue());
      assertTrue(bigFraction1.equals((Object)bigFraction0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_FIFTH;
      int int0 = bigFraction0.ONE_THIRD.compareTo(bigFraction0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_FIFTH;
      BigFraction bigFraction1 = bigFraction0.add(1447L);
      assertEquals((short)1447, bigFraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(0.0038986406289041042, 0.0038986406289041042, 243);
      assertEquals((byte)0, bigFraction0.byteValue());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(629, 629);
      double double0 = bigFraction0.percentageValue();
      assertEquals(100.0, double0, 0.01);
      assertEquals((byte)1, bigFraction0.byteValue());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_FIFTH;
      long long0 = bigFraction0.ONE_FIFTH.getDenominatorAsLong();
      assertEquals(5L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_FIFTH;
      bigFraction0.ONE_FIFTH.hashCode();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.getReducedFraction((-1), (-1));
      BigFraction bigFraction1 = bigFraction0.subtract((-1));
      assertEquals((byte)2, bigFraction1.byteValue());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_QUARTERS;
      BigInteger bigInteger0 = bigFraction0.getDenominator();
      assertEquals((byte)2, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_FIFTH;
      long long0 = bigFraction0.THREE_QUARTERS.longValue();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_FIFTH;
      BigFraction bigFraction1 = bigFraction0.multiply(1);
      assertTrue(bigFraction1.equals((Object)bigFraction0));
      assertEquals((short)0, bigFraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_FIFTH;
      // Undeclared exception!
      try { 
        bigFraction0.bigDecimalValue(1666, (-1));
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
      BigFraction bigFraction0 = BigFraction.getReducedFraction((-1), (-1));
      // Undeclared exception!
      try { 
        bigFraction0.bigDecimalValue(673);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid rounding mode
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.getReducedFraction((-1), (-1));
      BigFraction bigFraction1 = bigFraction0.multiply(2154L);
      assertEquals((byte)106, bigFraction1.byteValue());
      assertEquals((short)1, bigFraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_FIFTH;
      int int0 = bigFraction0.getDenominatorAsInt();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_FIFTH;
      BigFraction bigFraction1 = bigFraction0.FOUR_FIFTHS.divide((-3512299194304650054L));
      assertFalse(bigFraction1.equals((Object)bigFraction0));
      assertEquals((short)0, bigFraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.MINUS_ONE;
      long long0 = bigFraction0.getNumeratorAsLong();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-1582.20903));
      double double0 = bigFraction0.pow(1445.69);
      assertEquals((short) (-1582), bigFraction0.shortValue());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(346.0);
      assertEquals((short)346, bigFraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BigFraction bigFraction0 = null;
      try {
        bigFraction0 = new BigFraction(1.7976931348623157E308, (-2927.49913299), 1567);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Overflow trying to convert 179,769,313,486,231,570,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000 to fraction (9,223,372,036,854,775,807/1)
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(2959.21312148587, 2959.21312148587, (-168));
      assertEquals((byte) (-113), bigFraction0.byteValue());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BigFraction bigFraction0 = null;
      try {
        bigFraction0 = new BigFraction((-100.871572), (-100.871572), 1132);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Overflow trying to convert -100.872 to fraction (-871,592,341,737/8,640,614,243)
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BigFraction bigFraction0 = null;
      try {
        bigFraction0 = new BigFraction(0.0, (-45));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BigFraction bigFraction0 = null;
      try {
        bigFraction0 = new BigFraction((-1553.8981213174031), (-1553.8981213174031), (-1325));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Unable to convert -1,553.898 to fraction after -1,325 iterations
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(261.8, (-1));
      assertEquals((short)261, bigFraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.getReducedFraction(0, 0);
      assertEquals((short)0, bigFraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(218, (-1));
      BigFraction bigFraction1 = bigFraction0.abs();
      assertFalse(bigFraction1.equals((Object)bigFraction0));
      assertEquals((short)218, bigFraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_FIFTH;
      BigFraction bigFraction1 = bigFraction0.TWO_QUARTERS.abs();
      assertEquals((byte)0, bigFraction1.byteValue());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_FIFTH;
      BigFraction bigFraction1 = bigFraction0.ONE_THIRD.add(bigFraction0);
      assertFalse(bigFraction1.equals((Object)bigFraction0));
      assertEquals((byte)0, bigFraction1.byteValue());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.THREE_QUARTERS;
      // Undeclared exception!
      try { 
        bigFraction0.add((BigFraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fraction
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_QUARTER;
      BigFraction bigFraction1 = bigFraction0.add(bigFraction0);
      assertNotSame(bigFraction1, bigFraction0);
      assertFalse(bigFraction1.equals((Object)bigFraction0));
      assertEquals((short)0, bigFraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(1071L, 1071L);
      // Undeclared exception!
      try { 
        bigFraction0.divide((BigInteger) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fraction
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-9223372036854775808L));
      BigInteger bigInteger0 = BigInteger.ZERO;
      // Undeclared exception!
      try { 
        bigFraction0.FOUR_FIFTHS.divide(bigInteger0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // denominator must be different from 0
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_THIRD;
      // Undeclared exception!
      try { 
        bigFraction0.ONE_THIRD.divide((BigFraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fraction
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_HALF;
      BigFraction bigFraction1 = new BigFraction(0.0);
      // Undeclared exception!
      try { 
        bigFraction0.ONE_THIRD.divide(bigFraction1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // denominator must be different from 0
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_THIRDS;
      BigFraction bigFraction1 = bigFraction0.pow(2717);
      double double0 = bigFraction1.doubleValue();
      assertFalse(bigFraction1.equals((Object)bigFraction0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.MINUS_ONE;
      Object object0 = new Object();
      boolean boolean0 = bigFraction0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_FIFTH;
      BigInteger bigInteger0 = BigInteger.ZERO;
      BigFraction bigFraction1 = bigFraction0.ONE_HALF.add(bigInteger0);
      boolean boolean0 = bigFraction0.equals(bigFraction1);
      assertFalse(bigFraction1.equals((Object)bigFraction0));
      assertEquals((short)0, bigFraction1.shortValue());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.MINUS_ONE;
      float float0 = bigFraction0.floatValue();
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-2002.3022915559752));
      BigFraction bigFraction1 = bigFraction0.THREE_QUARTERS.pow(622);
      float float0 = bigFraction1.floatValue();
      assertEquals(0.0F, float0, 0.01F);
      assertEquals((short) (-2002), bigFraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_HALF;
      // Undeclared exception!
      try { 
        bigFraction0.MINUS_ONE.multiply((BigInteger) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.THREE_FIFTHS;
      // Undeclared exception!
      try { 
        bigFraction0.TWO_FIFTHS.multiply((BigFraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fraction
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_HALF;
      BigFraction bigFraction1 = new BigFraction(0.0, 26);
      BigFraction bigFraction2 = bigFraction0.subtract(bigFraction1);
      BigFraction bigFraction3 = bigFraction1.divide(bigFraction2);
      assertSame(bigFraction2, bigFraction0);
      assertFalse(bigFraction3.equals((Object)bigFraction0));
      assertTrue(bigFraction3.equals((Object)bigFraction1));
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_HALF;
      BigFraction bigFraction1 = new BigFraction(0.0, 26);
      BigFraction bigFraction2 = bigFraction0.multiply(bigFraction1);
      assertTrue(bigFraction2.equals((Object)bigFraction1));
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.getReducedFraction((-1), (-1));
      BigFraction bigFraction1 = bigFraction0.pow((-1));
      assertEquals((short)1, bigFraction0.shortValue());
      assertTrue(bigFraction1.equals((Object)bigFraction0));
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_FIFTH;
      BigFraction bigFraction1 = bigFraction0.TWO_QUARTERS.pow(0L);
      assertFalse(bigFraction1.equals((Object)bigFraction0));
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(0L, (-724L));
      // Undeclared exception!
      try { 
        bigFraction0.pow((-183L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // denominator must be different from 0
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_FIFTH;
      BigInteger bigInteger0 = BigInteger.TEN;
      BigFraction bigFraction1 = bigFraction0.pow(bigInteger0);
      assertEquals((byte)0, bigFraction1.byteValue());
      assertFalse(bigFraction1.equals((Object)bigFraction0));
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.FOUR_FIFTHS;
      BigInteger bigInteger0 = BigInteger.valueOf((-89L));
      BigFraction bigFraction1 = bigFraction0.pow(bigInteger0);
      assertEquals((short)29293, bigFraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_QUARTERS;
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
  public void test60()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(2454.47);
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
  public void test61()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-2002.3022915559752));
      BigFraction bigFraction1 = bigFraction0.TWO_QUARTERS.subtract(bigFraction0);
      assertEquals((byte) (-46), bigFraction1.byteValue());
      assertFalse(bigFraction1.equals((Object)bigFraction0));
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-1676L));
      BigFraction bigFraction1 = bigFraction0.subtract(bigFraction0);
      assertEquals((short) (-1676), bigFraction0.shortValue());
      assertEquals((short)0, bigFraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-2002.3022915559752));
      String string0 = bigFraction0.toString();
      assertEquals("-8806218607553301 / 4398046511104", string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_FIFTH;
      String string0 = bigFraction0.TWO.toString();
      assertEquals("2", string0);
  }
}
