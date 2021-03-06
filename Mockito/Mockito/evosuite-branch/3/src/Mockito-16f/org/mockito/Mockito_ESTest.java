/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 18:08:34 GMT 2019
 */

package org.mockito;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.RoundingMode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoDebugger;
import org.mockito.internal.verification.api.VerificationMode;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.Stubber;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Mockito_ESTest extends Mockito_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<RoundingMode> class0 = RoundingMode.class;
      // Undeclared exception!
      try { 
        Mockito.mock(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Stubber stubber0 = Mockito.doNothing();
      assertNotNull(stubber0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VerificationMode verificationMode0 = Mockito.only();
      // Undeclared exception!
      try { 
        Mockito.doReturn(verificationMode0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        Mockito.when((Object) "Argument(s) are different! Wanted:");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer(6);
      VerificationMode verificationMode0 = Mockito.atMost(6);
      // Undeclared exception!
      try { 
        Mockito.verify((Object) integer0, verificationMode0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      // Undeclared exception!
      try { 
        Mockito.verifyZeroInteractions(objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        Mockito.reset(stringArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Stubber stubber0 = Mockito.doCallRealMethod();
      assertNotNull(stubber0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        Mockito.mock(class0, "%0-V}3o?i/N<");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockitoDebugger mockitoDebugger0 = Mockito.debug();
      assertNotNull(mockitoDebugger0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VerificationMode verificationMode0 = Mockito.never();
      assertNotNull(verificationMode0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Mockito.inOrder((Object[]) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Mockito.spy("F>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Mockito mockito0 = new Mockito();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        Mockito.mock(class0, (Answer) mockito0.RETURNS_DEFAULTS);
        fail("Expecting exception: IncompatibleClassChangeError");
      
      } catch(IncompatibleClassChangeError e) {
         //
         // Expected non-static field org.mockito.cglib.proxy.Enhancer.serialVersionUID
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Answer<Object> answer0 = Mockito.RETURNS_SMART_NULLS;
      Stubber stubber0 = Mockito.doAnswer(answer0);
      assertNotNull(stubber0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        Mockito.stubVoid("BVQVU/");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Mockito.stub("O(8pPPz%WXa|v");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      // Undeclared exception!
      try { 
        Mockito.verifyNoMoreInteractions(objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      VerificationMode verificationMode0 = Mockito.atLeastOnce();
      assertNotNull(verificationMode0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        Mockito.atLeast((-3373));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Integer integer0 = new Integer((-2173));
      // Undeclared exception!
      try { 
        Mockito.verify(integer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Mockito.validateMockitoUsage();
  }
}
