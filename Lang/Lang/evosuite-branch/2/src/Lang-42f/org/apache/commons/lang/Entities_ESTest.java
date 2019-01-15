/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 04 18:08:09 GMT 2019
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import org.apache.commons.lang.Entities;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Entities_ESTest extends Entities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Entities entities0 = new Entities();
      String string0 = entities0.unescape(".&:1HDR");
      assertEquals(".&:1HDR", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Entities entities0 = new Entities();
      Entities.fillWithHtml40Entities(entities0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
      entities_BinaryEntityMap0.add("c`'kqW*d}Q.vg*~PAaw", 283);
      int int0 = entities_BinaryEntityMap0.value("c`'kqW*d}Q.vg*~PAaw");
      assertEquals(283, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap(124);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Entities.TreeEntityMap entities_TreeEntityMap0 = new Entities.TreeEntityMap();
      int int0 = entities_TreeEntityMap0.value("2F@MP87Rw1W");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Entities.HashEntityMap entities_HashEntityMap0 = new Entities.HashEntityMap();
      entities_HashEntityMap0.add("", (-2828));
      int int0 = entities_HashEntityMap0.value("");
      assertEquals((-2828), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Entities.LookupEntityMap entities_LookupEntityMap0 = new Entities.LookupEntityMap();
      entities_LookupEntityMap0.add("", 105);
      int int0 = entities_LookupEntityMap0.value("");
      assertEquals(105, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Entities entities0 = new Entities();
      String string0 = entities0.entityName(1467);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
      entities_BinaryEntityMap0.ensureCapacity(660);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Entities.ArrayEntityMap entities_ArrayEntityMap0 = new Entities.ArrayEntityMap();
      entities_ArrayEntityMap0.add((String) null, (-1));
      String string0 = entities_ArrayEntityMap0.name((-1));
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
      entities_BinaryEntityMap0.add("", 97);
      int int0 = entities_BinaryEntityMap0.value((String) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
      entities_BinaryEntityMap0.add("c`'kqW*d}Q.vg*~PAaw", 283);
      String string0 = entities_BinaryEntityMap0.name(283);
      assertEquals("c`'kqW*d}Q.vg*~PAaw", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
      entities_BinaryEntityMap0.add("", 97);
      String string0 = entities_BinaryEntityMap0.name(413);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
      entities_BinaryEntityMap0.add("", 129);
      entities_BinaryEntityMap0.add("", (-1786));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Entities entities0 = Entities.HTML40;
      String string0 = entities0.escape(".g\"&:1HDR");
      assertEquals(".g&quot;&amp;:1HDR", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Entities entities0 = Entities.HTML32;
      String string0 = entities0.unescape("c`'kqW*d}Q.vg*~PAaw");
      assertEquals("c`'kqW*d}Q.vg*~PAaw", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Entities entities0 = new Entities();
      StringWriter stringWriter0 = new StringWriter();
      entities0.unescape((Writer) stringWriter0, "(b#&;)\"]Vw6M");
      assertEquals("(b#&;)\"]Vw6M", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Entities entities0 = new Entities();
      // Undeclared exception!
      try { 
        entities0.HTML32.unescape((Writer) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.Entities", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Entities entities0 = Entities.HTML40;
      String string0 = entities0.unescape(".g&quot;&amp;:1HDR");
      assertEquals(".g\"&:1HDR", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Entities entities0 = Entities.HTML40;
      String string0 = entities0.unescape("vs'&Q)b[2G&M{#ib;{");
      assertEquals("vs'&Q)b[2G&M{#ib;{", string0);
  }
}
