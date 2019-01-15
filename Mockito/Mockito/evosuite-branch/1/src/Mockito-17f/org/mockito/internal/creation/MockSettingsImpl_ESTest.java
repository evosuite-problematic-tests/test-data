/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 17:39:45 GMT 2018
 */

package org.mockito.internal.creation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.MockSettings;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.util.MockName;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.ClonesArguments;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MockSettingsImpl_ESTest extends MockSettingsImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      MockSettingsImpl mockSettingsImpl1 = (MockSettingsImpl)mockSettingsImpl0.serializable();
      assertTrue(mockSettingsImpl1.isSerializable());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      MockSettings mockSettings0 = mockSettingsImpl0.name("bL*(b}0\be8sG'8");
      assertSame(mockSettingsImpl0, mockSettings0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      Class<?>[] classArray0 = mockSettingsImpl0.getExtraInterfaces();
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      MockSettings mockSettings0 = mockSettingsImpl0.spiedInstance("bL*(b}0\be8sG'8");
      assertSame(mockSettingsImpl0, mockSettings0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      ClonesArguments clonesArguments0 = new ClonesArguments();
      MockSettings mockSettings0 = mockSettingsImpl0.defaultAnswer(clonesArguments0);
      assertSame(mockSettings0, mockSettingsImpl0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      Class<Object> class0 = Object.class;
      mockSettingsImpl0.initiateMockName(class0);
      assertFalse(mockSettingsImpl0.isSerializable());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      Answer<Object> answer0 = mockSettingsImpl0.getDefaultAnswer();
      assertNull(answer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      boolean boolean0 = mockSettingsImpl0.isSerializable();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      Object object0 = mockSettingsImpl0.getSpiedInstance();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      MockName mockName0 = mockSettingsImpl0.getMockName();
      assertNull(mockName0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      // Undeclared exception!
      try { 
        mockSettingsImpl0.extraInterfaces((Class<?>[]) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      Class<Annotation>[] classArray0 = (Class<Annotation>[]) Array.newInstance(Class.class, 7);
      // Undeclared exception!
      try { 
        mockSettingsImpl0.extraInterfaces(classArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 0);
      // Undeclared exception!
      try { 
        mockSettingsImpl0.extraInterfaces(classArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      Class<Annotation>[] classArray0 = (Class<Annotation>[]) Array.newInstance(Class.class, 7);
      Class<Annotation> class0 = Annotation.class;
      classArray0[0] = class0;
      classArray0[1] = class0;
      classArray0[2] = classArray0[0];
      classArray0[3] = classArray0[1];
      classArray0[4] = classArray0[0];
      classArray0[5] = classArray0[2];
      classArray0[6] = classArray0[4];
      MockSettings mockSettings0 = mockSettingsImpl0.extraInterfaces(classArray0);
      assertSame(mockSettingsImpl0, mockSettings0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 1);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      // Undeclared exception!
      try { 
        mockSettingsImpl0.extraInterfaces(classArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }
}
