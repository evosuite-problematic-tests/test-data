/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 19:05:16 GMT 2019
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
      BigFraction bigFraction0 = BigFraction.FOUR_FIFTHS;
      BigFraction bigFraction1 = bigFraction0.TWO.divide(bigFraction0);
      assertEquals((short)2, bigFraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_HALF;
      int int0 = bigFraction0.intValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      BigFraction bigFraction0 = new BigFraction(bigInteger0);
      assertEquals((byte)10, bigFraction0.byteValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO;
      BigFractionField bigFractionField0 = bigFraction0.getField();
      assertNotNull(bigFractionField0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(0L);
      assertEquals((short)0, bigFraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO;
      int int0 = bigFraction0.ONE_QUARTER.getNumeratorAsInt();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO;
      BigFraction bigFraction1 = bigFraction0.TWO_THIRDS.divide(2);
      assertFalse(bigFraction1.equals((Object)bigFraction0));
      assertEquals((byte)0, bigFraction1.byteValue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.THREE_QUARTERS;
      BigFraction bigFraction1 = bigFraction0.TWO_THIRDS.add(1269);
      assertEquals((short)1269, bigFraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-1442.7553708155), 0.0, 1159);
      BigFraction bigFraction1 = bigFraction0.subtract((-7278142539171889152L));
      assertEquals((byte)94, bigFraction0.byteValue());
      assertEquals((byte)93, bigFraction1.byteValue());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO;
      int int0 = bigFraction0.compareTo(bigFraction0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.THREE_QUARTERS;
      BigFraction bigFraction1 = bigFraction0.ONE_QUARTER.add(5L);
      assertEquals((byte)5, bigFraction1.byteValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_FIFTH;
      BigDecimal bigDecimal0 = bigFraction0.ZERO.bigDecimalValue();
      assertEquals((short)0, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_THIRD;
      double double0 = bigFraction0.percentageValue();
      assertEquals(33.333333333333336, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO;
      long long0 = bigFraction0.getDenominatorAsLong();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.THREE_QUARTERS;
      bigFraction0.THREE_FIFTHS.hashCode();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(1293, (-1909));
      BigFraction bigFraction1 = bigFraction0.subtract(1075);
      assertEquals((short) (-1075), bigFraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_FIFTHS;
      BigInteger bigInteger0 = bigFraction0.getDenominator();
      assertEquals((byte)5, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO;
      long long0 = bigFraction0.TWO.longValue();
      assertEquals(2L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_THIRD;
      // Undeclared exception!
      try { 
        bigFraction0.bigDecimalValue(1, (-1975));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid rounding mode
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.THREE_QUARTERS;
      BigDecimal bigDecimal0 = bigFraction0.TWO_THIRDS.bigDecimalValue(0);
      assertEquals((short)1, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.FOUR_FIFTHS;
      BigFraction bigFraction1 = bigFraction0.TWO_THIRDS.multiply((long) (-980));
      assertEquals((short) (-653), bigFraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_THIRD;
      int int0 = bigFraction0.getDenominatorAsInt();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO;
      BigFraction bigFraction1 = bigFraction0.divide(1L);
      assertTrue(bigFraction1.equals((Object)bigFraction0));
      assertEquals((short)2, bigFraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO;
      long long0 = bigFraction0.ONE.getNumeratorAsLong();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_THIRD;
      double double0 = bigFraction0.ONE_THIRD.pow(1866.086108);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(0.6223390102386475, (-1));
      // Undeclared exception!
      try { 
        bigFraction0.pow((-1));
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
      BigFraction bigFraction0 = null;
      try {
        bigFraction0 = new BigFraction(Double.POSITIVE_INFINITY);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot convert infinite value
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-2018.19131728));
      assertEquals((short) (-2018), bigFraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(0.0);
      BigFraction bigFraction1 = bigFraction0.THREE_FIFTHS.add(bigFraction0);
      assertFalse(bigFraction1.equals((Object)bigFraction0));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(1.0);
      BigInteger bigInteger0 = BigInteger.ZERO;
      boolean boolean0 = bigFraction0.equals(bigInteger0);
      assertFalse(boolean0);
      assertEquals((byte)1, bigFraction0.byteValue());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BigFraction bigFraction0 = null;
      try {
        bigFraction0 = new BigFraction(1.7976931348623157E308, (-226));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Overflow trying to convert 179,769,313,486,231,570,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000 to fraction (9,223,372,036,854,775,807/1)
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(481.725, 1289.672979, 2580);
      assertEquals((short)481, bigFraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((double) 795L, 52);
      assertEquals((short)795, bigFraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BigFraction bigFraction0 = null;
      try {
        bigFraction0 = new BigFraction((-540.753088), (-540.753088), 134217729);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Overflow trying to convert -540.753 to fraction (-2,166,675,043,543/4,006,773,316)
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BigFraction bigFraction0 = null;
      try {
        bigFraction0 = new BigFraction(0.0, 1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BigFraction bigFraction0 = null;
      try {
        bigFraction0 = new BigFraction((-297.229834), (-297.229834), (-1));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Unable to convert -297.23 to fraction after -1 iterations
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.getReducedFraction(0, (-290));
      assertEquals((byte)0, bigFraction0.byteValue());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-2394));
      BigFraction bigFraction1 = bigFraction0.abs();
      assertEquals((short)2394, bigFraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_THIRDS;
      BigFraction bigFraction1 = bigFraction0.TWO_FIFTHS.abs();
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
      BigFraction bigFraction0 = BigFraction.FOUR_FIFTHS;
      BigFraction bigFraction1 = bigFraction0.add(bigFraction0);
      assertEquals((byte)1, bigFraction1.byteValue());
      assertFalse(bigFraction1.equals((Object)bigFraction0));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO;
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
      BigFraction bigFraction0 = BigFraction.getReducedFraction((-2972), (-2972));
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
  public void test43()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(100L, (-1073741824L));
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
  public void test44()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_THIRD;
      BigFraction bigFraction1 = bigFraction0.ZERO.multiply((-344));
      // Undeclared exception!
      try { 
        bigFraction0.divide(bigFraction1);
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
      BigFraction bigFraction0 = new BigFraction((-1442.7553708155), 0.0, 1159);
      BigFraction bigFraction1 = bigFraction0.THREE_FIFTHS.pow((long) (-1560));
      double double0 = bigFraction1.doubleValue();
      assertEquals((byte) (-31), bigFraction1.byteValue());
      assertEquals((byte)94, bigFraction0.byteValue());
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(1.0);
      boolean boolean0 = bigFraction0.ONE_THIRD.equals(bigFraction0);
      assertFalse(boolean0);
      assertEquals((short)1, bigFraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_THIRDS;
      float float0 = bigFraction0.TWO.floatValue();
      assertEquals(2.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(1293, (-1909));
      BigFraction bigFraction1 = bigFraction0.ONE_FIFTH.pow(1293);
      BigFraction bigFraction2 = bigFraction0.FOUR_FIFTHS.add(bigFraction1);
      float float0 = bigFraction2.floatValue();
      assertFalse(bigFraction1.equals((Object)bigFraction2));
      assertEquals(0.8F, float0, 0.01F);
      assertFalse(bigFraction2.equals((Object)bigFraction1));
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_QUARTER;
      // Undeclared exception!
      try { 
        bigFraction0.ONE.multiply((BigInteger) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_QUARTERS;
      // Undeclared exception!
      try { 
        bigFraction0.multiply((BigFraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fraction
         //
         verifyException("org.apache.commons.math3.fraction.BigFraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_FIFTH;
      BigFraction bigFraction1 = bigFraction0.ONE_FIFTH.subtract(bigFraction0);
      BigFraction bigFraction2 = bigFraction1.multiply(bigFraction0);
      assertTrue(bigFraction2.equals((Object)bigFraction1));
      assertNotSame(bigFraction1, bigFraction0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_FIFTH;
      BigFraction bigFraction1 = bigFraction0.ONE_FIFTH.subtract(bigFraction0);
      BigFraction bigFraction2 = bigFraction0.multiply(bigFraction1);
      assertNotSame(bigFraction1, bigFraction0);
      assertTrue(bigFraction2.equals((Object)bigFraction1));
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(1.0);
      BigFraction bigFraction1 = bigFraction0.pow(2819561105158720014L);
      assertEquals((byte)1, bigFraction1.byteValue());
      assertTrue(bigFraction1.equals((Object)bigFraction0));
      assertEquals((short)1, bigFraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO_THIRDS;
      BigInteger bigInteger0 = BigInteger.TEN;
      BigFraction bigFraction1 = bigFraction0.MINUS_ONE.pow(bigInteger0);
      assertEquals((byte)1, bigFraction1.byteValue());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO;
      BigInteger bigInteger0 = BigInteger.TEN;
      BigFraction bigFraction1 = bigFraction0.subtract(bigInteger0);
      BigInteger bigInteger1 = bigFraction1.getNumerator();
      BigFraction bigFraction2 = bigFraction1.pow(bigInteger1);
      assertEquals((byte) (-8), bigInteger1.byteValue());
      assertEquals((byte)0, bigFraction2.byteValue());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-213), (-213));
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
  public void test57()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-97);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      BigFraction bigFraction0 = new BigFraction(bigInteger0, bigInteger0);
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
  public void test58()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.THREE_QUARTERS;
      BigFraction bigFraction1 = new BigFraction(0);
      BigFraction bigFraction2 = bigFraction0.subtract(bigFraction1);
      assertFalse(bigFraction2.equals((Object)bigFraction1));
      assertSame(bigFraction2, bigFraction0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-2018.19131728), (-528));
      BigFraction bigFraction1 = BigFraction.THREE_QUARTERS;
      BigFraction bigFraction2 = bigFraction0.subtract(bigFraction1);
      assertFalse(bigFraction2.equals((Object)bigFraction0));
      assertEquals((byte)29, bigFraction2.byteValue());
      assertFalse(bigFraction2.equals((Object)bigFraction1));
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-1442.7553708155), 0.0, 1159);
      String string0 = bigFraction0.toString();
      assertEquals("-3807812311 / 2639264", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-1442.7553708155), 0.0, 1159);
      BigFraction bigFraction1 = bigFraction0.TWO_QUARTERS.pow((-1548L));
      String string0 = bigFraction1.toString();
      assertEquals("9872639700668549482824157618291974606487933943585541944769228960011294275960025909940572258743689419421486146686517267611084459945144149299075534798400612972360553838107136920661123391150823422676359344690740510955918728633977237952353841652119584624631052866938063575570322863233504986774708895612050925037031297471371640598750134319361058611530053991837290470256198793120344601319485701344761344746539033587682664033099657267305854256747450314166291498349841350656", string0);
      assertEquals((byte)94, bigFraction0.byteValue());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(0.0);
      String string0 = bigFraction0.toString();
      assertEquals("0", string0);
  }
}