/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 22:10:59 GMT 2019
 */

package org.mockito.internal.verification;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.invocation.InvocationMatcher;
import org.mockito.internal.progress.MockingProgressImpl;
import org.mockito.internal.progress.ThreadSafeMockingProgress;
import org.mockito.internal.stubbing.InvocationContainerImpl;
import org.mockito.internal.util.Timer;
import org.mockito.internal.verification.AtMost;
import org.mockito.internal.verification.NoMoreInteractions;
import org.mockito.internal.verification.VerificationDataImpl;
import org.mockito.internal.verification.VerificationOverTimeImpl;
import org.mockito.internal.verification.api.VerificationData;
import org.mockito.verification.Timeout;
import org.mockito.verification.VerificationMode;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VerificationOverTimeImpl_ESTest extends VerificationOverTimeImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NoMoreInteractions noMoreInteractions0 = new NoMoreInteractions();
      VerificationOverTimeImpl verificationOverTimeImpl0 = new VerificationOverTimeImpl(0L, 1536L, noMoreInteractions0, true);
      long long0 = verificationOverTimeImpl0.getDuration();
      assertEquals(1536L, long0);
      assertEquals(0L, verificationOverTimeImpl0.getPollingPeriod());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AtMost atMost0 = new AtMost(16);
      VerificationOverTimeImpl verificationOverTimeImpl0 = new VerificationOverTimeImpl(366L, 2484L, atMost0, false);
      verificationOverTimeImpl0.getDelegate();
      assertEquals(366L, verificationOverTimeImpl0.getPollingPeriod());
      assertEquals(2484L, verificationOverTimeImpl0.getDuration());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NoMoreInteractions noMoreInteractions0 = new NoMoreInteractions();
      VerificationOverTimeImpl verificationOverTimeImpl0 = new VerificationOverTimeImpl(0L, 1536L, noMoreInteractions0, true);
      long long0 = verificationOverTimeImpl0.getPollingPeriod();
      assertEquals(1536L, verificationOverTimeImpl0.getDuration());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Timer timer0 = new Timer((-944L));
      VerificationOverTimeImpl verificationOverTimeImpl0 = new VerificationOverTimeImpl((-944L), (-944L), (VerificationMode) null, false, timer0);
      verificationOverTimeImpl0.verify((VerificationData) null);
      assertEquals((-944L), verificationOverTimeImpl0.getDuration());
      assertEquals((-944L), verificationOverTimeImpl0.getPollingPeriod());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AtMost atMost0 = new AtMost(16);
      VerificationOverTimeImpl verificationOverTimeImpl0 = new VerificationOverTimeImpl(366L, 2484L, atMost0, false);
      MockingProgressImpl mockingProgressImpl0 = new MockingProgressImpl();
      MockSettingsImpl<Integer> mockSettingsImpl0 = new MockSettingsImpl<Integer>();
      InvocationContainerImpl invocationContainerImpl0 = new InvocationContainerImpl(mockingProgressImpl0, mockSettingsImpl0);
      VerificationDataImpl verificationDataImpl0 = new VerificationDataImpl(invocationContainerImpl0, (InvocationMatcher) null);
      // Undeclared exception!
      verificationOverTimeImpl0.verify(verificationDataImpl0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NoMoreInteractions noMoreInteractions0 = new NoMoreInteractions();
      Timeout timeout0 = new Timeout(2506L, noMoreInteractions0);
      VerificationOverTimeImpl verificationOverTimeImpl0 = new VerificationOverTimeImpl(1078L, 1078L, timeout0, true);
      ThreadSafeMockingProgress threadSafeMockingProgress0 = new ThreadSafeMockingProgress();
      MockSettingsImpl<NoMoreInteractions> mockSettingsImpl0 = new MockSettingsImpl<NoMoreInteractions>();
      InvocationContainerImpl invocationContainerImpl0 = new InvocationContainerImpl(threadSafeMockingProgress0, mockSettingsImpl0);
      VerificationDataImpl verificationDataImpl0 = new VerificationDataImpl(invocationContainerImpl0, (InvocationMatcher) null);
      verificationOverTimeImpl0.verify(verificationDataImpl0);
      assertEquals(1078L, verificationOverTimeImpl0.getPollingPeriod());
      assertEquals(1078L, verificationOverTimeImpl0.getDuration());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AtMost atMost0 = new AtMost(16);
      VerificationOverTimeImpl verificationOverTimeImpl0 = new VerificationOverTimeImpl(366L, 2484L, atMost0, false);
      boolean boolean0 = verificationOverTimeImpl0.canRecoverFromFailure(atMost0);
      assertEquals(2484L, verificationOverTimeImpl0.getDuration());
      assertEquals(366L, verificationOverTimeImpl0.getPollingPeriod());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Timer timer0 = new Timer((-944L));
      VerificationOverTimeImpl verificationOverTimeImpl0 = new VerificationOverTimeImpl((-944L), (-944L), (VerificationMode) null, false, timer0);
      boolean boolean0 = verificationOverTimeImpl0.canRecoverFromFailure((VerificationMode) null);
      assertEquals((-944L), verificationOverTimeImpl0.getDuration());
      assertTrue(boolean0);
      assertEquals((-944L), verificationOverTimeImpl0.getPollingPeriod());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NoMoreInteractions noMoreInteractions0 = new NoMoreInteractions();
      VerificationOverTimeImpl verificationOverTimeImpl0 = new VerificationOverTimeImpl(0L, 1536L, noMoreInteractions0, true);
      boolean boolean0 = verificationOverTimeImpl0.canRecoverFromFailure(noMoreInteractions0);
      assertFalse(boolean0);
      assertEquals(1536L, verificationOverTimeImpl0.getDuration());
      assertEquals(0L, verificationOverTimeImpl0.getPollingPeriod());
  }
}
