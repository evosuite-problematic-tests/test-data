/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 11:04:37 GMT 2018
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.FunctionInjector;
import com.google.javascript.jscomp.FunctionToBlockMutator;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.PeepholeSimplifyRegExp;
import com.google.javascript.jscomp.PrintStreamErrorManager;
import com.google.javascript.rhino.Node;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Set;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FunctionInjector_ESTest extends FunctionInjector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, true, false, true);
      // Undeclared exception!
      try { 
        functionInjector0.maybePrepareCall((Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.FunctionInjector", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, true, true);
      Node node0 = new Node(0);
      Node node1 = new Node(0, node0, node0, node0);
      CompilerOptions compilerOptions0 = compiler0.newCompilerOptions();
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      // Undeclared exception!
      try { 
        functionInjector0.canInlineReferenceToFunction((NodeTraversal) null, node1, node1, compilerOptions0.stripTypePrefixes, functionInjector_InliningMode0, false, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.FunctionInjector", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      Node node0 = new Node(0);
      Node node1 = new Node(0, node0, node0, node0);
      CompilerOptions compilerOptions0 = compiler0.newCompilerOptions();
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, false);
      // Undeclared exception!
      try { 
        functionInjector0.canInlineReferenceToFunction((NodeTraversal) null, node1, node1, compilerOptions0.stripTypes, functionInjector_InliningMode0, false, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.FunctionInjector", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, true, false);
      PeepholeSimplifyRegExp peepholeSimplifyRegExp0 = new PeepholeSimplifyRegExp();
      Node node0 = new Node(0);
      Node node1 = new Node(0, node0, node0, node0);
      Node node2 = peepholeSimplifyRegExp0.optimizeSubtree(node1);
      CompilerOptions compilerOptions0 = compiler0.newCompilerOptions();
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      functionInjector0.canInlineReferenceToFunction((NodeTraversal) null, node2, node2, compilerOptions0.stripNameSuffixes, functionInjector_InliningMode0, true, false);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      Node node0 = new Node((-3404));
      Node node1 = new Node((-3404), node0, node0, node0);
      CompilerOptions compilerOptions0 = compiler0.newCompilerOptions();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, false);
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
      // Undeclared exception!
      try { 
        functionInjector0.canInlineReferenceToFunction((NodeTraversal) null, node1, node1, compilerOptions0.stripNamePrefixes, functionInjector_InliningMode0, false, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, true);
      Node node0 = new Node(4);
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      node0.addChildrenToFront(node0);
      functionInjector0.canInlineReferenceToFunction((NodeTraversal) null, node0, node0, (Set<String>) null, functionInjector_InliningMode0, false, false);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, true, true, true);
      Node node0 = new Node(4);
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      node0.addChildrenToFront(node0);
      // Undeclared exception!
      try { 
        functionInjector0.canInlineReferenceToFunction((NodeTraversal) null, node0, node0, (Set<String>) null, functionInjector_InliningMode0, false, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("Expected non-empty string.");
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager(mockPrintStream0);
      Compiler compiler0 = new Compiler(printStreamErrorManager0);
      CompilerOptions compilerOptions0 = new CompilerOptions();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, functionToBlockMutator_LabelNameSupplier0, false, true, false);
      ArrayList<FunctionInjector.Reference> arrayList0 = new ArrayList<FunctionInjector.Reference>();
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference((Node) null, (JSModule) null, functionInjector_InliningMode0);
      arrayList0.add(functionInjector_Reference0);
      boolean boolean0 = functionInjector0.inliningLowersCost((JSModule) null, (Node) null, arrayList0, compilerOptions0.stripNameSuffixes, true, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("Expected non-empty string.");
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager(mockPrintStream0);
      Compiler compiler0 = new Compiler(printStreamErrorManager0);
      CompilerOptions compilerOptions0 = new CompilerOptions();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, functionToBlockMutator_LabelNameSupplier0, false, false, false);
      ArrayList<FunctionInjector.Reference> arrayList0 = new ArrayList<FunctionInjector.Reference>();
      boolean boolean0 = functionInjector0.inliningLowersCost((JSModule) null, (Node) null, arrayList0, compilerOptions0.stripNameSuffixes, false, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("Expected non-empty string.");
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager(mockPrintStream0);
      Compiler compiler0 = new Compiler(printStreamErrorManager0);
      CompilerOptions compilerOptions0 = new CompilerOptions();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, functionToBlockMutator_LabelNameSupplier0, false, false, false);
      ArrayList<FunctionInjector.Reference> arrayList0 = new ArrayList<FunctionInjector.Reference>();
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference((Node) null, (JSModule) null, functionInjector_InliningMode0);
      arrayList0.add(functionInjector_Reference0);
      // Undeclared exception!
      try { 
        functionInjector0.inliningLowersCost((JSModule) null, (Node) null, arrayList0, compilerOptions0.stripNameSuffixes, false, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager((Logger) null);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, functionToBlockMutator_LabelNameSupplier0, true, true, true);
      Node node0 = Node.newNumber(1.2);
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference(node0, (JSModule) null, functionInjector_InliningMode0);
      ImmutableList<FunctionInjector.Reference> immutableList0 = ImmutableList.of(functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0);
      // Undeclared exception!
      try { 
        functionInjector0.inliningLowersCost((JSModule) null, node0, immutableList0, (Set<String>) null, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("Expecte non-empty string.");
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager(mockPrintStream0);
      Compiler compiler0 = new Compiler(printStreamErrorManager0);
      CompilerOptions compilerOptions0 = new CompilerOptions();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, functionToBlockMutator_LabelNameSupplier0, false, true, false);
      ArrayList<FunctionInjector.Reference> arrayList0 = new ArrayList<FunctionInjector.Reference>();
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference((Node) null, (JSModule) null, functionInjector_InliningMode0);
      arrayList0.add(functionInjector_Reference0);
      // Undeclared exception!
      try { 
        functionInjector0.inliningLowersCost((JSModule) null, (Node) null, arrayList0, compilerOptions0.stripNameSuffixes, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, true, true);
      Charset charset0 = Charset.defaultCharset();
      Set<String> set0 = charset0.aliases();
      functionInjector0.setKnownConstants(set0);
      // Undeclared exception!
      try { 
        functionInjector0.setKnownConstants(set0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }
}
