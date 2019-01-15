/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 11:03:15 GMT 2018
 */

package org.mockito.internal.stubbing.answers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockError;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.stubbing.answers.AnswersValidator;
import org.mockito.internal.stubbing.answers.CallsRealMethods;
import org.mockito.internal.stubbing.answers.DoesNothing;
import org.mockito.internal.stubbing.answers.Returns;
import org.mockito.internal.stubbing.answers.ThrowsException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AnswersValidator_ESTest extends AnswersValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AnswersValidator answersValidator0 = new AnswersValidator();
      CallsRealMethods callsRealMethods0 = new CallsRealMethods();
      // Undeclared exception!
      try { 
        answersValidator0.validate(callsRealMethods0, (Invocation) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.internal.stubbing.answers.AnswersValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AnswersValidator answersValidator0 = new AnswersValidator();
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException("F**2N6dQhL$[Y");
      ThrowsException throwsException0 = new ThrowsException(mockRuntimeException0);
      answersValidator0.validate(throwsException0, (Invocation) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AnswersValidator answersValidator0 = new AnswersValidator();
      Object object0 = new Object();
      Returns returns0 = new Returns(object0);
      // Undeclared exception!
      try { 
        answersValidator0.validate(returns0, (Invocation) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.internal.stubbing.answers.AnswersValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AnswersValidator answersValidator0 = new AnswersValidator();
      DoesNothing doesNothing0 = new DoesNothing();
      // Undeclared exception!
      try { 
        answersValidator0.validate(doesNothing0, (Invocation) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.internal.stubbing.answers.AnswersValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AnswersValidator answersValidator0 = new AnswersValidator();
      ThrowsException throwsException0 = new ThrowsException((Throwable) null);
      // Undeclared exception!
      try { 
        answersValidator0.validate(throwsException0, (Invocation) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AnswersValidator answersValidator0 = new AnswersValidator();
      MockError mockError0 = new MockError("    verifyZeroInteractions(mockOne, mockTwo);");
      ThrowsException throwsException0 = new ThrowsException(mockError0);
      answersValidator0.validate(throwsException0, (Invocation) null);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AnswersValidator answersValidator0 = new AnswersValidator();
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException();
      MockThrowable mockThrowable0 = new MockThrowable(mockRuntimeException0);
      ThrowsException throwsException0 = new ThrowsException(mockThrowable0);
      // Undeclared exception!
      try { 
        answersValidator0.validate(throwsException0, (Invocation) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.internal.stubbing.answers.AnswersValidator", e);
      }
  }
}