/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 17:54:49 GMT 2018
 */

package org.mockito.internal.creation.instance;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.internal.creation.instance.ConstructorInstantiator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstructorInstantiator_ESTest extends ConstructorInstantiator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConstructorInstantiator constructorInstantiator0 = new ConstructorInstantiator("");
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        constructorInstantiator0.newInstance(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to create mock instance of 'Object'.
         // Please ensure that the outer instance has correct type and that the target class has parameter-less constructor.
         //
         verifyException("org.mockito.internal.creation.instance.ConstructorInstantiator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConstructorInstantiator constructorInstantiator0 = new ConstructorInstantiator((Object) null);
      Class<String> class0 = String.class;
      String string0 = constructorInstantiator0.newInstance(class0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ConstructorInstantiator constructorInstantiator0 = new ConstructorInstantiator("");
      Class<String> class0 = String.class;
      String string0 = constructorInstantiator0.newInstance(class0);
      assertEquals("", string0);
  }
}