/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 12:24:25 GMT 2018
 */

package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.util.MathUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MathUtils_ESTest extends MathUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      int int0 = MathUtils.hash((-619.203354862128));
      assertEquals((-1207907532), int0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      int int0 = MathUtils.hash(doubleArray0);
      assertEquals(29791, int0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      int int0 = MathUtils.lcm(0, (-269));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      float float0 = MathUtils.round((float) 0, (-161));
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      long long0 = MathUtils.addAndCheck((-891L), (-714L));
      assertEquals((-1605L), long0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      double double0 = MathUtils.sinh((-1.0));
      assertEquals((-1.1752011936438014), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      double double0 = MathUtils.normalizeAngle(1.0, 1.1752011936438014);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      double double0 = MathUtils.cosh(0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      double double0 = MathUtils.log(0.0, 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck((-2147483645), (-1400));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      int int0 = MathUtils.addAndCheck(0, 21);
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck(1582, Integer.MAX_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      long long0 = MathUtils.addAndCheck(3835L, 1763L);
      assertEquals(5598L, long0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      long long0 = MathUtils.subAndCheck((long) 3481, 87178291200L);
      assertEquals((-87178287719L), long0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck((-9223372036854775808L), 2269L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck(9223372036854775807L, (long) (-1562));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(52, 0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient((-130), 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient((-1), (-1110));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(2824, 2824);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(0, (-1));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(21, 1);
      assertEquals(21L, long0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient(1902, 1817);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(13, 3);
      assertEquals(286L, long0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(66, 48);
      assertEquals(6.8489560786647E15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(908, (-4704));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientDouble((-719), 630);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientDouble((-1576), (-1576));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(1655, 1655);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(1294, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(499, 1);
      assertEquals(499.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(0, (-1));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      // Undeclared exception!
      MathUtils.binomialCoefficientDouble(2147482393, 2146266253);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(67, (-591));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientLog(1, 10);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientLog((-2179), (-2179));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(2405, 2405);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(1251, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(1073, 1);
      assertEquals(6.9782137426306985, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(4, 3);
      assertEquals(1.3862943611198906, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(0, (-1207907532));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(1843, 1030);
      assertEquals(1260.686951921937, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      boolean boolean0 = MathUtils.equals(Double.NaN, (-1890.0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      boolean boolean0 = MathUtils.equals(Double.NaN, Double.NaN);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((double[]) null, (double[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      boolean boolean0 = MathUtils.equals(doubleArray0, (double[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      boolean boolean0 = MathUtils.equals((double[]) null, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[2];
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 630;
      double[] doubleArray1 = new double[1];
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      double double0 = MathUtils.factorialDouble(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorial((-66));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for n!
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorial(31);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // factorial value is too large to fit in a long
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorialDouble((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for n!
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      double double0 = MathUtils.factorialDouble(21);
      assertEquals(5.109094217170942E19, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorialLog((-2694));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n > 0 for n!
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      double double0 = MathUtils.factorialLog(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      int int0 = MathUtils.gcd(48, 0);
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte) (-1));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte)0);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      double double0 = MathUtils.indicator((-8.7178287719E10));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      double double0 = MathUtils.indicator((double) Float.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      double double0 = MathUtils.indicator(3481.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.round(Float.NaN, (-5761), (-1952));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid rounding method.
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      float float0 = MathUtils.round((-1.0F), 2518);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      int int0 = MathUtils.indicator((-461));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      int int0 = MathUtils.indicator(0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      long long0 = MathUtils.indicator((-2825L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      long long0 = MathUtils.indicator(0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      short short0 = MathUtils.indicator((short) (-2988));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      short short0 = MathUtils.indicator((short)61);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-2147483646), 2506);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.lcm((-1666), (-1074790400));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck(0L, (long) (-551));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((long) (-743), (long) (-743));
      assertEquals(552049L, long0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-7122295009154267L), (-7122295009154267L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-9223372036854775808L), 422L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((-635L), 5484L);
      assertEquals((-3482340L), long0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((long) 0, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      float float0 = MathUtils.round(0.0F, 1397, 1);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      float float0 = MathUtils.round(1125.9F, 0);
      assertEquals(1126.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      double double0 = MathUtils.nextAfter(0.9999999999999999, 1L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      double double0 = MathUtils.nextAfter(1L, 0);
      assertEquals(0.9999999999999999, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      double double0 = MathUtils.scalb(0.0, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      double double0 = MathUtils.scalb((-1.0), 0);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      double double0 = MathUtils.scalb(Double.NaN, 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      double double0 = MathUtils.scalb(Double.POSITIVE_INFINITY, (-3613));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      double double0 = MathUtils.round(Double.NaN, 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      double double0 = MathUtils.round(Double.NEGATIVE_INFINITY, 15);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      float float0 = MathUtils.round(542.0F, 0, 0);
      assertEquals(543.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      float float0 = MathUtils.round((float) (byte) (-53), 2, 2);
      assertEquals((-52.99F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      float float0 = MathUtils.round((float) (byte) (-35), 3, 3);
      assertEquals((-35.001F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      float float0 = MathUtils.round((-805.4393F), (-1581), 5);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      float float0 = MathUtils.round((float) (byte) (-35), 6, 6);
      assertEquals((-35.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      float float0 = MathUtils.round((-805.43933F), (-1581), 7);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      float float0 = MathUtils.round((float) (byte)2, (int) (byte)2, (int) (byte)2);
      assertEquals(2.01F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      float float0 = MathUtils.round((float) (byte)11, 3, 3);
      assertEquals(10.999F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      float float0 = MathUtils.round((-805.4393F), 1602, 5);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      float float0 = MathUtils.round((float) (byte)80, (int) (byte)80, 6);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.round((-805.43933F), 1, 7);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Inexact result from rounding
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte) (-14));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)42);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      double double0 = MathUtils.sign((double) 0L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      double double0 = MathUtils.sign(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      double double0 = MathUtils.sign((-619.741307998));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      double double0 = MathUtils.sign(1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      float float0 = MathUtils.sign((float) 0L);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      float float0 = MathUtils.sign(Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      float float0 = MathUtils.sign((float) 331);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      float float0 = MathUtils.sign((float) (byte) (-14));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      int int0 = MathUtils.sign((int) (byte) (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      int int0 = MathUtils.sign(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      int int0 = MathUtils.sign(2518);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      long long0 = MathUtils.sign((-2271L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      long long0 = MathUtils.sign((long) 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      long long0 = MathUtils.sign((long) 1251);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      short short0 = MathUtils.sign((short)4);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      short short0 = MathUtils.sign((short)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      short short0 = MathUtils.sign((short) (-786));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck((-2147481051), 2876);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      int int0 = MathUtils.subAndCheck(52, 1401);
      assertEquals((-1349), int0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck(2836, (-2147481478));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck(790L, (-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      long long0 = MathUtils.subAndCheck((long) (-1581), (-9223372036854775808L));
      assertEquals(9223372036854774227L, long0);
  }
}
