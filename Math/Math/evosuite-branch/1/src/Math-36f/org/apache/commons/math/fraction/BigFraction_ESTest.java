/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 15:06:08 GMT 2018
 */

package org.apache.commons.math.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.math.fraction.BigFraction;
import org.apache.commons.math.fraction.BigFractionField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BigFraction_ESTest extends BigFraction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_FIFTH;
      BigFraction bigFraction1 = bigFraction0.divide((-690L));
      assertEquals((byte)0, bigFraction1.byteValue());
      assertFalse(bigFraction1.equals((Object)bigFraction0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-1582.20903));
      int int0 = bigFraction0.compareTo(bigFraction0);
      assertEquals((short) (-1582), bigFraction0.shortValue());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-1582.20903));
      double double0 = bigFraction0.pow(1445.69);
      assertEquals((short) (-1582), bigFraction0.shortValue());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_QUARTER;
      long long0 = bigFraction0.MINUS_ONE.getNumeratorAsLong();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_QUARTERS;
      BigFraction bigFraction1 = bigFraction0.add(2);
      assertEquals((byte)2, bigFraction1.byteValue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-1582.20903));
      BigFraction bigFraction1 = bigFraction0.multiply((long) (-1492));
      assertEquals((short)1359, bigFraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_THIRDS;
      long long0 = bigFraction0.TWO_QUARTERS.longValue();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_THIRD;
      double double0 = bigFraction0.MINUS_ONE.percentageValue();
      assertEquals((-100.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-1582.20903));
      BigFraction bigFraction1 = bigFraction0.ONE_HALF.multiply((-1492));
      assertEquals((short) (-1582), bigFraction0.shortValue());
      assertEquals((byte)22, bigFraction1.byteValue());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_THIRDS;
      int int0 = bigFraction0.intValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.getReducedFraction(1, 1121);
      int int0 = bigFraction0.getDenominatorAsInt();
      assertEquals(1121, int0);
      assertEquals((byte)0, bigFraction0.byteValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-1582.20903));
      bigFraction0.getDenominator();
      assertEquals((short) (-1582), bigFraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.getReducedFraction(0, (-1));
      BigFraction bigFraction1 = bigFraction0.subtract((-1));
      assertEquals((short)1, bigFraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(0);
      BigFraction bigFraction1 = bigFraction0.add(bigFraction0);
      assertSame(bigFraction1, bigFraction0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-1676L));
      assertEquals((byte)116, bigFraction0.byteValue());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_HALF;
      BigDecimal bigDecimal0 = bigFraction0.FOUR_FIFTHS.bigDecimalValue();
      assertEquals((short)0, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_THIRDS;
      BigFractionField bigFractionField0 = bigFraction0.TWO_THIRDS.getField();
      assertNotNull(bigFractionField0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_THIRDS;
      BigInteger bigInteger0 = bigFraction0.getNumerator();
      assertEquals((byte)2, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(1021L, 1021L);
      BigFraction bigFraction1 = bigFraction0.add((-4267615245585081135L));
      assertEquals((byte)1, bigFraction0.byteValue());
      assertEquals((short)7378, bigFraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-1582.20903));
      // Undeclared exception!
      try { 
        bigFraction0.bigDecimalValue(1289);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid rounding mode
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      BigFraction bigFraction0 = new BigFraction(bigInteger0);
      assertEquals((short)1, bigFraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-1582.20903));
      BigFraction bigFraction1 = bigFraction0.divide((-1492));
      assertEquals((byte)1, bigFraction1.byteValue());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(4577762542105553359L, 4577762542105553359L);
      long long0 = bigFraction0.getDenominatorAsLong();
      assertEquals(1L, long0);
      assertEquals((byte)1, bigFraction0.byteValue());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_THIRDS;
      BigFraction bigFraction1 = bigFraction0.subtract((-953L));
      assertEquals((short)953, bigFraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_THIRDS;
      BigFraction bigFraction1 = bigFraction0.divide(bigFraction0);
      assertEquals((short)1, bigFraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(524.2218585091433, (-2134));
      int int0 = bigFraction0.getNumeratorAsInt();
      assertEquals(524, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(4577762542105553359L, 4577762542105553359L);
      bigFraction0.MINUS_ONE.hashCode();
      assertEquals((short)1, bigFraction0.shortValue());
      assertEquals((byte)1, bigFraction0.byteValue());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_THIRDS;
      // Undeclared exception!
      try { 
        bigFraction0.ZERO.bigDecimalValue((-1), (-90));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid rounding mode
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BigFraction bigFraction0 = null;
      try {
        bigFraction0 = new BigFraction(1, (-845.5), 3);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Overflow trying to convert 1 to fraction (-9,223,372,036,854,775,808/9,223,372,036,854,775,807)
         //
         verifyException("org.apache.commons.math.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        BigFraction.getReducedFraction((-1), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // denominator must be different from 0
         //
         verifyException("org.apache.commons.math.fraction.BigFraction", e);
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
      BigFraction bigFraction0 = new BigFraction(346.0);
      assertEquals((short)346, bigFraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(2959.21312148587, 2959.21312148587, (-168));
      assertEquals((short)2959, bigFraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BigFraction bigFraction0 = null;
      try {
        bigFraction0 = new BigFraction((double) 1121, 3);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Overflow trying to convert 1,121 to fraction (9,223,372,036,854,774,688/9,223,372,036,854,775,807)
         //
         verifyException("org.apache.commons.math.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BigFraction bigFraction0 = null;
      try {
        bigFraction0 = new BigFraction((-1553.8981213174031), (-1553.8981213174031), (-1325));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Unable to convert -1,553.898 to fraction after -1,325 iterations
         //
         verifyException("org.apache.commons.math.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(261.8, 629);
      assertEquals((short)261, bigFraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(218, (-1));
      BigFraction bigFraction1 = bigFraction0.abs();
      assertNotSame(bigFraction1, bigFraction0);
      assertEquals((byte) (-38), bigFraction1.byteValue());
      assertEquals((byte)38, bigFraction0.byteValue());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(4577762542105553359L, 4577762542105553359L);
      BigFraction bigFraction1 = bigFraction0.abs();
      assertEquals((byte)1, bigFraction1.byteValue());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.getReducedFraction(1, 1121);
      BigFraction bigFraction1 = bigFraction0.add(bigFraction0);
      assertNotSame(bigFraction1, bigFraction0);
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
         verifyException("org.apache.commons.math.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.getReducedFraction(1, 1121);
      BigInteger bigInteger0 = BigInteger.TEN;
      BigFraction bigFraction1 = bigFraction0.ONE_THIRD.subtract(bigInteger0);
      BigFraction bigFraction2 = bigFraction1.add(bigFraction0);
      assertEquals((short) (-9), bigFraction2.shortValue());
      assertNotSame(bigFraction2, bigFraction1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_THIRD;
      BigInteger bigInteger0 = BigInteger.ZERO;
      // Undeclared exception!
      try { 
        bigFraction0.ZERO.divide(bigInteger0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // denominator must be different from 0
         //
         verifyException("org.apache.commons.math.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_THIRD;
      // Undeclared exception!
      try { 
        bigFraction0.ONE_THIRD.divide((BigFraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fraction
         //
         verifyException("org.apache.commons.math.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_HALF;
      BigFraction bigFraction1 = new BigFraction(0.0);
      // Undeclared exception!
      try { 
        bigFraction0.ONE_THIRD.divide(bigFraction1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // denominator must be different from 0
         //
         verifyException("org.apache.commons.math.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(7.119037959453517E-17);
      BigFraction bigFraction1 = bigFraction0.FOUR_FIFTHS.pow((-3180L));
      double double0 = bigFraction1.doubleValue();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(7.119037959453517E-17);
      Object object0 = new Object();
      boolean boolean0 = bigFraction0.FOUR_FIFTHS.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_FIFTH;
      BigFraction bigFraction1 = BigFraction.ONE;
      boolean boolean0 = bigFraction0.equals(bigFraction1);
      assertFalse(boolean0);
      assertFalse(bigFraction1.equals((Object)bigFraction0));
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(524.2218585091433, (-2134));
      float float0 = bigFraction0.TWO.floatValue();
      assertEquals(2.0F, float0, 0.01F);
      assertEquals((short)524, bigFraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.getReducedFraction(1, 1121);
      BigFraction bigFraction1 = bigFraction0.TWO_FIFTHS.pow((long) 1121);
      float float0 = bigFraction1.floatValue();
      assertEquals(0.0F, float0, 0.01F);
      assertFalse(bigFraction1.equals((Object)bigFraction0));
      assertEquals((short)0, bigFraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_HALF;
      // Undeclared exception!
      try { 
        bigFraction0.MINUS_ONE.multiply((BigInteger) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.THREE_FIFTHS;
      // Undeclared exception!
      try { 
        bigFraction0.TWO_FIFTHS.multiply((BigFraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fraction
         //
         verifyException("org.apache.commons.math.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(0L, (-724L));
      BigFraction bigFraction1 = BigFraction.MINUS_ONE;
      BigFraction bigFraction2 = bigFraction0.divide(bigFraction1);
      assertTrue(bigFraction2.equals((Object)bigFraction0));
      assertFalse(bigFraction2.equals((Object)bigFraction1));
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_THIRD;
      BigFraction bigFraction1 = new BigFraction(9.942682855652123E-8, 802);
      BigFraction bigFraction2 = bigFraction0.THREE_QUARTERS.multiply(bigFraction1);
      assertTrue(bigFraction2.equals((Object)bigFraction1));
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.getReducedFraction(1, 1121);
      BigFraction bigFraction1 = bigFraction0.THREE_QUARTERS.pow(121);
      assertEquals((short)0, bigFraction0.shortValue());
      assertFalse(bigFraction1.equals((Object)bigFraction0));
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_THIRDS;
      BigFraction bigFraction1 = bigFraction0.pow((-1702));
      assertEquals((short)23260, bigFraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.getReducedFraction(1, 1121);
      BigInteger bigInteger0 = BigInteger.TEN;
      BigFraction bigFraction1 = bigFraction0.pow(bigInteger0);
      assertFalse(bigFraction1.equals((Object)bigFraction0));
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.FOUR_FIFTHS;
      BigInteger bigInteger0 = BigInteger.valueOf((-89L));
      BigFraction bigFraction1 = bigFraction0.pow(bigInteger0);
      assertEquals((byte)109, bigFraction1.byteValue());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_QUARTERS;
      // Undeclared exception!
      try { 
        bigFraction0.subtract((BigInteger) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.getReducedFraction(1, 1121);
      BigFraction bigFraction1 = bigFraction0.subtract(bigFraction0);
      assertEquals((byte)0, bigFraction1.byteValue());
      assertNotSame(bigFraction1, bigFraction0);
      assertEquals((byte)0, bigFraction0.byteValue());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(2454.47);
      // Undeclared exception!
      try { 
        bigFraction0.subtract((BigFraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fraction
         //
         verifyException("org.apache.commons.math.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(0L, (-724L));
      BigFraction bigFraction1 = bigFraction0.subtract(bigFraction0);
      assertSame(bigFraction1, bigFraction0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.getReducedFraction(1, 1121);
      BigInteger bigInteger0 = BigInteger.TEN;
      BigFraction bigFraction1 = bigFraction0.ONE_THIRD.subtract(bigInteger0);
      BigFraction bigFraction2 = bigFraction0.subtract(bigFraction1);
      assertEquals((short)9, bigFraction2.shortValue());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(7.119037959453517E-17);
      String string0 = bigFraction0.TWO_FIFTHS.toString();
      assertEquals("2 / 5", string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(524.2218585091433, (-2134));
      String string0 = bigFraction0.toString();
      assertEquals("524", string0);
  }
}
