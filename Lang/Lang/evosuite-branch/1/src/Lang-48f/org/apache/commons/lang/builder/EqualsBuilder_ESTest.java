/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 13:03:00 GMT 2018
 */

package org.apache.commons.lang.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EqualsBuilder_ESTest extends EqualsBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Object object0 = new Object();
      LinkedList<BigDecimal> linkedList0 = new LinkedList<BigDecimal>();
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) equalsBuilder0, object0, (Collection) linkedList0);
      assertTrue(equalsBuilder0.isEquals());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) equalsBuilder0, (Object) bigDecimal0);
      assertFalse(boolean0);
      assertTrue(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      long[] longArray0 = new long[2];
      equalsBuilder0.append((long[]) null, longArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<String> class0 = String.class;
      String[] stringArray0 = new String[7];
      Object object0 = new Object();
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) null, object0, false, class0, stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) bigDecimal0, (Object) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object object0 = new Object();
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      boolean boolean0 = EqualsBuilder.reflectionEquals(object0, (Object) bigDecimal0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      Object object1 = new Object();
      Class<String> class0 = String.class;
      boolean boolean0 = EqualsBuilder.reflectionEquals(object0, object1, false, class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object object0 = new Object();
      Class<String> class0 = String.class;
      String[] stringArray0 = new String[9];
      stringArray0[8] = "value";
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) "", object0, true, (Class) class0, stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Object> class0 = Object.class;
      BigInteger bigInteger0 = BigInteger.ZERO;
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      BigDecimal bigDecimal1 = new BigDecimal(bigInteger0);
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) bigDecimal0, (Object) bigDecimal1, false, (Class) class0, (String[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.appendSuper(false);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = new byte[1];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(byteArray0, byteArray1);
      EqualsBuilder equalsBuilder2 = equalsBuilder1.appendSuper(false);
      assertSame(equalsBuilder0, equalsBuilder2);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      short[] shortArray0 = new short[3];
      short[] shortArray1 = new short[0];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(shortArray0, shortArray1);
      equalsBuilder1.append((Object) equalsBuilder0, (Object) equalsBuilder0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal((int) (short)57);
      Class<BigDecimal> class0 = BigDecimal.class;
      BigDecimal bigDecimal1 = BigDecimal.ZERO;
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) bigDecimal0, (Object) bigDecimal1, true, (Class) class0, (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      BigDecimal bigDecimal1 = new BigDecimal(1);
      Class<Object> class0 = Object.class;
      String[] stringArray0 = new String[5];
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) bigDecimal0, (Object) bigDecimal1, false, (Class) class0, stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) "&83<", (Object) "", true, (Class) class0, (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      BigDecimal bigDecimal1 = BigDecimal.TEN;
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((Object) bigDecimal0, (Object) bigDecimal1);
      equalsBuilder1.append((byte)0, (byte)0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      BigInteger bigInteger0 = BigInteger.TEN;
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      BigDecimal bigDecimal1 = BigDecimal.TEN;
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((Object) bigDecimal0, (Object) bigDecimal1);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((Object) null, (Object) equalsBuilder0);
      equalsBuilder1.append((-1L), (-1L));
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      short[] shortArray0 = new short[1];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((short[]) null, shortArray0);
      equalsBuilder1.append((int) (short) (-54), (int) (short) (-54));
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      float[] floatArray0 = new float[5];
      floatArray0[4] = (float) (short) (-2867);
      float[] floatArray1 = new float[5];
      equalsBuilder0.append(floatArray0, floatArray1);
      equalsBuilder0.append((short)0, (short)0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) equalsBuilder0;
      Object[] objectArray1 = new Object[5];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(objectArray0, objectArray1);
      EqualsBuilder equalsBuilder2 = equalsBuilder1.append('J', 'I');
      assertSame(equalsBuilder2, equalsBuilder0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = new byte[4];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(byteArray0, byteArray1);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-103);
      byte[] byteArray1 = new byte[4];
      equalsBuilder0.append(byteArray0, byteArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) equalsBuilder0;
      Object[] objectArray1 = new Object[5];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(objectArray0, objectArray1);
      EqualsBuilder equalsBuilder2 = equalsBuilder1.append((double) 1, (double) (-2305));
      assertSame(equalsBuilder0, equalsBuilder2);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      short[] shortArray0 = new short[3];
      short[] shortArray1 = new short[0];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(shortArray0, shortArray1);
      EqualsBuilder equalsBuilder2 = equalsBuilder1.append(0.0F, (float) (short)57);
      assertFalse(equalsBuilder2.isEquals());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      double[] doubleArray0 = new double[5];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((double[]) null, doubleArray0);
      equalsBuilder1.append(true, true);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      boolean[] booleanArray0 = new boolean[6];
      booleanArray0[4] = true;
      boolean[] booleanArray1 = new boolean[6];
      equalsBuilder0.append(booleanArray0, booleanArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.append((byte)2, (byte) (-116));
      equalsBuilder0.append((Object[]) null, (Object[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Object[] objectArray0 = new Object[7];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(objectArray0, objectArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      Object[] objectArray0 = new Object[9];
      equalsBuilder0.append((Object[]) null, objectArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      Object[] objectArray0 = new Object[1];
      equalsBuilder0.append(objectArray0, (Object[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      Object[] objectArray0 = new Object[6];
      Object[] objectArray1 = new Object[8];
      equalsBuilder0.append(objectArray0, objectArray1);
      boolean[] booleanArray0 = new boolean[6];
      equalsBuilder0.append(booleanArray0, booleanArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) equalsBuilder0;
      objectArray0[1] = (Object) equalsBuilder0;
      objectArray0[2] = (Object) equalsBuilder0;
      Object[] objectArray1 = new Object[5];
      objectArray1[0] = (Object) equalsBuilder0;
      objectArray1[2] = (Object) equalsBuilder0;
      objectArray1[1] = (Object) equalsBuilder0;
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(objectArray0, objectArray1);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      short[] shortArray0 = new short[3];
      short[] shortArray1 = new short[0];
      equalsBuilder0.append(shortArray0, shortArray1);
      long[] longArray0 = new long[4];
      equalsBuilder0.append(longArray0, longArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      long[] longArray0 = new long[1];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(longArray0, longArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      long[] longArray0 = new long[9];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(longArray0, (long[]) null);
      float[] floatArray0 = new float[9];
      equalsBuilder1.append(floatArray0, floatArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      long[] longArray0 = new long[2];
      long[] longArray1 = new long[2];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(longArray0, longArray1);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      long[] longArray0 = new long[9];
      long[] longArray1 = new long[5];
      equalsBuilder0.append(longArray0, longArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      long[] longArray0 = new long[2];
      longArray0[0] = (-5130L);
      long[] longArray1 = new long[2];
      equalsBuilder0.append(longArray0, longArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      int[] intArray0 = new int[2];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(intArray0, intArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      char[] charArray0 = new char[3];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((char[]) null, charArray0);
      int[] intArray0 = new int[9];
      equalsBuilder1.append(intArray0, intArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      int[] intArray0 = new int[1];
      equalsBuilder0.append(intArray0, (int[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      int[] intArray0 = new int[2];
      equalsBuilder0.append((int[]) null, intArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      int[] intArray0 = new int[4];
      int[] intArray1 = new int[4];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(intArray1, intArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      int[] intArray0 = new int[6];
      int[] intArray1 = new int[5];
      equalsBuilder0.append(intArray0, intArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      int[] intArray0 = new int[4];
      int[] intArray1 = new int[4];
      intArray1[0] = (-540);
      equalsBuilder0.append(intArray1, intArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.append((Object) null, (Object) equalsBuilder0);
      short[] shortArray0 = new short[5];
      equalsBuilder0.append(shortArray0, shortArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      short[] shortArray0 = new short[2];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(shortArray0, shortArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      short[] shortArray0 = new short[2];
      equalsBuilder0.append(shortArray0, (short[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      short[] shortArray0 = new short[1];
      short[] shortArray1 = new short[1];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(shortArray0, shortArray1);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      short[] shortArray0 = new short[7];
      shortArray0[0] = (short)2;
      short[] shortArray1 = new short[7];
      equalsBuilder0.append(shortArray1, shortArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      float[] floatArray0 = new float[5];
      floatArray0[4] = (float) (short) (-2867);
      float[] floatArray1 = new float[5];
      equalsBuilder0.append(floatArray0, floatArray1);
      equalsBuilder0.append((char[]) null, (char[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((char[]) null, (char[]) null);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      char[] charArray0 = new char[1];
      equalsBuilder0.append(charArray0, (char[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      char[] charArray0 = new char[8];
      char[] charArray1 = new char[8];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(charArray0, charArray1);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      char[] charArray0 = new char[8];
      charArray0[0] = '4';
      char[] charArray1 = new char[8];
      equalsBuilder0.append(charArray0, charArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.append((Object) null, (Object) equalsBuilder0);
      equalsBuilder0.append((byte[]) null, (byte[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      byte[] byteArray0 = new byte[0];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(byteArray0, byteArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      byte[] byteArray0 = new byte[4];
      equalsBuilder0.append((byte[]) null, byteArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      byte[] byteArray0 = new byte[3];
      equalsBuilder0.append(byteArray0, (byte[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      short[] shortArray0 = new short[3];
      short[] shortArray1 = new short[0];
      equalsBuilder0.append(shortArray0, shortArray1);
      double[] doubleArray0 = new double[5];
      equalsBuilder0.append(doubleArray0, doubleArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      double[] doubleArray0 = new double[3];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(doubleArray0, doubleArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      double[] doubleArray0 = new double[1];
      equalsBuilder0.append(doubleArray0, (double[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[3];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(doubleArray0, doubleArray1);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[8];
      equalsBuilder0.append(doubleArray0, doubleArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-2411.789014482702);
      double[] doubleArray1 = new double[3];
      equalsBuilder0.append(doubleArray0, doubleArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      float[] floatArray0 = new float[1];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(floatArray0, floatArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      float[] floatArray0 = new float[4];
      equalsBuilder0.append((float[]) null, floatArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      float[] floatArray0 = new float[2];
      equalsBuilder0.append(floatArray0, (float[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      float[] floatArray0 = new float[3];
      float[] floatArray1 = new float[7];
      equalsBuilder0.append(floatArray0, floatArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      float[] floatArray0 = new float[5];
      float[] floatArray1 = new float[5];
      floatArray1[0] = (-1094.4575F);
      equalsBuilder0.append(floatArray0, floatArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      boolean[] booleanArray0 = new boolean[4];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(booleanArray0, booleanArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      boolean[] booleanArray0 = new boolean[7];
      equalsBuilder0.append((boolean[]) null, booleanArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      boolean[] booleanArray0 = new boolean[2];
      equalsBuilder0.append(booleanArray0, (boolean[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      boolean[] booleanArray0 = new boolean[2];
      boolean[] booleanArray1 = new boolean[5];
      equalsBuilder0.append(booleanArray0, booleanArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      boolean[] booleanArray0 = new boolean[6];
      boolean[] booleanArray1 = new boolean[6];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(booleanArray0, booleanArray1);
      assertTrue(equalsBuilder1.isEquals());
  }
}
