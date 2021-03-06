/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 24 13:32:47 GMT 2018
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
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
      Entities.fillWithHtml40Entities(entities0);
      String string0 = entities0.unescape("Fk%[C#&quot;AN,L&gt;pD");
      assertEquals("Fk%[C#\"AN,L>pD", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Entities.ArrayEntityMap entities_ArrayEntityMap0 = new Entities.ArrayEntityMap();
      entities_ArrayEntityMap0.add("Illegal Load: ", 144);
      String string0 = entities_ArrayEntityMap0.name(144);
      assertEquals("Illegal Load: ", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
      entities_BinaryEntityMap0.add("FJ'", (-1));
      int int0 = entities_BinaryEntityMap0.value("FJ'");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Entities.TreeEntityMap entities_TreeEntityMap0 = new Entities.TreeEntityMap();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Entities.HashEntityMap entities_HashEntityMap0 = new Entities.HashEntityMap();
      String string0 = entities_HashEntityMap0.name((-1));
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Entities.HashEntityMap entities_HashEntityMap0 = new Entities.HashEntityMap();
      entities_HashEntityMap0.add("T2|F", (-1));
      int int0 = entities_HashEntityMap0.value("T2|F");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Entities.HashEntityMap entities_HashEntityMap0 = new Entities.HashEntityMap();
      int int0 = entities_HashEntityMap0.value("T2|F");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Entities.ArrayEntityMap entities_ArrayEntityMap0 = new Entities.ArrayEntityMap();
      entities_ArrayEntityMap0.ensureCapacity(144);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Entities.ArrayEntityMap entities_ArrayEntityMap0 = new Entities.ArrayEntityMap();
      entities_ArrayEntityMap0.add((String) null, 75);
      String string0 = entities_ArrayEntityMap0.name(130);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
      entities_BinaryEntityMap0.add("FJ'", (-1));
      int int0 = entities_BinaryEntityMap0.value("U^Q");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap(2871);
      String string0 = "x[c 6'_on|?\"xrN}";
      entities_BinaryEntityMap0.add("x[c 6'_on|?\"xrN}", 2871);
      Entities entities0 = Entities.XML;
      entities0.HTML32.escape("x[c 6'_on|?\"xrN}");
      StringWriter stringWriter0 = new StringWriter();
      Entities.fillWithHtml40Entities(entities0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Entities entities0 = new Entities();
      String string0 = entities0.XML.map.name(2871);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
      entities_BinaryEntityMap0.size = 14;
      entities_BinaryEntityMap0.add("P*QH\"D2", 256);
      entities_BinaryEntityMap0.add("#V.y2hP}Ums\"#4", 256);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap(1224);
      String string0 = entities_BinaryEntityMap0.name(145);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Entities entities0 = new Entities();
      StringWriter stringWriter0 = new StringWriter();
      Entities.fillWithHtml40Entities(entities0);
      entities0.escape((Writer) stringWriter0, "Tep:*>*p[k2t<y");
      assertEquals("Tep:*&gt;*p[k2t&lt;y", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Entities entities0 = Entities.XML;
      String string0 = entities0.unescape("DI9zeX+8&do9q|]");
      assertEquals("DI9zeX+8&do9q|]", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Entities entities0 = Entities.XML;
      String string0 = entities0.unescape("*^`IN\n1Gh4");
      assertEquals("*^`IN\n1Gh4", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Entities entities0 = Entities.XML;
      String string0 = entities0.HTML40.unescape(")!.~hb&;@^");
      assertEquals(")!.~hb&;@^", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Entities entities0 = Entities.XML;
      String string0 = entities0.unescape("!=Cjc2E&#]LBHr8;4n8");
      assertEquals("!=Cjc2E&#]LBHr8;4n8", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Entities entities0 = new Entities();
      String string0 = entities0.unescape("!cE&#;4n8");
      assertEquals("!cE&#;4n8", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Entities entities0 = Entities.XML;
      StringWriter stringWriter0 = new StringWriter();
      entities0.unescape((Writer) stringWriter0, "Fk%C#G&quot;[L&gt;p&lt;");
      assertEquals("Fk%C#G\"[L>p<", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Entities entities0 = Entities.HTML32;
      StringWriter stringWriter0 = new StringWriter();
      entities0.HTML32.unescape((Writer) stringWriter0, "U^Q");
      assertEquals("U^Q", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Entities entities0 = new Entities();
      StringWriter stringWriter0 = new StringWriter();
      entities0.unescape((Writer) stringWriter0, "'7 &-qZHJ6A3$e6-_");
      assertEquals("'7 &-qZHJ6A3$e6-_", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Entities entities0 = Entities.XML;
      StringWriter stringWriter0 = new StringWriter();
      entities0.unescape((Writer) stringWriter0, "&!4&psE;EK");
      assertEquals("&!4&psE;EK", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Entities entities0 = Entities.XML;
      StringWriter stringWriter0 = new StringWriter();
      entities0.HTML32.unescape((Writer) stringWriter0, ":*&;.<'Z8waS=");
      assertEquals(":*&;.<'Z8waS=", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Entities entities0 = Entities.XML;
      StringWriter stringWriter0 = new StringWriter();
      entities0.unescape((Writer) stringWriter0, "!=Cjc2E&#]LBHr8;4n8");
      assertEquals("!=Cjc2E&#]LBHr8;4n8", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Entities entities0 = new Entities();
      StringWriter stringWriter0 = new StringWriter();
      entities0.unescape((Writer) stringWriter0, "!cE&#;4n8");
      assertEquals("!cE&#;4n8", stringWriter0.toString());
  }
}
