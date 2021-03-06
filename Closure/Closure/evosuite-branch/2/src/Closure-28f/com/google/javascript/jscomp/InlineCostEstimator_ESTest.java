/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 12:42:40 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.InlineCostEstimator;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InlineCostEstimator_ESTest extends InlineCostEstimator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Node node0 = Node.newString("3:HVm6");
      node0.setType(38);
      int int0 = InlineCostEstimator.getCost(node0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Node node0 = Node.newNumber((-1591.4), Integer.MAX_VALUE, Integer.MAX_VALUE);
      int int0 = InlineCostEstimator.getCost(node0, 0);
      assertEquals(1, int0);
  }
}
