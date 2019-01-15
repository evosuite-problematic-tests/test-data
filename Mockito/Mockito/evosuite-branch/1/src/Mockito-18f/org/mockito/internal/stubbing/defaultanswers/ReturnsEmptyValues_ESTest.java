/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 17:43:47 GMT 2018
 */

package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.SQLTimeoutException;
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
      Class<SQLTimeoutException> class0 = SQLTimeoutException.class;
      ReturnsEmptyValues returnsEmptyValues0 = new ReturnsEmptyValues();
      Object object0 = returnsEmptyValues0.returnValueFor(class0);
      assertNull(object0);
  }
}