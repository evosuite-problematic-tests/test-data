/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 11:01:24 GMT 2018
 */

package org.mockito.internal.invocation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.PriorityQueue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.hamcrest.text.StringContainsInOrder;
import org.junit.runner.RunWith;
import org.mockito.internal.creation.MockitoMethodProxy;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.invocation.MockitoMethod;
import org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod;
import org.mockito.invocation.InvocationOnMock;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Invocation_ESTest extends Invocation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PriorityQueue<String> priorityQueue0 = new PriorityQueue<String>();
      StringContainsInOrder stringContainsInOrder0 = new StringContainsInOrder(priorityQueue0);
      FilteredCGLIBProxyRealMethod filteredCGLIBProxyRealMethod0 = new FilteredCGLIBProxyRealMethod((MockitoMethodProxy) null);
      Invocation invocation0 = null;
      try {
        invocation0 = new Invocation(stringContainsInOrder0, (MockitoMethod) null, (Object[]) null, 0, filteredCGLIBProxyRealMethod0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.internal.invocation.Invocation", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        Invocation.isToString((InvocationOnMock) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.internal.invocation.Invocation", e);
      }
  }
}
