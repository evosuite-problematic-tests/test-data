/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 17:15:48 GMT 2019
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
      int int0 = MathUtils.hash(0.0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      int int0 = MathUtils.hash((double[]) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      int int0 = MathUtils.lcm(2244, 766);
      assertEquals(859452, int0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      float float0 = MathUtils.round((-262.17F), 1);
      assertEquals((-262.2F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      long long0 = MathUtils.addAndCheck((-827L), (-2878L));
      assertEquals((-3705L), long0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      double double0 = MathUtils.sinh(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      double double0 = MathUtils.normalizeAngle(2.0, 1);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(1833, (-2609));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      double double0 = MathUtils.cosh(0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      double double0 = MathUtils.round((-574.2323225), 0);
      assertEquals((-574.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      double double0 = MathUtils.log((-2179.446339878), (short) (-1));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck((-2144306897), (-2144306897));
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
      int int0 = MathUtils.addAndCheck(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck(1980, 2147483589);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck(9223372036854775807L, (long) (short) (-1));
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
      long long0 = MathUtils.subAndCheck((-5033L), (-1037L));
      assertEquals((-3996L), long0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck((-688L), 9223372036854775788L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      long long0 = MathUtils.subAndCheck(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient((-2146463949), 6668);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient((-2396), (-2396));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(6668, 6668);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(2733, 0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(2313, 1);
      assertEquals(2313L, long0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(0, (-1));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient(2733, 2020);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // result too large to represent in a long integer
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientLog((byte)0, 3641);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientLog((-3), (-3));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(0, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(1, (short)0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(3561, (short)1);
      assertEquals(8.177796683277778, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble((byte)0, (-1));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = Double.NaN;
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      boolean boolean0 = MathUtils.equals(Double.NaN, (-5036.0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      boolean boolean0 = MathUtils.equals((double[]) null, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      boolean boolean0 = MathUtils.equals(doubleArray0, (double[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((double[]) null, (double[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[8];
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 494;
      double[] doubleArray1 = new double[3];
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      long long0 = MathUtils.factorial((byte)0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorial(286);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // result too large to represent in a long integer
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorial((-1067));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for n!
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorialLog((byte) (-35));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n > 0 for n!
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      int int0 = MathUtils.gcd((byte)0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      int int0 = MathUtils.gcd(2091, 0);
      assertEquals(2091, int0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      int int0 = MathUtils.gcd((-3361), (-1386));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.gcd(Integer.MIN_VALUE, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: gcd is 2^31
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte) (-1));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte)45);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      double double0 = MathUtils.indicator(1306.902543893354);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      double double0 = MathUtils.indicator(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      double double0 = MathUtils.indicator((-1677.85973));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      int int0 = MathUtils.indicator((-1977));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      int int0 = MathUtils.indicator(0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      long long0 = MathUtils.indicator((-2081L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      long long0 = MathUtils.indicator(0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      short short0 = MathUtils.indicator((short) (-1));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      short short0 = MathUtils.indicator((short) (byte)1);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-2146086429), 1707);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck(2136527098, 37);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-3587L), 4503599627370495L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck(0L, (-1239L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck(1L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((-1109L), (-1109L));
      assertEquals(1229881L, long0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-1120L), (-9218868437227405313L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((long) 1, (long) (-2080));
      assertEquals((-2080L), long0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck(1L, 1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck(9218868437227405312L, 9218868437227405312L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      float float0 = MathUtils.round(0.0F, 581);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      float float0 = MathUtils.round(1.0F, 1555, 5);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      double double0 = MathUtils.nextAfter(0.0, (-1.0));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      double double0 = MathUtils.nextAfter(2.2204460492503128E-16, 2115.0982087);
      assertEquals(2.220446049250313E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      double double0 = MathUtils.nextAfter(1L, 0.0);
      assertEquals(0.9999999999999999, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      double double0 = MathUtils.scalb(0.0, (-378));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      double double0 = MathUtils.scalb(1.0, 669);
      assertEquals(2.4494416553286712E201, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      double double0 = MathUtils.scalb(Double.NaN, 31);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      double double0 = MathUtils.scalb(Double.POSITIVE_INFINITY, 3334);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      double double0 = MathUtils.round(Double.NaN, 659, 4);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      double double0 = MathUtils.round(Double.POSITIVE_INFINITY, 0, 0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      float float0 = MathUtils.round((float) (-1032), (-1032), 0);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      float float0 = MathUtils.round((-242.51245F), 1593, 1);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      float float0 = MathUtils.round((float) 1, 1, 2);
      assertEquals(1.1F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      float float0 = MathUtils.round((float) 9, 9, 3);
      assertEquals(8.999999F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      float float0 = MathUtils.round((-2.3695688F), 6, 6);
      assertEquals((-2.369569F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      float float0 = MathUtils.round((float) 7, 7, 7);
      assertEquals(7.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.round(0.0F, 971, (-4));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid rounding method.
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      float float0 = MathUtils.round((-241.81F), 3, 3);
      assertEquals((-241.811F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      float float0 = MathUtils.round(1.0F, 5, 5);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      float float0 = MathUtils.round((-0.60595846F), 6, 6);
      assertEquals((-0.605958F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      float float0 = MathUtils.round(Float.NaN, 6, 6);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.round(Float.NaN, 7, 7);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Inexact result from rounding
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)66);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte) (-4));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      double double0 = MathUtils.sign(4.9E-324);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      double double0 = MathUtils.sign(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      double double0 = MathUtils.sign(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      double double0 = MathUtils.sign((-2265.654758602401));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      float float0 = MathUtils.sign((-644.0F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      float float0 = MathUtils.sign(Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      float float0 = MathUtils.sign(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      float float0 = MathUtils.sign(92.55488F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      int int0 = MathUtils.sign((-1977));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      int int0 = MathUtils.sign(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      int int0 = MathUtils.sign(2);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      long long0 = MathUtils.sign((-2105L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      long long0 = MathUtils.sign(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      long long0 = MathUtils.sign(4503599627370496L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      short short0 = MathUtils.sign((short) (-326));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      short short0 = MathUtils.sign((short) (byte)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      short short0 = MathUtils.sign((short)3866);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck((-2147483647), 1669);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      int int0 = MathUtils.subAndCheck(18, 669);
      assertEquals((-651), int0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck(677, (-2147483646));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      long long0 = MathUtils.subAndCheck((-688L), (-9223372036854775808L));
      assertEquals(9223372036854775120L, long0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck(9223372036854774740L, (-9223372036854775807L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }
}
