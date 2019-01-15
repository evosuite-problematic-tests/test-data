/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 07 03:45:21 GMT 2019
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
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.SyntacticScopeCreator;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.ArrayList;
import java.util.ListIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MustBeReachingVariableDef_ESTest extends MustBeReachingVariableDef_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Node node0 = new Node(101, 101, 101);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Compiler compiler0 = new Compiler();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "", "");
      Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      // Undeclared exception!
      try { 
        mustBeReachingVariableDef0.analyze(36);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.MustBeReachingVariableDef", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Node node0 = new Node((-3141), (-3141), (-3141));
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Compiler compiler0 = new Compiler();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "R`,Jr}tEn$!{0B", "R`,Jr}tEn$!{0B");
      Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      scope0.declare("HuIt`r", node0, objectType0, (CompilerInput) null, false);
      mustBeReachingVariableDef0.analyze(1692);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Node node0 = new Node((-3141), (-3141), (-3141));
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Compiler compiler0 = new Compiler();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "R`,Jr}tEn$!{0B", "R`,Jr}tEn$!{0B");
      Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ObjectType objectType0 = jSTypeRegistry0.createAnonymousObjectType();
      scope0.declare("HuIt`r", node0, objectType0, (CompilerInput) null, false);
      MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef0 = mustBeReachingVariableDef0.createEntryLattice();
      MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef1 = mustBeReachingVariableDef0.join(mustBeReachingVariableDef_MustDef0, mustBeReachingVariableDef_MustDef0);
      assertTrue(mustBeReachingVariableDef_MustDef1.equals((Object)mustBeReachingVariableDef_MustDef0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArrayList<Scope.Var> arrayList0 = new ArrayList<Scope.Var>();
      ListIterator<Scope.Var> listIterator0 = arrayList0.listIterator();
      MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef0 = new MustBeReachingVariableDef.MustDef(listIterator0);
      SourceFile sourceFile0 = SourceFile.fromCode("+~o1eB7-WlG F5nsXX~", "Wrapped ", (String) null);
      boolean boolean0 = mustBeReachingVariableDef_MustDef0.equals(sourceFile0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Node node0 = new Node(110);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Compiler compiler0 = new Compiler();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "R`,Jr}tEn$!{0B", "R`,Jr}tEn$!{0B");
      Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      mustBeReachingVariableDef0.analyze(36);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Node node0 = new Node(98);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Compiler compiler0 = new Compiler();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.MustBeReachingVaiableDef$MustDef", "com.google.javascript.jscomp.MustBeReachingVaiableDef$MustDef");
      Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      // Undeclared exception!
      try { 
        mustBeReachingVariableDef0.analyze(36);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.MustBeReachingVariableDef", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Node node0 = new Node(99, 99, 99);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Compiler compiler0 = new Compiler();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
      Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      mustBeReachingVariableDef0.analyze(36);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Node node0 = new Node(105, 105, 105);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Compiler compiler0 = new Compiler();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "R`,Jr}tEn$!{0B", "R`,Jr}tEn$!{0B");
      Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      mustBeReachingVariableDef0.analyze(4);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Node node0 = new Node(106, 106, 106);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Compiler compiler0 = new Compiler();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "R`,Jr}tEn$!{0B", "R`,Jr}tEn$!{0B");
      Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      mustBeReachingVariableDef0.analyze(0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Node node0 = new Node(107, 107, 107);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Compiler compiler0 = new Compiler();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "R`,Jr}tEn$!{0B", "R`,Jr}tEn$!{0B");
      Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      mustBeReachingVariableDef0.analyze(1692);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Node node0 = new Node(108, 108, 108);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Compiler compiler0 = new Compiler();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "arguments", "arguments");
      Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      // Undeclared exception!
      try { 
        mustBeReachingVariableDef0.analyze(36);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.MustBeReachingVariableDef", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Node node0 = new Node(109);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Compiler compiler0 = new Compiler();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "R`,Jr}tEn$!{0B", "R`,Jr}tEn$!{0B");
      Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      mustBeReachingVariableDef0.analyze(109);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Node node0 = new Node(111, 111, 111);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Compiler compiler0 = new Compiler();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "R`,Jr}tEn$!{0B", "R`,Jr}tEn$!{0B");
      Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      mustBeReachingVariableDef0.analyze(1692);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Node node0 = new Node(112, 112, 112);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Compiler compiler0 = new Compiler();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "R`,Jr}tEn$!{0B", "R`,Jr}tEn$!{0B");
      Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      mustBeReachingVariableDef0.analyze(1692);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Node node0 = new Node(113, 113, 113);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Compiler compiler0 = new Compiler();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
      Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      // Undeclared exception!
      try { 
        mustBeReachingVariableDef0.analyze(36);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.MustBeReachingVariableDef", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Node node0 = new Node(115, 115, 115);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Compiler compiler0 = new Compiler();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
      Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      // Undeclared exception!
      try { 
        mustBeReachingVariableDef0.analyze(36);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // malformed 'for' statement FOR 115
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Node node0 = new Node(116, 116, 116);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Compiler compiler0 = new Compiler();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
      Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      mustBeReachingVariableDef0.analyze(36);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Node node0 = new Node(118, 118, 118);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Compiler compiler0 = new Compiler();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "arguments", "arguments");
      Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      mustBeReachingVariableDef0.analyze(36);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Node node0 = new Node(120, 120, 120);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Compiler compiler0 = new Compiler();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "arguments", "arguments");
      Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      mustBeReachingVariableDef0.analyze(36);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Node node0 = new Node(121, 121, 121);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Compiler compiler0 = new Compiler();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "arguments", "arguments");
      Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      mustBeReachingVariableDef0.analyze(36);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Node node0 = new Node(123, 123, 123);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Compiler compiler0 = new Compiler();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "", "");
      Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      mustBeReachingVariableDef0.analyze(36);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Node node0 = new Node(124);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Compiler compiler0 = new Compiler();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
      Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      mustBeReachingVariableDef0.analyze(36);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Node node0 = new Node(118);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Compiler compiler0 = new Compiler();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      node0.addChildToFront(node0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "R`,Jr}tEn$!{0B", "R`,Jr}tEn$!{0B");
      Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      // Undeclared exception!
      try { 
        mustBeReachingVariableDef0.analyze(118);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Node node0 = new Node(92);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Compiler compiler0 = new Compiler();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      node0.addChildToFront(node0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "R`,Jr}tEn$!{0B", "R`,Jr}tEn$!{0B");
      Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      // Undeclared exception!
      try { 
        mustBeReachingVariableDef0.analyze(92);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef0 = new MustBeReachingVariableDef.MustDef();
      Node node0 = new Node(118, 118, 118);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Compiler compiler0 = new Compiler();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "arguments", "arguments");
      Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef1 = mustBeReachingVariableDef0.flowThrough(node1, mustBeReachingVariableDef_MustDef0);
      assertNotSame(mustBeReachingVariableDef_MustDef1, mustBeReachingVariableDef_MustDef0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ArrayList<Scope.Var> arrayList0 = new ArrayList<Scope.Var>();
      ListIterator<Scope.Var> listIterator0 = arrayList0.listIterator();
      MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef0 = new MustBeReachingVariableDef.MustDef(listIterator0);
      Node node0 = new Node(111, 111, 111);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Compiler compiler0 = new Compiler();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
      Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef1 = mustBeReachingVariableDef0.flowThrough(node1, mustBeReachingVariableDef_MustDef0);
      assertNotSame(mustBeReachingVariableDef_MustDef1, mustBeReachingVariableDef_MustDef0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Node node0 = new Node(103);
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Compiler compiler0 = new Compiler();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      node0.addChildToFront(node0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "R`,Jr}tEn$!{0B", "R`,Jr}tEn$!{0B");
      Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      // Undeclared exception!
      try { 
        mustBeReachingVariableDef0.analyze(103);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Node node0 = new Node((-3141), (-3141), (-3141));
      ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
      Compiler compiler0 = new Compiler();
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "R`,Jr}tEn$!{0B", "R`,Jr}tEn$!{0B");
      Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
      MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
      mustBeReachingVariableDef0.analyze(1692);
      Node node2 = mustBeReachingVariableDef0.getDef((String) null, (Node) null);
      assertNull(node2);
  }
}
