/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 17:13:18 GMT 2018
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
import org.mockito.verification.After;
import org.mockito.verification.VerificationMode;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VerificationOverTimeImpl_ESTest extends VerificationOverTimeImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AtMost atMost0 = new AtMost(2391);
      After after0 = new After(0L, atMost0);
      VerificationOverTimeImpl verificationOverTimeImpl0 = new VerificationOverTimeImpl(0L, 1517L, after0, false);
      long long0 = verificationOverTimeImpl0.getDuration();
      assertEquals(1517L, long0);
      assertEquals(0L, verificationOverTimeImpl0.getPollingPeriod());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AtMost atMost0 = new AtMost(7005);
      VerificationOverTimeImpl verificationOverTimeImpl0 = new VerificationOverTimeImpl(1477L, 1477L, atMost0, true);
      verificationOverTimeImpl0.getDelegate();
      assertEquals(1477L, verificationOverTimeImpl0.getDuration());
      assertEquals(1477L, verificationOverTimeImpl0.getPollingPeriod());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NoMoreInteractions noMoreInteractions0 = new NoMoreInteractions();
      Timer timer0 = new Timer(718L);
      VerificationOverTimeImpl verificationOverTimeImpl0 = new VerificationOverTimeImpl(1L, (-1840L), noMoreInteractions0, true, timer0);
      long long0 = verificationOverTimeImpl0.getPollingPeriod();
      assertEquals(1L, long0);
      assertEquals((-1840L), verificationOverTimeImpl0.getDuration());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Timer timer0 = new Timer((-15L));
      VerificationOverTimeImpl verificationOverTimeImpl0 = new VerificationOverTimeImpl((-15L), (-15L), (VerificationMode) null, false, timer0);
      verificationOverTimeImpl0.verify((VerificationData) null);
      assertEquals((-15L), verificationOverTimeImpl0.getDuration());
      assertEquals((-15L), verificationOverTimeImpl0.getPollingPeriod());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AtMost atMost0 = new AtMost(7005);
      VerificationOverTimeImpl verificationOverTimeImpl0 = new VerificationOverTimeImpl(1477L, 1477L, atMost0, true);
      ThreadSafeMockingProgress threadSafeMockingProgress0 = new ThreadSafeMockingProgress();
      MockSettingsImpl<NoMoreInteractions> mockSettingsImpl0 = new MockSettingsImpl<NoMoreInteractions>();
      InvocationContainerImpl invocationContainerImpl0 = new InvocationContainerImpl(threadSafeMockingProgress0, mockSettingsImpl0);
      VerificationDataImpl verificationDataImpl0 = new VerificationDataImpl(invocationContainerImpl0, (InvocationMatcher) null);
      verificationOverTimeImpl0.verify(verificationDataImpl0);
      assertEquals(1477L, verificationOverTimeImpl0.getPollingPeriod());
      assertEquals(1477L, verificationOverTimeImpl0.getDuration());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AtMost atMost0 = new AtMost(2391);
      After after0 = new After(0L, atMost0);
      VerificationOverTimeImpl verificationOverTimeImpl0 = new VerificationOverTimeImpl(0L, 1517L, after0, false);
      MockingProgressImpl mockingProgressImpl0 = new MockingProgressImpl();
      MockSettingsImpl<Integer> mockSettingsImpl0 = new MockSettingsImpl<Integer>();
      InvocationContainerImpl invocationContainerImpl0 = new InvocationContainerImpl(mockingProgressImpl0, mockSettingsImpl0);
      VerificationDataImpl verificationDataImpl0 = new VerificationDataImpl(invocationContainerImpl0, (InvocationMatcher) null);
      // Undeclared exception!
      verificationOverTimeImpl0.verify(verificationDataImpl0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AtMost atMost0 = new AtMost(2391);
      After after0 = new After(0L, atMost0);
      VerificationOverTimeImpl verificationOverTimeImpl0 = new VerificationOverTimeImpl(0L, 1517L, after0, false);
      boolean boolean0 = verificationOverTimeImpl0.canRecoverFromFailure(atMost0);
      assertEquals(1517L, verificationOverTimeImpl0.getDuration());
      assertFalse(boolean0);
      assertEquals(0L, verificationOverTimeImpl0.getPollingPeriod());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      VerificationOverTimeImpl verificationOverTimeImpl0 = new VerificationOverTimeImpl((-2237L), (-2237L), (VerificationMode) null, false);
      boolean boolean0 = verificationOverTimeImpl0.canRecoverFromFailure(verificationOverTimeImpl0);
      assertEquals((-2237L), verificationOverTimeImpl0.getPollingPeriod());
      assertEquals((-2237L), verificationOverTimeImpl0.getDuration());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NoMoreInteractions noMoreInteractions0 = new NoMoreInteractions();
      Timer timer0 = new Timer(718L);
      VerificationOverTimeImpl verificationOverTimeImpl0 = new VerificationOverTimeImpl(1L, (-1840L), noMoreInteractions0, true, timer0);
      boolean boolean0 = verificationOverTimeImpl0.canRecoverFromFailure(noMoreInteractions0);
      assertEquals((-1840L), verificationOverTimeImpl0.getDuration());
      assertFalse(boolean0);
      assertEquals(1L, verificationOverTimeImpl0.getPollingPeriod());
  }
}
