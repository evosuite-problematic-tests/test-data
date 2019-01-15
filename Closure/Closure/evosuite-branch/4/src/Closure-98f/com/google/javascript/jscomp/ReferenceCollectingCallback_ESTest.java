/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 10:33:21 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Predicate;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.Denormalize;
import com.google.javascript.jscomp.ExternExportsPass;
import com.google.javascript.jscomp.FoldConstants;
import com.google.javascript.jscomp.GroupVariableDeclarations;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ReferenceCollectingCallback;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.rhino.Node;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReferenceCollectingCallback_ESTest extends ReferenceCollectingCallback_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
      ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0);
      Node node0 = Node.newString(118, "");
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, referenceCollectingCallback0);
      ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = ReferenceCollectingCallback.Reference.newBleedingFunction(nodeTraversal0, (ReferenceCollectingCallback.BasicBlock) null, node0);
      // Undeclared exception!
      try { 
        referenceCollectingCallback_Reference0.getAssignedValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Node node0 = new Node(101);
      Compiler compiler0 = new Compiler();
      Denormalize denormalize0 = new Denormalize(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, denormalize0);
      ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = ReferenceCollectingCallback.Reference.newBleedingFunction(nodeTraversal0, (ReferenceCollectingCallback.BasicBlock) null, node0);
      Scope scope0 = referenceCollectingCallback_Reference0.getScope();
      assertNull(scope0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ExternExportsPass externExportsPass0 = new ExternExportsPass(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, externExportsPass0);
      Node node0 = new Node(0);
      ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = ReferenceCollectingCallback.Reference.newBleedingFunction(nodeTraversal0, (ReferenceCollectingCallback.BasicBlock) null, node0);
      Node node1 = referenceCollectingCallback_Reference0.getParent();
      assertEquals(1, Node.TARGET_PROP);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ExternExportsPass externExportsPass0 = new ExternExportsPass(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, externExportsPass0);
      Node node0 = new Node(0);
      ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = new ReferenceCollectingCallback.Reference(node0, node0, nodeTraversal0, (ReferenceCollectingCallback.BasicBlock) null);
      String string0 = referenceCollectingCallback_Reference0.getSourceName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Node node0 = new Node(77);
      Compiler compiler0 = new Compiler();
      Denormalize denormalize0 = new Denormalize(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, denormalize0);
      ReferenceCollectingCallback.BasicBlock referenceCollectingCallback_BasicBlock0 = new ReferenceCollectingCallback.BasicBlock((ReferenceCollectingCallback.BasicBlock) null, node0);
      ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = new ReferenceCollectingCallback.Reference(node0, node0, nodeTraversal0, referenceCollectingCallback_BasicBlock0);
      ReferenceCollectingCallback.BasicBlock referenceCollectingCallback_BasicBlock1 = referenceCollectingCallback_Reference0.getBasicBlock();
      assertSame(referenceCollectingCallback_BasicBlock1, referenceCollectingCallback_BasicBlock0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Node node0 = new Node(101);
      Compiler compiler0 = new Compiler();
      Denormalize denormalize0 = new Denormalize(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, denormalize0);
      ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = ReferenceCollectingCallback.Reference.newBleedingFunction(nodeTraversal0, (ReferenceCollectingCallback.BasicBlock) null, node0);
      Node node1 = referenceCollectingCallback_Reference0.getGrandparent();
      assertNull(node1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Node node0 = new Node(101);
      Compiler compiler0 = new Compiler();
      Denormalize denormalize0 = new Denormalize(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, denormalize0);
      ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = ReferenceCollectingCallback.Reference.newBleedingFunction(nodeTraversal0, (ReferenceCollectingCallback.BasicBlock) null, node0);
      boolean boolean0 = referenceCollectingCallback_Reference0.isHoistedFunction();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ReferenceCollectingCallback.ReferenceCollection referenceCollectingCallback_ReferenceCollection0 = new ReferenceCollectingCallback.ReferenceCollection();
      Compiler compiler0 = new Compiler();
      FoldConstants foldConstants0 = new FoldConstants(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, foldConstants0);
      referenceCollectingCallback_ReferenceCollection0.add((ReferenceCollectingCallback.Reference) null, nodeTraversal0, (Scope.Var) null);
      // Undeclared exception!
      try { 
        referenceCollectingCallback_ReferenceCollection0.firstReferenceIsAssigningDeclaration();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
      Node node0 = compiler0.parseTestCode("*ryxP8{jvkno`uVfYR");
      ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0);
      referenceCollectingCallback0.process(node0, node0);
      assertEquals(1, Node.LEFT);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
      Predicate<Scope.Var> predicate0 = (Predicate<Scope.Var>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0, predicate0);
      ReferenceCollectingCallback.ReferenceCollection referenceCollectingCallback_ReferenceCollection0 = referenceCollectingCallback0.getReferenceCollection((Scope.Var) null);
      assertNull(referenceCollectingCallback_ReferenceCollection0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Node node0 = Node.newString("v", 67, 67);
      Node node1 = new Node(38, node0);
      Predicate<Scope.Var> predicate0 = (Predicate<Scope.Var>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
      ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback((AbstractCompiler) null, referenceCollectingCallback_Behavior0, predicate0);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, referenceCollectingCallback0, (ScopeCreator) null);
      // Undeclared exception!
      try { 
        referenceCollectingCallback0.visit(nodeTraversal0, node1, node0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // NAME is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Node node0 = Node.newString(77, "Tracer should not be null at the end of5 pss.");
      Compiler compiler0 = new Compiler();
      Denormalize denormalize0 = new Denormalize(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, denormalize0);
      ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
      Predicate<Scope.Var> predicate0 = (Predicate<Scope.Var>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0, predicate0);
      // Undeclared exception!
      try { 
        referenceCollectingCallback0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayDeque", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
      ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, referenceCollectingCallback0, (ScopeCreator) null);
      Node node0 = Node.newString(101, "com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection");
      boolean boolean0 = referenceCollectingCallback0.shouldTraverse(nodeTraversal0, node0, node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
      ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0);
      Node node0 = Node.newString(98, "");
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, referenceCollectingCallback0);
      // Undeclared exception!
      try { 
        referenceCollectingCallback0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayDeque", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
      ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, referenceCollectingCallback0, (ScopeCreator) null);
      Node node0 = Node.newString(100, "com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection");
      // Undeclared exception!
      try { 
        referenceCollectingCallback0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayDeque", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
      ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, referenceCollectingCallback0, (ScopeCreator) null);
      Node node0 = Node.newString(108, "com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection");
      boolean boolean0 = referenceCollectingCallback0.shouldTraverse(nodeTraversal0, node0, node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
      ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0);
      Node node0 = Node.newString(115, "");
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, referenceCollectingCallback0);
      // Undeclared exception!
      try { 
        referenceCollectingCallback0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayDeque", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Node node0 = Node.newNumber((-6008.03295979409), 12, (-2462));
      Node node1 = new Node(119, node0, node0, node0, 4, 19);
      ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
      ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback((AbstractCompiler) null, referenceCollectingCallback_Behavior0);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, referenceCollectingCallback0, (ScopeCreator) null);
      // Undeclared exception!
      try { 
        referenceCollectingCallback0.visit(nodeTraversal0, node1, node1);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayDeque", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
      Node node0 = compiler0.parseTestCode("*ryxP8{jvkno`uVfYR");
      ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, referenceCollectingCallback0);
      referenceCollectingCallback0.visit(nodeTraversal0, node0, node0);
      assertEquals("", nodeTraversal0.getSourceName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ReferenceCollectingCallback.ReferenceCollection referenceCollectingCallback_ReferenceCollection0 = new ReferenceCollectingCallback.ReferenceCollection();
      ArrayList<ReferenceCollectingCallback.Reference> arrayList0 = new ArrayList<ReferenceCollectingCallback.Reference>();
      referenceCollectingCallback_ReferenceCollection0.references = (List<ReferenceCollectingCallback.Reference>) arrayList0;
      arrayList0.add((ReferenceCollectingCallback.Reference) null);
      // Undeclared exception!
      try { 
        referenceCollectingCallback_ReferenceCollection0.isWellDefined();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ReferenceCollectingCallback.ReferenceCollection referenceCollectingCallback_ReferenceCollection0 = new ReferenceCollectingCallback.ReferenceCollection();
      boolean boolean0 = referenceCollectingCallback_ReferenceCollection0.isWellDefined();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ReferenceCollectingCallback.ReferenceCollection referenceCollectingCallback_ReferenceCollection0 = new ReferenceCollectingCallback.ReferenceCollection();
      boolean boolean0 = referenceCollectingCallback_ReferenceCollection0.isEscaped();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ReferenceCollectingCallback.ReferenceCollection referenceCollectingCallback_ReferenceCollection0 = new ReferenceCollectingCallback.ReferenceCollection();
      ArrayList<ReferenceCollectingCallback.Reference> arrayList0 = new ArrayList<ReferenceCollectingCallback.Reference>();
      referenceCollectingCallback_ReferenceCollection0.references = (List<ReferenceCollectingCallback.Reference>) arrayList0;
      arrayList0.add((ReferenceCollectingCallback.Reference) null);
      // Undeclared exception!
      try { 
        referenceCollectingCallback_ReferenceCollection0.isEscaped();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ReferenceCollectingCallback.ReferenceCollection referenceCollectingCallback_ReferenceCollection0 = new ReferenceCollectingCallback.ReferenceCollection();
      ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = referenceCollectingCallback_ReferenceCollection0.getInitializingReferenceForConstants();
      assertNull(referenceCollectingCallback_Reference0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ReferenceCollectingCallback.ReferenceCollection referenceCollectingCallback_ReferenceCollection0 = new ReferenceCollectingCallback.ReferenceCollection();
      LinkedList<ReferenceCollectingCallback.Reference> linkedList0 = new LinkedList<ReferenceCollectingCallback.Reference>();
      linkedList0.add((ReferenceCollectingCallback.Reference) null);
      referenceCollectingCallback_ReferenceCollection0.references = (List<ReferenceCollectingCallback.Reference>) linkedList0;
      // Undeclared exception!
      try { 
        referenceCollectingCallback_ReferenceCollection0.getInitializingReferenceForConstants();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ReferenceCollectingCallback.ReferenceCollection referenceCollectingCallback_ReferenceCollection0 = new ReferenceCollectingCallback.ReferenceCollection();
      boolean boolean0 = referenceCollectingCallback_ReferenceCollection0.isAssignedOnceInLifetime();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ReferenceCollectingCallback.ReferenceCollection referenceCollectingCallback_ReferenceCollection0 = new ReferenceCollectingCallback.ReferenceCollection();
      ArrayList<ReferenceCollectingCallback.Reference> arrayList0 = new ArrayList<ReferenceCollectingCallback.Reference>();
      referenceCollectingCallback_ReferenceCollection0.references = (List<ReferenceCollectingCallback.Reference>) arrayList0;
      arrayList0.add((ReferenceCollectingCallback.Reference) null);
      // Undeclared exception!
      try { 
        referenceCollectingCallback_ReferenceCollection0.isAssignedOnceInLifetime();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ReferenceCollectingCallback.ReferenceCollection referenceCollectingCallback_ReferenceCollection0 = new ReferenceCollectingCallback.ReferenceCollection();
      boolean boolean0 = referenceCollectingCallback_ReferenceCollection0.isNeverAssigned();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ReferenceCollectingCallback.ReferenceCollection referenceCollectingCallback_ReferenceCollection0 = new ReferenceCollectingCallback.ReferenceCollection();
      ArrayList<ReferenceCollectingCallback.Reference> arrayList0 = new ArrayList<ReferenceCollectingCallback.Reference>();
      referenceCollectingCallback_ReferenceCollection0.references = (List<ReferenceCollectingCallback.Reference>) arrayList0;
      arrayList0.add((ReferenceCollectingCallback.Reference) null);
      // Undeclared exception!
      try { 
        referenceCollectingCallback_ReferenceCollection0.isNeverAssigned();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ReferenceCollectingCallback.ReferenceCollection referenceCollectingCallback_ReferenceCollection0 = new ReferenceCollectingCallback.ReferenceCollection();
      boolean boolean0 = referenceCollectingCallback_ReferenceCollection0.firstReferenceIsAssigningDeclaration();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Node node0 = Node.newString(83, "{gr;#Sp*C>l&y?[");
      Compiler compiler0 = new Compiler();
      GroupVariableDeclarations groupVariableDeclarations0 = new GroupVariableDeclarations(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, groupVariableDeclarations0);
      Node node1 = new Node(50, node0, node0, node0, node0, 33, 5);
      ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = new ReferenceCollectingCallback.Reference(node0, node0, nodeTraversal0, (ReferenceCollectingCallback.BasicBlock) null);
      boolean boolean0 = referenceCollectingCallback_Reference0.isDeclaration();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Node node0 = new Node(102);
      Compiler compiler0 = new Compiler();
      Denormalize denormalize0 = new Denormalize(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, denormalize0);
      ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = ReferenceCollectingCallback.Reference.newBleedingFunction(nodeTraversal0, (ReferenceCollectingCallback.BasicBlock) null, node0);
      boolean boolean0 = referenceCollectingCallback_Reference0.isVarDeclaration();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
      ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0);
      Node node0 = Node.newString(118, "");
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, referenceCollectingCallback0);
      ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = ReferenceCollectingCallback.Reference.newBleedingFunction(nodeTraversal0, (ReferenceCollectingCallback.BasicBlock) null, node0);
      boolean boolean0 = referenceCollectingCallback_Reference0.isVarDeclaration();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
      ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0);
      Node node0 = Node.newString(95, "");
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, referenceCollectingCallback0);
      ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = ReferenceCollectingCallback.Reference.newBleedingFunction(nodeTraversal0, (ReferenceCollectingCallback.BasicBlock) null, node0);
      boolean boolean0 = referenceCollectingCallback_Reference0.isInitializingDeclaration();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
      ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0);
      Node node0 = Node.newString(105, "");
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, referenceCollectingCallback0);
      ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = ReferenceCollectingCallback.Reference.newBleedingFunction(nodeTraversal0, (ReferenceCollectingCallback.BasicBlock) null, node0);
      boolean boolean0 = referenceCollectingCallback_Reference0.isInitializingDeclaration();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
      ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0);
      Node node0 = Node.newString(118, "");
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, referenceCollectingCallback0);
      Node node1 = Node.newString(83, "");
      node0.addChildrenToFront(node1);
      ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = ReferenceCollectingCallback.Reference.newBleedingFunction(nodeTraversal0, (ReferenceCollectingCallback.BasicBlock) null, node0);
      boolean boolean0 = referenceCollectingCallback_Reference0.isInitializingDeclaration();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
      ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0);
      Node node0 = Node.newString(118, "");
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, referenceCollectingCallback0);
      node0.addChildrenToFront(node0);
      ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = ReferenceCollectingCallback.Reference.newBleedingFunction(nodeTraversal0, (ReferenceCollectingCallback.BasicBlock) null, node0);
      boolean boolean0 = referenceCollectingCallback_Reference0.isInitializingDeclaration();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Node node0 = new Node(101);
      Node node1 = new Node(101, node0, node0, 2, 3);
      Compiler compiler0 = new Compiler();
      Denormalize denormalize0 = new Denormalize(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, denormalize0);
      ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = ReferenceCollectingCallback.Reference.newBleedingFunction(nodeTraversal0, (ReferenceCollectingCallback.BasicBlock) null, node1);
      boolean boolean0 = referenceCollectingCallback_Reference0.isLvalue();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
      ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0);
      Node node0 = Node.newString(118, "");
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, referenceCollectingCallback0);
      Node node1 = Node.newString(83, "");
      node0.addChildrenToFront(node1);
      ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = ReferenceCollectingCallback.Reference.newBleedingFunction(nodeTraversal0, (ReferenceCollectingCallback.BasicBlock) null, node0);
      // Undeclared exception!
      try { 
        referenceCollectingCallback_Reference0.isLvalue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Node node0 = Node.newString(83, "{gr;#Sp*C>l&y?[");
      Compiler compiler0 = new Compiler();
      GroupVariableDeclarations groupVariableDeclarations0 = new GroupVariableDeclarations(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, groupVariableDeclarations0);
      ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = new ReferenceCollectingCallback.Reference(node0, node0, nodeTraversal0, (ReferenceCollectingCallback.BasicBlock) null);
      boolean boolean0 = referenceCollectingCallback_Reference0.isSimpleAssignmentToName();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Node node0 = new Node(102);
      Compiler compiler0 = new Compiler();
      Denormalize denormalize0 = new Denormalize(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, denormalize0);
      ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = ReferenceCollectingCallback.Reference.newBleedingFunction(nodeTraversal0, (ReferenceCollectingCallback.BasicBlock) null, node0);
      boolean boolean0 = referenceCollectingCallback_Reference0.isLvalue();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
      ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0);
      Node node0 = Node.newString(95, "");
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, referenceCollectingCallback0);
      ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = ReferenceCollectingCallback.Reference.newBleedingFunction(nodeTraversal0, (ReferenceCollectingCallback.BasicBlock) null, node0);
      boolean boolean0 = referenceCollectingCallback_Reference0.isLvalue();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Node node0 = Node.newNumber((-6008.03295979409), 12, (-2462));
      Node node1 = new Node(119, node0, node0, node0, 4, 19);
      ReferenceCollectingCallback.BasicBlock referenceCollectingCallback_BasicBlock0 = new ReferenceCollectingCallback.BasicBlock((ReferenceCollectingCallback.BasicBlock) null, node0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Node node0 = Node.newString(101, "com.google.javascript.jscomp.ReferenceCollectingCallback");
      ReferenceCollectingCallback.BasicBlock referenceCollectingCallback_BasicBlock0 = new ReferenceCollectingCallback.BasicBlock((ReferenceCollectingCallback.BasicBlock) null, node0);
      boolean boolean0 = referenceCollectingCallback_BasicBlock0.provablyExecutesBefore((ReferenceCollectingCallback.BasicBlock) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Node node0 = Node.newString("v", 67, 67);
      ReferenceCollectingCallback.BasicBlock referenceCollectingCallback_BasicBlock0 = new ReferenceCollectingCallback.BasicBlock((ReferenceCollectingCallback.BasicBlock) null, node0);
      ReferenceCollectingCallback.BasicBlock referenceCollectingCallback_BasicBlock1 = new ReferenceCollectingCallback.BasicBlock(referenceCollectingCallback_BasicBlock0, node0);
      boolean boolean0 = referenceCollectingCallback_BasicBlock0.provablyExecutesBefore(referenceCollectingCallback_BasicBlock1);
      assertTrue(boolean0);
  }
}
