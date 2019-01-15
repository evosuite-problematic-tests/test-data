/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 05:21:33 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.MaybeReachingVariableUse;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MaybeReachingVariableUse_ESTest extends MaybeReachingVariableUse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "B f|EPZ)c", (String) null);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
      // Undeclared exception!
      try { 
        maybeReachingVariableUse0.getUses((String) null, node0);
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
      Node node0 = Node.newNumber((-902.3382), (-25), (-25));
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      JSTypeNative jSTypeNative0 = JSTypeNative.OBJECT_PROTOTYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      Scope scope0 = new Scope(node0, objectType0);
      Compiler compiler0 = new Compiler();
      MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = maybeReachingVariableUse0.createInitialEstimateLattice();
      assertNotNull(maybeReachingVariableUse_ReachingUses0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Node node0 = Node.newNumber((-902.3382), (-25), (-25));
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      JSTypeNative jSTypeNative0 = JSTypeNative.OBJECT_PROTOTYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      Scope scope0 = new Scope(node0, objectType0);
      Compiler compiler0 = new Compiler();
      MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = maybeReachingVariableUse0.createEntryLattice();
      boolean boolean0 = maybeReachingVariableUse_ReachingUses0.equals(controlFlowGraph0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Node node0 = Node.newNumber((-902.3382), (-25), (-25));
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.RANGE_ERROR_FUNCTION_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      Scope scope0 = new Scope(node0, objectType0);
      Compiler compiler0 = new Compiler();
      MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = maybeReachingVariableUse0.createEntryLattice();
      boolean boolean0 = maybeReachingVariableUse_ReachingUses0.equals(maybeReachingVariableUse_ReachingUses0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Node node0 = Node.newNumber((-902.3382), (-25), (-25));
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.RANGE_ERROR_FUNCTION_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      Scope scope0 = new Scope(node0, objectType0);
      Compiler compiler0 = new Compiler();
      MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = maybeReachingVariableUse0.createEntryLattice();
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses1 = maybeReachingVariableUse0.join(maybeReachingVariableUse_ReachingUses0, maybeReachingVariableUse_ReachingUses0);
      assertTrue(maybeReachingVariableUse_ReachingUses1.equals((Object)maybeReachingVariableUse_ReachingUses0));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Node node0 = Node.newNumber((-902.3382), (-25), (-25));
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      ControlFlowGraph.Branch controlFlowGraph_Branch0 = ControlFlowGraph.Branch.ON_TRUE;
      controlFlowGraph0.connectToImplicitReturn(node0, controlFlowGraph_Branch0);
      JSTypeNative jSTypeNative0 = JSTypeNative.RANGE_ERROR_FUNCTION_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      Scope scope0 = new Scope(node0, objectType0);
      Compiler compiler0 = new Compiler();
      MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = maybeReachingVariableUse0.createEntryLattice();
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses1 = maybeReachingVariableUse0.flowThrough(node0, maybeReachingVariableUse_ReachingUses0);
      assertNotSame(maybeReachingVariableUse_ReachingUses1, maybeReachingVariableUse_ReachingUses0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Node node0 = Node.newNumber((-902.3382), (-25), (-25));
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) null);
      ControlFlowGraph.Branch controlFlowGraph_Branch0 = ControlFlowGraph.Branch.ON_EX;
      controlFlowGraph0.connectToImplicitReturn(node0, controlFlowGraph_Branch0);
      JSTypeNative jSTypeNative0 = JSTypeNative.OBJECT_PROTOTYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      Scope scope0 = new Scope(node0, objectType0);
      Compiler compiler0 = new Compiler();
      MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = maybeReachingVariableUse0.createEntryLattice();
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses1 = maybeReachingVariableUse0.flowThrough(node0, maybeReachingVariableUse_ReachingUses0);
      assertNotSame(maybeReachingVariableUse_ReachingUses1, maybeReachingVariableUse_ReachingUses0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Node node0 = Node.newNumber((-902.3382), (-25), (-25));
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.RANGE_ERROR_FUNCTION_TYPE;
      ObjectType objectType0 = jSTypeRegistry0.getNativeObjectType(jSTypeNative0);
      Scope scope0 = new Scope(node0, objectType0);
      Compiler compiler0 = new Compiler();
      MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
      node0.addChildToBack(node0);
      MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = maybeReachingVariableUse0.createEntryLattice();
      // Undeclared exception!
      try { 
        maybeReachingVariableUse0.flowThrough(node0, maybeReachingVariableUse_ReachingUses0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }
}
