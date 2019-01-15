/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 12:27:42 GMT 2018
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedHashSet;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.IDKey;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HashCodeBuilder_ESTest extends HashCodeBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.appendSuper(0);
      assertEquals(629, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = new Object();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      int int0 = HashCodeBuilder.reflectionHashCode(object0, (Collection<String>) linkedHashSet0);
      assertEquals(17, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.hashCode();
      assertEquals(17, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        HashCodeBuilder.reflectionHashCode(Integer.MAX_VALUE, 590, (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The object to build a hash code for must not be null
         //
         verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      double[] doubleArray0 = new double[8];
      hashCodeBuilder0.append(doubleArray0);
      assertEquals((-779599631), hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      short[] shortArray0 = new short[2];
      hashCodeBuilder0.append(shortArray0);
      assertEquals(23273, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        HashCodeBuilder.reflectionHashCode((-1958), 0, (Object) null, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The object to build a hash code for must not be null
         //
         verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        HashCodeBuilder.reflectionHashCode((-1538), 1131731653, object0, true, (Class<? super Object>) class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // HashCodeBuilder requires an odd initial value
         //
         verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      HashCodeBuilder.register(hashCodeBuilder0);
      int int0 = HashCodeBuilder.reflectionHashCode((Object) hashCodeBuilder0);
      assertEquals(17, int0);
      assertEquals(17, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = HashCodeBuilder.reflectionHashCode((Object) "v>*}R'", true);
      assertEquals(1131731638, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Class<Object> class0 = Object.class;
      int int0 = HashCodeBuilder.reflectionHashCode((-1), (-1), linkedHashSet0, false, (Class<? super LinkedHashSet<Integer>>) class0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<String> class0 = String.class;
      int int0 = HashCodeBuilder.reflectionHashCode((-1803), (-1803), " in an array of ", false, (Class<? super String>) class0);
      assertEquals(461700567, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append(1.0);
      HashCodeBuilder hashCodeBuilder2 = hashCodeBuilder1.append('[');
      HashCodeBuilder hashCodeBuilder3 = hashCodeBuilder2.append((boolean[]) null);
      HashCodeBuilder hashCodeBuilder4 = hashCodeBuilder3.append((short) (-2697));
      HashCodeBuilder hashCodeBuilder5 = hashCodeBuilder4.append(0L);
      hashCodeBuilder5.append((double) (short) (-2697));
      String[] stringArray0 = new String[9];
      stringArray0[0] = "'&Tep:*>*p[k2t<y+";
      stringArray0[1] = "@8J";
      stringArray0[2] = "ro:{?QA:!LIc}Ial";
      stringArray0[3] = "<c;>qoWe2_ XKaj^";
      stringArray0[4] = "The Array must not be null";
      stringArray0[5] = "X89;%Ndc4";
      stringArray0[6] = "org.apache.commons.lang3.builder.HashCodeBuilder";
      stringArray0[7] = "";
      stringArray0[8] = "";
      int int0 = HashCodeBuilder.reflectionHashCode((Object) hashCodeBuilder3, stringArray0);
      assertEquals((-2062350749), hashCodeBuilder3.toHashCode());
      assertEquals(23426, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Object> class0 = Object.class;
      String[] stringArray0 = new String[7];
      // Undeclared exception!
      try { 
        HashCodeBuilder.reflectionHashCode((int) 0, (int) 0, (Object) "', has a length less than 2", false, (Class<? super Object>) class0, stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // HashCodeBuilder requires a non zero initial value
         //
         verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = null;
      try {
        hashCodeBuilder0 = new HashCodeBuilder(1, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // HashCodeBuilder requires a non zero multiplier
         //
         verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Integer integer0 = new Integer(762);
      IDKey iDKey0 = new IDKey(integer0);
      // Undeclared exception!
      try { 
        HashCodeBuilder.reflectionHashCode((-1719), (-1680), (Object) iDKey0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // HashCodeBuilder requires an odd multiplier
         //
         verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      boolean[] booleanArray0 = new boolean[12];
      hashCodeBuilder0.append(booleanArray0);
      assertEquals(235031477, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append(true);
      assertEquals(629, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      byte[] byteArray0 = new byte[3];
      hashCodeBuilder0.append(byteArray0);
      assertEquals(861101, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((byte[]) null);
      assertEquals(629, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((char[]) null);
      assertEquals(629, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((double[]) null);
      assertEquals(629, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((float[]) null);
      assertEquals(629, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder((-2857), (-2857));
      float[] floatArray0 = new float[8];
      hashCodeBuilder0.append(floatArray0);
      assertEquals(2019234455, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      int[] intArray0 = new int[4];
      hashCodeBuilder0.append(intArray0);
      assertEquals(31860737, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((int[]) null);
      assertEquals(629, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      long[] longArray0 = new long[1];
      hashCodeBuilder0.append(longArray0);
      assertEquals(629, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((long[]) null);
      assertEquals(629, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder((-1), (-1));
      hashCodeBuilder0.append((Object) null);
      assertEquals(1, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) objectArray0;
      // Undeclared exception!
      try { 
        hashCodeBuilder0.append(objectArray0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((Object[]) null);
      assertEquals(629, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      Object[] objectArray0 = new Object[0];
      HashCodeBuilder hashCodeBuilder1 = hashCodeBuilder0.append(objectArray0);
      assertEquals(17, hashCodeBuilder1.toHashCode());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(4525, 4525);
      hashCodeBuilder0.append((short[]) null);
      assertEquals(20475625, hashCodeBuilder0.toHashCode());
  }
}
