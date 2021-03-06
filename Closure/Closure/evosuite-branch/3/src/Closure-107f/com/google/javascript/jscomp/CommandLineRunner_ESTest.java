/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 05 11:13:13 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CommandLineRunner;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CommandLineRunner_ESTest extends CommandLineRunner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = null;
      try {
        commandLineRunner0 = new CommandLineRunner(stringArray0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[1];
      CommandLineRunner commandLineRunner0 = null;
      try {
        commandLineRunner0 = new CommandLineRunner(stringArray0, (PrintStream) null, (PrintStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "gecko_event.js";
      stringArray0[1] = "mOQJ{Nk=\"@";
      stringArray0[2] = "@NfTu]G8";
      stringArray0[3] = "-U8UV!ES;2sCVF`";
      stringArray0[4] = "XMLEND";
      stringArray0[5] = "R]XhQ%[ol0NO% Klh{L";
      stringArray0[6] = "externs.zip";
      stringArray0[7] = "";
      stringArray0[8] = "";
      CommandLineRunner commandLineRunner0 = null;
      try {
        commandLineRunner0 = new CommandLineRunner(stringArray0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "--A=";
      // Undeclared exception!
      try { 
        CommandLineRunner.main(stringArray0);
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
      String[] stringArray0 = new String[5];
      // Undeclared exception!
      try { 
        CommandLineRunner.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
