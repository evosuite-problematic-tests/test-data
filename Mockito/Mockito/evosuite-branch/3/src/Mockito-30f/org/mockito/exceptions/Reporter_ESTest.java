/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 18:51:32 GMT 2019
 */

package org.mockito.exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;
import org.mockito.exceptions.Discrepancy;
import org.mockito.exceptions.PrintableInvocation;
import org.mockito.exceptions.Reporter;
import org.mockito.exceptions.base.MockitoAssertionError;
import org.mockito.exceptions.verification.junit.ArgumentsAreDifferent;
import org.mockito.internal.debugging.Location;
import org.mockito.internal.exceptions.VerificationAwareInvocation;
import org.mockito.internal.exceptions.base.StackTraceFilter;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.invocation.InvocationMatcher;
import org.mockito.internal.stubbing.StubbedInvocationMatcher;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Reporter_ESTest extends Reporter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.mocksHaveToBePassedToVerifyNoMoreInteractions();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      Location location0 = new Location();
      // Undeclared exception!
      try { 
        reporter0.tooManyActualInvocations(0, 0, (PrintableInvocation) null, location0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.noMoreInteractionsWantedInOrder((Invocation) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.wantedButNotInvoked((PrintableInvocation) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        reporter0.cannotMockFinalClass(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.extraInterfacesDoesNotAcceptNullParameters();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.wrongTypeOfReturnValue("org.mockito.exceptions.verification.junit.JUnitTool", "E}]6Ho(2NZe", "E}]6Ho(2NZe");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.nullPassedWhenCreatingInOrder();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      MockThrowable mockThrowable0 = new MockThrowable("Using the FastClass empty constructor--please report to the cglib-devel mailing list");
      // Undeclared exception!
      try { 
        reporter0.checkedExceptionInvalid(mockThrowable0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      StackTraceFilter stackTraceFilter0 = new StackTraceFilter();
      Location location0 = new Location(stackTraceFilter0);
      // Undeclared exception!
      try { 
        reporter0.tooManyActualInvocationsInOrder(3606, 3606, (PrintableInvocation) null, location0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.noArgumentValueWasCaptured();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      MockException mockException0 = new MockException("+o34f;G");
      // Undeclared exception!
      try { 
        reporter0.cannotInitializeForSpyAnnotation("org.mockito.cglib.core.CodeGenerationException", mockException0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      StackTraceFilter stackTraceFilter0 = new StackTraceFilter();
      Location location0 = new Location(stackTraceFilter0);
      // Undeclared exception!
      try { 
        reporter0.unfinishedStubbing(location0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      LinkedList<VerificationAwareInvocation> linkedList0 = new LinkedList<VerificationAwareInvocation>();
      // Undeclared exception!
      try { 
        reporter0.noMoreInteractionsWanted((Invocation) null, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.mocksHaveToBePassedWhenCreatingInOrder();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.notAMockPassedWhenCreatingInOrder();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.inOrderRequiresFamiliarMock();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.cannotVerifyToString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Discrepancy discrepancy0 = new Discrepancy((-2502), (-2502));
      Location location0 = new Location();
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.tooLittleActualInvocations(discrepancy0, (PrintableInvocation) null, location0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.nullPassedToVerifyNoMoreInteractions();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        reporter0.mockedTypeIsInconsistentWithSpiedInstanceType(class0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.wantedButNotInvokedInOrder((PrintableInvocation) null, (PrintableInvocation) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      MockException mockException0 = new MockException("/s+7-");
      // Undeclared exception!
      try { 
        reporter0.cannotInitializeForInjectMocksAnnotation("", mockException0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.cannotStubWithNullThrowable();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.extraInterfacesRequiresAtLeastOneInterface();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      Location location0 = new Location();
      // Undeclared exception!
      try { 
        reporter0.misplacedArgumentMatcher(location0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      StackTraceFilter stackTraceFilter0 = new StackTraceFilter();
      Location location0 = new Location(stackTraceFilter0);
      // Undeclared exception!
      try { 
        reporter0.neverWantedButInvoked((PrintableInvocation) null, location0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.notAMockPassedToVerifyNoMoreInteractions();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.cannotStubVoidMethodWithAReturnValue("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.moreThanOneAnnotationNotAllowed("w6WTMIwKcUbdlo(");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.nullPassedToWhenMethod();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      Class<Invocation> class0 = Invocation.class;
      // Undeclared exception!
      try { 
        reporter0.notAMockPassedToVerify(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.unsupportedCombinationOfAnnotations("org.mockito.internal.debugging.Location", "org.mockito.internal.debugging.Location");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      Location location0 = new Location();
      // Undeclared exception!
      try { 
        reporter0.unfinishedVerificationException(location0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        reporter0.smartNullPointerException(object0, (Location) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.missingMethodInvocation();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.invalidUseOfMatchers(0, 2598);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.onlyVoidMethodsCanBeSetToDoNothing();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.notAMockPassedToWhenMethod();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.wantedAtMostX((-713), (-39));
        fail("Expecting exception: MockitoAssertionError");
      
      } catch(MockitoAssertionError e) {
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.cannotCallRealMethodOnInterface();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      Class<Invocation> class0 = Invocation.class;
      // Undeclared exception!
      try { 
        reporter0.extraInterfacesCannotContainMockedType(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.nullPassedToVerify();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        reporter0.extraInterfacesAcceptsOnlyInterfaces(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Location location0 = new Location();
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.argumentsAreDifferent("OQ&#3IpUTJ@B", "OQ&#3IpUTJ@B", location0);
        fail("Expecting exception: ArgumentsAreDifferent");
      
      } catch(ArgumentsAreDifferent e) {
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedList<StubbedInvocationMatcher> linkedList0 = new LinkedList<StubbedInvocationMatcher>();
      linkedList0.add((StubbedInvocationMatcher) null);
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.wantedButNotInvoked((PrintableInvocation) null, (List<? extends PrintableInvocation>) linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      LinkedList<InvocationMatcher> linkedList0 = new LinkedList<InvocationMatcher>();
      // Undeclared exception!
      try { 
        reporter0.wantedButNotInvoked((PrintableInvocation) null, (List<? extends PrintableInvocation>) linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      Discrepancy discrepancy0 = new Discrepancy(31, 31);
      // Undeclared exception!
      try { 
        reporter0.tooLittleActualInvocationsInOrder(discrepancy0, (PrintableInvocation) null, (Location) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }
}
