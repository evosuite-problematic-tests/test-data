/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 10:28:46 GMT 2018
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CommandLineRunner;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CommandLineRunner_ESTest extends CommandLineRunner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      Compiler compiler0 = commandLineRunner0.createCompiler();
      assertNotNull(compiler0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        CommandLineRunner.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "yes";
      CommandLineRunner commandLineRunner0 = null;
      try {
        commandLineRunner0 = new CommandLineRunner(stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // No argument is allowed: yes
         //
         verifyException("org.kohsuke.args4j.CmdLineParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "--A=";
      MockFile mockFile0 = new MockFile("");
      MockFile mockFile1 = new MockFile(mockFile0, "--A=");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile1);
      CommandLineRunner commandLineRunner0 = null;
      try {
        commandLineRunner0 = new CommandLineRunner(stringArray0, mockPrintStream0, mockPrintStream0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      CompilerOptions compilerOptions0 = commandLineRunner0.createOptions();
      assertFalse(compilerOptions0.generatePseudoNames);
  }
}
