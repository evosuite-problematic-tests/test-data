/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 07 03:11:28 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.AbstractPeepholeOptimization;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ExploitAssigns;
import com.google.javascript.jscomp.PeepholeOptimizationsPass;
import com.google.javascript.jscomp.PeepholeRemoveDeadCode;
import com.google.javascript.jscomp.PeepholeReplaceKnownMethods;
import com.google.javascript.jscomp.PeepholeSimplifyRegExp;
import com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax;
import com.google.javascript.jscomp.ReorderConstantExpression;
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
      assertSame(compiler0, abstractCompiler0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      AbstractPeepholeOptimization[] abstractPeepholeOptimizationArray0 = new AbstractPeepholeOptimization[9];
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
      abstractPeepholeOptimizationArray0[0] = (AbstractPeepholeOptimization) peepholeSubstituteAlternateSyntax0;
      PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods(true);
      abstractPeepholeOptimizationArray0[1] = (AbstractPeepholeOptimization) peepholeReplaceKnownMethods0;
      ExploitAssigns exploitAssigns0 = new ExploitAssigns();
      abstractPeepholeOptimizationArray0[2] = (AbstractPeepholeOptimization) exploitAssigns0;
      PeepholeRemoveDeadCode peepholeRemoveDeadCode0 = new PeepholeRemoveDeadCode();
      abstractPeepholeOptimizationArray0[3] = (AbstractPeepholeOptimization) peepholeRemoveDeadCode0;
      ReorderConstantExpression reorderConstantExpression0 = new ReorderConstantExpression();
      abstractPeepholeOptimizationArray0[4] = (AbstractPeepholeOptimization) reorderConstantExpression0;
      ReorderConstantExpression reorderConstantExpression1 = new ReorderConstantExpression();
      abstractPeepholeOptimizationArray0[5] = (AbstractPeepholeOptimization) reorderConstantExpression1;
      PeepholeSimplifyRegExp peepholeSimplifyRegExp0 = new PeepholeSimplifyRegExp();
      abstractPeepholeOptimizationArray0[6] = (AbstractPeepholeOptimization) peepholeSimplifyRegExp0;
      PeepholeSimplifyRegExp peepholeSimplifyRegExp1 = new PeepholeSimplifyRegExp();
      abstractPeepholeOptimizationArray0[7] = (AbstractPeepholeOptimization) peepholeSimplifyRegExp1;
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new PeepholeSubstituteAlternateSyntax(false);
      abstractPeepholeOptimizationArray0[8] = (AbstractPeepholeOptimization) peepholeSubstituteAlternateSyntax1;
      PeepholeOptimizationsPass peepholeOptimizationsPass0 = new PeepholeOptimizationsPass(compiler0, abstractPeepholeOptimizationArray0);
      Node[] nodeArray0 = new Node[1];
      Node node0 = compiler0.parseSyntheticCode("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass");
      peepholeOptimizationsPass0.process(node0, node0);
      nodeArray0[0] = node0;
      peepholeOptimizationsPass0.process(nodeArray0[0], nodeArray0[0]);
      assertEquals(1, nodeArray0.length);
  }
}