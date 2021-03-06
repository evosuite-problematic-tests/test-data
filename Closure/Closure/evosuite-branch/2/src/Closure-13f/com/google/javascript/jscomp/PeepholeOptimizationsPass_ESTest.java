/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 12:12:48 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.AbstractPeepholeOptimization;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.PeepholeCollectPropertyAssignments;
import com.google.javascript.jscomp.PeepholeOptimizationsPass;
import com.google.javascript.jscomp.PeepholeReplaceKnownMethods;
import com.google.javascript.jscomp.PeepholeSimplifyRegExp;
import com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PeepholeOptimizationsPass_ESTest extends PeepholeOptimizationsPass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      PeepholeOptimizationsPass peepholeOptimizationsPass0 = new PeepholeOptimizationsPass(compiler0, (AbstractPeepholeOptimization[]) null);
      AbstractCompiler abstractCompiler0 = peepholeOptimizationsPass0.getCompiler();
      assertSame(abstractCompiler0, compiler0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      AbstractPeepholeOptimization[] abstractPeepholeOptimizationArray0 = new AbstractPeepholeOptimization[3];
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
      abstractPeepholeOptimizationArray0[0] = (AbstractPeepholeOptimization) peepholeSubstituteAlternateSyntax0;
      PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments0 = new PeepholeCollectPropertyAssignments();
      abstractPeepholeOptimizationArray0[1] = (AbstractPeepholeOptimization) peepholeCollectPropertyAssignments0;
      PeepholeSimplifyRegExp peepholeSimplifyRegExp0 = new PeepholeSimplifyRegExp();
      abstractPeepholeOptimizationArray0[2] = (AbstractPeepholeOptimization) peepholeSimplifyRegExp0;
      PeepholeOptimizationsPass peepholeOptimizationsPass0 = new PeepholeOptimizationsPass(compiler0, abstractPeepholeOptimizationArray0);
      Node node0 = new Node(4, 43, 35);
      Node node1 = new Node(52, node0, node0, node0, node0);
      peepholeOptimizationsPass0.process(node1, node1);
      assertFalse(node1.hasChildren());
      assertEquals(0, node1.getChildCount());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      AbstractPeepholeOptimization[] abstractPeepholeOptimizationArray0 = new AbstractPeepholeOptimization[3];
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
      abstractPeepholeOptimizationArray0[0] = (AbstractPeepholeOptimization) peepholeSubstituteAlternateSyntax0;
      PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments0 = new PeepholeCollectPropertyAssignments();
      abstractPeepholeOptimizationArray0[1] = (AbstractPeepholeOptimization) peepholeCollectPropertyAssignments0;
      PeepholeSimplifyRegExp peepholeSimplifyRegExp0 = new PeepholeSimplifyRegExp();
      abstractPeepholeOptimizationArray0[2] = (AbstractPeepholeOptimization) peepholeSimplifyRegExp0;
      PeepholeOptimizationsPass peepholeOptimizationsPass0 = new PeepholeOptimizationsPass(compiler0, abstractPeepholeOptimizationArray0);
      PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods(false);
      Node node0 = compiler0.parseTestCode("F=und duplicate modules");
      peepholeOptimizationsPass0.process(node0, node0);
      peepholeOptimizationsPass0.process(node0, node0);
      assertFalse(node0.isNE());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      AbstractPeepholeOptimization[] abstractPeepholeOptimizationArray0 = new AbstractPeepholeOptimization[3];
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
      abstractPeepholeOptimizationArray0[0] = (AbstractPeepholeOptimization) peepholeSubstituteAlternateSyntax0;
      PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments0 = new PeepholeCollectPropertyAssignments();
      abstractPeepholeOptimizationArray0[1] = (AbstractPeepholeOptimization) peepholeCollectPropertyAssignments0;
      PeepholeSimplifyRegExp peepholeSimplifyRegExp0 = new PeepholeSimplifyRegExp();
      abstractPeepholeOptimizationArray0[2] = (AbstractPeepholeOptimization) peepholeSimplifyRegExp0;
      PeepholeOptimizationsPass peepholeOptimizationsPass0 = new PeepholeOptimizationsPass(compiler0, abstractPeepholeOptimizationArray0);
      PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods(false);
      Node node0 = compiler0.parseTestCode("F=und duplicate modules");
      Node node1 = new Node(52, node0, node0, node0, node0);
      peepholeOptimizationsPass0.process(node1, node1);
      assertFalse(node1.isObjectLit());
  }
}
