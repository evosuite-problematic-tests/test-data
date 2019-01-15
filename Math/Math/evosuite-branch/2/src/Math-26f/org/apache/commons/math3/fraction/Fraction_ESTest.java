/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 19:54:26 GMT 2019
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
      // Undeclared exception!
      try { 
        fraction0.TWO_QUARTERS.add((Fraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fraction
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
      Fraction fraction1 = fraction0.multiply(1);
      assertTrue(fraction1.equals((Object)fraction0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_THIRD;
      int int0 = fraction0.getDenominator();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(100, (-3117));
      Fraction fraction1 = fraction0.divide((-3117));
      assertEquals(9715689, fraction1.getDenominator());
      assertEquals(1.0292631E-5F, fraction1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Fraction fraction0 = new Fraction(1922);
      assertEquals(1922, fraction0.getNumerator());
      assertEquals(1922.0F, fraction0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(100, (-3117));
      fraction0.getField();
      assertEquals(3117, fraction0.getDenominator());
      assertEquals((-3.2082130253448833), fraction0.percentageValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_FIFTHS;
      long long0 = fraction0.longValue();
      assertEquals(0.6, fraction0.doubleValue(), 0.01);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(100, (-3117));
      Fraction fraction1 = fraction0.TWO_FIFTHS.subtract(0);
      assertEquals(2, fraction1.getNumerator());
      assertEquals((-3.2082130253448833), fraction0.percentageValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Fraction fraction0 = new Fraction(4452, 4452);
      int int0 = fraction0.intValue();
      assertEquals(1, fraction0.getNumerator());
      assertEquals(100.0, fraction0.percentageValue(), 0.01);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_THIRDS;
      fraction0.hashCode();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(100, (-3117));
      int int0 = fraction0.getNumerator();
      assertEquals((-3.2082130253448833), fraction0.percentageValue(), 0.01);
      assertEquals((-100), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_FIFTHS;
      float float0 = fraction0.floatValue();
      assertEquals(0.6F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO;
      double double0 = fraction0.percentageValue();
      assertEquals(200.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Fraction fraction0 = new Fraction(0.7214844226837158, (-1193));
      // Undeclared exception!
      try { 
        fraction0.reciprocal();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero denominator in fraction 1/0
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Fraction fraction0 = null;
      try {
        fraction0 = new Fraction(1.7976931348623157E308, 1.7976931348623157E308, Integer.MIN_VALUE);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Overflow trying to convert 179,769,313,486,231,570,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000 to fraction (9,223,372,036,854,775,807/1)
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Fraction fraction0 = null;
      try {
        fraction0 = new Fraction(5350.91389385764, (-3.141592653589793), 97);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Overflow trying to convert 5,350.914 to fraction (8,696,075,171/1,625,157)
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Fraction fraction0 = null;
      try {
        fraction0 = new Fraction(0.0, 0.0, 2728);
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
        fraction0 = new Fraction(3409.4959550329204, (-526.30505620955), 2);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Unable to convert 3,409.496 to fraction after 2 iterations
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Fraction fraction0 = new Fraction(2732.029);
      Fraction fraction1 = Fraction.ONE_FIFTH;
      Fraction fraction2 = fraction0.ONE_HALF.add(fraction1);
      assertEquals(70.0, fraction2.percentageValue(), 0.01);
      assertEquals(273202.9, fraction0.percentageValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Fraction fraction0 = null;
      try {
        fraction0 = new Fraction(Integer.MIN_VALUE, (-2782));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow in fraction -2,147,483,648/-2,782, cannot negate
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Fraction fraction0 = new Fraction(0.0);
      // Undeclared exception!
      try { 
        fraction0.TWO_THIRDS.divide(Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow in fraction 2/-2,147,483,648, cannot negate
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE;
      Fraction fraction1 = fraction0.negate();
      Fraction fraction2 = fraction1.abs();
      assertNotSame(fraction2, fraction0);
      assertEquals((-1L), fraction1.longValue());
      assertTrue(fraction2.equals((Object)fraction0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_FIFTHS;
      Fraction fraction1 = fraction0.ZERO.abs();
      assertEquals(0, fraction1.getNumerator());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_FIFTHS;
      int int0 = fraction0.compareTo(fraction0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_FIFTHS;
      Fraction fraction1 = fraction0.add((-762));
      int int0 = fraction1.compareTo(fraction0);
      assertEquals((-1), int0);
      assertEquals(5, fraction1.getDenominator());
      assertEquals((-3807), fraction1.getNumerator());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_FIFTHS;
      Fraction fraction1 = fraction0.add((-762));
      int int0 = fraction0.compareTo(fraction1);
      assertEquals((-761.4), fraction1.doubleValue(), 0.01);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Fraction fraction0 = new Fraction(4452, 4452);
      Fraction fraction1 = Fraction.ONE_THIRD;
      boolean boolean0 = fraction0.equals(fraction1);
      assertFalse(boolean0);
      assertEquals(1, fraction0.getDenominator());
      assertFalse(fraction1.equals((Object)fraction0));
      assertEquals(1.0F, fraction0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO;
      boolean boolean0 = fraction0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO;
      Fraction fraction1 = Fraction.ONE_QUARTER;
      boolean boolean0 = fraction1.equals(fraction0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_FIFTHS;
      Fraction fraction1 = fraction0.ONE.multiply(fraction0);
      boolean boolean0 = fraction0.equals(fraction1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(Integer.MIN_VALUE, 4221);
      // Undeclared exception!
      try { 
        fraction0.negate();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow in fraction -2,147,483,648/4,221, cannot negate
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO;
      Fraction fraction1 = fraction0.ZERO.subtract(fraction0);
      assertEquals((byte) (-2), fraction1.byteValue());
      assertEquals((-2), fraction1.getNumerator());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      Fraction fraction1 = fraction0.add(fraction0);
      assertSame(fraction1, fraction0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_FIFTHS;
      Fraction fraction1 = fraction0.TWO_FIFTHS.add(fraction0);
      assertEquals(1.0F, fraction1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(Integer.MAX_VALUE, 50);
      // Undeclared exception!
      try { 
        fraction0.ONE_QUARTER.subtract(fraction0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow, numerator too large after multiply: -4,294,967,269
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_QUARTERS;
      // Undeclared exception!
      try { 
        fraction0.ONE_QUARTER.multiply((Fraction) null);
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
      Fraction fraction0 = Fraction.getReducedFraction(4, 4);
      Fraction fraction1 = fraction0.ZERO.divide(fraction0);
      assertEquals(1, fraction0.getDenominator());
      assertEquals(1.0F, fraction0.floatValue(), 0.01F);
      assertEquals(0, fraction1.getNumerator());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_HALF;
      Fraction fraction1 = Fraction.ZERO;
      Fraction fraction2 = fraction0.THREE_FIFTHS.multiply(fraction1);
      assertEquals(0.0, fraction2.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO;
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
  public void test39()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      // Undeclared exception!
      try { 
        fraction0.divide(fraction0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // the fraction to divide by must not be zero: 0/1
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction(0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero denominator in fraction 0/0
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(0, (-5647));
      assertEquals(0.0, fraction0.percentageValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(Integer.MIN_VALUE, Integer.MIN_VALUE);
      assertEquals(1.0, fraction0.doubleValue(), 0.01);
      assertEquals(1, fraction0.getDenominator());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction(4345, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow in fraction 4,345/-2,147,483,648, cannot negate
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction(Integer.MIN_VALUE, (-432));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow in fraction -2,147,483,648/-432, cannot negate
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(4, 4);
      String string0 = fraction0.TWO_FIFTHS.toString();
      assertEquals("2 / 5", string0);
      assertEquals(1.0F, fraction0.floatValue(), 0.01F);
      assertEquals(1, fraction0.getNumerator());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE;
      String string0 = fraction0.toString();
      assertEquals("1", string0);
  }
}
