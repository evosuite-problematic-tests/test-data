/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 11:54:35 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.MinimizeExitPoints;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MinimizeExitPoints_ESTest extends MinimizeExitPoints_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      Node node0 = compiler0.parseSyntheticCode("ES5_STR,ICT", "ES5_STR,ICT");
      minimizeExitPoints0.process(node0, node0);
      assertFalse(node0.isComma());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      Node node0 = compiler0.parseSyntheticCode("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints");
      minimizeExitPoints0.tryMinimizeExits(node0, (-910), (String) null);
      assertFalse(node0.isThrow());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
      Node node0 = new Node(225);
      minimizeExitPoints0.tryMinimizeExits(node0, 225, "jk5");
      assertEquals(55, Node.INFERRED_FUNCTION);
  }
}
