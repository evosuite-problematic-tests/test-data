/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 07:44:49 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerInput;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.MaybeReachingVariableUse;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MaybeReachingVariableUse_ESTest extends MaybeReachingVariableUse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "bXf@n,Z8{[?!~x]!_", "bXf@n,Z8{[?!~x]!_");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, false);
      Scope scope0 = new Scope(node0, compiler0);
      MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
      // Undeclared exception!
      try { 
        maybeReachingVariableUse0.getUses("'1]FFFVy]", node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.MaybeReachingVariableUse", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "YzD", "YzD");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, false);
      Scope scope0 = new Scope(node0, compiler0);
      MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = maybeReachingVariableUse0.createInitialEstimateLattice();
      assertNotNull(maybeReachingVariableUse_ReachingUses0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "YzD", "YzD");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, false);
      Scope scope0 = new Scope(node0, compiler0);
      MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = maybeReachingVariableUse0.createEntryLattice();
      assertNotNull(maybeReachingVariableUse_ReachingUses0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = new MaybeReachingVariableUse.ReachingUses();
      Object object0 = new Object();
      boolean boolean0 = maybeReachingVariableUse_ReachingUses0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = new MaybeReachingVariableUse.ReachingUses();
      boolean boolean0 = maybeReachingVariableUse_ReachingUses0.equals(maybeReachingVariableUse_ReachingUses0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = new MaybeReachingVariableUse.ReachingUses();
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("YzD");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
      scope0.declare("YzD", node0, (JSType) null, (CompilerInput) null, false);
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses1 = maybeReachingVariableUse0.flowThrough(node0, maybeReachingVariableUse_ReachingUses0);
      boolean boolean0 = maybeReachingVariableUse_ReachingUses0.equals(maybeReachingVariableUse_ReachingUses1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = new MaybeReachingVariableUse.ReachingUses();
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "YzD", "YzD");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, false);
      Scope scope0 = new Scope(node0, compiler0);
      MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses1 = maybeReachingVariableUse0.join(maybeReachingVariableUse_ReachingUses0, maybeReachingVariableUse_ReachingUses0);
      assertNotSame(maybeReachingVariableUse_ReachingUses1, maybeReachingVariableUse_ReachingUses0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = new MaybeReachingVariableUse.ReachingUses();
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "YzD", "YzD");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, false);
      Scope scope0 = new Scope(node0, compiler0);
      MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
      ControlFlowGraph.Branch controlFlowGraph_Branch0 = ControlFlowGraph.Branch.ON_EX;
      controlFlowGraph0.connect(node0, controlFlowGraph_Branch0, node0);
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses1 = maybeReachingVariableUse0.flowThrough(node0, maybeReachingVariableUse_ReachingUses0);
      assertNotSame(maybeReachingVariableUse_ReachingUses1, maybeReachingVariableUse_ReachingUses0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = new MaybeReachingVariableUse.ReachingUses();
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "bXf@n,Z8{[?!~x]!_", "bXf@n,Z8{[?!~x]!_");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, false);
      Scope scope0 = new Scope(node0, compiler0);
      MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
      ControlFlowGraph.Branch controlFlowGraph_Branch0 = ControlFlowGraph.Branch.UNCOND;
      controlFlowGraph0.connect(node0, controlFlowGraph_Branch0, node0);
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses1 = maybeReachingVariableUse0.flowThrough(node0, maybeReachingVariableUse_ReachingUses0);
      assertNotSame(maybeReachingVariableUse_ReachingUses1, maybeReachingVariableUse_ReachingUses0);
  }
}
