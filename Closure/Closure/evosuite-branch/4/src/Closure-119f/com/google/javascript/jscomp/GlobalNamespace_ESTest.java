/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 11:19:51 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.GlobalNamespace;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import java.io.PrintStream;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GlobalNamespace_ESTest extends GlobalNamespace_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GlobalNamespace globalNamespace0 = new GlobalNamespace((AbstractCompiler) null, (Node) null);
      // Undeclared exception!
      try { 
        globalNamespace0.getNameForest();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      Predicate<String> predicate0 = (Predicate<String>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      GlobalNamespace.Tracker globalNamespace_Tracker0 = new GlobalNamespace.Tracker(compiler0, (PrintStream) null, predicate0);
      // Undeclared exception!
      try { 
        globalNamespace_Tracker0.process((Node) null, (Node) null);
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
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      Node node0 = new Node((-3008), 2097152, 2097152);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0);
      // Undeclared exception!
      try { 
        globalNamespace0.getSlot("0YUdNV|V_3rK44e%l");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Logger logger0 = Logger.getAnonymousLogger();
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, (Node) null);
      StaticScope<JSType> staticScope0 = globalNamespace0.getParentScope();
      assertNull(staticScope0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Node node0 = Node.newString(0, "com.google.javascript.jscomp.RenamePrototypes$ProcessProperties");
      Compiler compiler0 = new Compiler();
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0);
      StaticScope<JSType> staticScope0 = globalNamespace0.getScope((GlobalNamespace.Name) null);
      assertSame(globalNamespace0, staticScope0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      Node node0 = new Node((-3008), 2097152, 2097152);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0);
      // Undeclared exception!
      try { 
        globalNamespace0.getAllSymbols();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      Node node0 = new Node((-3008), 2097152, 2097152);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0);
      Node node1 = globalNamespace0.getRootNode();
      assertNull(node1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GlobalNamespace globalNamespace0 = new GlobalNamespace((AbstractCompiler) null, (Node) null);
      // Undeclared exception!
      try { 
        globalNamespace0.getTypeOfThis();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.GlobalNamespace", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("*Lq", (GlobalNamespace.Name) null, true);
      String string0 = globalNamespace_Name0.getName();
      assertEquals("*Lq", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("com.google.javascript.jscomp.CleanupPasses$3", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Ref globalNamespace_Ref0 = globalNamespace_Name0.getDeclaration();
      assertNull(globalNamespace_Ref0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("", (GlobalNamespace.Name) null, true);
      boolean boolean0 = globalNamespace_Name0.isDeclaredType();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("*Lq", (GlobalNamespace.Name) null, true);
      JSType jSType0 = globalNamespace_Name0.getType();
      assertNull(jSType0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("GET", (GlobalNamespace.Name) null, true);
      String string0 = globalNamespace_Name0.toString();
      assertEquals("GET (OTHER): globalSets=0, localSets=0, totalGets=0, aliasingGets=0, callGets=0", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("Expected expression but was ", (GlobalNamespace.Name) null, true);
      JSDocInfo jSDocInfo0 = globalNamespace_Name0.getJSDocInfo();
      assertNull(jSDocInfo0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("com.google.javascript.jscomp.RenamePrototypes$ProcessProperties", (GlobalNamespace.Name) null, false);
      String string0 = globalNamespace_Name0.getBaseName();
      assertEquals("com.google.javascript.jscomp.RenamePrototypes$ProcessProperties", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("tUC+7A8?~", (GlobalNamespace.Name) null, false);
      boolean boolean0 = globalNamespace_Name0.isTypeInferred();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSModule jSModule0 = new JSModule((String) null);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_LOCAL;
      GlobalNamespace.Ref globalNamespace_Ref0 = null;
      try {
        globalNamespace_Ref0 = new GlobalNamespace.Ref(jSModule0, (Scope) null, (Node) null, (GlobalNamespace.Name) null, globalNamespace_Ref_Type0, 105);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.GlobalNamespace$Ref", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.DIRECT_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      JSModule jSModule0 = globalNamespace_Ref0.getModule();
      assertNull(jSModule0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_GLOBAL;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      StaticSlot<JSType> staticSlot0 = globalNamespace_Ref0.getSymbol();
      assertNull(staticSlot0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.DELETE_PROP;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      GlobalNamespace.Ref globalNamespace_Ref1 = globalNamespace_Ref0.getTwin();
      assertNull(globalNamespace_Ref1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      StaticSourceFile staticSourceFile0 = globalNamespace_Ref0.getSourceFile();
      assertNull(staticSourceFile0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.CALL_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      Node node0 = globalNamespace_Ref0.getNode();
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.CombinedCompilerPass");
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, (Node) null, node0);
      boolean boolean0 = globalNamespace0.hasExternsRoot();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "collapseVariableDeclarations");
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0, node0);
      boolean boolean0 = globalNamespace0.hasExternsRoot();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "collapseVariableDeclarations");
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0, node0);
      globalNamespace0.getOwnSlot("DIREC7T_GET");
      // Undeclared exception!
      try { 
        globalNamespace0.getReferences((GlobalNamespace.Name) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.GlobalNamespace", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      Node node0 = new Node((-3008), 2097152, 2097152);
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0);
      JSModule jSModule0 = new JSModule((String) null);
      Scope scope0 = Scope.createLatticeBottom(node0);
      GlobalNamespace.AstChange globalNamespace_AstChange0 = new GlobalNamespace.AstChange(jSModule0, scope0, node0);
      GlobalNamespace.AstChange[] globalNamespace_AstChangeArray0 = new GlobalNamespace.AstChange[1];
      globalNamespace_AstChangeArray0[0] = globalNamespace_AstChange0;
      ImmutableList<GlobalNamespace.AstChange> immutableList0 = ImmutableList.of(globalNamespace_AstChange0, globalNamespace_AstChange0, globalNamespace_AstChange0, globalNamespace_AstChange0, globalNamespace_AstChange0, globalNamespace_AstChange0, globalNamespace_AstChange0, globalNamespace_AstChange0, globalNamespace_AstChange0, globalNamespace_AstChange0, globalNamespace_AstChange0, globalNamespace_AstChange0, globalNamespace_AstChangeArray0);
      globalNamespace0.scanNewNodes(immutableList0);
      assertTrue(immutableList0.contains(globalNamespace_AstChange0));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.CombinedCompilerPass");
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0, node0);
      GlobalNamespace.Name globalNamespace_Name0 = globalNamespace0.getOwnSlot("com.google.javascript.jscomp.CombinedCompilerPass");
      assertNull(globalNamespace_Name0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.CombinedCompilerPass");
      GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, (Node) null, node0);
      GlobalNamespace.Name globalNamespace_Name0 = globalNamespace0.getOwnSlot("DIRECT_GET");
      assertNull(globalNamespace_Name0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("", (GlobalNamespace.Name) null, true);
      GlobalNamespace.Name globalNamespace_Name1 = globalNamespace_Name0.addProperty("", true);
      GlobalNamespace.Name globalNamespace_Name2 = globalNamespace_Name0.addProperty("", false);
      assertNotSame(globalNamespace_Name2, globalNamespace_Name1);
      assertNotNull(globalNamespace_Name2);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("*Lq", (GlobalNamespace.Name) null, true);
      GlobalNamespace.Name globalNamespace_Name1 = globalNamespace_Name0.addProperty("*Lq", true);
      assertNotNull(globalNamespace_Name1);
      
      String string0 = globalNamespace_Name1.getFullName();
      assertEquals("*Lq.*Lq", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("com.google.javascript.jscomp.RenamePrototypes$ProcessProperties", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_GLOBAL;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      globalNamespace_Name0.addRef(globalNamespace_Ref0);
      globalNamespace_Name0.addRef(globalNamespace_Ref0);
      assertFalse(globalNamespace_Name0.isTypeInferred());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("com.google.javascript.jscomp.RenamePrototypes$ProcessProperties", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.PROTOTYPE_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      globalNamespace_Name0.addRef(globalNamespace_Ref0);
      globalNamespace_Name0.removeRef(globalNamespace_Ref0);
      assertFalse(globalNamespace_Name0.isTypeInferred());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("com.google.javascript.jscomp.RenamePrototypes$ProcessProperties", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      globalNamespace_Name0.addRef(globalNamespace_Ref0);
      globalNamespace_Name0.removeRef(globalNamespace_Ref0);
      assertFalse(globalNamespace_Name0.isTypeInferred());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("com.google.javascript.jscomp.RenamePrototypes$ProcessProperties", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.CALL_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      globalNamespace_Name0.addRef(globalNamespace_Ref0);
      globalNamespace_Name0.removeRef(globalNamespace_Ref0);
      assertFalse(globalNamespace_Name0.isTypeInferred());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("com.google.javascript.jscomp.RenamePrototypes$ProcessProperties", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.DELETE_PROP;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      globalNamespace_Name0.addRef(globalNamespace_Ref0);
      globalNamespace_Name0.removeRef(globalNamespace_Ref0);
      assertFalse(globalNamespace_Name0.isTypeInferred());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("com.google.javascript.jscomp.RenamePrototypes$ProcessProperties", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.DIRECT_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      globalNamespace_Name0.removeRef(globalNamespace_Ref0);
      assertFalse(globalNamespace_Name0.isTypeInferred());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("com.google.javascript.jscomp.RenamePrototypes$ProcessProperties", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.DIRECT_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      globalNamespace_Name0.addRef(globalNamespace_Ref0);
      globalNamespace_Name0.removeRef(globalNamespace_Ref0);
      globalNamespace_Name0.removeRef(globalNamespace_Ref0);
      assertFalse(globalNamespace_Name0.isTypeInferred());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("com.google.javascript.jscomp.RenamePrototypes$ProcessProperties", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_GLOBAL;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      globalNamespace_Name0.addRef(globalNamespace_Ref0);
      globalNamespace_Name0.removeRef(globalNamespace_Ref0);
      assertFalse(globalNamespace_Name0.isTypeInferred());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("com.google.javascript.jscomp.RenamePrototypes$ProcessProperties", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_GLOBAL;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      globalNamespace_Name0.addRef(globalNamespace_Ref0);
      globalNamespace_Name0.addRefInternal(globalNamespace_Ref0);
      globalNamespace_Name0.removeRef(globalNamespace_Ref0);
      assertFalse(globalNamespace_Name0.isTypeInferred());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("com.google.javascript.jscomp.RenamePrototypes$ProcessProperties", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_LOCAL;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      globalNamespace_Name0.addRef(globalNamespace_Ref0);
      globalNamespace_Name0.removeRef(globalNamespace_Ref0);
      assertFalse(globalNamespace_Name0.isTypeInferred());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("com.google.javascript.jscomp.RenamePrototypes$ProcessProperties", (GlobalNamespace.Name) null, false);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.DIRECT_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      globalNamespace_Name0.addRef(globalNamespace_Ref0);
      // Undeclared exception!
      try { 
        globalNamespace_Name0.isSimpleStubDeclaration();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.GlobalNamespace$Name", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("com.google.javascript.jscomp.RenamePrototypes$ProcessProperties", (GlobalNamespace.Name) null, false);
      boolean boolean0 = globalNamespace_Name0.isSimpleStubDeclaration();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("com.google.javascript.jscomp.RenamePrototypes$ProcessProperties", (GlobalNamespace.Name) null, true);
      boolean boolean0 = globalNamespace_Name0.canEliminate();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("", (GlobalNamespace.Name) null, true);
      boolean boolean0 = globalNamespace_Name0.canCollapse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("com.google.javascript.jscomp.RenamePrototypes$ProcessProperties", (GlobalNamespace.Name) null, false);
      boolean boolean0 = globalNamespace_Name0.canCollapse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("com.google.javascript.jscomp.RenamePrototypes$ProcessProperties", (GlobalNamespace.Name) null, false);
      globalNamespace_Name0.setDeclaredType();
      boolean boolean0 = globalNamespace_Name0.canCollapse();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name((String) null, (GlobalNamespace.Name) null, false);
      globalNamespace_Name0.globalSets = 103;
      boolean boolean0 = globalNamespace_Name0.canCollapse();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name((String) null, (GlobalNamespace.Name) null, false);
      globalNamespace_Name0.localSets = 894;
      boolean boolean0 = globalNamespace_Name0.canCollapse();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name((String) null, (GlobalNamespace.Name) null, false);
      globalNamespace_Name0.localSets = 894;
      globalNamespace_Name0.deleteProps = (-1891);
      boolean boolean0 = globalNamespace_Name0.canCollapse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("*Lq", (GlobalNamespace.Name) null, true);
      boolean boolean0 = globalNamespace_Name0.shouldKeepKeys();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("com.google.javascript.jscomp.RenamePrototypes$ProcessProperties", (GlobalNamespace.Name) null, false);
      globalNamespace_Name0.globalSets = (int) (byte) (-23);
      boolean boolean0 = globalNamespace_Name0.needsToBeStubbed();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("com.google.javascript.jscomp.RenamePrototypes$ProcessProperties", (GlobalNamespace.Name) null, true);
      boolean boolean0 = globalNamespace_Name0.needsToBeStubbed();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("com.google.javascript.jscomp.RenamePrototypes$ProcessProperties", (GlobalNamespace.Name) null, true);
      globalNamespace_Name0.localSets = 5;
      boolean boolean0 = globalNamespace_Name0.needsToBeStubbed();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("*Lq", (GlobalNamespace.Name) null, true);
      GlobalNamespace.Name globalNamespace_Name1 = globalNamespace_Name0.addProperty("*Lq", false);
      globalNamespace_Name1.setDeclaredType();
      assertNotSame(globalNamespace_Name1, globalNamespace_Name0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("com.google.javascript.jscomp.RenamePrototypes$ProcessProperties", (GlobalNamespace.Name) null, true);
      boolean boolean0 = globalNamespace_Name0.isNamespace();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("*Lq", (GlobalNamespace.Name) null, true);
      GlobalNamespace.Name globalNamespace_Name1 = globalNamespace_Name0.addProperty("*Lq", false);
      boolean boolean0 = globalNamespace_Name1.isSimpleName();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("-oZ", (GlobalNamespace.Name) null, false);
      boolean boolean0 = globalNamespace_Name0.isSimpleName();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_GLOBAL;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      String string0 = globalNamespace_Ref0.getSourceName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_GLOBAL;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      boolean boolean0 = globalNamespace_Ref0.isSet();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      boolean boolean0 = globalNamespace_Ref0.isSet();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_LOCAL;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      boolean boolean0 = globalNamespace_Ref0.isSet();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      // Undeclared exception!
      try { 
        GlobalNamespace.Ref.markTwins(globalNamespace_Ref0, globalNamespace_Ref0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.PROTOTYPE_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      // Undeclared exception!
      try { 
        GlobalNamespace.Ref.markTwins(globalNamespace_Ref0, globalNamespace_Ref0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
      GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
      GlobalNamespace.Ref.Type globalNamespace_Ref_Type1 = GlobalNamespace.Ref.Type.SET_FROM_GLOBAL;
      GlobalNamespace.Ref globalNamespace_Ref1 = globalNamespace_Ref0.cloneAndReclassify(globalNamespace_Ref_Type1);
      GlobalNamespace.Ref.markTwins(globalNamespace_Ref1, globalNamespace_Ref0);
      assertFalse(globalNamespace_Ref1.equals((Object)globalNamespace_Ref0));
  }
}
