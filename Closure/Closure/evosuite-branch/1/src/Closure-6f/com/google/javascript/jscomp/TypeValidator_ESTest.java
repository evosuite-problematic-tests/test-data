/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 06:51:18 GMT 2018
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CheckRegExp;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerInput;
import com.google.javascript.jscomp.DiagnosticType;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.MemoizedScopeCreator;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.ReplaceIdGenerators;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.jscomp.TypeValidator;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.UnionType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypeValidator_ESTest extends TypeValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      CheckRegExp checkRegExp0 = new CheckRegExp(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkRegExp0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_OBJECT_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      FunctionType functionType1 = functionType0.cloneWithoutArrowType();
      typeValidator0.expectArgumentMatchesParameter(nodeTraversal0, (Node) null, functionType1, functionType0, node0, 0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      CheckRegExp checkRegExp0 = new CheckRegExp(compiler0);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkRegExp0, (ScopeCreator) null);
      JSType jSType0 = modificationVisitor0.caseVoidType();
      typeValidator0.expectNumber(nodeTraversal0, node0, jSType0, "property {0} on interface {1} is not implemented by type {2}");
      assertEquals(1, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.getErrorManager();
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      Iterable<TypeValidator.TypeMismatch> iterable0 = typeValidator0.getMismatches();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Normalize.parseAndNormalizeTestCode(compiler0, "", "");
      TypeValidator typeValidator0 = compiler0.getTypeValidator();
      typeValidator0.setShouldReport(false);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.parseTestCode("JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      CheckRegExp checkRegExp0 = new CheckRegExp(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkRegExp0);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_OBJECT_TYPE;
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      JSTypeNative[] jSTypeNativeArray0 = new JSTypeNative[4];
      jSTypeNativeArray0[0] = jSTypeNative0;
      jSTypeNativeArray0[1] = jSTypeNative0;
      JSTypeNative jSTypeNative1 = JSTypeNative.FUNCTION_INSTANCE_TYPE;
      jSTypeNativeArray0[2] = jSTypeNative1;
      jSTypeNativeArray0[3] = jSTypeNative0;
      JSType jSType0 = jSTypeRegistry0.createUnionType(jSTypeNativeArray0);
      typeValidator0.expectString(nodeTraversal0, (Node) null, jSType0, "@h2([sW\u0001");
      assertEquals(1, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNoType();
      DiagnosticType diagnosticType0 = ReplaceIdGenerators.NON_GLOBAL_ID_GENERATOR_CALL;
      String[] stringArray0 = new String[5];
      JSError jSError0 = JSError.make(diagnosticType0, stringArray0);
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch(jSType0, jSType0, jSError0);
      String string0 = typeValidator_TypeMismatch0.toString();
      assertEquals("(None, None)", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      CheckRegExp checkRegExp0 = new CheckRegExp(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkRegExp0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_OBJECT_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      boolean boolean0 = typeValidator0.expectObject(nodeTraversal0, node0, functionType0, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      CheckRegExp checkRegExp0 = new CheckRegExp(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkRegExp0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_RESOLVED_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      typeValidator0.expectAnyObject(nodeTraversal0, node0, functionType0, "Not declared as a constructor");
      assertTrue(functionType0.hasCachedValues());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("JSC_HIDDEN_INTRFACE_PROPERTY_MISMATCH");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      CheckRegExp checkRegExp0 = new CheckRegExp(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkRegExp0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_OBJECT_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      typeValidator0.expectString(nodeTraversal0, node0, functionType0, "Not declared as a constructor");
      assertFalse(functionType0.hasCachedValues());
      assertEquals(0, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      CheckRegExp checkRegExp0 = new CheckRegExp(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkRegExp0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_OBJECT_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      FunctionType functionType1 = jSTypeRegistry0.createFunctionType((JSType) functionType0, node0);
      // Undeclared exception!
      try { 
        typeValidator0.expectStringOrNumber(nodeTraversal0, node0, functionType1, "Named type with empty name component");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.FunctionType", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.parseTestCode("JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      CheckRegExp checkRegExp0 = new CheckRegExp(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkRegExp0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_OBJECT_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      boolean boolean0 = typeValidator0.expectNotNullOrUndefined(nodeTraversal0, (Node) null, functionType0, "Gm(X~CtGEU", functionType0);
      assertTrue(functionType0.hasCachedValues());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      CheckRegExp checkRegExp0 = new CheckRegExp(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkRegExp0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_RESOLVED_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      boolean boolean0 = typeValidator0.expectNotNullOrUndefined(nodeTraversal0, node0, functionType0, "{0} expressions are not callable", functionType0);
      assertTrue(functionType0.hasCachedValues());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      CheckRegExp checkRegExp0 = new CheckRegExp(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkRegExp0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_RESOLVED_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      typeValidator0.expectSwitchMatchesCase(nodeTraversal0, node0, functionType0, functionType0);
      assertEquals(0, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.parseTestCode("JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      CheckRegExp checkRegExp0 = new CheckRegExp(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkRegExp0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_OBJECT_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      JSType jSType0 = modificationVisitor0.caseBooleanType();
      // Undeclared exception!
      try { 
        typeValidator0.expectSwitchMatchesCase(nodeTraversal0, (Node) null, functionType0, jSType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.TypeValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, true);
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      CheckRegExp checkRegExp0 = new CheckRegExp(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkRegExp0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      node0.getStaticSourceFile();
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_OBJECT_TYPE;
      checkRegExp0.process(node0, node0);
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      JSType jSType0 = modificationVisitor0.caseFunctionType(functionType0);
      jSType0.canTestForShallowEqualityWith(functionType0);
      typeValidator0.expectAnyObject(nodeTraversal0, node0, jSType0, "");
      typeValidator0.expectBitwiseable(nodeTraversal0, node0, jSType0, "Unknown class name");
      System.setCurrentTimeMillis(0);
      Compiler.IntermediateState compiler_IntermediateState0 = compiler0.getState();
      Node node1 = compiler_IntermediateState0.externsRoot;
      typeValidator0.expectStringOrNumber(nodeTraversal0, (Node) null, jSType0, ",Uld.*E.");
      typeValidator0.expectValidTypeofName(nodeTraversal0, (Node) null, ">~b");
      typeValidator0.expectArgumentMatchesParameter(nodeTraversal0, node0, functionType0, jSType0, (Node) null, (-1649));
      typeValidator0.expectActualObject(nodeTraversal0, node0, jSType0, "Not declared as a constructor");
      Compiler.IntermediateState compiler_IntermediateState1 = compiler0.getState();
      Node node2 = compiler_IntermediateState1.externsRoot;
      typeValidator0.expectNumber(nodeTraversal0, (Node) null, jSType0, "Not declared as a type name");
      ModificationVisitor modificationVisitor1 = new ModificationVisitor(jSTypeRegistry0);
      UnionType unionType0 = mock(UnionType.class, new ViolatedAssumptionAnswer());
      doReturn((Iterable) null).when(unionType0).getAlternates();
      // Undeclared exception!
      try { 
        modificationVisitor1.caseUnionType(unionType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.jstype.ModificationVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      CheckRegExp checkRegExp0 = new CheckRegExp(compiler0);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_OBJECT_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkRegExp0, (ScopeCreator) null);
      JSType jSType0 = modificationVisitor0.caseVoidType();
      boolean boolean0 = typeValidator0.expectCanAssignToPropertyOf(nodeTraversal0, node0, functionType0, jSType0, node0, "Unknown class name");
      assertTrue(functionType0.hasCachedValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      CheckRegExp checkRegExp0 = new CheckRegExp(compiler0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_OBJECT_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      MemoizedScopeCreator memoizedScopeCreator0 = new MemoizedScopeCreator((ScopeCreator) null);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkRegExp0, memoizedScopeCreator0);
      boolean boolean0 = typeValidator0.expectCanAssignToPropertyOf(nodeTraversal0, node0, functionType0, functionType0, node0, "Unknown class name");
      assertTrue(functionType0.hasCachedValues());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.parseTestCode("JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      CheckRegExp checkRegExp0 = new CheckRegExp(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkRegExp0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_RESOLVED_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      boolean boolean0 = typeValidator0.expectCanAssignTo(nodeTraversal0, (Node) null, functionType0, functionType0, "Not declared as a type name");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("JSC_HIDDEN_INTRFACE_PROPERTY_MISMATCH");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      CheckRegExp checkRegExp0 = new CheckRegExp(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkRegExp0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_OBJECT_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      JSType jSType0 = modificationVisitor0.caseBooleanType();
      boolean boolean0 = typeValidator0.expectCanAssignTo(nodeTraversal0, node0, functionType0, jSType0, "Unknown class name");
      assertTrue(functionType0.hasCachedValues());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.parseTestCode("JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      CheckRegExp checkRegExp0 = new CheckRegExp(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkRegExp0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_RESOLVED_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      typeValidator0.expectCanOverride(nodeTraversal0, (Node) null, functionType0, functionType0, "Unknown class name", functionType0);
      assertEquals(0, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      CheckRegExp checkRegExp0 = new CheckRegExp(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkRegExp0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_OBJECT_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      JSType jSType0 = modificationVisitor0.caseStringType();
      typeValidator0.expectCanOverride(nodeTraversal0, node0, functionType0, jSType0, "DK\"|8=X", functionType0);
      assertTrue(functionType0.hasCachedValues());
      assertEquals(1, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      CheckRegExp checkRegExp0 = new CheckRegExp(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkRegExp0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_OBJECT_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      typeValidator0.expectSuperType(nodeTraversal0, node0, functionType0, functionType0);
      assertNull(functionType0.getReferenceName());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      CheckRegExp checkRegExp0 = new CheckRegExp(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkRegExp0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_OBJECT_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      typeValidator0.expectCanCast(nodeTraversal0, node0, functionType0, functionType0);
      assertFalse(node0.isReturn());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_OBJECT_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      Scope.Var scope_Var0 = mock(Scope.Var.class, new ViolatedAssumptionAnswer());
      doReturn(functionType0).when(scope_Var0).getType();
      // Undeclared exception!
      try { 
        typeValidator0.expectUndeclaredVariable("Unknown class name", (CompilerInput) null, node0, (Node) null, scope_Var0, "*T`2lzQa/)Mo", functionType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.TypeValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_OBJECT_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      Scope.Var scope_Var0 = mock(Scope.Var.class, new ViolatedAssumptionAnswer());
      doReturn((JSType) null).when(scope_Var0).getType();
      doReturn((String) null).when(scope_Var0).toString();
      Scope.Var scope_Var1 = typeValidator0.expectUndeclaredVariable("Unknown class name", (CompilerInput) null, node0, (Node) null, scope_Var0, "*T`2lzQa/)Mo", functionType0);
      assertNull(scope_Var1.getName());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      CheckRegExp checkRegExp0 = new CheckRegExp(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkRegExp0);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      JSTypeNative jSTypeNative0 = JSTypeNative.NO_OBJECT_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      typeValidator0.expectAllInterfaceProperties(nodeTraversal0, node0, functionType0);
      assertEquals(1, node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch((JSType) null, (JSType) null, (JSError) null);
      boolean boolean0 = typeValidator_TypeMismatch0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch((JSType) null, (JSType) null, (JSError) null);
      // Undeclared exception!
      try { 
        typeValidator_TypeMismatch0.equals(typeValidator_TypeMismatch0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.TypeValidator$TypeMismatch", e);
      }
  }
}