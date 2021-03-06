/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 05:23:34 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.AbstractPeepholeOptimization;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.MessageFormatter;
import com.google.javascript.jscomp.PeepholeFoldConstants;
import com.google.javascript.jscomp.PeepholeFoldWithTypes;
import com.google.javascript.jscomp.PeepholeOptimizationsPass;
import com.google.javascript.jscomp.PrintStreamErrorManager;
import com.google.javascript.rhino.Node;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PeepholeOptimizationsPass_ESTest extends PeepholeOptimizationsPass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      File file0 = MockFile.createTempFile(">Xor", ">Xor", (File) mockFile0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      Compiler compiler0 = new Compiler(mockPrintStream0);
      AbstractPeepholeOptimization[] abstractPeepholeOptimizationArray0 = new AbstractPeepholeOptimization[1];
      PeepholeOptimizationsPass peepholeOptimizationsPass0 = new PeepholeOptimizationsPass(compiler0, abstractPeepholeOptimizationArray0);
      AbstractCompiler abstractCompiler0 = peepholeOptimizationsPass0.getCompiler();
      assertSame(abstractCompiler0, compiler0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockFile mockFile0 = new MockFile("{wj$nK22n,;9@K", "*XAB1ak.:m[ D,1");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager((MessageFormatter) null, mockPrintStream0);
      Compiler compiler0 = new Compiler(printStreamErrorManager0);
      AbstractPeepholeOptimization[] abstractPeepholeOptimizationArray0 = new AbstractPeepholeOptimization[5];
      PeepholeFoldWithTypes peepholeFoldWithTypes0 = new PeepholeFoldWithTypes();
      abstractPeepholeOptimizationArray0[0] = (AbstractPeepholeOptimization) peepholeFoldWithTypes0;
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants(false);
      abstractPeepholeOptimizationArray0[1] = (AbstractPeepholeOptimization) peepholeFoldConstants0;
      abstractPeepholeOptimizationArray0[2] = (AbstractPeepholeOptimization) peepholeFoldConstants0;
      abstractPeepholeOptimizationArray0[3] = (AbstractPeepholeOptimization) peepholeFoldConstants0;
      abstractPeepholeOptimizationArray0[4] = (AbstractPeepholeOptimization) peepholeFoldConstants0;
      PeepholeOptimizationsPass peepholeOptimizationsPass0 = new PeepholeOptimizationsPass(compiler0, abstractPeepholeOptimizationArray0);
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.PeepholeOptimizationsPass");
      peepholeOptimizationsPass0.process(node0, node0);
      peepholeOptimizationsPass0.process(node0, node0);
      assertEquals(0, node0.getSideEffectFlags());
  }
}
