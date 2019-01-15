/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 10:03:04 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.DeadAssignmentsElimination;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DeadAssignmentsElimination_ESTest extends DeadAssignmentsElimination_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      DeadAssignmentsElimination deadAssignmentsElimination0 = new DeadAssignmentsElimination(compiler0);
      Node node0 = compiler0.parseSyntheticCode("k.lE1-", "k.lE1-");
      deadAssignmentsElimination0.process(node0, node0);
      assertEquals(21, Node.LOCALCOUNT_PROP);
  }
}
