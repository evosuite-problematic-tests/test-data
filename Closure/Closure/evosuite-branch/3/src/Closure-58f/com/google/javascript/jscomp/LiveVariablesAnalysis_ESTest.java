/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 09:24:19 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.LiveVariablesAnalysis;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.rhino.Node;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LiveVariablesAnalysis_ESTest extends LiveVariablesAnalysis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "/0zgI2x'<_;", "o");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      Set<Scope.Var> set0 = liveVariablesAnalysis0.getEscapedLocals();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "/0zgI2x'<_;", "o");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      // Undeclared exception!
      try { 
        liveVariablesAnalysis0.getVarIndex("/0zgI2x'<_;");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.LiveVariablesAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "/0zgI2x'<_;", "o");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createEntryLattice();
      // Undeclared exception!
      try { 
        liveVariablesAnalysis_LiveVariableLattice0.isLive((Scope.Var) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "/0zgI2x'<_;", "o");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createEntryLattice();
      String string0 = liveVariablesAnalysis_LiveVariableLattice0.toString();
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "/0zgI2x'<_;", "o");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createEntryLattice();
      boolean boolean0 = liveVariablesAnalysis_LiveVariableLattice0.isLive(108);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode(".NGB;N", ".NGB;N");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createInitialEstimateLattice();
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice1 = liveVariablesAnalysis0.join(liveVariablesAnalysis_LiveVariableLattice0, liveVariablesAnalysis_LiveVariableLattice0);
      assertNotSame(liveVariablesAnalysis_LiveVariableLattice1, liveVariablesAnalysis_LiveVariableLattice0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("NRcQBtN", "NRcQBtN");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, false, false);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createInitialEstimateLattice();
      JSModule jSModule0 = new JSModule("NRcQBtN");
      boolean boolean0 = liveVariablesAnalysis_LiveVariableLattice0.equals(jSModule0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("NRcQBtN", "NRcQBtN");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, false, false);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createInitialEstimateLattice();
      boolean boolean0 = liveVariablesAnalysis_LiveVariableLattice0.equals(liveVariablesAnalysis_LiveVariableLattice0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("o", "o");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createEntryLattice();
      ControlFlowGraph.Branch controlFlowGraph_Branch0 = ControlFlowGraph.Branch.UNCOND;
      controlFlowGraph0.connectToImplicitReturn(node0, controlFlowGraph_Branch0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice1 = liveVariablesAnalysis0.flowThrough(node0, liveVariablesAnalysis_LiveVariableLattice0);
      assertNotSame(liveVariablesAnalysis_LiveVariableLattice1, liveVariablesAnalysis_LiveVariableLattice0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("o", "o");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createInitialEstimateLattice();
      ControlFlowGraph.Branch controlFlowGraph_Branch0 = ControlFlowGraph.Branch.ON_EX;
      controlFlowGraph0.connectToImplicitReturn(node0, controlFlowGraph_Branch0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice1 = liveVariablesAnalysis0.flowThrough(node0, liveVariablesAnalysis_LiveVariableLattice0);
      assertNotSame(liveVariablesAnalysis_LiveVariableLattice1, liveVariablesAnalysis_LiveVariableLattice0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("NRcQBtN", "NRcQBtN");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, false, false);
      node0.setType(114);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createInitialEstimateLattice();
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice1 = liveVariablesAnalysis0.flowThrough(node0, liveVariablesAnalysis_LiveVariableLattice0);
      assertNotSame(liveVariablesAnalysis_LiveVariableLattice1, liveVariablesAnalysis_LiveVariableLattice0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("h", "h");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, false, false);
      node0.setType(98);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createEntryLattice();
      // Undeclared exception!
      try { 
        liveVariablesAnalysis0.flowThrough(node0, liveVariablesAnalysis_LiveVariableLattice0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.LiveVariablesAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("h", "h");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      node0.setType(100);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createInitialEstimateLattice();
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice1 = liveVariablesAnalysis0.flowThrough(node0, liveVariablesAnalysis_LiveVariableLattice0);
      assertNotSame(liveVariablesAnalysis_LiveVariableLattice1, liveVariablesAnalysis_LiveVariableLattice0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("h", "h");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      node0.setType(101);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createInitialEstimateLattice();
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice1 = liveVariablesAnalysis0.flowThrough(node0, liveVariablesAnalysis_LiveVariableLattice0);
      assertNotSame(liveVariablesAnalysis_LiveVariableLattice1, liveVariablesAnalysis_LiveVariableLattice0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("h", "h");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      node0.setType(108);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createInitialEstimateLattice();
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice1 = liveVariablesAnalysis0.flowThrough(node0, liveVariablesAnalysis_LiveVariableLattice0);
      assertNotSame(liveVariablesAnalysis_LiveVariableLattice1, liveVariablesAnalysis_LiveVariableLattice0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("h", "h");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      node0.setType(113);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createEntryLattice();
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice1 = liveVariablesAnalysis0.flowThrough(node0, liveVariablesAnalysis_LiveVariableLattice0);
      assertNotSame(liveVariablesAnalysis_LiveVariableLattice1, liveVariablesAnalysis_LiveVariableLattice0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("NRBtN", "NRBtN");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, false, false);
      node0.setType(115);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createInitialEstimateLattice();
      // Undeclared exception!
      try { 
        liveVariablesAnalysis0.flowThrough(node0, liveVariablesAnalysis_LiveVariableLattice0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // malformed 'for' statement FOR 1 [synthetic: com.google.javascript.rhino.Node$IntPropListItem@0000000483] [source_file: com.google.javascript.rhino.Node$ObjectPropListItem@0000000484] [input_id: com.google.javascript.rhino.Node$ObjectPropListItem@0000000485]
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode(".NGB;N", ".NGB;N");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      node0.setType(118);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createInitialEstimateLattice();
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice1 = liveVariablesAnalysis0.flowThrough(node0, liveVariablesAnalysis_LiveVariableLattice0);
      assertNotSame(liveVariablesAnalysis_LiveVariableLattice1, liveVariablesAnalysis_LiveVariableLattice0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("Gl", "Gl");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, false, false);
      node0.setType(125);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createEntryLattice();
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice1 = liveVariablesAnalysis0.flowThrough(node0, liveVariablesAnalysis_LiveVariableLattice0);
      assertNotSame(liveVariablesAnalysis_LiveVariableLattice1, liveVariablesAnalysis_LiveVariableLattice0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("NRVcQBSuN", "NRVcQBSuN");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, false, false);
      node0.setType(118);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createInitialEstimateLattice();
      // Undeclared exception!
      try { 
        liveVariablesAnalysis0.flowThrough(node0, liveVariablesAnalysis_LiveVariableLattice0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("arguments", "arguments");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, false, false);
      node0.setType(2048);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createEntryLattice();
      // Undeclared exception!
      try { 
        liveVariablesAnalysis0.flowThrough(node0, liveVariablesAnalysis_LiveVariableLattice0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.LiveVariablesAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("Gl", "Gl");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, false, false);
      node0.setType(97);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createEntryLattice();
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice1 = liveVariablesAnalysis0.flowThrough(node0, liveVariablesAnalysis_LiveVariableLattice0);
      assertNotSame(liveVariablesAnalysis_LiveVariableLattice1, liveVariablesAnalysis_LiveVariableLattice0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("h", "h");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      Node node1 = new Node(8292, node0);
      node1.detachChildren();
      node0.addChildrenToBack(node1);
      liveVariablesAnalysis0.markAllParametersEscaped();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("h", "h");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      node0.addChildrenToBack(node0);
      // Undeclared exception!
      try { 
        liveVariablesAnalysis0.markAllParametersEscaped();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // EXPR_RESULT 1 [source_file: com.google.javascript.rhino.Node$ObjectPropListItem@0000000470] is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }
}