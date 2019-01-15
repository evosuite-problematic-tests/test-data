/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 11:02:38 GMT 2018
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.javascript.jscomp.CheckSuspiciousCode;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.Denormalize;
import com.google.javascript.jscomp.FunctionInjector;
import com.google.javascript.jscomp.FunctionToBlockMutator;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.InlineSimpleMethods;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.MemoizedScopeCreator;
import com.google.javascript.jscomp.NameReferenceGraph;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.rhino.Node;
import java.util.Set;
import java.util.Stack;
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
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, true);
      Node node0 = Node.newString("R!ez<JqAnRy2=rq)v");
      JSModule jSModule0 = new JSModule("P|5%h577&el");
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference(node0, (JSModule) null, functionInjector_InliningMode0);
      ImmutableList<FunctionInjector.Reference> immutableList0 = ImmutableList.of(functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0);
      InlineSimpleMethods inlineSimpleMethods0 = new InlineSimpleMethods(compiler0);
      Set<String> set0 = inlineSimpleMethods0.externMethods;
      // Undeclared exception!
      try { 
        functionInjector0.inliningLowersCost(jSModule0, node0, immutableList0, set0, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, functionToBlockMutator_LabelNameSupplier0, true, false, false);
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
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, false);
      Node node0 = compiler0.parseTestCode("DIRECT");
      Denormalize denormalize0 = new Denormalize(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, denormalize0);
      InlineSimpleMethods inlineSimpleMethods0 = new InlineSimpleMethods(compiler0);
      Set<String> set0 = inlineSimpleMethods0.nonMethodProperties;
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
      functionInjector0.canInlineReferenceToFunction(nodeTraversal0, node0, node0, set0, functionInjector_InliningMode0, true, true);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, true, true, true);
      Node node0 = compiler0.parseTestCode("DIRECT");
      CheckSuspiciousCode checkSuspiciousCode0 = new CheckSuspiciousCode();
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention(googleCodingConvention0);
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, closureCodingConvention0);
      MemoizedScopeCreator memoizedScopeCreator0 = new MemoizedScopeCreator(typedScopeCreator0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkSuspiciousCode0, memoizedScopeCreator0);
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      // Undeclared exception!
      try { 
        functionInjector0.canInlineReferenceToFunction(nodeTraversal0, node0, node0, (Set<String>) null, functionInjector_InliningMode0, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.FunctionInjector", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, true, true, true);
      Node node0 = compiler0.parseTestCode("DIRECT");
      Denormalize denormalize0 = new Denormalize(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, denormalize0);
      InlineSimpleMethods inlineSimpleMethods0 = new InlineSimpleMethods(compiler0);
      Set<String> set0 = inlineSimpleMethods0.nonMethodProperties;
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
      functionInjector0.canInlineReferenceToFunction(nodeTraversal0, node0, node0, set0, functionInjector_InliningMode0, true, true);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, true, true, true);
      Node node0 = compiler0.parseTestCode("DIRECT");
      CheckSuspiciousCode checkSuspiciousCode0 = new CheckSuspiciousCode();
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention(googleCodingConvention0);
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, closureCodingConvention0);
      MemoizedScopeCreator memoizedScopeCreator0 = new MemoizedScopeCreator(typedScopeCreator0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkSuspiciousCode0, memoizedScopeCreator0);
      CompilerOptions compilerOptions0 = compiler0.getOptions();
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
      // Undeclared exception!
      try { 
        functionInjector0.canInlineReferenceToFunction(nodeTraversal0, node0, node0, compilerOptions0.stripNameSuffixes, functionInjector_InliningMode0, false, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, true, true, false);
      CompilerOptions compilerOptions0 = new CompilerOptions();
      Stack<FunctionInjector.Reference> stack0 = new Stack<FunctionInjector.Reference>();
      boolean boolean0 = functionInjector0.inliningLowersCost((JSModule) null, (Node) null, stack0, compilerOptions0.stripTypePrefixes, false, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, functionToBlockMutator_LabelNameSupplier0, false, false, false);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.FunctionInjector$3");
      NameReferenceGraph.Reference nameReferenceGraph_Reference0 = new NameReferenceGraph.Reference(node0, node0);
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference(node0, (JSModule) null, functionInjector_InliningMode0);
      ImmutableList<FunctionInjector.Reference> immutableList0 = ImmutableList.of(functionInjector_Reference0);
      ImmutableBiMap<String, Integer> immutableBiMap0 = ImmutableBiMap.of("com.google.javascript.jscomp.FunctionInjector$3", (Integer) node0.FLAG_NO_THROWS, "YES", (Integer) 55);
      ImmutableSet<String> immutableSet0 = immutableBiMap0.keySet();
      // Undeclared exception!
      try { 
        functionInjector0.inliningLowersCost((JSModule) null, nameReferenceGraph_Reference0.parent, immutableList0, immutableSet0, false, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, functionToBlockMutator_LabelNameSupplier0, false, false, false);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.FunctionInjector$3");
      NameReferenceGraph.Reference nameReferenceGraph_Reference0 = new NameReferenceGraph.Reference(node0, node0);
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference(node0, (JSModule) null, functionInjector_InliningMode0);
      ImmutableList<FunctionInjector.Reference> immutableList0 = ImmutableList.of(functionInjector_Reference0);
      ImmutableBiMap<String, Integer> immutableBiMap0 = ImmutableBiMap.of("com.google.javascript.jscomp.FunctionInjector$3", (Integer) node0.DECR_FLAG, "YES", (Integer) 55);
      ImmutableSet<String> immutableSet0 = immutableBiMap0.keySet();
      boolean boolean0 = functionInjector0.inliningLowersCost((JSModule) null, nameReferenceGraph_Reference0.parent, immutableList0, immutableSet0, true, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, false);
      Node node0 = compiler0.parseTestCode("DIRECT");
      InlineSimpleMethods inlineSimpleMethods0 = new InlineSimpleMethods(compiler0);
      Set<String> set0 = inlineSimpleMethods0.nonMethodProperties;
      JSModule jSModule0 = new JSModule("");
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference(node0, jSModule0, functionInjector_InliningMode0);
      ImmutableList<FunctionInjector.Reference> immutableList0 = ImmutableList.of(functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0);
      // Undeclared exception!
      try { 
        functionInjector0.inliningLowersCost(jSModule0, node0, immutableList0, set0, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, false);
      Node node0 = Node.newString("R!ez<JqAnRy2=rq)v");
      JSModule jSModule0 = new JSModule("P|5%h577&el");
      JSModule jSModule1 = new JSModule(":1");
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference(node0, jSModule1, functionInjector_InliningMode0);
      ImmutableList<FunctionInjector.Reference> immutableList0 = ImmutableList.of(functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0);
      InlineSimpleMethods inlineSimpleMethods0 = new InlineSimpleMethods(compiler0);
      Set<String> set0 = inlineSimpleMethods0.externMethods;
      // Undeclared exception!
      try { 
        functionInjector0.inliningLowersCost(jSModule0, node0, immutableList0, set0, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.FunctionInjector", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("qG1_kWzq My#;@dL");
      Compiler compiler0 = new Compiler(mockPrintStream0);
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, true, true, true);
      Integer integer0 = new Integer(3);
      ImmutableBiMap<String, Integer> immutableBiMap0 = ImmutableBiMap.of("", integer0);
      ImmutableSet<String> immutableSet0 = immutableBiMap0.keySet();
      functionInjector0.setKnownConstants(immutableSet0);
      // Undeclared exception!
      try { 
        functionInjector0.setKnownConstants(immutableSet0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }
}