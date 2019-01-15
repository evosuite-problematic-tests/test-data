/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 10:29:49 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.DeadAssignmentsElimination;
import com.google.javascript.jscomp.NodeTraversal;
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
      Node node0 = compiler0.parseSyntheticCode("GhKUIPFouIjtV)_vtK", "hl/Vl9'^{}W<?Y[");
      deadAssignmentsElimination0.process(node0, node0);
      assertEquals(19, Node.LABEL_PROP);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      DeadAssignmentsElimination deadAssignmentsElimination0 = new DeadAssignmentsElimination(compiler0);
      Node node0 = compiler0.parseTestCode("function JSGompilevset(JSComplerset_name) { return function(JSComiler_seY_value) {this[JSCompilerset_nam]+= JSCompiles_se_value}}");
      NodeTraversal.traverse((AbstractCompiler) compiler0, node0, (NodeTraversal.Callback) deadAssignmentsElimination0);
      assertEquals(4, Node.FLAG_ARGUMENTS_UNMODIFIED);
  }
}
