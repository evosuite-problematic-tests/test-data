/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 10:47:08 GMT 2018
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
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
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
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.hashCode();
      assertEquals(17, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        HashCodeBuilder.reflectionHashCode((-883), 631, (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The object to build a hash code for must not be null
         //
         verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      long[] longArray0 = new long[1];
      hashCodeBuilder0.append(longArray0);
      assertEquals(629, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder((-79), (-79));
      int[] intArray0 = new int[1];
      hashCodeBuilder0.append(intArray0);
      assertEquals(6241, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      IDKey iDKey0 = new IDKey(hashCodeBuilder0);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        HashCodeBuilder.reflectionHashCode((-565), (-1310), (Object) iDKey0, true, (Class<? super Object>) class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // HashCodeBuilder requires an odd multiplier
         //
         verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      HashCodeBuilder.register(object0);
      int int0 = HashCodeBuilder.reflectionHashCode((-1), 209, object0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer(0);
      int int0 = HashCodeBuilder.reflectionHashCode((Object) integer0, true);
      assertEquals(634, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IDKey iDKey0 = new IDKey("");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      int int0 = HashCodeBuilder.reflectionHashCode((Object) iDKey0, (Collection<String>) linkedHashSet0);
      assertEquals(23644, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Integer integer0 = new Integer((-353));
      Class<Integer> class0 = Integer.class;
      String[] stringArray0 = new String[5];
      int int0 = HashCodeBuilder.reflectionHashCode(Integer.MAX_VALUE, Integer.MAX_VALUE, integer0, true, (Class<? super Integer>) class0, stringArray0);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      // Undeclared exception!
      try { 
        HashCodeBuilder.reflectionHashCode(0, 0, (Object) hashCodeBuilder0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // HashCodeBuilder requires a non zero initial value
         //
         verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        HashCodeBuilder.reflectionHashCode(748, 0, integer0, true, (Class<? super Integer>) class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // HashCodeBuilder requires an odd initial value
         //
         verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = null;
      try {
        hashCodeBuilder0 = new HashCodeBuilder(Integer.MAX_VALUE, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // HashCodeBuilder requires a non zero multiplier
         //
         verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append(true);
      assertEquals(629, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      boolean[] booleanArray0 = new boolean[4];
      hashCodeBuilder0.append(booleanArray0);
      assertEquals(31912797, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((boolean[]) null);
      assertEquals(629, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      byte[] byteArray0 = new byte[2];
      hashCodeBuilder0.append(byteArray0);
      assertEquals(23273, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = HashCodeBuilder.reflectionHashCode((Object) "'}49z=vZ},ck3");
      assertEquals(179654800, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((char[]) null);
      assertEquals(629, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      double[] doubleArray0 = new double[2];
      hashCodeBuilder0.append(doubleArray0);
      assertEquals(23273, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((double[]) null);
      assertEquals(629, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      float[] floatArray0 = new float[9];
      hashCodeBuilder0.append(floatArray0);
      assertEquals(1219584725, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((float[]) null);
      assertEquals(629, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((int[]) null);
      assertEquals(629, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((long[]) null);
      assertEquals(629, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      Object[] objectArray0 = new Object[8];
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
  public void test26()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((Object[]) null);
      assertEquals(629, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder(1445, 1445);
      Object[] objectArray0 = new Object[9];
      hashCodeBuilder0.append(objectArray0);
      assertEquals(1382008889, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      short[] shortArray0 = new short[4];
      hashCodeBuilder0.append(shortArray0);
      assertEquals(31860737, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((short[]) null);
      assertEquals(629, hashCodeBuilder0.toHashCode());
  }
}
