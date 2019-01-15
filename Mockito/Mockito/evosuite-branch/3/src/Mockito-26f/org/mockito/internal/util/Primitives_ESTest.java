/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 18:45:47 GMT 2019
 */

package org.mockito.internal.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.internal.util.Primitives;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Primitives_ESTest extends Primitives_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Primitives primitives0 = new Primitives();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      Boolean boolean0 = Primitives.primitiveWrapperOf(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Integer integer0 = Primitives.primitiveValueOrNullFor(class0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<Integer> class1 = Primitives.primitiveTypeOf(class0);
      Class<Integer> class2 = Primitives.primitiveTypeOf(class1);
      assertEquals("int", class2.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<Short> class0 = Short.class;
      Class<Short> class1 = Primitives.primitiveTypeOf(class0);
      boolean boolean0 = Primitives.isPrimitiveWrapper(class1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      boolean boolean0 = Primitives.isPrimitiveWrapper(class0);
      assertTrue(boolean0);
  }
}
