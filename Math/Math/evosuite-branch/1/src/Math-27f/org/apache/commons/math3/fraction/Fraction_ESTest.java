/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 14:53:57 GMT 2018
 */

package org.apache.commons.math3.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.fraction.Fraction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Fraction_ESTest extends Fraction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Fraction fraction0 = Fraction.FOUR_FIFTHS;
      Fraction fraction1 = fraction0.TWO_QUARTERS.multiply(1312);
      assertEquals(65600.0, fraction1.percentageValue(), 0.01);
      assertEquals(656, fraction1.getNumerator());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Fraction fraction0 = new Fraction(5, 31);
      int int0 = fraction0.getDenominator();
      assertEquals(31, int0);
      assertEquals(0.16129032F, fraction0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Fraction fraction0 = new Fraction(5, 31);
      Fraction fraction1 = fraction0.ZERO.divide((-2706));
      assertEquals(1, fraction1.getDenominator());
      assertEquals(0.16129032F, fraction0.floatValue(), 0.01F);
      assertEquals(0.0F, fraction1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Fraction fraction0 = new Fraction(143);
      assertEquals(143, fraction0.getNumerator());
      assertEquals(143.0, fraction0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Fraction fraction0 = new Fraction(5, 31);
      fraction0.TWO_FIFTHS.getField();
      assertEquals(16.129032258064516, fraction0.percentageValue(), 0.01);
      assertEquals(31, fraction0.getDenominator());
      assertEquals(0.16129032F, fraction0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE;
      long long0 = fraction0.longValue();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Fraction fraction0 = new Fraction(2325.357092);
      Fraction fraction1 = fraction0.ONE_THIRD.subtract(1497);
      assertEquals((-149666.6666666667), fraction1.percentageValue(), 0.01);
      assertEquals(3262476, fraction0.getNumerator());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_THIRDS;
      int int0 = fraction0.intValue();
      assertEquals(66.66666666666666, fraction0.percentageValue(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Fraction fraction0 = new Fraction(5, 31);
      fraction0.hashCode();
      assertEquals(0.16129032258064516, fraction0.doubleValue(), 0.01);
      assertEquals(5, fraction0.getNumerator());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Fraction fraction0 = new Fraction(2325.357092);
      int int0 = fraction0.getNumerator();
      assertEquals(3262476, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_QUARTER;
      float float0 = fraction0.floatValue();
      assertEquals(0.25F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE;
      double double0 = fraction0.percentageValue();
      assertEquals(100.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Fraction fraction0 = new Fraction((-2704.52175432), 125);
      Fraction fraction1 = fraction0.ZERO.add(fraction0);
      assertEquals((-62204), fraction1.getNumerator());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Fraction fraction0 = null;
      try {
        fraction0 = new Fraction(8.0E298);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Overflow trying to convert 80,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000 to fraction (9,223,372,036,854,775,807/1)
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Fraction fraction0 = new Fraction(0.0);
      assertEquals(0.0, fraction0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Fraction fraction0 = null;
      try {
        fraction0 = new Fraction(4188.2183246, (-1893.5391199847977), 53);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Overflow trying to convert 4,188.218 to fraction (2,393,039,057/571,374)
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Fraction fraction0 = null;
      try {
        fraction0 = new Fraction(0.0, 251);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Fraction fraction0 = null;
      try {
        fraction0 = new Fraction(1961.562697624219, 0.0, (-2345));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Unable to convert 1,961.563 to fraction after -2,345 iterations
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(0, 3);
      // Undeclared exception!
      try { 
        fraction0.TWO_FIFTHS.divide(0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero denominator in fraction 2/0
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Fraction fraction0 = null;
      try {
        fraction0 = new Fraction(Integer.MIN_VALUE, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow in fraction -2,147,483,648/-2,147,483,648, cannot negate
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Fraction fraction0 = null;
      try {
        fraction0 = new Fraction(5, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow in fraction 5/-2,147,483,648, cannot negate
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Fraction fraction0 = Fraction.MINUS_ONE;
      Fraction fraction1 = fraction0.abs();
      assertEquals(1, fraction1.getDenominator());
      assertEquals(1.0F, fraction1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Fraction fraction0 = new Fraction(2325.357092);
      int int0 = fraction0.compareTo(fraction0);
      assertEquals(0, int0);
      assertEquals(1403, fraction0.getDenominator());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      Fraction fraction1 = Fraction.THREE_FIFTHS;
      int int0 = fraction0.compareTo(fraction1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Fraction fraction0 = new Fraction(2325.357092);
      Fraction fraction1 = Fraction.ONE_THIRD;
      int int0 = fraction0.compareTo(fraction1);
      assertEquals(1, int0);
      assertEquals(3262476, fraction0.getNumerator());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Fraction fraction0 = new Fraction(2325.357092);
      Fraction fraction1 = Fraction.ONE_THIRD;
      boolean boolean0 = fraction0.equals(fraction1);
      assertFalse(boolean0);
      assertEquals(232535.70919458303, fraction0.percentageValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Fraction fraction0 = Fraction.FOUR_FIFTHS;
      boolean boolean0 = fraction0.equals("+[4$2ZTX}m#& xK");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Fraction fraction0 = new Fraction(2325.357092);
      Fraction fraction1 = new Fraction(2325.357092);
      boolean boolean0 = fraction0.equals(fraction1);
      assertTrue(boolean0);
      assertEquals(232535.70919458303, fraction1.percentageValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE;
      Fraction fraction1 = fraction0.ONE_THIRD.divide(fraction0);
      boolean boolean0 = fraction0.equals(fraction1);
      assertFalse(boolean0);
      assertEquals(0.3333333333333333, fraction1.doubleValue(), 0.01);
      assertFalse(fraction1.equals((Object)fraction0));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Fraction fraction0 = new Fraction(628, 628);
      Fraction fraction1 = fraction0.ZERO.abs();
      Fraction fraction2 = fraction0.add(Integer.MAX_VALUE);
      // Undeclared exception!
      try { 
        fraction1.subtract(fraction2);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow in fraction -2,147,483,648/1, cannot negate
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_QUARTERS;
      // Undeclared exception!
      try { 
        fraction0.TWO.subtract((Fraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fraction
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      Fraction fraction1 = fraction0.TWO_QUARTERS.subtract(fraction0);
      assertEquals(50.0, fraction1.percentageValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Fraction fraction0 = new Fraction(2325.357092);
      Fraction fraction1 = fraction0.TWO.add(fraction0);
      assertEquals(1403, fraction1.getDenominator());
      assertEquals(2327.3570919458302, fraction1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Fraction fraction0 = Fraction.FOUR_FIFTHS;
      Fraction fraction1 = fraction0.subtract(fraction0);
      assertEquals(1, fraction1.getDenominator());
      assertEquals(0.0, fraction1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Fraction fraction0 = new Fraction(5, 31);
      Fraction fraction1 = Fraction.getReducedFraction((-2706), Integer.MIN_VALUE);
      Fraction fraction2 = Fraction.getReducedFraction(4, (-1376));
      Fraction fraction3 = fraction0.ONE_THIRD.subtract(fraction2);
      // Undeclared exception!
      try { 
        fraction3.add(fraction1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow, numerator too large after multiply: 46,573,726,153
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_FIFTHS;
      // Undeclared exception!
      try { 
        fraction0.ONE_FIFTH.multiply((Fraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fraction
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_THIRDS;
      Fraction fraction1 = Fraction.ZERO;
      Fraction fraction2 = fraction0.multiply(fraction1);
      assertEquals(0.0, fraction2.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_THIRDS;
      // Undeclared exception!
      try { 
        fraction0.divide((Fraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fraction
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      // Undeclared exception!
      try { 
        fraction0.TWO_QUARTERS.divide(fraction0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // the fraction to divide by must not be zero: 0/1
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction((-803), 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero denominator in fraction -803/0
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction(2593, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow in fraction 2,593/-2,147,483,648, cannot negate
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction(Integer.MIN_VALUE, (-176));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow in fraction -2,147,483,648/-176, cannot negate
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Fraction fraction0 = new Fraction(2593, 2566);
      String string0 = fraction0.toString();
      assertEquals("2593 / 2566", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE;
      String string0 = fraction0.toString();
      assertEquals("1", string0);
  }
}
