/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 10:37:39 GMT 2018
 */

package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReturnsDeepStubs_ESTest extends ReturnsDeepStubs_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReturnsDeepStubs returnsDeepStubs0 = new ReturnsDeepStubs();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        returnsDeepStubs0.actualParameterizedType(object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }
}
