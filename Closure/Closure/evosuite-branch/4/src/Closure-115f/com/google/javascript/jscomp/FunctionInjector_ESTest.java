/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 11:11:53 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedSet;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CoverageInstrumentationCallback;
import com.google.javascript.jscomp.CoverageInstrumentationPass;
import com.google.javascript.jscomp.FileInstrumentationData;
import com.google.javascript.jscomp.FunctionInjector;
import com.google.javascript.jscomp.FunctionToBlockMutator;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.LightweightMessageFormatter;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.PrintStreamErrorManager;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.TemplateType;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FunctionInjector_ESTest extends FunctionInjector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, functionToBlockMutator_LabelNameSupplier0, false, true, true);
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference((Node) null, (JSModule) null, functionInjector_InliningMode0);
      ImmutableList<FunctionInjector.Reference> immutableList0 = ImmutableList.of(functionInjector_Reference0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      // Undeclared exception!
      try { 
        functionInjector0.inliningLowersCost((JSModule) null, (Node) null, immutableList0, linkedHashSet0, true, false);
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
      SyntheticAst syntheticAst0 = new SyntheticAst("y8^&n/");
      MockFile mockFile0 = new MockFile("y8^&n/", "y8^&n/");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Compiler compiler0 = new Compiler(mockPrintStream0);
      Node node0 = syntheticAst0.getAstRoot(compiler0);
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, functionToBlockMutator_LabelNameSupplier0, false, false, false);
      // Undeclared exception!
      try { 
        functionInjector0.maybePrepareCall(node0);
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
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      MockPrintStream mockPrintStream0 = new MockPrintStream("j");
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager(lightweightMessageFormatter0, mockPrintStream0);
      Compiler compiler0 = new Compiler(printStreamErrorManager0);
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, functionToBlockMutator_LabelNameSupplier0, false, false, false);
      FileInstrumentationData fileInstrumentationData0 = new FileInstrumentationData("j", "~fO_zZBAT");
      ImmutableSortedMap<String, FileInstrumentationData> immutableSortedMap0 = ImmutableSortedMap.of("j", fileInstrumentationData0, "~fO_zZBAT", fileInstrumentationData0);
      CoverageInstrumentationPass.CoverageReach coverageInstrumentationPass_CoverageReach0 = CoverageInstrumentationPass.CoverageReach.ALL;
      CoverageInstrumentationCallback coverageInstrumentationCallback0 = new CoverageInstrumentationCallback(immutableSortedMap0, coverageInstrumentationPass_CoverageReach0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, coverageInstrumentationCallback0, (ScopeCreator) null);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSType[] jSTypeArray0 = new JSType[3];
      JSTypeNative jSTypeNative0 = JSTypeNative.REFERENCE_ERROR_FUNCTION_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      jSTypeArray0[2] = (JSType) functionType0;
      Node node0 = jSTypeRegistry0.createParameters(jSTypeArray0);
      EnumType enumType0 = jSTypeRegistry0.createEnumType("~fO_zZBAT", (Node) null, jSTypeArray0[2]);
      EnumElementType enumElementType0 = enumType0.getElementsType();
      Set<String> set0 = enumElementType0.getPropertyNames();
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
      functionInjector0.canInlineReferenceToFunction(nodeTraversal0, node0, (Node) null, set0, functionInjector_InliningMode0, true, true);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      MockPrintStream mockPrintStream0 = new MockPrintStream("j");
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager(lightweightMessageFormatter0, mockPrintStream0);
      Compiler compiler0 = new Compiler(printStreamErrorManager0);
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, functionToBlockMutator_LabelNameSupplier0, false, false, false);
      FileInstrumentationData fileInstrumentationData0 = new FileInstrumentationData("j", "~fO_zZBAT");
      ImmutableSortedMap<String, FileInstrumentationData> immutableSortedMap0 = ImmutableSortedMap.of("j", fileInstrumentationData0, "~fO_zZBAT", fileInstrumentationData0);
      CoverageInstrumentationPass.CoverageReach coverageInstrumentationPass_CoverageReach0 = CoverageInstrumentationPass.CoverageReach.ALL;
      CoverageInstrumentationCallback coverageInstrumentationCallback0 = new CoverageInstrumentationCallback(immutableSortedMap0, coverageInstrumentationPass_CoverageReach0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, coverageInstrumentationCallback0, (ScopeCreator) null);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSType[] jSTypeArray0 = new JSType[3];
      ImmutableList<TemplateType> immutableList0 = ImmutableList.of();
      FunctionType functionType0 = jSTypeRegistry0.createInterfaceType("j", (Node) null, immutableList0);
      jSTypeArray0[2] = (JSType) functionType0;
      Node node0 = jSTypeRegistry0.createParameters(jSTypeArray0);
      EnumType enumType0 = jSTypeRegistry0.createEnumType("~fO_zZBAT", (Node) null, jSTypeArray0[2]);
      EnumElementType enumElementType0 = enumType0.getElementsType();
      Set<String> set0 = enumElementType0.getPropertyNames();
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
      // Undeclared exception!
      try { 
        functionInjector0.canInlineReferenceToFunction(nodeTraversal0, node0, (Node) null, set0, functionInjector_InliningMode0, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      MockPrintStream mockPrintStream0 = new MockPrintStream("j");
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager(lightweightMessageFormatter0, mockPrintStream0);
      Compiler compiler0 = new Compiler(printStreamErrorManager0);
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, functionToBlockMutator_LabelNameSupplier0, true, true, true);
      FileInstrumentationData fileInstrumentationData0 = new FileInstrumentationData("j", "~fO_zZBAT");
      ImmutableSortedMap<String, FileInstrumentationData> immutableSortedMap0 = ImmutableSortedMap.of("j", fileInstrumentationData0, "~fO_zZBAT", fileInstrumentationData0);
      CoverageInstrumentationPass.CoverageReach coverageInstrumentationPass_CoverageReach0 = CoverageInstrumentationPass.CoverageReach.ALL;
      CoverageInstrumentationCallback coverageInstrumentationCallback0 = new CoverageInstrumentationCallback(immutableSortedMap0, coverageInstrumentationPass_CoverageReach0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, coverageInstrumentationCallback0, (ScopeCreator) null);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSType[] jSTypeArray0 = new JSType[3];
      ImmutableList<TemplateType> immutableList0 = ImmutableList.of();
      FunctionType functionType0 = jSTypeRegistry0.createInterfaceType("j", (Node) null, immutableList0);
      jSTypeArray0[2] = (JSType) functionType0;
      Node node0 = jSTypeRegistry0.createParameters(jSTypeArray0);
      EnumType enumType0 = jSTypeRegistry0.createEnumType("~fO_zZBAT", (Node) null, jSTypeArray0[2]);
      EnumElementType enumElementType0 = enumType0.getElementsType();
      Set<String> set0 = enumElementType0.getPropertyNames();
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      // Undeclared exception!
      try { 
        functionInjector0.canInlineReferenceToFunction(nodeTraversal0, node0, (Node) null, set0, functionInjector_InliningMode0, false, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.FunctionInjector", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, functionToBlockMutator_LabelNameSupplier0, false, true, false);
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      Locale locale0 = Locale.CANADA;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, (NodeTraversal.Callback) null, (ScopeCreator) null);
      Node node0 = Node.newString((-3416), "QD:vXe@er2LoG#");
      Node node1 = new Node((-3416), node0, 57, (-2));
      functionInjector0.canInlineReferenceToFunction(nodeTraversal0, node1, node1, set0, functionInjector_InliningMode0, true, false);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager((Logger) null);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, true);
      Node node0 = new Node(110);
      ImmutableSortedMap<FunctionInjector.Reference, String> immutableSortedMap0 = ImmutableSortedMap.of();
      ImmutableSortedMap<FunctionInjector.Reference, Object> immutableSortedMap1 = ImmutableSortedMap.copyOf((Map<? extends FunctionInjector.Reference, ?>) immutableSortedMap0);
      ImmutableSortedSet<FunctionInjector.Reference> immutableSortedSet0 = immutableSortedMap1.keySet();
      boolean boolean0 = functionInjector0.inliningLowersCost((JSModule) null, node0, immutableSortedSet0, (Set<String>) null, true, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("can only implement interf(ces");
      Compiler compiler0 = new Compiler(mockPrintStream0);
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, functionToBlockMutator_LabelNameSupplier0, false, false, true);
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference((Node) null, (JSModule) null, functionInjector_InliningMode0);
      ImmutableList<FunctionInjector.Reference> immutableList0 = ImmutableList.of(functionInjector_Reference0);
      Locale locale0 = Locale.CANADA;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      // Undeclared exception!
      try { 
        functionInjector0.inliningLowersCost((JSModule) null, (Node) null, immutableList0, set0, false, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("can only implement interf(ces");
      Compiler compiler0 = new Compiler(mockPrintStream0);
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, functionToBlockMutator_LabelNameSupplier0, false, true, true);
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference((Node) null, (JSModule) null, functionInjector_InliningMode0);
      ImmutableList<FunctionInjector.Reference> immutableList0 = ImmutableList.of(functionInjector_Reference0);
      Locale locale0 = Locale.CANADA;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      boolean boolean0 = functionInjector0.inliningLowersCost((JSModule) null, (Node) null, immutableList0, set0, true, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, functionToBlockMutator_LabelNameSupplier0, false, false, true);
      FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
      FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference((Node) null, (JSModule) null, functionInjector_InliningMode0);
      ImmutableList<FunctionInjector.Reference> immutableList0 = ImmutableList.of(functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0, functionInjector_Reference0);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getModifies();
      // Undeclared exception!
      try { 
        functionInjector0.inliningLowersCost((JSModule) null, (Node) null, immutableList0, set0, false, false);
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
      Compiler compiler0 = new Compiler();
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      FunctionInjector functionInjector0 = new FunctionInjector(compiler0, functionToBlockMutator_LabelNameSupplier0, false, true, true);
      ImmutableSortedMap<String, String> immutableSortedMap0 = ImmutableSortedMap.of("", "CFgEo9=", "^Om", "");
      ImmutableSortedSet<String> immutableSortedSet0 = immutableSortedMap0.navigableKeySet();
      functionInjector0.setKnownConstants(immutableSortedSet0);
      // Undeclared exception!
      try { 
        functionInjector0.setKnownConstants(immutableSortedSet0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }
}
