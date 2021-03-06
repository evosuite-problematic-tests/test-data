/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 16:28:35 GMT 2019
 */

package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import org.apache.commons.math.util.MathUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MathUtils_ESTest extends MathUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      int int0 = MathUtils.hash((-50.6066517));
      assertEquals(50628012, int0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      int int0 = MathUtils.hash(doubleArray0);
      assertEquals(29791, int0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      float float0 = MathUtils.round((-1449.761F), 2, 2);
      assertEquals((-1449.76F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      double double0 = MathUtils.sinh((short) (-1));
      assertEquals((-1.1752011936438014), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      double double0 = MathUtils.normalizeAngle((-1.0), 0.0);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      double double0 = MathUtils.cosh((-50.6066517));
      assertEquals(4.755099240585215E21, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      double double0 = MathUtils.round((double) 1870L, (-1574));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      double double0 = MathUtils.log(0.0, 2.2250738585072014E-308);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck(Integer.MIN_VALUE, (-1));
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
      int int0 = MathUtils.addAndCheck((-1433), 15);
      assertEquals((-1418), int0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck(2146828182, 2146828182);
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
      long long0 = MathUtils.subAndCheck((long) (short)1, 4854L);
      assertEquals((-4853L), long0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      long long0 = MathUtils.subAndCheck(0L, (-932L));
      assertEquals(932L, long0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      long long0 = MathUtils.addAndCheck((-355622400L), (long) (short) (-1));
      assertEquals((-355622401L), long0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(0, 0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(9, 5);
      assertEquals(4.836281906951478, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(4194304, 0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(67, 1);
      assertEquals(67L, long0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(15, 14);
      assertEquals(15L, long0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(115909, (-3739));
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(65, 61);
      assertEquals(677040L, long0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient(2887, 1997);
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
      double double0 = MathUtils.binomialCoefficientDouble(990, 990);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(0, (-2278));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(1, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble((byte)88, 1);
      assertEquals(88.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(0, (byte) (-1));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(155, 117);
      assertEquals(2.3065012468390184E36, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(6, 6);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(12, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(26, 1);
      assertEquals(3.258096538021482, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(0, (-1));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog((short)1030, 808);
      assertEquals(533.333682782629, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(411, 61);
      assertEquals(169.70645449319184, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientDouble((-1899), (-1009));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k), got n = -1,899, k = -1,009
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient((-1), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k), got n = -1
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      int int0 = MathUtils.compareTo((byte)1, 0.0, (byte)0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      int int0 = MathUtils.compareTo((-1.0), 0.0, 675.904);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      int int0 = MathUtils.compareTo(0.0, 3516, (-1990.262133505751));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      boolean boolean0 = MathUtils.equals(Double.NaN, (double) 1114);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (double) Float.NaN;
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      int int0 = MathUtils.compareTo(0.0, 0.0, 0.0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((double) 1803, (double) 1803, 17);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.equals(1357.733051, 928.77, (-1));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.equals((double) (byte) (-43), (-1769.297152486), 2022272001);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((-1.0), (-1531.667), 1438);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((double[]) null, (double[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      boolean boolean0 = MathUtils.equals(doubleArray0, (double[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      boolean boolean0 = MathUtils.equals((double[]) null, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[4];
      boolean boolean0 = MathUtils.equals(doubleArray1, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 2043.5648F;
      double[] doubleArray1 = new double[6];
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorial((-2699));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for n!, got n = -2,699
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorial(705);
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
      double double0 = MathUtils.factorialDouble(990);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorialDouble((-2095));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for n!, got n = -2,095
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
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
        MathUtils.factorialLog((-668));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for n!, got n = -668
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      double double0 = MathUtils.factorialLog(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      int int0 = MathUtils.gcd(1, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
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
  public void test060()  throws Throwable  {
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
  public void test061()  throws Throwable  {
      int int0 = MathUtils.lcm(1638, 4);
      assertEquals(3276, int0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
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
  public void test063()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte) (-4));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte)0);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      double double0 = MathUtils.indicator((double) 1L);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      double double0 = MathUtils.indicator(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      double double0 = MathUtils.indicator((-1921.1134785));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      float float0 = MathUtils.indicator(Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      int int0 = MathUtils.indicator((int) (short) (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      int int0 = MathUtils.indicator(1655);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      long long0 = MathUtils.indicator((-407L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      long long0 = MathUtils.indicator(0L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      short short0 = MathUtils.indicator((short) (-283));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      short short0 = MathUtils.indicator((short)1030);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      int int0 = MathUtils.lcm(0, (-2559));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      int int0 = MathUtils.lcm(1503, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
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
  public void test078()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-1073741823), 3296);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-2147483645), (-2147483645));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((long) (-2900), (long) (-1627));
      assertEquals(4718300L, long0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((long) (-2559), 1L);
      assertEquals((-2559L), long0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-9223372036854775808L), (-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck(0L, (-2701L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck(9223372036854775807L, (-2576L));
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
      long long0 = MathUtils.mulAndCheck((long) 6, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      double double0 = MathUtils.nextAfter(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      double double0 = MathUtils.nextAfter(0, (-1.0));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      float float0 = MathUtils.round((-1.0F), (int) (short)1);
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      double double0 = MathUtils.nextAfter(0.9999999999999999, 0.9999999999999999);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      double double0 = MathUtils.nextAfter(1L, (-1.0));
      assertEquals(0.9999999999999999, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      double double0 = MathUtils.scalb(0.0, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      double double0 = MathUtils.scalb(1213.916, 21);
      assertEquals(2.545766367232E9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      double double0 = MathUtils.scalb(Double.NaN, (-1));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      double double0 = MathUtils.scalb(Double.POSITIVE_INFINITY, (-1499));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      try { 
        MathUtils.normalizeArray((double[]) null, Double.NEGATIVE_INFINITY);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot normalize to an infinite value
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      try { 
        MathUtils.normalizeArray((double[]) null, Double.NaN);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot normalize to NaN
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = Double.POSITIVE_INFINITY;
      try { 
        MathUtils.normalizeArray(doubleArray0, 0.0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Array contains an infinite element, \u221E at index 1
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[4] = Double.NaN;
      try { 
        MathUtils.normalizeArray(doubleArray0, 1.0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Array sums to zero
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[3] = (-1.0);
      doubleArray0[4] = Double.NaN;
      double[] doubleArray1 = MathUtils.normalizeArray(doubleArray0, 1.0);
      assertArrayEquals(new double[] {-0.0, -0.0, -0.0, 1.0, Double.NaN, -0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      double double0 = MathUtils.round((double) Float.NaN, (-1), (-2275));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      double double0 = MathUtils.round(Double.POSITIVE_INFINITY, 0, 0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      float float0 = MathUtils.round(0.0F, 0, 0);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      float float0 = MathUtils.round(257.0F, 1, 1);
      assertEquals(256.9F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      float float0 = MathUtils.round(257.0F, 5, 5);
      assertEquals(257.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      float float0 = MathUtils.round((float) (short) (-1), 642, 6);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      float float0 = MathUtils.round((float) (short) (-1), 642, 7);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.round((float) 0, 906, 906);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid rounding method 906, valid methods: ROUND_CEILING (2), ROUND_DOWN (1), ROUND_FLOOR (3), ROUND_HALF_DOWN (5), ROUND_HALF_EVEN (6), ROUND_HALF_UP (4), ROUND_UNNECESSARY (7), ROUND_UP (0)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      float float0 = MathUtils.round(257.0F, 2, 2);
      assertEquals(257.01F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      float float0 = MathUtils.round(0.0F, 182, 5);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      float float0 = MathUtils.round((float) (short) (-1), (int) (short) (-1), 6);
      assertEquals(-0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      float float0 = MathUtils.round((float) (short)0, 642, 6);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      float float0 = MathUtils.round(1609.79F, 0);
      assertEquals(1610.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.round((float) (short) (-13), (-1), 7);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Inexact result from rounding
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte) (-15));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)1);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      double double0 = MathUtils.sign((double) (byte)1);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      double double0 = MathUtils.sign(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      double double0 = MathUtils.sign(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      double double0 = MathUtils.sign((-2511.5496026340415));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      float float0 = MathUtils.sign((float) (-2147483634));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      float float0 = MathUtils.sign(Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      float float0 = MathUtils.sign(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      float float0 = MathUtils.sign((float) 1L);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      int int0 = MathUtils.sign((-2147483263));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      int int0 = MathUtils.sign(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      int int0 = MathUtils.sign(1114);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      long long0 = MathUtils.sign((long) (short) (-1));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      long long0 = MathUtils.sign(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      long long0 = MathUtils.sign((long) 31);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      short short0 = MathUtils.sign((short)1);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      short short0 = MathUtils.sign((short)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      short short0 = MathUtils.sign((short) (-1993));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck((-2147483634), 2146216695);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      int int0 = MathUtils.subAndCheck((-2147483634), (-371));
      assertEquals((-2147483263), int0);
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck(2023236795, (-2023236795));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck((long) 1117, (-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      long long0 = MathUtils.subAndCheck((-1478L), (-9223372036854775807L));
      assertEquals(9223372036854774329L, long0);
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      int int0 = MathUtils.pow(3250809, 3250809);
      assertEquals((-197922375), int0);
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      try { 
        MathUtils.pow((-1), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot raise an integral value to a negative power (-1^-1)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      int int0 = MathUtils.pow(325, 39916800L);
      assertEquals(2022272001, int0);
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      try { 
        MathUtils.pow(0, (-952L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot raise an integral value to a negative power (0^-952)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      try { 
        MathUtils.pow((long) 29791, (-978));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot raise an integral value to a negative power (29,791^-978)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      long long0 = MathUtils.pow(565L, 9);
      assertEquals(5756321095435960085L, long0);
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      try { 
        MathUtils.pow((long) (-1), (long) (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot raise an integral value to a negative power (-1^-1)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      long long0 = MathUtils.pow((long) 2, (long) 2);
      assertEquals(4L, long0);
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      BigInteger bigInteger1 = MathUtils.pow(bigInteger0, 0);
      assertEquals((byte)1, bigInteger1.byteValue());
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      try { 
        MathUtils.pow(bigInteger0, (-1317));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot raise an integral value to a negative power (0^-1,317)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      BigInteger bigInteger1 = MathUtils.pow(bigInteger0, (long) 1324);
      assertNotSame(bigInteger1, bigInteger0);
  }

  @Test(timeout = 4000)
  public void test150()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      try { 
        MathUtils.pow(bigInteger0, (long) (byte) (-114));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot raise an integral value to a negative power (0^-114)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      BigInteger bigInteger1 = MathUtils.pow(bigInteger0, bigInteger0);
      assertEquals((short) (-7168), bigInteger1.shortValue());
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-85);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      try { 
        MathUtils.pow(bigInteger0, bigInteger0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot raise an integral value to a negative power (-93,458,488,360,960^-93,458,488,360,960)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double double0 = MathUtils.distance1(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test154()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = MathUtils.distance1(intArray0, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test155()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double double0 = MathUtils.distance(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test156()  throws Throwable  {
      int[] intArray0 = new int[7];
      double double0 = MathUtils.distance(intArray0, intArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test157()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = MathUtils.distanceInf(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test158()  throws Throwable  {
      int[] intArray0 = new int[4];
      int int0 = MathUtils.distanceInf(intArray0, intArray0);
      assertEquals(0, int0);
  }
}
