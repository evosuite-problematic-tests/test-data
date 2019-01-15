/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 06 12:04:27 GMT 2019
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.apache.commons.lang3.time.FastDateParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FastDateParser_ESTest extends FastDateParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone(">]+dz2M(ey:LB&");
      Locale locale0 = Locale.US;
      FastDateParser fastDateParser0 = new FastDateParser(">]+dz2M(ey:LB&", timeZone0, locale0);
      fastDateParser0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("org.apache.commons.lang3.time.FastDateParser$1");
      Locale locale0 = Locale.CANADA;
      FastDateParser fastDateParser0 = new FastDateParser("H+9!1{Sa|.tYP Gu", timeZone0, locale0);
      assertEquals("H+9!1{Sa|.tYP Gu", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.ENGLISH;
      FastDateParser fastDateParser0 = new FastDateParser("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+md+|h+|k+|m+|s+|w+|y+|z+d''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++", timeZone0, locale0);
      assertEquals("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+md+|h+|k+|m+|s+|w+|y+|z+d''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("GMTNST");
      Locale locale0 = Locale.CANADA;
      FastDateParser fastDateParser0 = new FastDateParser("KlRX>dxBC;m4+XB", timeZone0, locale0);
      Date date0 = fastDateParser0.parse("6^Iy%5'?&dp");
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = Locale.GERMAN;
      FastDateParser fastDateParser0 = new FastDateParser("$ShYpP1", timeZone0, locale0);
      String string0 = fastDateParser0.toString();
      assertEquals("FastDateParser[$ShYpP1,de,GMT]", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone(">]+dz2M(ey:LB&");
      Locale locale0 = Locale.US;
      FastDateParser fastDateParser0 = new FastDateParser(">]+dz2M(ey:LB&", timeZone0, locale0);
      ParsePosition parsePosition0 = new ParsePosition(0);
      Object object0 = fastDateParser0.parseObject(">]+dz2M(ey:LB&", parsePosition0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = Locale.FRANCE;
      FastDateParser fastDateParser0 = new FastDateParser("%%ENL!%V@k(,s7x", timeZone0, locale0);
      String string0 = fastDateParser0.getPattern();
      assertEquals("%%ENL!%V@k(,s7x", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = Locale.FRANCE;
      FastDateParser fastDateParser0 = new FastDateParser("%%ENL!%V@k(,s7x", timeZone0, locale0);
      Locale locale1 = fastDateParser0.getLocale();
      assertEquals("fr_FR", locale1.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone(">]+dz2M(ey:LB&");
      Locale locale0 = Locale.US;
      FastDateParser fastDateParser0 = new FastDateParser(">]+dz2M(ey:LB&", timeZone0, locale0);
      // Undeclared exception!
      try { 
        fastDateParser0.parseObject((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone(">]+dz2M(ey:LB&");
      Locale locale0 = Locale.US;
      FastDateParser fastDateParser0 = new FastDateParser(">]+dz2M(ey:LB&", timeZone0, locale0);
      TimeZone timeZone1 = fastDateParser0.getTimeZone();
      assertSame(timeZone0, timeZone1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "s<Bl!NKa");
      Locale locale0 = Locale.ITALIAN;
      FastDateParser fastDateParser0 = new FastDateParser("W([u%%e%j.a^tn.g", simpleTimeZone0, locale0);
      Pattern pattern0 = fastDateParser0.getParsePattern();
      assertEquals("(\\p{IsNd}++)\\(\\[", pattern0.pattern());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "MIT");
      Locale locale0 = new Locale("MIT", "MIT", "MIT");
      FastDateParser fastDateParser0 = null;
      try {
        fastDateParser0 = new FastDateParser("j87U&C", simpleTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid pattern
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("6'ne,@5z-}T]");
      Locale locale0 = Locale.PRC;
      FastDateParser fastDateParser0 = new FastDateParser("6'ne,@5z-}T]", timeZone0, locale0);
      boolean boolean0 = fastDateParser0.equals(fastDateParser0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone(">]+dz2M(ey:LB&");
      Locale locale0 = Locale.US;
      FastDateParser fastDateParser0 = new FastDateParser(">]+dz2M(ey:LB&", timeZone0, locale0);
      boolean boolean0 = fastDateParser0.equals(locale0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("6'ne,@5z-}T]");
      Locale locale0 = Locale.PRC;
      FastDateParser fastDateParser0 = new FastDateParser("6'ne,@5z-}T]", timeZone0, locale0);
      FastDateParser fastDateParser1 = new FastDateParser("-! zaJ}Bpd5'xbC", timeZone0, locale0);
      boolean boolean0 = fastDateParser0.equals(fastDateParser1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ENGLISH;
      timeZone0.setID("w?80}3 6_|z");
      FastDateParser fastDateParser0 = new FastDateParser("w?80}3 6_|z", timeZone0, locale0);
      TimeZone timeZone1 = TimeZone.getDefault();
      FastDateParser fastDateParser1 = new FastDateParser("w?80}3 6_|z", timeZone1, locale0);
      boolean boolean0 = fastDateParser0.equals(fastDateParser1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1782, "(The ");
      Locale locale0 = Locale.US;
      FastDateParser fastDateParser0 = new FastDateParser("(The ", simpleTimeZone0, locale0);
      Locale locale1 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser1 = new FastDateParser("(The ", simpleTimeZone0, locale1);
      boolean boolean0 = fastDateParser0.equals(fastDateParser1);
      assertFalse(fastDateParser1.equals((Object)fastDateParser0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.FRENCH;
      FastDateParser fastDateParser0 = new FastDateParser("GMTBET", timeZone0, locale0);
      try { 
        fastDateParser0.parse("GMTBET");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable date: \"GMTBET\" does not match (ap\\. J\\.-C\\.|ap\\. J\\.-C\\.|BC|BC)(\\p{IsNd}++)
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("GMTCTT");
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser0 = new FastDateParser("GMTCTT", timeZone0, locale0);
      try { 
        fastDateParser0.parse("GMTCTT");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // (The ja_JP_JP_#u-ca-japanese locale does not support dates before 1868 AD)
         // Unparseable date: \"GMTCTT\" does not match (\u7D00\u5143\u524D|\u7D00\u5143\u524D|\u897F\u66A6|\u897F\u66A6)(\\p{IsNd}++)
         //
         verifyException("org.apache.commons.lang3.time.FastDateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours((-1));
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.JAPAN;
      FastDateParser fastDateParser0 = new FastDateParser("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|E+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++", timeZone0, locale0);
      assertEquals("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|E+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(46, "Daj|Z>xQ");
      Locale locale0 = Locale.JAPANESE;
      FastDateParser fastDateParser0 = new FastDateParser("kmKS*J61:VlT", simpleTimeZone0, locale0);
      int int0 = fastDateParser0.adjustYear(46);
      assertEquals(1946, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = Locale.FRANCE;
      FastDateParser fastDateParser0 = new FastDateParser("%%ENL!%V@k(,s7x", timeZone0, locale0);
      int int0 = fastDateParser0.adjustYear(0);
      assertEquals(2000, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = new Locale(")", ")", ")");
      FastDateParser fastDateParser0 = new FastDateParser(")", timeZone0, locale0);
      assertEquals(")", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone(",i$/Pv*og9bc6=+");
      Locale locale0 = Locale.JAPANESE;
      FastDateParser fastDateParser0 = new FastDateParser(",i$/Pv*og9bc6=+", timeZone0, locale0);
      assertEquals(",i$/Pv*og9bc6=+", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone(".eiG0%fug");
      Locale locale0 = Locale.CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser(".eiG0%fug", timeZone0, locale0);
      assertEquals(".eiG0%fug", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("/.94_+a5@dY\"r{M");
      Locale locale0 = Locale.US;
      FastDateParser fastDateParser0 = new FastDateParser("/.94_+a5@dY\"r{M", timeZone0, locale0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("w?D0}3 6_|z", timeZone0, locale0);
      assertEquals("w?D0}3 6_|z", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("1$Ts'u");
      Locale locale0 = Locale.FRENCH;
      FastDateParser fastDateParser0 = new FastDateParser("1$Ts'u", timeZone0, locale0);
      assertEquals("1$Ts'u", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = new Locale("vb<CXosjEA^1},T", "GMTNET", "]H&K}y'QR");
      FastDateParser fastDateParser0 = new FastDateParser("m3#}D^?^7t", timeZone0, locale0);
      assertEquals("m3#}D^?^7t", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(46, "Daj|Z>xQ");
      Locale locale0 = Locale.JAPANESE;
      FastDateParser fastDateParser0 = new FastDateParser("E4  v0(fi]8t68XCIN", simpleTimeZone0, locale0);
      assertEquals("E4  v0(fi]8t68XCIN", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("G7M^");
      Locale locale0 = Locale.CHINESE;
      FastDateParser fastDateParser0 = new FastDateParser("G7M^", timeZone0, locale0);
      assertEquals("G7M^", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("JP");
      Locale locale0 = Locale.JAPANESE;
      FastDateParser fastDateParser0 = new FastDateParser("&3'iOyZdG'8x", timeZone0, locale0);
      assertEquals("&3'iOyZdG'8x", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CHINA;
      FastDateParser fastDateParser0 = new FastDateParser("a96Xo/bjBxO1v[0KBz", timeZone0, locale0);
      assertEquals("a96Xo/bjBxO1v[0KBz", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1787), "D2yl]\"*ZHU");
      Locale locale0 = Locale.CHINA;
      FastDateParser fastDateParser0 = new FastDateParser("(F:@OJd<.(WMJO=KE'S", simpleTimeZone0, locale0);
      assertEquals("(F:@OJd<.(WMJO=KE'S", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = new Locale(";&\"", ";&\"");
      FastDateParser fastDateParser0 = new FastDateParser(";&\"", timeZone0, locale0);
      assertEquals(";&\"", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      TimeZone timeZone0 = TimeZone.getTimeZone("W([u%%e%j.a^tn.g");
      FastDateParser fastDateParser0 = new FastDateParser("s<Bl!NKa", timeZone0, locale0);
      assertEquals("s<Bl!NKa", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.GERMANY;
      FastDateParser fastDateParser0 = new FastDateParser("hk=spd", timeZone0, locale0);
      assertEquals("hk=spd", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("6'ne'@5z-}T]");
      Locale locale0 = Locale.PRC;
      FastDateParser fastDateParser0 = new FastDateParser("6'ne'@5z-}T]", timeZone0, locale0);
      assertEquals("6'ne'@5z-}T]", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.FRANCE;
      FastDateParser fastDateParser0 = new FastDateParser("_ex/Q3p7AY$oa;('0", timeZone0, locale0);
      assertEquals("_ex/Q3p7AY$oa;('0", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("`k>(Ef)C");
      Locale locale0 = Locale.FRENCH;
      FastDateParser fastDateParser0 = new FastDateParser("`k>(Ef)C", timeZone0, locale0);
      assertEquals("`k>(Ef)C", fastDateParser0.getPattern());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ENGLISH;
      FastDateParser fastDateParser0 = new FastDateParser("w?80}3 6_|z", timeZone0, locale0);
      assertEquals("w?80}3 6_|z", fastDateParser0.getPattern());
  }
}