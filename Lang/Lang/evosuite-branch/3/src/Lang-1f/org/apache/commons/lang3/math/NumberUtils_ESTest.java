/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 12:10:29 GMT 2019
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
      int int0 = NumberUtils.max((int) numberUtils0.INTEGER_MINUS_ONE, 0, (int) numberUtils0.BYTE_ZERO);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      byte byte0 = NumberUtils.toByte("-z+<LVI:c*,~}T8");
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      double double0 = NumberUtils.max((double) (short)0, (double) (byte)0, (double) 2422L);
      assertEquals(2422.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      long long0 = NumberUtils.toLong("");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      int int0 = NumberUtils.toInt("0X");
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
        NumberUtils.createNumber("");
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
      try { 
        NumberUtils.createNumber("0x");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0x0xi(YmXvf");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"0xi(YmXvf\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-0X..LC3% NxHAM4Br~");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"X..LC3%\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-0X..LC3 $xHAM4Br~");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-..LC3 $xHAM4Br~\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0Xk@7(<A=0TE/.TXy'");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"Xk@7(<A\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-0x3$#3C6&b");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-3$#3C6&b\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      try { 
        NumberUtils.createNumber(".e");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // .e is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      try { 
        NumberUtils.createNumber("Array cannot be empty.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Array cannot be empty. is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      try { 
        NumberUtils.createNumber("lwXM<EF.eRc/ ");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // lwXM<EF.eRc/  is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      try { 
        NumberUtils.createNumber("7Dubretk(E~KFR");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 7Dubretk(E~KFR is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
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
  public void test030()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("-0.");
      assertEquals((short)0, number0.shortValue());
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0E&jdwVF?^%|}A");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0E&jdwVF?^%|}A is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0.i(YmXvf");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0.i(YmXvf is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Number number0 = NumberUtils.createNumber(".2F");
      assertEquals(0.2F, number0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      try { 
        NumberUtils.createNumber("..L");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // ..L is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      try { 
        NumberUtils.createNumber("The Array must not be null");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // The Array must not be null is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      try { 
        NumberUtils.createNumber("--gL");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // --gL is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("4L");
      assertEquals(4L, number0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("1D");
      assertEquals(1.0, number0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0d");
      assertEquals((byte)0, number0.byteValue());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0E?x5[(`S>)J0[e5");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"E?x5[\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0.");
      assertEquals(0.0F, number0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      try { 
        NumberUtils.createNumber(".nADd>P;:$~S=q&hi2");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("60.");
      assertEquals(60.0F, number0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Float float0 = NumberUtils.createFloat((String) null);
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Double double0 = NumberUtils.createDouble((String) null);
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger((String) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Long long0 = NumberUtils.createLong((String) null);
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger((String) null);
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigInteger("0x0r%H");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"r%H\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger("-#F");
      assertEquals((byte) (-15), bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigInteger("Strings must not be null");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"String\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger("0");
      assertEquals((short)0, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal((String) null);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
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
  public void test055()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigDecimal("--");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -- is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      long[] longArray0 = new long[6];
      longArray0[1] = (-1L);
      long long0 = NumberUtils.min(longArray0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = (int) (byte)54;
      int int0 = NumberUtils.min(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      short[] shortArray0 = new short[7];
      shortArray0[2] = (short) (-973);
      short short0 = NumberUtils.min(shortArray0);
      assertEquals((short) (-973), short0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[3] = (byte) (-4);
      byte byte0 = NumberUtils.min(byteArray0);
      assertEquals((byte) (-4), byte0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[5] = Double.NaN;
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[2] = (-1067.8783428);
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals((-1067.8783428), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      float[] floatArray0 = new float[5];
      floatArray0[2] = Float.NaN;
      float float0 = NumberUtils.min(floatArray0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      float[] floatArray0 = new float[7];
      floatArray0[0] = (float) (short)57;
      float float0 = NumberUtils.min(floatArray0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      long[] longArray0 = new long[3];
      longArray0[0] = (-371L);
      long long0 = NumberUtils.max(longArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[1] = 1805;
      int int0 = NumberUtils.max(intArray0);
      assertEquals(1805, int0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      short[] shortArray0 = new short[6];
      shortArray0[4] = (short)4172;
      short short0 = NumberUtils.max(shortArray0);
      assertEquals((short)4172, short0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)83;
      byte byte0 = NumberUtils.max(byteArray0);
      assertEquals((byte)83, byte0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[4] = Double.NaN;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[4] = (double) 2030.0F;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(2030.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      float[] floatArray0 = new float[5];
      floatArray0[2] = Float.NaN;
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      float[] floatArray0 = new float[5];
      floatArray0[0] = (float) (-2522L);
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
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
  public void test073()  throws Throwable  {
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
  public void test074()  throws Throwable  {
      long long0 = NumberUtils.min((-2522L), 0L, 0L);
      assertEquals((-2522L), long0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      long long0 = NumberUtils.min((long) 480, 1L, (-2280L));
      assertEquals((-2280L), long0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      int int0 = NumberUtils.min(3091, 3091, (-4185));
      assertEquals((-4185), int0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      int int0 = NumberUtils.min(0, (-1616), 1);
      assertEquals((-1616), int0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      short short0 = NumberUtils.min((short)975, (short)975, (short)4032);
      assertEquals((short)975, short0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      short short0 = NumberUtils.min((short)2386, (short)0, (short) (byte) (-40));
      assertEquals((short) (-40), short0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte) (-66), (byte) (-66), (byte) (-66));
      assertEquals((byte) (-66), byte0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte)85, (byte)0, (byte) (-87));
      assertEquals((byte) (-87), byte0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      long long0 = NumberUtils.max((long) 0, 1L, 1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      long long0 = NumberUtils.max((long) 0, (long) 0, 1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      int int0 = NumberUtils.max(480, 480, 480);
      assertEquals(480, int0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      int int0 = NumberUtils.max((-1670), (-1670), 1599);
      assertEquals(1599, int0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      short short0 = NumberUtils.max((short) (-771), (short)975, (short)0);
      assertEquals((short)975, short0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      short short0 = NumberUtils.max((short) (-3158), (short) (-3158), (short) (-1));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte)0, (byte) (-91), (byte) (-91));
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte) (-62), (byte)0, (byte)11);
      assertEquals((byte)11, byte0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("L");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0xi(YmXvf");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0E&");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x9");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x#g'D");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0xfDKXIE=z&}i[fTQz644");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("..LC3% $xHAM4Br~");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("e^|OyS#mj");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("8eeO 3@'e|Jj= v+");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("+_s,LXHpF");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("9E-uZ^8-:.Uj8j+");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber(".e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("E");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber(".");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("..");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("5d");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("1D");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("f");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber(".2F");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("9l");
      assertTrue(boolean0);
  }
}