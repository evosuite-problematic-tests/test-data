/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 18:03:05 GMT 2019
 */

package org.mockito.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import java.util.Locale;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.internal.MockHandler;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.progress.ThreadSafeMockingProgress;
import org.mockito.internal.stubbing.InvocationContainerImpl;
import org.mockito.internal.verification.Only;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.VoidMethodStubbable;
import org.mockito.stubbing.answers.ReturnsElementsOf;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MockHandler_ESTest extends MockHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockHandler<Integer> mockHandler0 = new MockHandler<Integer>((MockSettingsImpl) null);
      // Undeclared exception!
      try { 
        mockHandler0.setAnswersForStubbing((List<Answer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockHandler<ReturnsElementsOf> mockHandler0 = new MockHandler<ReturnsElementsOf>();
      InvocationContainerImpl invocationContainerImpl0 = (InvocationContainerImpl)mockHandler0.getInvocationContainer();
      assertFalse(invocationContainerImpl0.hasAnswersForStubbing());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockHandler<Object> mockHandler0 = new MockHandler<Object>((MockSettingsImpl) null);
      VoidMethodStubbable<Object> voidMethodStubbable0 = mockHandler0.voidMethodStubbable((Object) null);
      assertNotNull(voidMethodStubbable0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      MockHandler<Locale> mockHandler0 = new MockHandler<Locale>(mockSettingsImpl0);
      MockHandler<Locale> mockHandler1 = new MockHandler<Locale>(mockHandler0);
      ThreadSafeMockingProgress threadSafeMockingProgress0 = new ThreadSafeMockingProgress();
      InvocationContainerImpl invocationContainerImpl0 = new InvocationContainerImpl(threadSafeMockingProgress0);
      mockHandler1.invocationContainerImpl = invocationContainerImpl0;
      Vector<String> vector0 = new Vector<String>();
      ReturnsElementsOf returnsElementsOf0 = new ReturnsElementsOf(vector0);
      invocationContainerImpl0.addAnswerForVoidMethod(returnsElementsOf0);
      try { 
        mockHandler1.handle((Invocation) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.internal.invocation.InvocationMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Invocation invocation0 = mock(Invocation.class, new ViolatedAssumptionAnswer());
      MockHandler<Object> mockHandler0 = new MockHandler<Object>();
      ThreadSafeMockingProgress threadSafeMockingProgress0 = new ThreadSafeMockingProgress();
      Only only0 = new Only();
      try { 
        mockHandler0.handle(invocation0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.internal.MockHandler", e);
      }
  }
}