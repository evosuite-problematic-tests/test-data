/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 26 09:32:51 GMT 2018
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.PeepholeFoldConstants;
import com.google.javascript.jscomp.Tracer;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PeepholeFoldConstants_ESTest extends PeepholeFoldConstants_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(26, "", 2, (-3));
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(2012, "", 0, 0);
      Node node1 = new Node(27, node0, 15, 8);
      Node node2 = peepholeFoldConstants0.optimizeSubtree(node1);
      assertNotNull(node2);
      assertEquals(1, node2.getChildCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(2012, "getvar", 0, 0);
      Node node1 = new Node(28, node0, node0);
      Node node2 = peepholeFoldConstants0.optimizeSubtree(node1);
      assertNotNull(node2);
      assertEquals(1, node2.getChildCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(2012, "", 2012, 0);
      Node node1 = new Node(29, node0, node0, 0, 1);
      Node node2 = peepholeFoldConstants0.optimizeSubtree(node1);
      assertNotNull(node2);
      assertEquals(1, node2.getChildCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(32, 32, 32);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(44, Node.IS_VAR_ARGS_PARAM);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(37, "", 27, 21);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(30, Node.SKIP_INDEXES_PROP);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString("", 92, 2281);
      Node node1 = new Node(122, node0, node0);
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.AbstractPeepholeOptimization", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(2012, "", 0, 0);
      Node node1 = new Node(2, 28, 8);
      Node node2 = new Node(49, node0, node0, node1, 4, 2012);
      Node node3 = peepholeFoldConstants0.optimizeSubtree(node2);
      assertEquals(44, Node.IS_VAR_ARGS_PARAM);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(2012, "", 0, 0);
      Node node1 = Node.newString(1, "", 31, 3);
      Node node2 = new Node(9, node1, node0, node0);
      Node node3 = peepholeFoldConstants0.optimizeSubtree(node2);
      assertNotNull(node3);
      assertEquals((-1), node3.getLineno());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(0, "7s@[/guGL{.5YVChQ8)", 0, 0);
      Node node1 = Node.newNumber((double) 1);
      Node node2 = new Node(11, node1, node0);
      Node node3 = peepholeFoldConstants0.optimizeSubtree(node2);
      assertNotNull(node3);
      assertEquals(2, node3.getChildCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString("", 12, 12);
      Node node1 = new Node(12, node0, node0);
      node1.addChildrenToFront(node1);
      Node node2 = peepholeFoldConstants0.optimizeSubtree(node1);
      assertEquals((-1), node2.getCharno());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(2012, "", 0, 0);
      Node node1 = Node.newString(1, "", 31, 3);
      Node node2 = new Node(13, node1, node0, node0, node0);
      Node node3 = peepholeFoldConstants0.optimizeSubtree(node2);
      assertTrue(node3.hasMoreThanOneChild());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(2012, "", 2012, 0);
      Node node1 = new Node(12);
      Node node2 = new Node(15, node0, node1, node1, 0, 5);
      Node node3 = peepholeFoldConstants0.optimizeSubtree(node2);
      assertTrue(node3.hasChildren());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(2012, "", 0, 0);
      Node node1 = Node.newString(1, "", 31, 3);
      Node node2 = new Node(17, node0, node1, node1, node1);
      Node node3 = peepholeFoldConstants0.optimizeSubtree(node2);
      assertTrue(node3.hasChildren());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(61, "", 0, 0);
      Node node1 = Node.newString(1, "", 31, 3);
      Node node2 = new Node(19, node0, node1);
      Node node3 = peepholeFoldConstants0.optimizeSubtree(node2);
      assertEquals(19, node3.getType());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(2012, "", 97, 0);
      Node node1 = Node.newString("", 4, 2);
      Node node2 = new Node(21, node1, node1, node1, node0);
      Node node3 = peepholeFoldConstants0.optimizeSubtree(node2);
      assertEquals(21, node3.getType());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(2036, "", 0, (-7));
      Node node1 = new Node(22, node0, node0, node0, node0, 12, 1);
      node1.addChildrenToBack(node1);
      Node node2 = peepholeFoldConstants0.optimizeSubtree(node1);
      assertNotNull(node2);
      assertEquals(2, node2.getChildCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(2012, "", 0, (-7));
      Node node1 = Node.newString(37, "", 27, 21);
      Node node2 = new Node(23, node1, node0, 20, 41);
      Node node3 = peepholeFoldConstants0.optimizeSubtree(node2);
      assertNotNull(node3);
      assertEquals(23, node3.getType());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(0, "7s@[/guGL{.5YVChQ8)", 0, 0);
      Node node1 = Node.newNumber((double) 1);
      Node node2 = new Node(24, node1, node0, node0, 1, 0);
      Node node3 = peepholeFoldConstants0.optimizeSubtree(node2);
      assertNotNull(node3);
      assertTrue(node3.hasChildren());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString("", 59, 59);
      Node node1 = new Node(59, node0, node0);
      node1.setType(38);
      node1.addChildrenToFront(node1);
      Node node2 = peepholeFoldConstants0.optimizeSubtree(node1);
      assertEquals((-3), Node.LOCAL_BLOCK_PROP);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(62, "", 0, 0);
      Node node1 = Node.newString(1, "", 31, 3);
      Node node2 = new Node(42, node0, node0, node0, node1, 40, 12);
      Node node3 = peepholeFoldConstants0.optimizeSubtree(node2);
      assertFalse(node3.isQuotedString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(100, "7s@[/guGL{.5YVChQ8)", 100, 100);
      Node node1 = Node.newNumber((double) 1);
      Node node2 = new Node(48, node0, node1, 100, 36);
      Node node3 = peepholeFoldConstants0.optimizeSubtree(node2);
      assertTrue(node3.hasChildren());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString("", 59, 59);
      Node node1 = new Node(59, node0, node0);
      node1.addChildrenToFront(node1);
      Node node2 = peepholeFoldConstants0.optimizeSubtree(node1);
      assertSame(node2, node1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString("", 72, 72);
      Node node1 = new Node(72, node0, node0);
      Node node2 = peepholeFoldConstants0.optimizeSubtree(node1);
      node2.addChildrenToFront(node1);
      peepholeFoldConstants0.optimizeSubtree(node2);
      assertEquals(2, node1.getChildCount());
      assertFalse(node0.hasOneChild());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSType[] jSTypeArray0 = new JSType[6];
      Node node0 = jSTypeRegistry0.createParameters(jSTypeArray0);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertFalse(node1.isQuotedString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(43, 43, 43);
      Node node1 = new Node(38, 4095, 24);
      Node node2 = new Node(2, node0, node0, node0, node1, 8, 0);
      Node node3 = peepholeFoldConstants0.optimizeSubtree(node2);
      assertEquals(4, Node.DESCENDANTS_FLAG);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(94);
      Node node1 = new Node(10, node0, node0, 14, 26);
      Node node2 = peepholeFoldConstants0.optimizeSubtree(node1);
      assertEquals(26, node2.getCharno());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(2012, "", 0, 0);
      Node node1 = new Node(14, node0);
      Node node2 = peepholeFoldConstants0.optimizeSubtree(node1);
      assertEquals(14, node2.getType());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(16, "");
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(4095, Node.MAX_COLUMN_NUMBER);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(2012, "", 2012, 0);
      Node node1 = new Node(18, node0, node0, 8, 40);
      Node node2 = peepholeFoldConstants0.optimizeSubtree(node1);
      assertEquals(1, node2.getChildCount());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(20, 20, 20);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals((-1), Node.CATCH_SCOPE_PROP);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(2012, "", 0, 0);
      Node node1 = new Node(25, node0, node0, node0, node0, 2, 4095);
      Node node2 = peepholeFoldConstants0.optimizeSubtree(node1);
      assertEquals(4095, node2.getCharno());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(31, "");
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(10, Node.VARS_PROP);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(33, "");
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(2, Node.RIGHT);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(34, 43, 32);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(29, Node.VAR_ARGS_NAME);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(2012, "", 0, (-26));
      Node node1 = new Node(35, node0, node0);
      Node node2 = peepholeFoldConstants0.optimizeSubtree(node1);
      assertTrue(node2.hasChildren());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString("", 2012, 0);
      Node node1 = new Node(36, node0);
      Node node2 = peepholeFoldConstants0.optimizeSubtree(node1);
      assertTrue(node2.hasChildren());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newNumber((-291.4886030863778));
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertFalse(node1.isSyntheticBlock());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString("", 59, 59);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(15, Node.NO_SIDE_EFFECTS);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(41, 41, 41);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertFalse(node1.isQuotedString());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(43, 43, 43);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(17, Node.TYPE_PROP);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(44);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(9, Node.FIXUPS_PROP);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(56, 56, 56);
      Node node1 = new Node(45, node0, node0, node0, 4095, 4095);
      Node node2 = peepholeFoldConstants0.optimizeSubtree(node1);
      assertTrue(node2.hasChildren());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString("", 46, 46);
      Node node1 = new Node(46, node0, node0);
      Node node2 = peepholeFoldConstants0.optimizeSubtree(node1);
      assertTrue(node2.hasOneChild());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(50, 50, 50);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(43, Node.IS_OPTIONAL_PARAM);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Logger logger0 = Tracer.logger;
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      Compiler compiler0 = new Compiler(loggerErrorManager0);
      Node node0 = compiler0.parseTestCode(";%$]5H");
      node0.setType(52);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(2, Node.BREAK_PROP);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(53, "fiXSG");
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(0, Node.SIDE_EFFECTS_ALL);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(54, 54, 781);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertFalse(node1.wasEmptyNode());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(55, 55, 55);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(0, node1.getChildCount());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(56, 56, 56);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(15, Node.NO_SIDE_EFFECTS);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(57, 57, 57);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(49, Node.FREE_CALL);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(60, 60, 60);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(1, Node.LEFT);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(61, "", 0, 0);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(36, Node.OPT_ARG_NAME);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(62, "", 0, 0);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(20, Node.FINALLY_PROP);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(2012, "", 0, 0);
      node0.setType(63);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(2, Node.RIGHT);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(64, 195, 4398);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(47, Node.DIRECTIVES);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(65, 65, 65);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(1, Node.LEFT);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(66, "nZB~O\"vD", 66, (-3013));
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(5, Node.FUNCTION_PROP);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(67, "", 0, 0);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(0, Node.LABEL_ID_PROP);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(68, 68, 68);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(0, Node.LABEL_ID_PROP);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(69, "7s@[/guGL{.5YVChQ8)", 69, 69);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(4095, Node.MAX_COLUMN_NUMBER);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(70, 70, 70);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(47, Node.DIRECTIVES);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(73, 38, 88);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertFalse(node1.isQuotedString());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString("A<eD9 /w0KYb?;");
      node0.setType(74);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertSame(node0, node1);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(75, 75, 75);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(9, Node.FIXUPS_PROP);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString("", 76, 76);
      Node node1 = new Node(76, node0, node0);
      Node node2 = peepholeFoldConstants0.optimizeSubtree(node1);
      assertEquals(1, node2.getChildCount());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(77, "oVC", 63, (-670));
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(40, Node.BRACELESS_TYPE);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(78, "ELWc", 78, 46);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals((-2), Node.OBJECT_IDS_PROP);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(79, 79, 79);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(37, Node.SYNTHETIC_BLOCK_PROP);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(80, "fiSG");
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(44, Node.IS_VAR_ARGS_PARAM);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(81, 60, 60);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(60, node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(82, 82, 82);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertFalse(node1.isLocalResultCall());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(84, 84, 84);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(17, Node.TYPE_PROP);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(85, 60, 60);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(2, Node.BREAK_PROP);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(86, 86, 86);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(0, node1.getSideEffectFlags());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(60, 60, 60);
      Node node1 = new Node(87, node0);
      Node node2 = peepholeFoldConstants0.optimizeSubtree(node1);
      assertEquals((-1), node2.getLineno());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(88);
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.PeepholeFoldConstants", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(89, 89, 89);
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.PeepholeFoldConstants", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString("");
      Node node1 = new Node(90, node0);
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString("", 91, 91);
      Node node1 = new Node(91, node0, node0);
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(1682, "OSx{7pGk|B", 92, 947);
      Node node1 = new Node(92, node0, 4, 21);
      Node node2 = peepholeFoldConstants0.optimizeSubtree(node1);
      assertEquals(1, node2.getChildCount());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(94);
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.PeepholeFoldConstants", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(95);
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.PeepholeFoldConstants", e);
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString("", 96, 96);
      Node node1 = new Node(96, node0, node0);
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(97, "7s@[/guGL{.5YVChQ8)", 97, 97);
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.PeepholeFoldConstants", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(43, 43, 43);
      Node node1 = new Node(21, node0, 10, 85);
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(100, "7s@[/guGL{.5YVChQ8)", 100, 100);
      Node node1 = new Node(11, node0, node0);
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.PeepholeFoldConstants", e);
      }
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString("%V`Q6JZYTb~b^", 0, 2012);
      Node node1 = new Node(19, node0, node0);
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString("", 0, 2012);
      Node node1 = new Node(32, node0, 31, 1);
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.PeepholeFoldConstants", e);
      }
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(2012, "", 2012, 0);
      Node node1 = new Node(32, node0, 31, 1);
      Node node2 = peepholeFoldConstants0.optimizeSubtree(node1);
      assertEquals(1, node2.getChildCount());
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(2012, "", 97, 0);
      Node node1 = Node.newString("", 4, 2);
      Node node2 = Node.newString(2, "");
      Node node3 = new Node(21, node2, node2, node1, node0);
      Node node4 = peepholeFoldConstants0.optimizeSubtree(node3);
      assertEquals(21, node4.getType());
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(2012, "", (-1019), 0);
      Node node1 = Node.newString(47, "", 14, 29);
      Node node2 = peepholeFoldConstants0.optimizeSubtree(node1);
      assertNotNull(node2);
      
      Node node3 = new Node(17, node2, node1, node0, node0);
      Node node4 = peepholeFoldConstants0.optimizeSubtree(node3);
      assertTrue(node4.hasChildren());
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(2012, "", (-1019), 0);
      Node node1 = Node.newString(47, "", 14, 29);
      Node node2 = Node.newString("", 26, 16);
      Node node3 = new Node(17, node2, node1, node0, node0);
      Node node4 = peepholeFoldConstants0.optimizeSubtree(node3);
      assertEquals(1, Node.LEFT);
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString("A<eD9 /w0KYb?;");
      node0.addChildAfter(node0, node0);
      node0.setType(30);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(19, Node.LABEL_PROP);
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(37, "", 27, 21);
      node0.addChildrenToBack(node0);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(4, Node.FLAG_ARGUMENTS_UNMODIFIED);
  }
}
