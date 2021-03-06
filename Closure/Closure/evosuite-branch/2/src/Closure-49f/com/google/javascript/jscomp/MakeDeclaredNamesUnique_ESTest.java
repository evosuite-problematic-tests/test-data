/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 13:32:32 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Supplier;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerPass;
import com.google.javascript.jscomp.FunctionToBlockMutator;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.RenameLabels;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MakeDeclaredNamesUnique_ESTest extends MakeDeclaredNamesUnique_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique();
      Compiler compiler0 = new Compiler();
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, makeDeclaredNamesUnique0);
      Node node0 = new Node(104);
      nodeTraversal0.traverse(node0);
      NodeTraversal.traverse((AbstractCompiler) compiler0, node0, (NodeTraversal.Callback) makeDeclaredNamesUnique0);
      assertFalse(node0.isQuotedString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MakeDeclaredNamesUnique.ContextualRenamer makeDeclaredNamesUnique_ContextualRenamer0 = new MakeDeclaredNamesUnique.ContextualRenamer();
      boolean boolean0 = makeDeclaredNamesUnique_ContextualRenamer0.stripConstIfReplaced();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MakeDeclaredNamesUnique.ContextualRenamer makeDeclaredNamesUnique_ContextualRenamer0 = new MakeDeclaredNamesUnique.ContextualRenamer();
      MakeDeclaredNamesUnique.Renamer makeDeclaredNamesUnique_Renamer0 = makeDeclaredNamesUnique_ContextualRenamer0.forChildScope();
      makeDeclaredNamesUnique_ContextualRenamer0.addDeclaredName("");
      makeDeclaredNamesUnique_Renamer0.addDeclaredName("");
      assertFalse(makeDeclaredNamesUnique_ContextualRenamer0.equals((Object)makeDeclaredNamesUnique_Renamer0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MakeDeclaredNamesUnique.BoilerplateRenamer makeDeclaredNamesUnique_BoilerplateRenamer0 = new MakeDeclaredNamesUnique.BoilerplateRenamer((Supplier<String>) null, "");
      // Undeclared exception!
      try { 
        makeDeclaredNamesUnique_BoilerplateRenamer0.forChildScope();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MakeDeclaredNamesUnique.InlineRenamer makeDeclaredNamesUnique_InlineRenamer0 = new MakeDeclaredNamesUnique.InlineRenamer((Supplier<String>) null, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$TypeRestriction", true);
      boolean boolean0 = makeDeclaredNamesUnique_InlineRenamer0.stripConstIfReplaced();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(renameLabels_DefaultNameSupplier0);
      MakeDeclaredNamesUnique.BoilerplateRenamer makeDeclaredNamesUnique_BoilerplateRenamer0 = new MakeDeclaredNamesUnique.BoilerplateRenamer(functionToBlockMutator_LabelNameSupplier0, "TtD");
      MakeDeclaredNamesUnique.Renamer makeDeclaredNamesUnique_Renamer0 = makeDeclaredNamesUnique_BoilerplateRenamer0.forChildScope();
      makeDeclaredNamesUnique_Renamer0.getReplacementName("TtD");
      assertFalse(makeDeclaredNamesUnique_Renamer0.stripConstIfReplaced());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MakeDeclaredNamesUnique.InlineRenamer makeDeclaredNamesUnique_InlineRenamer0 = new MakeDeclaredNamesUnique.InlineRenamer((Supplier<String>) null, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$TypeRestriction", true);
      makeDeclaredNamesUnique_InlineRenamer0.forChildScope();
      assertTrue(makeDeclaredNamesUnique_InlineRenamer0.stripConstIfReplaced());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockFile mockFile0 = new MockFile("arguments");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Compiler compiler0 = new Compiler(mockPrintStream0);
      CompilerPass compilerPass0 = MakeDeclaredNamesUnique.getContextualRenameInverter(compiler0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ArrayList<JSType> arrayList0 = new ArrayList<JSType>();
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) arrayList0);
      compilerPass0.process(node0, node0);
      assertEquals(2, Node.ATTRIBUTE_FLAG);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName("x,TZ}<c}");
      assertEquals("x,TZ}<c}", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique();
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(105);
      // Undeclared exception!
      try { 
        NodeTraversal.traverse((AbstractCompiler) compiler0, node0, (NodeTraversal.Callback) makeDeclaredNamesUnique0);
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
  public void test10()  throws Throwable  {
      MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique();
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(83);
      // Undeclared exception!
      try { 
        NodeTraversal.traverse((AbstractCompiler) compiler0, node0, (NodeTraversal.Callback) makeDeclaredNamesUnique0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MakeDeclaredNamesUnique.ContextualRenamer makeDeclaredNamesUnique_ContextualRenamer0 = new MakeDeclaredNamesUnique.ContextualRenamer();
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(105);
      MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique(makeDeclaredNamesUnique_ContextualRenamer0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, makeDeclaredNamesUnique0);
      // Undeclared exception!
      try { 
        makeDeclaredNamesUnique0.shouldTraverse(nodeTraversal0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.MakeDeclaredNamesUnique", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MakeDeclaredNamesUnique.ContextualRenamer makeDeclaredNamesUnique_ContextualRenamer0 = new MakeDeclaredNamesUnique.ContextualRenamer();
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(120);
      MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique(makeDeclaredNamesUnique_ContextualRenamer0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, makeDeclaredNamesUnique0);
      // Undeclared exception!
      try { 
        makeDeclaredNamesUnique0.shouldTraverse(nodeTraversal0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.MakeDeclaredNamesUnique", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique();
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(83);
      Node node1 = Node.newNumber((double) 2);
      node0.addChildrenToBack(node1);
      // Undeclared exception!
      try { 
        NodeTraversal.traverse((AbstractCompiler) compiler0, node0, (NodeTraversal.Callback) makeDeclaredNamesUnique0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "arguments", "goog.testing.ObjectPropertyString instantiated with \"{0}\" arguments, expected 2.");
      assertEquals(44, Node.IS_OPTIONAL_PARAM);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      Vector<JSType> vector0 = new Vector<JSType>();
      LinkedList<JSType> linkedList0 = new LinkedList<JSType>(vector0);
      Node node0 = jSTypeRegistry0.createParametersWithVarArgs((List<JSType>) linkedList0);
      makeDeclaredNamesUnique0.visit((NodeTraversal) null, node0, node0);
      assertEquals(17, Node.TYPE_PROP);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique();
      Compiler compiler0 = new Compiler();
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, makeDeclaredNamesUnique0);
      Node node0 = new Node(105);
      // Undeclared exception!
      try { 
        makeDeclaredNamesUnique0.visit(nodeTraversal0, node0, node0);
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
      MakeDeclaredNamesUnique.BoilerplateRenamer makeDeclaredNamesUnique_BoilerplateRenamer0 = new MakeDeclaredNamesUnique.BoilerplateRenamer((Supplier<String>) null, "398,1@;<U\"");
      MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique(makeDeclaredNamesUnique_BoilerplateRenamer0);
      Node node0 = Node.newString(120, "arguments");
      // Undeclared exception!
      try { 
        makeDeclaredNamesUnique0.visit((NodeTraversal) null, node0, node0);
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
      String string0 = MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName("mV4UJUo}-lU|HA$$K");
      assertEquals("mV4UJUo}-lU|HA", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MakeDeclaredNamesUnique.ContextualRenamer makeDeclaredNamesUnique_ContextualRenamer0 = new MakeDeclaredNamesUnique.ContextualRenamer();
      makeDeclaredNamesUnique_ContextualRenamer0.addDeclaredName("arguments");
      assertFalse(makeDeclaredNamesUnique_ContextualRenamer0.stripConstIfReplaced());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MakeDeclaredNamesUnique.ContextualRenamer makeDeclaredNamesUnique_ContextualRenamer0 = new MakeDeclaredNamesUnique.ContextualRenamer();
      MakeDeclaredNamesUnique.Renamer makeDeclaredNamesUnique_Renamer0 = makeDeclaredNamesUnique_ContextualRenamer0.forChildScope();
      makeDeclaredNamesUnique_Renamer0.addDeclaredName("StringNode: str is null");
      makeDeclaredNamesUnique_Renamer0.addDeclaredName("StringNode: str is null");
      assertFalse(makeDeclaredNamesUnique_ContextualRenamer0.equals((Object)makeDeclaredNamesUnique_Renamer0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MakeDeclaredNamesUnique.InlineRenamer makeDeclaredNamesUnique_InlineRenamer0 = new MakeDeclaredNamesUnique.InlineRenamer((Supplier<String>) null, "arguments", false);
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
  public void test22()  throws Throwable  {
      MakeDeclaredNamesUnique.InlineRenamer makeDeclaredNamesUnique_InlineRenamer0 = new MakeDeclaredNamesUnique.InlineRenamer((Supplier<String>) null, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$TypeRestriction", true);
      makeDeclaredNamesUnique_InlineRenamer0.addDeclaredName("");
      makeDeclaredNamesUnique_InlineRenamer0.addDeclaredName("");
      assertTrue(makeDeclaredNamesUnique_InlineRenamer0.stripConstIfReplaced());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      MakeDeclaredNamesUnique.InlineRenamer makeDeclaredNamesUnique_InlineRenamer0 = new MakeDeclaredNamesUnique.InlineRenamer(renameLabels_DefaultNameSupplier0, "c", true);
      makeDeclaredNamesUnique_InlineRenamer0.addDeclaredName("$$");
      assertTrue(makeDeclaredNamesUnique_InlineRenamer0.stripConstIfReplaced());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      MakeDeclaredNamesUnique.InlineRenamer makeDeclaredNamesUnique_InlineRenamer0 = new MakeDeclaredNamesUnique.InlineRenamer(renameLabels_DefaultNameSupplier0, "c", true);
      makeDeclaredNamesUnique_InlineRenamer0.addDeclaredName("+8-K?G3 2zr");
      assertTrue(makeDeclaredNamesUnique_InlineRenamer0.stripConstIfReplaced());
  }
}
