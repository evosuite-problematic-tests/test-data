/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 18 10:47:53 GMT 2018
 */

package org.mockito.internal.configuration;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Field;
import java.util.LinkedHashSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.internal.configuration.DefaultInjectionEngine;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultInjectionEngine_ESTest extends DefaultInjectionEngine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultInjectionEngine defaultInjectionEngine0 = new DefaultInjectionEngine();
      LinkedHashSet<Field> linkedHashSet0 = new LinkedHashSet<Field>();
      LinkedHashSet<Object> linkedHashSet1 = new LinkedHashSet<Object>();
      defaultInjectionEngine0.injectMocksOnFields(linkedHashSet0, linkedHashSet1, linkedHashSet0);
      assertEquals(0, linkedHashSet1.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultInjectionEngine defaultInjectionEngine0 = new DefaultInjectionEngine();
      LinkedHashSet<Field> linkedHashSet0 = new LinkedHashSet<Field>();
      LinkedHashSet<Object> linkedHashSet1 = new LinkedHashSet<Object>();
      linkedHashSet0.add((Field) null);
      Integer integer0 = new Integer((-1729));
      // Undeclared exception!
      try { 
        defaultInjectionEngine0.injectMocksOnFields(linkedHashSet0, linkedHashSet1, integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.internal.util.reflection.AccessibilityChanger", e);
      }
  }
}
