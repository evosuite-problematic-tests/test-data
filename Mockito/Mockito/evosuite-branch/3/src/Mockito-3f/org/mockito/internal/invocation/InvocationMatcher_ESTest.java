/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 17:39:59 GMT 2019
 */

package org.mockito.internal.invocation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.hamcrest.Matcher;
import org.junit.runner.RunWith;
import org.mockito.internal.invocation.InvocationMatcher;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.Location;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InvocationMatcher_ESTest extends InvocationMatcher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      Invocation invocation0 = mock(Invocation.class, new ViolatedAssumptionAnswer());
      doReturn(objectArray0).when(invocation0).getArguments();
      doReturn((Method) null).when(invocation0).getMethod();
      InvocationMatcher invocationMatcher0 = new InvocationMatcher(invocation0);
      Method method0 = invocationMatcher0.getMethod();
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      Invocation invocation0 = mock(Invocation.class, new ViolatedAssumptionAnswer());
      doReturn(objectArray0).when(invocation0).getArguments();
      InvocationMatcher invocationMatcher0 = new InvocationMatcher(invocation0);
      List<Matcher> list0 = (List<Matcher>)invocationMatcher0.getMatchers();
      assertEquals(8, list0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      Invocation invocation0 = mock(Invocation.class, new ViolatedAssumptionAnswer());
      doReturn((Object[]) null).when(invocation0).getArguments();
      InvocationMatcher invocationMatcher0 = null;
      try {
        invocationMatcher0 = new InvocationMatcher(invocation0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.internal.invocation.ArgumentsProcessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      Invocation invocation0 = mock(Invocation.class, new ViolatedAssumptionAnswer());
      doReturn((Object[]) null).when(invocation0).getArguments();
      InvocationMatcher invocationMatcher0 = null;
      try {
        invocationMatcher0 = new InvocationMatcher(invocation0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.internal.invocation.ArgumentsProcessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      Invocation invocation0 = mock(Invocation.class, new ViolatedAssumptionAnswer());
      doReturn((Object[]) null).when(invocation0).getArguments();
      InvocationMatcher invocationMatcher0 = null;
      try {
        invocationMatcher0 = new InvocationMatcher(invocation0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.internal.invocation.ArgumentsProcessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Stack<Invocation> stack0 = new Stack<Invocation>();
      List<InvocationMatcher> list0 = InvocationMatcher.createFrom(stack0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LinkedList<Invocation> linkedList0 = new LinkedList<Invocation>();
      linkedList0.add((Invocation) null);
      // Undeclared exception!
      try { 
        InvocationMatcher.createFrom(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.internal.invocation.InvocationMatcher", e);
      }
  }
}
