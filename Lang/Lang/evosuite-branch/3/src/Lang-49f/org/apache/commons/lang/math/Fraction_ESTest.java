/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 13:50:24 GMT 2019
 */

package org.apache.commons.lang.math;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.math.Fraction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Fraction_ESTest extends Fraction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE;
      Fraction fraction1 = fraction0.THREE_QUARTERS.abs();
      boolean boolean0 = fraction0.equals(fraction1);
      assertEquals(3, fraction1.getNumerator());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(2501.5);
      String string0 = fraction0.toProperString();
      assertNotNull(string0);
      assertEquals("2501 1/2", string0);
      assertEquals(2501.5F, fraction0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE;
      float float0 = fraction0.floatValue();
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(2501.5);
      int int0 = fraction0.intValue();
      assertEquals(2501, int0);
      assertEquals(2501.5F, fraction0.floatValue(), 0.01F);
      assertEquals(2, fraction0.getDenominator());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(4418, (-1));
      double double0 = fraction0.doubleValue();
      assertEquals((-4418), fraction0.getNumerator());
      assertEquals((-4418.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(3774, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be zero
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(Integer.MIN_VALUE, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction((-484), Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(0, 0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be zero
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction((-1241), (-143), (-241));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be negative
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction((-781), (-1569), 1011);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The numerator must not be negative
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(Integer.MIN_VALUE, 0, 32);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Numerator too large to represent as an Integer.
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(395, 395, 2147483646);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Numerator too large to represent as an Integer.
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction(0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be zero
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(Integer.MIN_VALUE, Integer.MIN_VALUE);
      assertEquals(1.0F, fraction0.floatValue(), 0.01F);
      assertEquals(1, fraction0.getDenominator());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction(331, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction(Integer.MIN_VALUE, (-1455));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction(1.7976931348623157E308);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The value must not be greater than Integer.MAX_VALUE or NaN
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction("4/5");
      assertEquals(0.8F, fraction0.floatValue(), 0.01F);
      assertEquals(5, fraction0.getDenominator());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The string must not be null
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction("},oor\"vz9I.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction("2501 1/2");
      assertEquals(2501.5, fraction0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction("0 @#)FpnNwk|6_4(dA");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // The fraction could not be parsed as the format X Y/Z
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getFraction("kW&v$E");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"kW&v$E\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-1241), (-1241));
      Fraction fraction1 = fraction0.reduce();
      assertEquals(0, fraction1.getProperNumerator());
      assertEquals(1241, fraction0.getNumerator());
      assertEquals(1, fraction1.getNumerator());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(0, 0, 32);
      Fraction fraction1 = fraction0.reduce();
      assertEquals(32, fraction0.getDenominator());
      assertFalse(fraction1.equals((Object)fraction0));
      assertEquals(1, fraction1.getDenominator());
      assertEquals(0, fraction1.getNumerator());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction((-2515), (-2515));
      // Undeclared exception!
      try { 
        fraction0.ZERO.pow((-1));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Unable to invert zero.
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(Integer.MIN_VALUE, 10231);
      // Undeclared exception!
      try { 
        fraction0.invert();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: can't negate numerator
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(Integer.MIN_VALUE, 629);
      // Undeclared exception!
      try { 
        fraction0.negate();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: too large to negate
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_THIRD;
      Fraction fraction1 = Fraction.getFraction(472, 1655, 472);
      Fraction fraction2 = fraction0.TWO_FIFTHS.subtract(fraction1);
      fraction2.abs();
      assertEquals((-475.10635F), fraction2.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_QUARTERS;
      Fraction fraction1 = fraction0.ONE.pow(0);
      assertEquals((byte)1, fraction1.byteValue());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(2501.5);
      // Undeclared exception!
      try { 
        fraction0.ONE_HALF.pow((-433));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-1163), (-1163));
      assertEquals(1.0, fraction0.doubleValue(), 0.01);
      
      Fraction fraction1 = fraction0.pow(Integer.MIN_VALUE);
      assertEquals(1, fraction1.getDenominator());
      assertEquals(1.0, fraction1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(918.3542515);
      Fraction fraction1 = Fraction.getFraction((-2.147483646E9));
      // Undeclared exception!
      try { 
        fraction0.TWO_QUARTERS.subtract(fraction1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_THIRD;
      // Undeclared exception!
      try { 
        fraction0.THREE_FIFTHS.pow(472);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mulPos
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(501, 501, 501);
      Fraction fraction1 = Fraction.getFraction((-250.71207072721052));
      Fraction fraction2 = fraction0.negate();
      // Undeclared exception!
      try { 
        fraction2.add(fraction1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(4418, (-1));
      Fraction fraction1 = fraction0.TWO_FIFTHS.add(fraction0);
      assertEquals((-4417.6), fraction1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(2.147483647E9);
      // Undeclared exception!
      try { 
        fraction0.ONE.add(fraction0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(2.147483647E9);
      Fraction fraction1 = fraction0.negate();
      Fraction fraction2 = fraction1.ONE_QUARTER.invert();
      // Undeclared exception!
      try { 
        fraction1.subtract(fraction2);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(2.147483647E9);
      Fraction fraction1 = fraction0.negate();
      Fraction fraction2 = fraction1.invert();
      // Undeclared exception!
      try { 
        fraction2.ONE_HALF.subtract(fraction2);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(0, (-1399));
      // Undeclared exception!
      try { 
        fraction0.subtract((Fraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fraction must not be null
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      Fraction fraction1 = fraction0.subtract(fraction0);
      assertTrue(fraction1.equals((Object)fraction0));
      assertNotSame(fraction1, fraction0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_FIFTHS;
      Fraction fraction1 = Fraction.ZERO;
      Fraction fraction2 = fraction0.TWO_FIFTHS.subtract(fraction1);
      assertEquals(0.4F, fraction2.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_FIFTHS;
      Fraction fraction1 = fraction0.TWO_FIFTHS.subtract(fraction0);
      String string0 = fraction1.toProperString();
      assertEquals(5, fraction1.getDenominator());
      assertNotNull(string0);
      assertEquals("-1/5", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Fraction fraction0 = Fraction.FOUR_FIFTHS;
      Fraction fraction1 = Fraction.ONE_FIFTH;
      Fraction fraction2 = fraction0.add(fraction1);
      assertEquals(1, fraction2.getDenominator());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(2015, (-2394));
      Fraction fraction1 = fraction0.negate();
      Fraction fraction2 = fraction0.ONE_QUARTER.multiplyBy(fraction1);
      Fraction fraction3 = Fraction.getFraction(2401.6987120911);
      // Undeclared exception!
      try { 
        fraction3.add(fraction2);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: numerator too large after multiply
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_THIRDS;
      // Undeclared exception!
      try { 
        fraction0.TWO_FIFTHS.multiplyBy((Fraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fraction must not be null
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_FIFTHS;
      Fraction fraction1 = fraction0.ZERO.divideBy(fraction0);
      assertEquals(0.0, fraction1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
      Fraction fraction1 = Fraction.ZERO;
      Fraction fraction2 = fraction0.ONE_QUARTER.multiplyBy(fraction1);
      assertEquals(0.0, fraction2.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_FIFTHS;
      // Undeclared exception!
      try { 
        fraction0.TWO_FIFTHS.divideBy((Fraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fraction must not be null
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_QUARTERS;
      Fraction fraction1 = Fraction.getFraction(0.0);
      // Undeclared exception!
      try { 
        fraction0.ONE.divideBy(fraction1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The fraction to divide by must not be zero
         //
         verifyException("org.apache.commons.lang.math.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
      Object object0 = new Object();
      boolean boolean0 = fraction0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-1241), (-1241));
      Fraction fraction1 = Fraction.getFraction((-1241), (-1241));
      boolean boolean0 = fraction1.equals(fraction0);
      assertTrue(boolean0);
      assertEquals(1241, fraction1.getNumerator());
      assertEquals(1.0, fraction1.doubleValue(), 0.01);
      assertEquals(1241, fraction1.getDenominator());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE;
      fraction0.hashCode();
      fraction0.ONE.hashCode();
      assertEquals(1, fraction0.getDenominator());
      assertEquals(1, fraction0.getNumerator());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(918.3542515);
      Fraction fraction1 = Fraction.THREE_FIFTHS;
      int int0 = fraction0.compareTo(fraction1);
      assertEquals(1, int0);
      assertEquals(918.354251497006, fraction0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE;
      Fraction fraction1 = Fraction.getReducedFraction(198, 198);
      int int0 = fraction0.compareTo(fraction1);
      assertTrue(fraction1.equals((Object)fraction0));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(0, 0, 32);
      Fraction fraction1 = Fraction.getReducedFraction(0, 32);
      int int0 = fraction1.compareTo(fraction0);
      assertEquals(32, fraction0.getDenominator());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction(918.3542515);
      Fraction fraction1 = fraction0.invert();
      int int0 = fraction1.compareTo(fraction0);
      assertEquals((-1), int0);
      assertEquals(0.0010889044F, fraction1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      String string0 = fraction0.toProperString();
      assertEquals("0", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(629, 629);
      Fraction fraction1 = fraction0.FOUR_FIFTHS.reduce();
      assertEquals(5, fraction1.getDenominator());
      assertEquals(0L, fraction1.longValue());
      
      Fraction fraction2 = Fraction.getReducedFraction(629, (-1257));
      fraction2.ONE.toProperString();
      assertEquals((-0.5003977724741447), fraction2.doubleValue(), 0.01);
      
      fraction0.THREE_QUARTERS.toProperString();
      String string0 = fraction0.toString();
      assertNotNull(string0);
      assertEquals("1/1", string0);
      
      long long0 = fraction0.longValue();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Fraction fraction0 = Fraction.getFraction((-1.0));
      String string0 = fraction0.toProperString();
      assertNotNull(string0);
      assertEquals("-1", string0);
      assertEquals(1, fraction0.getDenominator());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_QUARTERS;
      Fraction fraction1 = fraction0.ONE_THIRD.invert();
      String string0 = fraction1.toProperString();
      assertEquals(3, fraction0.getProperNumerator());
      assertNotNull(string0);
      assertEquals("3", string0);
      assertEquals(1, fraction1.getDenominator());
      assertEquals(0, fraction0.getProperWhole());
  }
}
