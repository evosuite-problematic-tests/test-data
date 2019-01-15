/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 07 03:41:19 GMT 2019
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
      Node node0 = Node.newNumber((-2177.673383610566));
      int int0 = InlineCostEstimator.getCost(node0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Node node0 = Node.newString("_", 1273, 1114);
      int int0 = InlineCostEstimator.getCost(node0, 0);
      assertEquals(3, int0);
  }
}