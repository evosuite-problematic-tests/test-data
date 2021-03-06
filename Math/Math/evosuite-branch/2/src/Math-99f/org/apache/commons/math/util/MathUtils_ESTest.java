/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 21:52:33 GMT 2019
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
      int int0 = MathUtils.hash((double) 1L);
      assertEquals(1072693248, int0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      int int0 = MathUtils.hash(doubleArray0);
      assertEquals(887503681, int0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      float float0 = MathUtils.round((float) 0, 540307201, 0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      long long0 = MathUtils.addAndCheck((long) (byte) (-68), (long) (byte) (-1));
      assertEquals((-69L), long0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      double double0 = MathUtils.sinh(1L);
      assertEquals(1.1752011936438014, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      double double0 = MathUtils.normalizeAngle(0, (-886L));
      assertEquals((-885.9291283123216), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      double double0 = MathUtils.cosh(-0.0F);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      double double0 = MathUtils.log(1.1102230246251565E-16, (short)0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck(Integer.MIN_VALUE, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      int int0 = MathUtils.addAndCheck(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck(1093205697, 1093205697);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      long long0 = MathUtils.subAndCheck(2L, 0L);
      assertEquals(2L, long0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      long long0 = MathUtils.addAndCheck((-886L), 1L);
      assertEquals((-885L), long0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck((-9218868437227405313L), (-9218868437227405313L));
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
        MathUtils.subAndCheck(2432902008176640000L, (-9218868437227405313L));
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
        MathUtils.binomialCoefficient(17, 5711);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient((byte) (-1), (-255));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(3973, 3973);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(4072, 0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(16, 1);
      assertEquals(16L, long0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(5, 4);
      assertEquals(5L, long0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient(1249, 1036);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble((short)33, 3);
      assertEquals(5456.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(66, 4);
      assertEquals(720720L, long0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(2146224126, (-1));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientDouble((-113), (byte)97);
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
        MathUtils.binomialCoefficientDouble((-2189), (-2189));
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
      double double0 = MathUtils.binomialCoefficientDouble(1036, 1036);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(2101, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(63, 1);
      assertEquals(63.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(0, (-1));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(3941, 3405);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog((short)0, (-1));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientLog(9, 2965);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientLog((-881), (-2173));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog((byte)11, (byte)11);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(1, (short)0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(3621, 1);
      assertEquals(8.19450550976564, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(0, (-17));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(3975, 3963);
      assertEquals(79.4495260206312, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(782, 131);
      assertEquals(350.14425846876367, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = Double.NaN;
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((double) Float.NaN, 0.0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((double) 2391L, (double) 2391L, 1.0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      boolean boolean0 = MathUtils.equals(10.0, (double) 9, 1.157920892373162E77);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((-217.915074265), 0.0, (-4270.890810303));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((-643.4), 1.0, 1345.92269);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      boolean boolean0 = MathUtils.equals(2295.029869, (double) 0.0F, 1.0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((double[]) null, (double[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      boolean boolean0 = MathUtils.equals(doubleArray0, (double[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      boolean boolean0 = MathUtils.equals((double[]) null, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[8];
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (double) (-1);
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorial((short) (-1));
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
      // Undeclared exception!
      try { 
        MathUtils.factorial(484);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // factorial value is too large to fit in a long
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      double double0 = MathUtils.factorialDouble(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorialDouble((-3511));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for n!
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      double double0 = MathUtils.factorialDouble(106);
      assertEquals(1.1462805637348918E170, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorialLog((-1752));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n > 0 for n!
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      double double0 = MathUtils.factorialLog(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.gcd((short)0, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: gcd(0, -2,147,483,648) is 2^31
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      int int0 = MathUtils.gcd(3959, 0);
      assertEquals(3959, int0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.gcd(Integer.MIN_VALUE, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: gcd(-2,147,483,648, 0) is 2^31
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.gcd(Integer.MIN_VALUE, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: gcd(-2,147,483,648, -2,147,483,648) is 2^31
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte) (-1));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte)16);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      double double0 = MathUtils.indicator((-1.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      double double0 = MathUtils.indicator(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      double double0 = MathUtils.indicator((double) (short)1);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      float float0 = MathUtils.indicator(Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      float float0 = MathUtils.round((float) (-1), (-1));
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      int int0 = MathUtils.indicator((int) (byte) (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      int int0 = MathUtils.indicator(0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      long long0 = MathUtils.indicator((-2022L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      long long0 = MathUtils.indicator(0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      short short0 = MathUtils.indicator((short) (-583));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      short short0 = MathUtils.indicator((short)0);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      int int0 = MathUtils.lcm(0, (-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      int int0 = MathUtils.lcm(3963, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      int int0 = MathUtils.lcm((-1), (short)33);
      assertEquals(33, int0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.lcm(2, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: lcm is 2^31
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.lcm(20, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-765), (-26024883));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((-3220L), (-1813L));
      assertEquals(5837860L, long0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck(0L, (-9218868437227405313L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-9223372036854775808L), (-972L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck(2147483647L, (-633L));
      assertEquals((-1359357148551L), long0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-5765L), 9223372036854775807L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((long) 3959, (long) 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      float float0 = MathUtils.round(665.0F, 2633);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      double double0 = MathUtils.nextAfter(0.0, 1178.3);
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      float float0 = MathUtils.round((float) 0L, 1, 1);
      assertEquals((-0.1F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      double double0 = MathUtils.nextAfter((-2160), 1.1102230246251565E-16);
      assertEquals((-2159.9999999999995), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      double double0 = MathUtils.nextAfter(0.9999999999999999, 423);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      double double0 = MathUtils.nextAfter(1.157920892373162E77, 0.0);
      assertEquals(1.1579208923731618E77, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      double double0 = MathUtils.scalb(0, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      double double0 = MathUtils.scalb(3.141592653589793, 267);
      assertEquals(7.450041894743374E80, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      double double0 = MathUtils.scalb(Double.NaN, 268);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      double double0 = MathUtils.scalb(Double.NEGATIVE_INFINITY, (-428));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      double double0 = MathUtils.round(Double.NaN, (-3388), (-1));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      double double0 = MathUtils.round(Double.NEGATIVE_INFINITY, (-3010));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.round(0.0F, 494, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid rounding method.
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      float float0 = MathUtils.round(1801.663F, 0);
      assertEquals(1802.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte) (-116));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)1);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      double double0 = MathUtils.sign((double) 665.0F);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      double double0 = MathUtils.sign(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      double double0 = MathUtils.sign(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      double double0 = MathUtils.sign((double) (-1.0F));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      float float0 = MathUtils.sign((-597.9267F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      float float0 = MathUtils.sign(Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      float float0 = MathUtils.sign(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      float float0 = MathUtils.sign(1.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      int int0 = MathUtils.sign(1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      int int0 = MathUtils.sign(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      int int0 = MathUtils.sign((int) (byte) (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      long long0 = MathUtils.sign((-1813L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      long long0 = MathUtils.sign(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      long long0 = MathUtils.sign((long) (byte)11);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      short short0 = MathUtils.sign((short) (byte)11);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      short short0 = MathUtils.sign((short)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      short short0 = MathUtils.sign((short) (-958));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck((-2147483647), 12);
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
      int int0 = MathUtils.subAndCheck(52, (int) (short)33);
      assertEquals(19, int0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck(4, (-2147483645));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck(324L, (-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      long long0 = MathUtils.subAndCheck((-844L), (-9223372036854775808L));
      assertEquals(9223372036854774964L, long0);
  }
}
