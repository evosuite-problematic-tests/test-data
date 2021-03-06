/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 08:19:00 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerInput;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.MustBeReachingVariableDef;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MustBeReachingVariableDef_ESTest extends MustBeReachingVariableDef_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, ";N,_SAOW", ";N,_SAOW");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      mustBeReachingVariableDef0.analyze();
      Node node1 = mustBeReachingVariableDef0.getDef(";N,_SAOW", node0);
      assertNull(node1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "arguments", "arguments");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, false, false);
      Scope scope0 = new Scope(node0, compiler0);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSTypeNative[] jSTypeNativeArray0 = new JSTypeNative[4];
      JSTypeNative jSTypeNative0 = JSTypeNative.BOOLEAN_TYPE;
      jSTypeNativeArray0[0] = jSTypeNative0;
      jSTypeNativeArray0[1] = jSTypeNativeArray0[0];
      jSTypeNativeArray0[2] = jSTypeNativeArray0[0];
      jSTypeNativeArray0[3] = jSTypeNativeArray0[0];
      JSType jSType0 = jSTypeRegistry0.createUnionType(jSTypeNativeArray0);
      scope0.declare("arguments", node0, jSType0, (CompilerInput) null, true);
      MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef0 = mustBeReachingVariableDef0.createEntryLattice();
      // Undeclared exception!
      try { 
        mustBeReachingVariableDef0.flowThrough(node0, mustBeReachingVariableDef_MustDef0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.MustBeReachingVariableDef", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, ";N,_SAOW", ";N,_SAOW");
      MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef0 = new MustBeReachingVariableDef.MustDef();
      boolean boolean0 = mustBeReachingVariableDef_MustDef0.equals(node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "NO_SHADOW", "NO_SHADOW");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, false, false);
      Scope scope0 = new Scope(node0, compiler0);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef0 = mustBeReachingVariableDef0.createInitialEstimateLattice();
      MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef1 = mustBeReachingVariableDef0.join(mustBeReachingVariableDef_MustDef0, mustBeReachingVariableDef_MustDef0);
      assertNotSame(mustBeReachingVariableDef_MustDef1, mustBeReachingVariableDef_MustDef0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("ar=gumnts", "ar=gumnts");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, false, false);
      Scope scope0 = new Scope(node0, compiler0);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef0 = mustBeReachingVariableDef0.createEntryLattice();
      MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef1 = mustBeReachingVariableDef0.flowThrough(node0, mustBeReachingVariableDef_MustDef0);
      assertNotSame(mustBeReachingVariableDef_MustDef1, mustBeReachingVariableDef_MustDef0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "arguments", "arguments");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, false, false);
      Scope scope0 = new Scope(node0, compiler0);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef0 = mustBeReachingVariableDef0.createEntryLattice();
      MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef1 = mustBeReachingVariableDef0.flowThrough(node0, mustBeReachingVariableDef_MustDef0);
      assertNotSame(mustBeReachingVariableDef_MustDef1, mustBeReachingVariableDef_MustDef0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, ";N,_SAOW", ";N,_SAOW");
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative[] jSTypeNativeArray0 = new JSTypeNative[5];
      JSTypeNative jSTypeNative0 = JSTypeNative.STRING_OBJECT_FUNCTION_TYPE;
      jSTypeNativeArray0[0] = jSTypeNative0;
      jSTypeNativeArray0[1] = jSTypeNative0;
      jSTypeNativeArray0[2] = jSTypeNative0;
      jSTypeNativeArray0[3] = jSTypeNative0;
      jSTypeNativeArray0[4] = jSTypeNativeArray0[0];
      JSType jSType0 = jSTypeRegistry0.createUnionType(jSTypeNativeArray0);
      InputId inputId0 = node0.getInputId();
      CompilerInput compilerInput0 = compiler0.getInput(inputId0);
      scope0.declare(";N,_SAOW", node0, jSType0, compilerInput0);
      mustBeReachingVariableDef0.analyze();
      Node node1 = mustBeReachingVariableDef0.getDef(";N,_SAOW", node0);
      assertEquals(52, Node.LENGTH);
  }
}
