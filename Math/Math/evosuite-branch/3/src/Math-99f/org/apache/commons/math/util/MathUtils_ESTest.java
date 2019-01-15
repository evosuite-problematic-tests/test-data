/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 17:24:25 GMT 2019
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
      int int0 = MathUtils.hash(1.0);
      assertEquals(1072693248, int0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      int int0 = MathUtils.hash(doubleArray0);
      assertEquals(923521, int0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      float float0 = MathUtils.round((float) (-1L), 0, 0);
      assertEquals((-2.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      long long0 = MathUtils.addAndCheck((-1550L), (-1550L));
      assertEquals((-3100L), long0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      double double0 = MathUtils.sinh((byte)16);
      assertEquals(4443055.26025388, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      double double0 = MathUtils.normalizeAngle((-1), (-4067.0116936842));
      assertEquals((-4066.2208937451924), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      float float0 = MathUtils.round(1.0F, 1520);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      double double0 = MathUtils.cosh((-768.041612031));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      double double0 = MathUtils.log(0.0, 5);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck((-2147483646), (-2147483646));
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
      int int0 = MathUtils.addAndCheck((-3604), 0);
      assertEquals((-3604), int0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck(23, 2147483646);
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
      long long0 = MathUtils.subAndCheck(6150400L, (long) 63);
      assertEquals(6150337L, long0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      long long0 = MathUtils.subAndCheck(604L, 0L);
      assertEquals(604L, long0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck((-9223372036854775808L), 5040L);
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
        MathUtils.addAndCheck(3138L, 9223372036854775807L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient((-2571), (-1634));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient((-640), (-640));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(0, 0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(1, 0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(4, (short)1);
      assertEquals(4L, long0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(0, (-1));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(66, 51);
      assertEquals(268367258592576L, long0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(1, (-216));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(15, 12);
      assertEquals(455.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient(2347, 1891);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(3643, 5);
      assertEquals(5332390976330418L, long0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientDouble(0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientDouble((-1), (-241));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble((byte)1, (byte)1);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble((short)66, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(495, 1);
      assertEquals(495.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(0, (short) (-1));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(67, 12);
      assertEquals(5.996962277488E12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientLog((-978249861), 0);
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
        MathUtils.binomialCoefficientLog((-4050), (-4050));
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
      double double0 = MathUtils.binomialCoefficientLog((byte)1, (short)1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(1072693248, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(3002, 1);
      assertEquals(8.007034012193408, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog((short)0, (-1));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(267, (-1921));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(1360, 836);
      assertEquals(902.7646318177871, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      boolean boolean0 = MathUtils.equals(Double.NaN, (double) 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[4] = Double.NaN;
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((double) 797449, (double) 797449, 3186.329912331473);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((double) (-2480), (double) 2480, (-2480.0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      boolean boolean0 = MathUtils.equals(278.3704, 0.0, 0.0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((-1.0), 384.0, (double) 956);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      boolean boolean0 = MathUtils.equals(1.1102230246251565E-16, 4.9E-324, 2046.0288846);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((double[]) null, (double[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      boolean boolean0 = MathUtils.equals(doubleArray0, (double[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      boolean boolean0 = MathUtils.equals((double[]) null, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[9];
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1.0);
      double[] doubleArray1 = new double[2];
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      double double0 = MathUtils.factorialLog(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorial((-3105));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for n!
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorial(1832);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // factorial value is too large to fit in a long
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      double double0 = MathUtils.factorialDouble(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorialDouble((byte) (-59));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for n!
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      double double0 = MathUtils.factorialDouble(267);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorialLog((-592));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n > 0 for n!
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      int int0 = MathUtils.gcd(2, 0);
      assertEquals(2, int0);
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
        MathUtils.gcd(0, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: gcd(0, -2,147,483,648) is 2^31
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.lcm(Integer.MIN_VALUE, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: gcd(-2,147,483,648, -2,147,483,648) is 2^31
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte) (-70));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte)0);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      double double0 = MathUtils.indicator(0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      double double0 = MathUtils.indicator(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      double double0 = MathUtils.indicator((-4562.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      int int0 = MathUtils.indicator((-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      int int0 = MathUtils.indicator(1320);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      long long0 = MathUtils.indicator((-2601L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      long long0 = MathUtils.indicator(3098L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      short short0 = MathUtils.indicator((short) (-3448));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      short short0 = MathUtils.indicator((short)0);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      int int0 = MathUtils.lcm(0, (-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      int int0 = MathUtils.lcm(4368, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      int int0 = MathUtils.lcm(5, (byte) (-1));
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.lcm(Integer.MIN_VALUE, 1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: lcm is 2^31
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck(1072694209, (-2196));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck(2990, 874479493);
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
      long long0 = MathUtils.mulAndCheck((-1L), (-1L));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck(355687428096000L, (-5678L));
      assertEquals((-2019593216729088000L), long0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-3579139390L), (-3579139390L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck(0L, (-1L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((long) (-1074790400), 4503599627370496L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck(0L, (long) (byte)0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      float float0 = MathUtils.round(0.0F, 1030);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      double double0 = MathUtils.nextAfter(0.0, (-1.0));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      double double0 = MathUtils.nextAfter((-0.9999999999999999), (-0.9999999999999999));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      double double0 = MathUtils.nextAfter((-1.0), 4273);
      assertEquals((-0.9999999999999999), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      double double0 = MathUtils.scalb(0.0, (-130));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      double double0 = MathUtils.scalb((-1.0), (-4562));
      assertEquals((-5.248340709036788E-141), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      double double0 = MathUtils.scalb(Float.NaN, 6);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      double double0 = MathUtils.scalb(Double.POSITIVE_INFINITY, 7);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      double double0 = MathUtils.round(Double.NaN, (int) (short) (-3448));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      double double0 = MathUtils.round(Double.POSITIVE_INFINITY, (-33), 0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      float float0 = MathUtils.round((float) 1320, 1, 1);
      assertEquals(1319.9F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      float float0 = MathUtils.round((-1460.94F), 0, 2);
      assertEquals((-1460.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      float float0 = MathUtils.round((-1460.94F), 0, 3);
      assertEquals((-1461.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      float float0 = MathUtils.round((-1460.1143F), 0, 5);
      assertEquals((-1460.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      float float0 = MathUtils.round(1822.0623F, (-2981), 6);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      float float0 = MathUtils.round(0.0F, 0, 7);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.round(3620.641F, (int) (short)1, (-1145));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid rounding method.
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      float float0 = MathUtils.round(1822.0623F, (-2981), 2);
      assertEquals(Float.POSITIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      float float0 = MathUtils.round(Float.NaN, (-3), 3);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      float float0 = MathUtils.round((-1460.6787F), 0, 5);
      assertEquals((-1461.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      float float0 = MathUtils.round(2.4748F, 1, 6);
      assertEquals(2.5F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      float float0 = MathUtils.round(1.0F, 2294, 6);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      float float0 = MathUtils.round(0.0F, 2294, 6);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      float float0 = MathUtils.round(5491.073F, 1);
      assertEquals(5491.1F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.round(0.391084F, 0, 7);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Inexact result from rounding
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)36);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte) (-64));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      double double0 = MathUtils.sign(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      double double0 = MathUtils.sign(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      double double0 = MathUtils.sign((double) (byte)36);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      double double0 = MathUtils.sign((-1830.13559));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      float float0 = MathUtils.sign(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      float float0 = MathUtils.sign(Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      float float0 = MathUtils.sign(1.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      float float0 = MathUtils.sign((-33.5F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      int int0 = MathUtils.sign(1520);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      int int0 = MathUtils.sign(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      int int0 = MathUtils.sign((-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      long long0 = MathUtils.sign(44L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      long long0 = MathUtils.sign((long) (byte)0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      long long0 = MathUtils.sign((-2119L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      short short0 = MathUtils.sign((short) (byte) (-70));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      short short0 = MathUtils.sign((short)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      short short0 = MathUtils.sign((short) (byte)36);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck((-1074790400), 2147483646);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      int int0 = MathUtils.subAndCheck((-9), (int) (byte) (-1));
      assertEquals((-8), int0);
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck(3, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      long long0 = MathUtils.subAndCheck((-430L), (-9223372036854775808L));
      assertEquals(9223372036854775378L, long0);
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck(974L, (-9223372036854775807L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }
}
