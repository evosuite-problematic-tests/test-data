/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 08:28:19 GMT 2018
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerPass;
import com.google.javascript.jscomp.FunctionToBlockMutator;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.RenameLabels;
import com.google.javascript.rhino.Node;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MakeDeclaredNamesUnique_ESTest extends MakeDeclaredNamesUnique_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CompilerPass compilerPass0 = MakeDeclaredNamesUnique.getContextualRenameInverter(compiler0);
      Node node0 = Node.newString("arguments");
      compilerPass0.process(node0, node0);
      assertEquals(2, Node.ATTRIBUTE_FLAG);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique();
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "function JSCompiler_emptyFn() {  return function() {}}", "function JSCompiler_emptyFn() {  return function() {}}");
      assertEquals(1, Node.TARGET_PROP);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      MakeDeclaredNamesUnique.BoilerplateRenamer makeDeclaredNamesUnique_BoilerplateRenamer0 = new MakeDeclaredNamesUnique.BoilerplateRenamer(renameLabels_DefaultNameSupplier0, "+0JD-LU7");
      boolean boolean0 = makeDeclaredNamesUnique_BoilerplateRenamer0.stripConstIfReplaced();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MakeDeclaredNamesUnique.ContextualRenamer makeDeclaredNamesUnique_ContextualRenamer0 = new MakeDeclaredNamesUnique.ContextualRenamer();
      MakeDeclaredNamesUnique.Renamer makeDeclaredNamesUnique_Renamer0 = makeDeclaredNamesUnique_ContextualRenamer0.forChildScope();
      makeDeclaredNamesUnique_ContextualRenamer0.addDeclaredName("eZ (e-");
      makeDeclaredNamesUnique_Renamer0.addDeclaredName("eZ (e-");
      assertFalse(makeDeclaredNamesUnique_Renamer0.stripConstIfReplaced());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(renameLabels_DefaultNameSupplier0);
      MakeDeclaredNamesUnique.InlineRenamer makeDeclaredNamesUnique_InlineRenamer0 = new MakeDeclaredNamesUnique.InlineRenamer(functionToBlockMutator_LabelNameSupplier0, "screen-bce", true);
      boolean boolean0 = makeDeclaredNamesUnique_InlineRenamer0.stripConstIfReplaced();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(renameLabels_DefaultNameSupplier0);
      MakeDeclaredNamesUnique.InlineRenamer makeDeclaredNamesUnique_InlineRenamer0 = new MakeDeclaredNamesUnique.InlineRenamer(functionToBlockMutator_LabelNameSupplier0, "vy<sqrrd", false);
      makeDeclaredNamesUnique_InlineRenamer0.getReplacementName("AK");
      assertFalse(makeDeclaredNamesUnique_InlineRenamer0.stripConstIfReplaced());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName("AK");
      assertEquals("AK", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(renameLabels_DefaultNameSupplier0);
      MakeDeclaredNamesUnique.InlineRenamer makeDeclaredNamesUnique_InlineRenamer0 = new MakeDeclaredNamesUnique.InlineRenamer(functionToBlockMutator_LabelNameSupplier0, "cP3lOd", false);
      MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique(makeDeclaredNamesUnique_InlineRenamer0);
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "cP3lOd", "cP3lOd");
      Node node1 = new Node(105, node0, node0);
      // Undeclared exception!
      try { 
        NodeTraversal.traverse((AbstractCompiler) compiler0, node1, (NodeTraversal.Callback) makeDeclaredNamesUnique0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique();
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "cP3lOd", "cP3lOd");
      Node node1 = new Node(105, node0, node0);
      // Undeclared exception!
      try { 
        NodeTraversal.traverse((AbstractCompiler) compiler0, node1, (NodeTraversal.Callback) makeDeclaredNamesUnique0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(renameLabels_DefaultNameSupplier0);
      MakeDeclaredNamesUnique.InlineRenamer makeDeclaredNamesUnique_InlineRenamer0 = new MakeDeclaredNamesUnique.InlineRenamer(functionToBlockMutator_LabelNameSupplier0, "cP3lO9", false);
      MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique(makeDeclaredNamesUnique_InlineRenamer0);
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "cP3lO9", "J_F|1iQAk!H/hm-");
      Node node1 = new Node(120, node0, node0);
      // Undeclared exception!
      try { 
        NodeTraversal.traverse((AbstractCompiler) compiler0, node1, (NodeTraversal.Callback) makeDeclaredNamesUnique0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(renameLabels_DefaultNameSupplier0);
      MakeDeclaredNamesUnique.InlineRenamer makeDeclaredNamesUnique_InlineRenamer0 = new MakeDeclaredNamesUnique.InlineRenamer(functionToBlockMutator_LabelNameSupplier0, "cP3lO9", false);
      MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique(makeDeclaredNamesUnique_InlineRenamer0);
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "cP3lO9", "cP3lO9");
      Node node1 = new Node(83, node0, node0);
      // Undeclared exception!
      try { 
        NodeTraversal.traverse((AbstractCompiler) compiler0, node1, (NodeTraversal.Callback) makeDeclaredNamesUnique0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "cP3lO9", "J_F|1iQAk!H/hm-");
      Node node1 = new Node(120, node0, node0);
      MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique();
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, (NodeTraversal.Callback) null);
      // Undeclared exception!
      try { 
        makeDeclaredNamesUnique0.visit(nodeTraversal0, node1, node1);
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
      String string0 = MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName("$$");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique();
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString(83, "arguments");
      Node node1 = new Node(83, node0, node0);
      // Undeclared exception!
      try { 
        NodeTraversal.traverse((AbstractCompiler) compiler0, node1, (NodeTraversal.Callback) makeDeclaredNamesUnique0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MakeDeclaredNamesUnique.ContextualRenamer makeDeclaredNamesUnique_ContextualRenamer0 = new MakeDeclaredNamesUnique.ContextualRenamer();
      MakeDeclaredNamesUnique.Renamer makeDeclaredNamesUnique_Renamer0 = makeDeclaredNamesUnique_ContextualRenamer0.forChildScope();
      makeDeclaredNamesUnique_Renamer0.addDeclaredName("Zm");
      makeDeclaredNamesUnique_Renamer0.addDeclaredName("Zm");
      assertFalse(makeDeclaredNamesUnique_ContextualRenamer0.equals((Object)makeDeclaredNamesUnique_Renamer0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(renameLabels_DefaultNameSupplier0);
      MakeDeclaredNamesUnique.InlineRenamer makeDeclaredNamesUnique_InlineRenamer0 = null;
      try {
        makeDeclaredNamesUnique_InlineRenamer0 = new MakeDeclaredNamesUnique.InlineRenamer(functionToBlockMutator_LabelNameSupplier0, "", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      MakeDeclaredNamesUnique.InlineRenamer makeDeclaredNamesUnique_InlineRenamer0 = new MakeDeclaredNamesUnique.InlineRenamer(renameLabels_DefaultNameSupplier0, "2h'npQ^9S", false);
      // Undeclared exception!
      try { 
        makeDeclaredNamesUnique_InlineRenamer0.addDeclaredName("arguments");
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
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(renameLabels_DefaultNameSupplier0);
      MakeDeclaredNamesUnique.InlineRenamer makeDeclaredNamesUnique_InlineRenamer0 = new MakeDeclaredNamesUnique.InlineRenamer(functionToBlockMutator_LabelNameSupplier0, "screen-bce", true);
      makeDeclaredNamesUnique_InlineRenamer0.addDeclaredName("screen-bce");
      makeDeclaredNamesUnique_InlineRenamer0.addDeclaredName("screen-bce");
      assertTrue(makeDeclaredNamesUnique_InlineRenamer0.stripConstIfReplaced());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      MakeDeclaredNamesUnique.BoilerplateRenamer makeDeclaredNamesUnique_BoilerplateRenamer0 = new MakeDeclaredNamesUnique.BoilerplateRenamer(renameLabels_DefaultNameSupplier0, "$$");
      MakeDeclaredNamesUnique.Renamer makeDeclaredNamesUnique_Renamer0 = makeDeclaredNamesUnique_BoilerplateRenamer0.forChildScope();
      makeDeclaredNamesUnique_Renamer0.addDeclaredName("");
      assertFalse(makeDeclaredNamesUnique_Renamer0.stripConstIfReplaced());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      MakeDeclaredNamesUnique.BoilerplateRenamer makeDeclaredNamesUnique_BoilerplateRenamer0 = new MakeDeclaredNamesUnique.BoilerplateRenamer(renameLabels_DefaultNameSupplier0, "$$");
      MakeDeclaredNamesUnique.Renamer makeDeclaredNamesUnique_Renamer0 = makeDeclaredNamesUnique_BoilerplateRenamer0.forChildScope();
      makeDeclaredNamesUnique_Renamer0.addDeclaredName("$$");
      assertFalse(makeDeclaredNamesUnique_Renamer0.stripConstIfReplaced());
  }
}