/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 13:01:13 GMT 2019
 */

package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.math.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NumberUtils_ESTest extends NumberUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      float float0 = NumberUtils.max((float) (byte)0, (float) (short) (-896), (-3993.019F));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      float float0 = NumberUtils.min((float) (short)47, 1.0F, 1.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      double double0 = NumberUtils.toDouble("`R2tz38&");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      double double0 = NumberUtils.min(1403.54302646249, 0.0, 3110.1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      byte byte0 = NumberUtils.toByte("-z+<LVI:c*,~}T8");
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      double double0 = NumberUtils.max(0.0, 0.0, 2127.7);
      assertEquals(2127.7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      long long0 = NumberUtils.toLong("");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      int int0 = NumberUtils.toInt("0x");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      float float0 = NumberUtils.toFloat("_D#*0 vyMv^");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      short short0 = NumberUtils.toShort("I");
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      int int0 = NumberUtils.toInt((String) null, (-1223));
      assertEquals((-1223), int0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      long long0 = NumberUtils.toLong((String) null, 2422L);
      assertEquals(2422L, long0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      float float0 = NumberUtils.toFloat((String) null, 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      double double0 = NumberUtils.toDouble((String) null, (-1.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      byte byte0 = NumberUtils.toByte((String) null, (byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      short short0 = NumberUtils.toShort((String) null, (short) (-371));
      assertEquals((short) (-371), short0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Number number0 = NumberUtils.createNumber((String) null);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      try { 
        NumberUtils.createNumber(" ");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // A blank string is not a valid number
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("--w-xlS?g*m<O3,");
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0x0");
      assertEquals(0, number0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-0xnh8nsbd?/]!)V[K$u`k");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-nh8nsbd?/]!)V[K$u`k\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      try { 
        NumberUtils.createNumber("9q`.BnHeh<]a?");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 9q`.BnHeh<]a? is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      try { 
        NumberUtils.createNumber("4e.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 4e. is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      try { 
        NumberUtils.createNumber(";.lZ/GDB59e!c8jE");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // ;.lZ/GDB59e!c8jE is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      try { 
        NumberUtils.createNumber("W[}>^XeE[(H");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // W[}>^XeE[(H is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      try { 
        NumberUtils.createNumber("hepfnSb4F=Mu8o5");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("4.");
      assertEquals(4.0F, number0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0e");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0e is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0e]");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0e] is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("3D");
      assertEquals(3.0, number0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      try { 
        NumberUtils.createNumber("MZs.%{$('}Ib_':<F");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // MZs.%{$('}Ib_':<F is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-L");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -L is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      try { 
        NumberUtils.createNumber("e8SVO?+2El(ud");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // e8SVO?+2El(ud is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("7f");
      assertEquals(7.0F, number0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      try { 
        NumberUtils.createNumber("v ry-=?\"svfm.a0xg:L");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // v ry-=?\"svfm.a0xg:L is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      try { 
        NumberUtils.createNumber("Strings must not be null");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Strings must not be null is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("-7L");
      assertEquals((-7L), number0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("6l");
      assertEquals(6L, number0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      try { 
        NumberUtils.createNumber("8sVEsB@:et:T4");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"8sVE\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Float float0 = NumberUtils.createFloat((String) null);
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Double double0 = NumberUtils.createDouble((String) null);
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger((String) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Long long0 = NumberUtils.createLong((String) null);
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger((String) null);
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal((String) null);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigDecimal("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // A blank string is not a valid number
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((long[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      long[] longArray0 = new long[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      long[] longArray0 = new long[4];
      longArray0[0] = (long) 1752;
      long long0 = NumberUtils.min(longArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((int[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[4] = (-1021);
      int int0 = NumberUtils.min(intArray0);
      assertEquals((-1021), int0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((short[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      short[] shortArray0 = new short[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(shortArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      short[] shortArray0 = new short[9];
      shortArray0[1] = (short) (-142);
      short short0 = NumberUtils.min(shortArray0);
      assertEquals((short) (-142), short0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte byte0 = NumberUtils.min(byteArray0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)68;
      byte byte0 = NumberUtils.min(byteArray0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[5] = Double.NaN;
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[2] = (-1067.8783428);
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals((-1067.8783428), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((float[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      float[] floatArray0 = new float[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      float[] floatArray0 = new float[5];
      floatArray0[2] = Float.NaN;
      float float0 = NumberUtils.min(floatArray0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      float[] floatArray0 = new float[7];
      floatArray0[0] = (float) (short)47;
      float float0 = NumberUtils.min(floatArray0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((long[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      long[] longArray0 = new long[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      long[] longArray0 = new long[3];
      longArray0[0] = (-371L);
      long long0 = NumberUtils.max(longArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((int[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = (-1);
      int int0 = NumberUtils.max(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((short[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      short[] shortArray0 = new short[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(shortArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      short[] shortArray0 = new short[5];
      shortArray0[0] = (short) (-1);
      short short0 = NumberUtils.max(shortArray0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)83;
      byte byte0 = NumberUtils.max(byteArray0);
      assertEquals((byte)83, byte0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[3] = Double.NaN;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-2119.1);
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((float[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      float[] floatArray0 = new float[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      float[] floatArray0 = new float[4];
      floatArray0[1] = Float.NaN;
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      float[] floatArray0 = new float[5];
      floatArray0[4] = (float) (short)4032;
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(4032.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Short short0 = new Short((short)692);
      long long0 = NumberUtils.min((long) (short)1489, (long) (short)692, (long) short0);
      assertEquals(692L, long0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      long long0 = NumberUtils.min((long) (short)1489, 6725L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      int int0 = NumberUtils.min(3091, 3091, (-4185));
      assertEquals((-4185), int0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      int int0 = NumberUtils.min(97, (-680), 97);
      assertEquals((-680), int0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      short short0 = NumberUtils.min((short)1453, (short) (-1873), (short)0);
      assertEquals((short) (-1873), short0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      short short0 = NumberUtils.min((short)22079, (short)22079, (short)835);
      assertEquals((short)835, short0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte) (-38), (byte) (-38), (byte) (-38));
      assertEquals((byte) (-38), byte0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte)85, (byte)0, (byte) (-87));
      assertEquals((byte) (-87), byte0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      long long0 = NumberUtils.max((long) (byte)0, (long) (byte)83, (-2554L));
      assertEquals(83L, long0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      long long0 = NumberUtils.max((long) (short)1489, 0L, 6725L);
      assertEquals(6725L, long0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      int int0 = NumberUtils.max((-918), 102, 102);
      assertEquals(102, int0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      int int0 = NumberUtils.max((-1670), (-1670), 1599);
      assertEquals(1599, int0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      short short0 = NumberUtils.max((short) (-771), (short)975, (short)0);
      assertEquals((short)975, short0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      short short0 = NumberUtils.max((short)615, (short)615, (short)692);
      assertEquals((short)692, short0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte)92, (byte) (-123), (byte)92);
      assertEquals((byte)92, byte0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte) (-62), (byte)0, (byte)11);
      assertEquals((byte)11, byte0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x-0xhepfnSb4F=Mu8o5");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0YN");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x0");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x1fdZ-C.R");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x}");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x4E=h;Oi :U");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("4E4");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("--6lfd3S Jt=,Q ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("..");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("...");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("5ePHI");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("4EE4");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("E&jdwVF?^%|}A");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("+^o/~^");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("4E");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("4e.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber(".");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("4E=");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("d");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("3D");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("7f");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("F");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-L");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("6l");
      assertTrue(boolean0);
  }
}
