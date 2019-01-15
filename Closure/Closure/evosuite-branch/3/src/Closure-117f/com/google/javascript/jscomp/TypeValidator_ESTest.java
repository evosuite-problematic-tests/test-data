/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 11:36:50 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.javascript.jscomp.CombinedCompilerPass;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerInput;
import com.google.javascript.jscomp.FunctionToBlockMutator;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.PeepholeSimplifyRegExp;
import com.google.javascript.jscomp.RenameLabels;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.jscomp.SyntacticScopeCreator;
import com.google.javascript.jscomp.TypeValidator;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypeValidator_ESTest extends TypeValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseVoidType();
      JSType jSType1 = jSTypeRegistry0.createOptionalNullableType(jSType0);
      Compiler compiler0 = new Compiler();
      Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      NodeTraversal.Callback[] nodeTraversal_CallbackArray0 = new NodeTraversal.Callback[1];
      CombinedCompilerPass combinedCompilerPass0 = new CombinedCompilerPass(compiler0, nodeTraversal_CallbackArray0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, combinedCompilerPass0, (ScopeCreator) null);
      boolean boolean0 = typeValidator0.expectObject(nodeTraversal0, (Node) null, jSType1, "Named type with empty name component");
      assertEquals(1, compiler0.getWarningCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      RenameLabels renameLabels0 = new RenameLabels(compiler0, functionToBlockMutator_LabelNameSupplier0, false);
      RenameLabels.ProcessLabels renameLabels_ProcessLabels0 = renameLabels0.new ProcessLabels();
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, renameLabels_ProcessLabels0);
      typeValidator0.expectValidTypeofName(nodeTraversal0, node0, "Named type with empty name component");
      assertEquals(1, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        compiler0.parseSyntheticCode("JSC_DUP_VAR_DECLARATION", "JSC_DUP_VAR_DECLARATION");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duplicate key: ngInject
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNullType();
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      String string0 = typeValidator_TypeMismatch0.toString();
      assertEquals("(null, null)", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      modificationVisitor0.caseVoidType();
      JSType jSType0 = modificationVisitor0.caseNullType();
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duplicate key: ngInject
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      modificationVisitor0.caseVoidType();
      JSType jSType0 = modificationVisitor0.caseNullType();
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duplicate key: ngInject
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      modificationVisitor0.caseVoidType();
      JSType jSType0 = modificationVisitor0.caseNullType();
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duplicate key: ngInject
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      modificationVisitor0.caseVoidType();
      JSType jSType0 = modificationVisitor0.caseNullType();
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duplicate key: ngInject
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      modificationVisitor0.caseVoidType();
      JSType jSType0 = modificationVisitor0.caseNullType();
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duplicate key: ngInject
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNullType();
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duplicate key: ngInject
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNullType();
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      TypeValidator.TypeMismatch typeValidator_TypeMismatch1 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      Compiler compiler0 = new Compiler();
      PeepholeSimplifyRegExp peepholeSimplifyRegExp0 = new PeepholeSimplifyRegExp();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      ImmutableList<JSType> immutableList0 = ImmutableList.of(jSType0, jSType0, jSType0, jSType0, jSType0);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType(jSType0, (List<JSType>) immutableList0);
      // Undeclared exception!
      try { 
        typeValidator0.expectString((NodeTraversal) null, node0, functionType0, "Object#Key");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.TypeValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNullType();
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duplicate key: ngInject
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseVoidType();
      jSTypeRegistry0.createOptionalNullableType(jSType0);
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      NodeTraversal.Callback[] nodeTraversal_CallbackArray0 = new NodeTraversal.Callback[1];
      CombinedCompilerPass combinedCompilerPass0 = new CombinedCompilerPass(compiler0, nodeTraversal_CallbackArray0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, combinedCompilerPass0, (ScopeCreator) null);
      EnumType enumType0 = jSTypeRegistry0.createEnumType("", node0, jSType0);
      typeValidator0.expectNumber(nodeTraversal0, (Node) null, enumType0, "Named type with empty name component");
      assertEquals(1, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNullType();
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      TypeValidator.TypeMismatch typeValidator_TypeMismatch1 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      Compiler compiler0 = new Compiler();
      PeepholeSimplifyRegExp peepholeSimplifyRegExp0 = new PeepholeSimplifyRegExp();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, (NodeTraversal.Callback) null, syntacticScopeCreator0);
      typeValidator0.expectBitwiseable(nodeTraversal0, node0, jSType0, "");
      assertEquals(0, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      modificationVisitor0.caseVoidType();
      JSType jSType0 = modificationVisitor0.caseNullType();
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duplicate key: ngInject
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNullType();
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      TypeValidator.TypeMismatch typeValidator_TypeMismatch1 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      Compiler compiler0 = new Compiler();
      PeepholeSimplifyRegExp peepholeSimplifyRegExp0 = new PeepholeSimplifyRegExp();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      typeValidator0.expectStringOrNumber((NodeTraversal) null, node0, jSType0, "T0{7Djfn");
      assertFalse(node0.isSetterDef());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      modificationVisitor0.caseVoidType();
      JSType jSType0 = modificationVisitor0.caseNullType();
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duplicate key: ngInject
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNullType();
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duplicate key: ngInject
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNullType();
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      TypeValidator.TypeMismatch typeValidator_TypeMismatch1 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      Compiler compiler0 = new Compiler();
      PeepholeSimplifyRegExp peepholeSimplifyRegExp0 = new PeepholeSimplifyRegExp();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      typeValidator0.expectSwitchMatchesCase((NodeTraversal) null, node0, jSType0, jSType0);
      assertEquals(39, Node.EMPTY_BLOCK);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseVoidType();
      JSType jSType1 = modificationVisitor0.caseNullType();
      jSTypeRegistry0.createOptionalNullableType(jSType0);
      Compiler compiler0 = new Compiler();
      Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
      TypeValidator typeValidator0 = compiler0.getTypeValidator();
      NodeTraversal.Callback[] nodeTraversal_CallbackArray0 = new NodeTraversal.Callback[1];
      CombinedCompilerPass combinedCompilerPass0 = new CombinedCompilerPass(compiler0, nodeTraversal_CallbackArray0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, combinedCompilerPass0, (ScopeCreator) null);
      // Undeclared exception!
      try { 
        typeValidator0.expectSwitchMatchesCase(nodeTraversal0, (Node) null, jSType0, jSType1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.TypeValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseVoidType();
      JSType jSType1 = jSTypeRegistry0.createOptionalNullableType(jSType0);
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      NodeTraversal.Callback[] nodeTraversal_CallbackArray0 = new NodeTraversal.Callback[1];
      CombinedCompilerPass combinedCompilerPass0 = new CombinedCompilerPass(compiler0, nodeTraversal_CallbackArray0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, combinedCompilerPass0, (ScopeCreator) null);
      boolean boolean0 = typeValidator0.expectCanAssignToPropertyOf(nodeTraversal0, node0, jSType1, jSType0, node0, "Named type with empty name component");
      assertEquals(1, compiler0.getWarningCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNullType();
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      TypeValidator.TypeMismatch typeValidator_TypeMismatch1 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      Compiler compiler0 = new Compiler();
      PeepholeSimplifyRegExp peepholeSimplifyRegExp0 = new PeepholeSimplifyRegExp();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, (NodeTraversal.Callback) null, syntacticScopeCreator0);
      boolean boolean0 = typeValidator0.expectCanAssignToPropertyOf(nodeTraversal0, node0, jSType0, jSType0, node0, "Named type with empty name component");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNullType();
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      TypeValidator.TypeMismatch typeValidator_TypeMismatch1 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      Compiler compiler0 = new Compiler();
      PeepholeSimplifyRegExp peepholeSimplifyRegExp0 = new PeepholeSimplifyRegExp();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      boolean boolean0 = typeValidator0.expectCanAssignTo((NodeTraversal) null, node0, jSType0, jSType0, "Not declared as a type name");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseVoidType();
      JSType jSType1 = modificationVisitor0.caseNullType();
      JSType jSType2 = jSTypeRegistry0.createOptionalNullableType(jSType0);
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      NodeTraversal.Callback[] nodeTraversal_CallbackArray0 = new NodeTraversal.Callback[1];
      CombinedCompilerPass combinedCompilerPass0 = new CombinedCompilerPass(compiler0, nodeTraversal_CallbackArray0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, combinedCompilerPass0, (ScopeCreator) null);
      typeValidator0.expectArgumentMatchesParameter(nodeTraversal0, node0, jSType1, jSType2, node0, 55);
      assertFalse(jSType1.isUnionType());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      modificationVisitor0.caseVoidType();
      JSType jSType0 = modificationVisitor0.caseNullType();
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duplicate key: ngInject
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseVoidType();
      JSType jSType1 = modificationVisitor0.caseNullType();
      jSTypeRegistry0.createOptionalNullableType(jSType0);
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      typeValidator0.expectCanOverride((NodeTraversal) null, node0, jSType1, jSType1, "t`)DNx/&N_=FC,}[}`P", jSType0);
      assertFalse(jSType0.isEnumType());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      modificationVisitor0.caseStringType();
      Compiler compiler0 = new Compiler();
      PeepholeSimplifyRegExp peepholeSimplifyRegExp0 = new PeepholeSimplifyRegExp();
      // Undeclared exception!
      try { 
        Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duplicate key: ngInject
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, true);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      modificationVisitor0.caseVoidType();
      JSType jSType0 = modificationVisitor0.caseNullType();
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duplicate key: ngInject
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseVoidType();
      JSType jSType1 = jSTypeRegistry0.createOptionalNullableType(jSType0);
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      NodeTraversal.Callback[] nodeTraversal_CallbackArray0 = new NodeTraversal.Callback[1];
      CombinedCompilerPass combinedCompilerPass0 = new CombinedCompilerPass(compiler0, nodeTraversal_CallbackArray0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, combinedCompilerPass0, (ScopeCreator) null);
      typeValidator0.expectCanCast(nodeTraversal0, node0, jSType1, jSType0);
      assertEquals(0, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      modificationVisitor0.caseVoidType();
      JSType jSType0 = modificationVisitor0.caseNullType();
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duplicate key: ngInject
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseVoidType();
      JSType jSType1 = jSTypeRegistry0.createOptionalNullableType(jSType0);
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      // Undeclared exception!
      try { 
        typeValidator0.expectUndeclaredVariable("", (CompilerInput) null, node0, node0, (Scope.Var) null, "", jSType1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.TypeValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      modificationVisitor0.caseStringType();
      Compiler compiler0 = new Compiler();
      PeepholeSimplifyRegExp peepholeSimplifyRegExp0 = new PeepholeSimplifyRegExp();
      // Undeclared exception!
      try { 
        Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duplicate key: ngInject
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseVoidType();
      JSType jSType1 = jSTypeRegistry0.createOptionalNullableType(jSType0);
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      NodeTraversal.Callback[] nodeTraversal_CallbackArray0 = new NodeTraversal.Callback[1];
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, nodeTraversal_CallbackArray0[0], (ScopeCreator) null);
      JSType jSType2 = modificationVisitor0.caseBooleanType();
      typeValidator0.expectCanOverride(nodeTraversal0, node0, jSType2, jSType0, "Named type with empty name component", jSType1);
      assertEquals(1, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
      TypeValidator typeValidator0 = new TypeValidator(compiler0);
      String string0 = typeValidator0.getReadableJSTypeName(node0, false);
      assertEquals("?", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      modificationVisitor0.caseVoidType();
      JSType jSType0 = modificationVisitor0.caseNullType();
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        Normalize.parseAndNormalizeTestCode(compiler0, "Not declared as a constructor");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duplicate key: ngInject
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNullType();
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      boolean boolean0 = typeValidator_TypeMismatch0.equals(simpleErrorReporter0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0, false);
      ModificationVisitor modificationVisitor0 = new ModificationVisitor(jSTypeRegistry0);
      JSType jSType0 = modificationVisitor0.caseNullType();
      TypeValidator.TypeMismatch typeValidator_TypeMismatch0 = new TypeValidator.TypeMismatch(jSType0, jSType0, (JSError) null);
      boolean boolean0 = typeValidator_TypeMismatch0.equals(typeValidator_TypeMismatch0);
      assertTrue(boolean0);
  }
}
