/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 17:11:40 GMT 2019
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
      int int0 = MathUtils.hash(234.135925);
      assertEquals(1058009847, int0);
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
      double double0 = MathUtils.cosh(0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      double double0 = MathUtils.round((-574.2323225), 0);
      assertEquals((-574.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      double double0 = MathUtils.log(2.0, (-38.3921783852358));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
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
  public void test011()  throws Throwable  {
      int int0 = MathUtils.addAndCheck(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck(2147482565, 2147482565);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      long long0 = MathUtils.addAndCheck(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      long long0 = MathUtils.subAndCheck((-5033L), (-1037L));
      assertEquals((-3996L), long0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck((-1234L), 9223372036854775807L);
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
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck(2315L, 9223372036854775807L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(19, 15);
      assertEquals(8.262558973010657, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient((-3482), (-1217));
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
      long long0 = MathUtils.binomialCoefficient(0, (byte)0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(1849, 0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(4352, 1);
      assertEquals(4352L, long0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(0, (-1));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(1771, 2);
      assertEquals(1567335L, long0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(66, 5);
      assertEquals(16.005702463936313, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(334, (-1669));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientDouble(1094, 1660);
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
        MathUtils.binomialCoefficientDouble((-2604), (-2604));
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
      double double0 = MathUtils.binomialCoefficientDouble(0, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(155, 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(3697, 1);
      assertEquals(3697.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble((byte)0, (-1));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(564, 529);
      assertEquals(6.497287665178155E55, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(6, (-4240));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientLog((-4240), 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientLog((-1), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(0, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(1, (short)0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(3561, (short)1);
      assertEquals(8.177796683277778, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(67, 66);
      assertEquals(4.204692619390966, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(1771, (-7200));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = Double.NaN;
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      boolean boolean0 = MathUtils.equals(Double.NaN, (-5036.0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((double[]) null, (double[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      boolean boolean0 = MathUtils.equals(doubleArray0, (double[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      boolean boolean0 = MathUtils.equals((double[]) null, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[6];
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-130.7);
      double[] doubleArray1 = new double[4];
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      double double0 = MathUtils.factorialDouble(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
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
  public void test051()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorial(286);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // factorial value is too large to fit in a long
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorialDouble((-1877));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for n!
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      double double0 = MathUtils.factorialDouble(691);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
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
  public void test055()  throws Throwable  {
      double double0 = MathUtils.factorialLog(5);
      assertEquals(4.787491742782046, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      int int0 = MathUtils.gcd((byte)0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      int int0 = MathUtils.gcd(2091, 0);
      assertEquals(2091, int0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      int int0 = MathUtils.gcd((-1), (-809));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte) (-1));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte)78);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      double double0 = MathUtils.indicator((double) 1216);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      double double0 = MathUtils.indicator(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      double double0 = MathUtils.indicator((-130.7));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      float float0 = MathUtils.indicator(Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      int int0 = MathUtils.indicator((-1427));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      int int0 = MathUtils.indicator(5);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      long long0 = MathUtils.indicator((-1730L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      long long0 = MathUtils.indicator((long) 2896);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      short short0 = MathUtils.indicator((short) (-666));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      short short0 = MathUtils.indicator((short)67);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-9150822), 438);
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
        MathUtils.mulAndCheck(1294100831, 5);
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
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient(3455, 66);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-231064915946L), (-2147483648L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((long) 82, (-812L));
      assertEquals((-66584L), long0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((long) (-1), (-848L));
      assertEquals(848L, long0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck(0L, (-1L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((long) 82, (-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck(0L, 56L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      float float0 = MathUtils.round(0.0F, 155);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      float float0 = MathUtils.round((float) 2855, 1534, 1);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      double double0 = MathUtils.nextAfter(0.0, (-2929.967693465));
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      double double0 = MathUtils.nextAfter((-1.0), 1.1102230246251565E-16);
      assertEquals((-0.9999999999999999), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      double double0 = MathUtils.nextAfter(1.9999999999999998, 1.9999999999999998);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      double double0 = MathUtils.nextAfter(1178L, (-2366.779302));
      assertEquals(1177.9999999999998, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      double double0 = MathUtils.scalb(0.0, (-378));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      double double0 = MathUtils.scalb((-2929.967693465), 763);
      assertEquals((-1.4215087043628095E233), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      double double0 = MathUtils.scalb(Double.NaN, (-734));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      double double0 = MathUtils.scalb(Double.POSITIVE_INFINITY, (short)67);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      double double0 = MathUtils.round(Double.NaN, (-2146305284), 2366);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      double double0 = MathUtils.round(Double.POSITIVE_INFINITY, (-520), (-520));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      float float0 = MathUtils.round((float) (-1032), (-1032), 0);
      assertEquals(Float.NEGATIVE_INFINITY, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
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
  public void test094()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)77);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte) (-120));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      double double0 = MathUtils.sign((-1.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      double double0 = MathUtils.sign(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      double double0 = MathUtils.sign(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      double double0 = MathUtils.sign(4.9E-324);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      float float0 = MathUtils.sign((-644.0F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      float float0 = MathUtils.sign(Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      float float0 = MathUtils.sign(0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      float float0 = MathUtils.sign(92.55488F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      int int0 = MathUtils.sign(2855);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      int int0 = MathUtils.sign((int) (short)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      int int0 = MathUtils.sign((-1977));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      long long0 = MathUtils.sign((-2105L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      long long0 = MathUtils.sign((long) 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      long long0 = MathUtils.sign((long) 1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      short short0 = MathUtils.sign((short) (-3305));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      short short0 = MathUtils.sign((short) (byte)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      short short0 = MathUtils.sign((short)2664);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck((-2147483647), 2832);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      int int0 = MathUtils.subAndCheck(1664, 1);
      assertEquals(1663, int0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck(1003, (-2147483378));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      long long0 = MathUtils.subAndCheck((-9223372036854775808L), (-9223372036854775808L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck((long) 5, (-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }
}
