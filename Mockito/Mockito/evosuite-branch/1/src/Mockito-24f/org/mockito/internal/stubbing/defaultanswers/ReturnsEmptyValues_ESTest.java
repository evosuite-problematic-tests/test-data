/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 12:05:13 GMT 2018
 */

package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReturnsEmptyValues_ESTest extends ReturnsEmptyValues_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReturnsEmptyValues returnsEmptyValues0 = new ReturnsEmptyValues();
      Class<Integer> class0 = Integer.class;
      Object object0 = returnsEmptyValues0.returnValueFor(class0);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<String> class0 = String.class;
      ReturnsEmptyValues returnsEmptyValues0 = new ReturnsEmptyValues();
      Object object0 = returnsEmptyValues0.returnValueFor(class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ReturnsEmptyValues returnsEmptyValues0 = new ReturnsEmptyValues();
      Class<List> class0 = List.class;
      LinkedList linkedList0 = (LinkedList)returnsEmptyValues0.returnValueFor(class0);
      assertEquals(0, linkedList0.size());
  }
}
