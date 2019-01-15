/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 07 04:49:53 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerInput;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.LiveVariablesAnalysis;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.io.File;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LiveVariablesAnalysis_ESTest extends LiveVariablesAnalysis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MockFile mockFile0 = new MockFile("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator");
      Charset charset0 = Charset.defaultCharset();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile((File) mockFile0, charset0);
      Node node0 = compiler0.parse(jSSourceFile0);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, false, false);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      Set<Scope.Var> set0 = liveVariablesAnalysis0.getEscapedLocals();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      File file0 = MockFile.createTempFile("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator");
      Charset charset0 = Charset.defaultCharset();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile(file0, charset0);
      Node node0 = compiler0.parse(jSSourceFile0);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      // Undeclared exception!
      try { 
        liveVariablesAnalysis0.getVarIndex(" children, but was ");
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
      File file0 = MockFile.createTempFile("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator");
      Charset charset0 = Charset.defaultCharset();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile(file0, charset0);
      Node node0 = compiler0.parse(jSSourceFile0);
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
      File file0 = MockFile.createTempFile("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator");
      Charset charset0 = Charset.defaultCharset();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile(file0, charset0);
      Node node0 = compiler0.parse(jSSourceFile0);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createInitialEstimateLattice();
      String string0 = liveVariablesAnalysis_LiveVariableLattice0.toString();
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      File file0 = MockFile.createTempFile("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator");
      Charset charset0 = Charset.defaultCharset();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile(file0, charset0);
      Node node0 = compiler0.parse(jSSourceFile0);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createInitialEstimateLattice();
      boolean boolean0 = liveVariablesAnalysis_LiveVariableLattice0.isLive(34);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      File file0 = MockFile.createTempFile("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator");
      Charset charset0 = Charset.defaultCharset();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile(file0, charset0);
      Node node0 = compiler0.parse(jSSourceFile0);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createEntryLattice();
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice1 = liveVariablesAnalysis0.join(liveVariablesAnalysis_LiveVariableLattice0, liveVariablesAnalysis_LiveVariableLattice0);
      assertTrue(liveVariablesAnalysis_LiveVariableLattice1.equals((Object)liveVariablesAnalysis_LiveVariableLattice0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Charset charset0 = Charset.defaultCharset();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", charset0);
      Node node0 = compiler0.parse(jSSourceFile0);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createEntryLattice();
      boolean boolean0 = liveVariablesAnalysis_LiveVariableLattice0.equals("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Charset charset0 = Charset.defaultCharset();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", charset0);
      Node node0 = compiler0.parse(jSSourceFile0);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createEntryLattice();
      boolean boolean0 = liveVariablesAnalysis_LiveVariableLattice0.equals(liveVariablesAnalysis_LiveVariableLattice0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode("arguments", "arguments");
      Node node0 = compiler0.parse(jSSourceFile0);
      node0.setType(113);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      JSType jSType0 = jSTypeRegistry0.createNamedType("com.google.javascript.jscomp.CheckSideEffects", "com.google.javascript.jscomp.CheckSideEffects", 37, 2);
      Stack<JSType> stack0 = new Stack<JSType>();
      JSType jSType1 = jSTypeRegistry0.createFunctionTypeWithVarArgs((ObjectType) null, jSType0, (List<JSType>) stack0);
      CompilerInput compilerInput0 = new CompilerInput(jSSourceFile0, false);
      scope0.declare("arguments", node0, jSType1, compilerInput0, true);
      liveVariablesAnalysis0.analyze();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator");
      Node node0 = compiler0.parse(jSSourceFile0);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      ControlFlowGraph.Branch controlFlowGraph_Branch0 = ControlFlowGraph.Branch.SYN_BLOCK;
      controlFlowGraph0.connectIfNotFound(node0, controlFlowGraph_Branch0, node0);
      liveVariablesAnalysis0.analyze();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      File file0 = MockFile.createTempFile("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator");
      Charset charset0 = Charset.defaultCharset();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile(file0, charset0);
      Node node0 = compiler0.parse(jSSourceFile0);
      node0.setType(98);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createInitialEstimateLattice();
      // Undeclared exception!
      try { 
        liveVariablesAnalysis0.flowThrough(node0, liveVariablesAnalysis_LiveVariableLattice0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Charset charset0 = Charset.defaultCharset();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", charset0);
      Node node0 = compiler0.parse(jSSourceFile0);
      node0.setType(100);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      // Undeclared exception!
      try { 
        liveVariablesAnalysis0.analyze();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Charset charset0 = Charset.defaultCharset();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", charset0);
      Node node0 = compiler0.parse(jSSourceFile0);
      node0.setType(101);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      // Undeclared exception!
      try { 
        liveVariablesAnalysis0.analyze();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator");
      Node node0 = compiler0.parse(jSSourceFile0);
      node0.setType(108);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      liveVariablesAnalysis0.analyze();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      File file0 = MockFile.createTempFile("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator");
      Charset charset0 = Charset.defaultCharset();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile(file0, charset0);
      Node node0 = compiler0.parse(jSSourceFile0);
      node0.setType(114);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createInitialEstimateLattice();
      // Undeclared exception!
      try { 
        liveVariablesAnalysis0.flowThrough(node0, liveVariablesAnalysis_LiveVariableLattice0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator");
      Node node0 = compiler0.parse(jSSourceFile0);
      node0.setType(115);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      // Undeclared exception!
      try { 
        liveVariablesAnalysis0.analyze();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // malformed 'for' statement FOR 1 [synthetic: com.google.javascript.rhino.Node$IntPropListItem@0000000503] [source_file: com.google.javascript.rhino.Node$ObjectPropListItem@0000000504] [input_id: com.google.javascript.rhino.Node$ObjectPropListItem@0000000505]
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode("com.google.javascript.jscomp.CrossModuleMe9hodMotion$IdGenerator", "com.google.javascript.jscomp.CrossModuleMe9hodMotion$IdGenerator");
      Node node0 = compiler0.parse(jSSourceFile0);
      node0.setType(118);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      // Undeclared exception!
      try { 
        liveVariablesAnalysis0.analyze();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      File file0 = MockFile.createTempFile("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator");
      Charset charset0 = Charset.defaultCharset();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile(file0, charset0);
      Node node0 = compiler0.parse(jSSourceFile0);
      node0.setType(125);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      liveVariablesAnalysis0.analyze();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode("com.google.javascript.jscomp.CrossModuleMe9hodMotion$IdGenerator", "com.google.javascript.jscomp.CrossModuleMe9hodMotion$IdGenerator");
      Node node0 = compiler0.parse(jSSourceFile0);
      node0.setType(118);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      ControlFlowGraph.Branch controlFlowGraph_Branch0 = ControlFlowGraph.Branch.ON_EX;
      controlFlowGraph0.connectIfNotFound(node0, controlFlowGraph_Branch0, node0);
      liveVariablesAnalysis0.analyze();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode("arguments", "arguments");
      Node node0 = compiler0.parse(jSSourceFile0);
      node0.setType(113);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      // Undeclared exception!
      try { 
        liveVariablesAnalysis0.analyze();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.LiveVariablesAnalysis", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator");
      Node node0 = compiler0.parse(jSSourceFile0);
      node0.setType(97);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      liveVariablesAnalysis0.analyze();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode("arguments", "arguments");
      Node node0 = compiler0.parse(jSSourceFile0);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Scope scope0 = new Scope(node0, compiler0);
      LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
      node0.addChildToFront(node0);
      liveVariablesAnalysis0.markAllParametersEscaped();
  }
}
