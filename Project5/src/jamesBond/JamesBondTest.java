package jamesBond;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JamesBondTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCase0() {
		assertFalse(JamesBond.bondRegex("(()"));
	}
	@Test
	public void testCase1() {
		assertTrue(JamesBond.bondRegex("((007)"));
	}
	@Test
	public void testCase2() {
		assertFalse(JamesBond.bondRegex("((07)"));
	}
	@Test
	public void testCase3() {
		assertFalse(JamesBond.bondRegex("((7)"));
	}
	@Test
	public void testCase4() {
		assertFalse(JamesBond.bondRegex("()"));
	}
	@Test
	public void testCase5() {
		assertFalse(JamesBond.bondRegex("())"));
	}
	@Test
	public void testCase6() {
		assertFalse(JamesBond.bondRegex("()007)"));
	}
	@Test
	public void testCase7() {
		assertFalse(JamesBond.bondRegex("()07)"));
	}
	@Test
	public void testCase8() {
		assertFalse(JamesBond.bondRegex("()7)"));
	}
	@Test
	public void testCase9() {
		assertFalse(JamesBond.bondRegex("(0()"));
	}
	@Test
	public void testCase10() {
		assertTrue(JamesBond.bondRegex("(0(007)"));
	}
	@Test
	public void testCase11() {
		assertFalse(JamesBond.bondRegex("(0(07)"));
	}
	@Test
	public void testCase12() {
		assertFalse(JamesBond.bondRegex("(0(7)"));
	}
	@Test
	public void testCase13() {
		assertFalse(JamesBond.bondRegex("(0)"));
	}
	@Test
	public void testCase14() {
		assertFalse(JamesBond.bondRegex("(0))"));
	}
	@Test
	public void testCase15() {
		assertFalse(JamesBond.bondRegex("(0)007)"));
	}
	@Test
	public void testCase16() {
		assertFalse(JamesBond.bondRegex("(0)07)"));
	}
	@Test
	public void testCase17() {
		assertFalse(JamesBond.bondRegex("(0)7)"));
	}
	@Test
	public void testCase18() {
		assertFalse(JamesBond.bondRegex("(00()"));
	}
	@Test
	public void testCase19() {
		assertTrue(JamesBond.bondRegex("(00(007)"));
	}
	@Test
	public void testCase20() {
		assertFalse(JamesBond.bondRegex("(00(07)"));
	}
	@Test
	public void testCase21() {
		assertFalse(JamesBond.bondRegex("(00(7)"));
	}
	@Test
	public void testCase22() {
		assertFalse(JamesBond.bondRegex("(00)"));
	}
	@Test
	public void testCase23() {
		assertFalse(JamesBond.bondRegex("(00))"));
	}
	@Test
	public void testCase24() {
		assertFalse(JamesBond.bondRegex("(00)007)"));
	}
	@Test
	public void testCase25() {
		assertFalse(JamesBond.bondRegex("(00)07)"));
	}
	@Test
	public void testCase26() {
		assertFalse(JamesBond.bondRegex("(00)7)"));
	}
	@Test
	public void testCase27() {
		assertFalse(JamesBond.bondRegex("(000)"));
	}
	@Test
	public void testCase28() {
		assertFalse(JamesBond.bondRegex("(000007)"));
	}
	@Test
	public void testCase29() {
		assertFalse(JamesBond.bondRegex("(00007)"));
	}
	@Test
	public void testCase30() {
		assertFalse(JamesBond.bondRegex("(0007)"));
	}
	@Test
	public void testCase31() {
		assertFalse(JamesBond.bondRegex("(001)"));
	}
	@Test
	public void testCase32() {
		assertFalse(JamesBond.bondRegex("(001007)"));
	}
	@Test
	public void testCase33() {
		assertFalse(JamesBond.bondRegex("(00107)"));
	}
	@Test
	public void testCase34() {
		assertFalse(JamesBond.bondRegex("(0017)"));
	}
	@Test
	public void testCase35() {
		assertFalse(JamesBond.bondRegex("(002)"));
	}
	@Test
	public void testCase36() {
		assertFalse(JamesBond.bondRegex("(002007)"));
	}
	@Test
	public void testCase37() {
		assertFalse(JamesBond.bondRegex("(00207)"));
	}
	@Test
	public void testCase38() {
		assertFalse(JamesBond.bondRegex("(0027)"));
	}
	@Test
	public void testCase39() {
		assertFalse(JamesBond.bondRegex("(003)"));
	}
	@Test
	public void testCase40() {
		assertFalse(JamesBond.bondRegex("(003007)"));
	}
	@Test
	public void testCase41() {
		assertFalse(JamesBond.bondRegex("(00307)"));
	}
	@Test
	public void testCase42() {
		assertFalse(JamesBond.bondRegex("(0037)"));
	}
	@Test
	public void testCase43() {
		assertFalse(JamesBond.bondRegex("(004)"));
	}
	@Test
	public void testCase44() {
		assertFalse(JamesBond.bondRegex("(004007)"));
	}
	@Test
	public void testCase45() {
		assertFalse(JamesBond.bondRegex("(00407)"));
	}
	@Test
	public void testCase46() {
		assertFalse(JamesBond.bondRegex("(0047)"));
	}
	@Test
	public void testCase47() {
		assertFalse(JamesBond.bondRegex("(005)"));
	}
	@Test
	public void testCase48() {
		assertFalse(JamesBond.bondRegex("(005007)"));
	}
	@Test
	public void testCase49() {
		assertFalse(JamesBond.bondRegex("(00507)"));
	}
	@Test
	public void testCase50() {
		assertFalse(JamesBond.bondRegex("(0057)"));
	}
	@Test
	public void testCase51() {
		assertFalse(JamesBond.bondRegex("(006)"));
	}
	@Test
	public void testCase52() {
		assertFalse(JamesBond.bondRegex("(006007)"));
	}
	@Test
	public void testCase53() {
		assertFalse(JamesBond.bondRegex("(00607)"));
	}
	@Test
	public void testCase54() {
		assertFalse(JamesBond.bondRegex("(0067)"));
	}
	@Test
	public void testCase55() {
		assertFalse(JamesBond.bondRegex("(007()"));
	}
	@Test
	public void testCase56() {
		assertTrue(JamesBond.bondRegex("(007(007)"));
	}
	@Test
	public void testCase57() {
		assertFalse(JamesBond.bondRegex("(007(07)"));
	}
	@Test
	public void testCase58() {
		assertFalse(JamesBond.bondRegex("(007(7)"));
	}
	@Test
	public void testCase59() {
		assertTrue(JamesBond.bondRegex("(007)"));
	}
	@Test
	public void testCase60() {
		assertTrue(JamesBond.bondRegex("(007)()"));
	}
	@Test
	public void testCase61() {
		assertTrue(JamesBond.bondRegex("(007)(007)"));
	}
	@Test
	public void testCase62() {
		assertTrue(JamesBond.bondRegex("(007)(07)"));
	}
	@Test
	public void testCase63() {
		assertTrue(JamesBond.bondRegex("(007)(7)"));
	}
	@Test
	public void testCase64() {
		assertTrue(JamesBond.bondRegex("(007))"));
	}
	@Test
	public void testCase65() {
		assertTrue(JamesBond.bondRegex("(007)))"));
	}
	@Test
	public void testCase66() {
		assertTrue(JamesBond.bondRegex("(007))007)"));
	}
	@Test
	public void testCase67() {
		assertTrue(JamesBond.bondRegex("(007))07)"));
	}
	@Test
	public void testCase68() {
		assertTrue(JamesBond.bondRegex("(007))7)"));
	}
	@Test
	public void testCase69() {
		assertTrue(JamesBond.bondRegex("(007)0)"));
	}
	@Test
	public void testCase70() {
		assertTrue(JamesBond.bondRegex("(007)0007)"));
	}
	@Test
	public void testCase71() {
		assertTrue(JamesBond.bondRegex("(007)007)"));
	}
	@Test
	public void testCase72() {
		assertTrue(JamesBond.bondRegex("(007)07)"));
	}
	@Test
	public void testCase73() {
		assertTrue(JamesBond.bondRegex("(007)1)"));
	}
	@Test
	public void testCase74() {
		assertTrue(JamesBond.bondRegex("(007)1007)"));
	}
	@Test
	public void testCase75() {
		assertTrue(JamesBond.bondRegex("(007)107)"));
	}
	@Test
	public void testCase76() {
		assertTrue(JamesBond.bondRegex("(007)17)"));
	}
	@Test
	public void testCase77() {
		assertTrue(JamesBond.bondRegex("(007)2)"));
	}
	@Test
	public void testCase78() {
		assertTrue(JamesBond.bondRegex("(007)2007)"));
	}
	@Test
	public void testCase79() {
		assertTrue(JamesBond.bondRegex("(007)207)"));
	}
	@Test
	public void testCase80() {
		assertTrue(JamesBond.bondRegex("(007)27)"));
	}
	@Test
	public void testCase81() {
		assertTrue(JamesBond.bondRegex("(007)3)"));
	}
	@Test
	public void testCase82() {
		assertTrue(JamesBond.bondRegex("(007)3007)"));
	}
	@Test
	public void testCase83() {
		assertTrue(JamesBond.bondRegex("(007)307)"));
	}
	@Test
	public void testCase84() {
		assertTrue(JamesBond.bondRegex("(007)37)"));
	}
	@Test
	public void testCase85() {
		assertTrue(JamesBond.bondRegex("(007)4)"));
	}
	@Test
	public void testCase86() {
		assertTrue(JamesBond.bondRegex("(007)4007)"));
	}
	@Test
	public void testCase87() {
		assertTrue(JamesBond.bondRegex("(007)407)"));
	}
	@Test
	public void testCase88() {
		assertTrue(JamesBond.bondRegex("(007)47)"));
	}
	@Test
	public void testCase89() {
		assertTrue(JamesBond.bondRegex("(007)5)"));
	}
	@Test
	public void testCase90() {
		assertTrue(JamesBond.bondRegex("(007)5007)"));
	}
	@Test
	public void testCase91() {
		assertTrue(JamesBond.bondRegex("(007)507)"));
	}
	@Test
	public void testCase92() {
		assertTrue(JamesBond.bondRegex("(007)57)"));
	}
	@Test
	public void testCase93() {
		assertTrue(JamesBond.bondRegex("(007)6)"));
	}
	@Test
	public void testCase94() {
		assertTrue(JamesBond.bondRegex("(007)6007)"));
	}
	@Test
	public void testCase95() {
		assertTrue(JamesBond.bondRegex("(007)607)"));
	}
	@Test
	public void testCase96() {
		assertTrue(JamesBond.bondRegex("(007)67)"));
	}
	@Test
	public void testCase97() {
		assertTrue(JamesBond.bondRegex("(007)7)"));
	}
	@Test
	public void testCase98() {
		assertTrue(JamesBond.bondRegex("(007)7007)"));
	}
	@Test
	public void testCase99() {
		assertTrue(JamesBond.bondRegex("(007)707)"));
	}
	@Test
	public void testCase100() {
		assertTrue(JamesBond.bondRegex("(007)77)"));
	}
	@Test
	public void testCase101() {
		assertTrue(JamesBond.bondRegex("(007)8)"));
	}
	@Test
	public void testCase102() {
		assertTrue(JamesBond.bondRegex("(007)8007)"));
	}
	@Test
	public void testCase103() {
		assertTrue(JamesBond.bondRegex("(007)807)"));
	}
	@Test
	public void testCase104() {
		assertTrue(JamesBond.bondRegex("(007)87)"));
	}
	@Test
	public void testCase105() {
		assertTrue(JamesBond.bondRegex("(007)9)"));
	}
	@Test
	public void testCase106() {
		assertTrue(JamesBond.bondRegex("(007)9007)"));
	}
	@Test
	public void testCase107() {
		assertTrue(JamesBond.bondRegex("(007)907)"));
	}
	@Test
	public void testCase108() {
		assertTrue(JamesBond.bondRegex("(007)97)"));
	}
	@Test
	public void testCase109() {
		assertFalse(JamesBond.bondRegex("(0070)"));
	}
	@Test
	public void testCase110() {
		assertFalse(JamesBond.bondRegex("(0070007)"));
	}
	@Test
	public void testCase111() {
		assertFalse(JamesBond.bondRegex("(007007)"));
	}
	@Test
	public void testCase112() {
		assertFalse(JamesBond.bondRegex("(00707)"));
	}
	@Test
	public void testCase113() {
		assertFalse(JamesBond.bondRegex("(0071)"));
	}
	@Test
	public void testCase114() {
		assertFalse(JamesBond.bondRegex("(0071007)"));
	}
	@Test
	public void testCase115() {
		assertFalse(JamesBond.bondRegex("(007107)"));
	}
	@Test
	public void testCase116() {
		assertFalse(JamesBond.bondRegex("(00717)"));
	}
	@Test
	public void testCase117() {
		assertFalse(JamesBond.bondRegex("(0072)"));
	}
	@Test
	public void testCase118() {
		assertFalse(JamesBond.bondRegex("(0072007)"));
	}
	@Test
	public void testCase119() {
		assertFalse(JamesBond.bondRegex("(007207)"));
	}
	@Test
	public void testCase120() {
		assertFalse(JamesBond.bondRegex("(00727)"));
	}
	@Test
	public void testCase121() {
		assertFalse(JamesBond.bondRegex("(0073)"));
	}
	@Test
	public void testCase122() {
		assertFalse(JamesBond.bondRegex("(0073007)"));
	}
	@Test
	public void testCase123() {
		assertFalse(JamesBond.bondRegex("(007307)"));
	}
	@Test
	public void testCase124() {
		assertFalse(JamesBond.bondRegex("(00737)"));
	}
	@Test
	public void testCase125() {
		assertFalse(JamesBond.bondRegex("(0074)"));
	}
	@Test
	public void testCase126() {
		assertFalse(JamesBond.bondRegex("(0074007)"));
	}
	@Test
	public void testCase127() {
		assertFalse(JamesBond.bondRegex("(007407)"));
	}
	@Test
	public void testCase128() {
		assertFalse(JamesBond.bondRegex("(00747)"));
	}
	@Test
	public void testCase129() {
		assertFalse(JamesBond.bondRegex("(0075)"));
	}
	@Test
	public void testCase130() {
		assertFalse(JamesBond.bondRegex("(0075007)"));
	}
	@Test
	public void testCase131() {
		assertFalse(JamesBond.bondRegex("(007507)"));
	}
	@Test
	public void testCase132() {
		assertFalse(JamesBond.bondRegex("(00757)"));
	}
	@Test
	public void testCase133() {
		assertFalse(JamesBond.bondRegex("(0076)"));
	}
	@Test
	public void testCase134() {
		assertFalse(JamesBond.bondRegex("(0076007)"));
	}
	@Test
	public void testCase135() {
		assertFalse(JamesBond.bondRegex("(007607)"));
	}
	@Test
	public void testCase136() {
		assertFalse(JamesBond.bondRegex("(00767)"));
	}
	@Test
	public void testCase137() {
		assertFalse(JamesBond.bondRegex("(0077)"));
	}
	@Test
	public void testCase138() {
		assertFalse(JamesBond.bondRegex("(0077007)"));
	}
	@Test
	public void testCase139() {
		assertFalse(JamesBond.bondRegex("(007707)"));
	}
	@Test
	public void testCase140() {
		assertFalse(JamesBond.bondRegex("(00777)"));
	}
	@Test
	public void testCase141() {
		assertFalse(JamesBond.bondRegex("(0078)"));
	}
	@Test
	public void testCase142() {
		assertFalse(JamesBond.bondRegex("(0078007)"));
	}
	@Test
	public void testCase143() {
		assertFalse(JamesBond.bondRegex("(007807)"));
	}
	@Test
	public void testCase144() {
		assertFalse(JamesBond.bondRegex("(00787)"));
	}
	@Test
	public void testCase145() {
		assertFalse(JamesBond.bondRegex("(0079)"));
	}
	@Test
	public void testCase146() {
		assertFalse(JamesBond.bondRegex("(0079007)"));
	}
	@Test
	public void testCase147() {
		assertFalse(JamesBond.bondRegex("(007907)"));
	}
	@Test
	public void testCase148() {
		assertFalse(JamesBond.bondRegex("(00797)"));
	}
	@Test
	public void testCase149() {
		assertFalse(JamesBond.bondRegex("(008)"));
	}
	@Test
	public void testCase150() {
		assertFalse(JamesBond.bondRegex("(008007)"));
	}
	@Test
	public void testCase151() {
		assertFalse(JamesBond.bondRegex("(00807)"));
	}
	@Test
	public void testCase152() {
		assertFalse(JamesBond.bondRegex("(0087)"));
	}
	@Test
	public void testCase153() {
		assertFalse(JamesBond.bondRegex("(009)"));
	}
	@Test
	public void testCase154() {
		assertFalse(JamesBond.bondRegex("(009007)"));
	}
	@Test
	public void testCase155() {
		assertFalse(JamesBond.bondRegex("(00907)"));
	}
	@Test
	public void testCase156() {
		assertFalse(JamesBond.bondRegex("(0097)"));
	}
	@Test
	public void testCase157() {
		assertFalse(JamesBond.bondRegex("(01)"));
	}
	@Test
	public void testCase158() {
		assertFalse(JamesBond.bondRegex("(01007)"));
	}
	@Test
	public void testCase159() {
		assertFalse(JamesBond.bondRegex("(0107)"));
	}
	@Test
	public void testCase160() {
		assertFalse(JamesBond.bondRegex("(017)"));
	}
	@Test
	public void testCase161() {
		assertFalse(JamesBond.bondRegex("(02)"));
	}
	@Test
	public void testCase162() {
		assertFalse(JamesBond.bondRegex("(02007)"));
	}
	@Test
	public void testCase163() {
		assertFalse(JamesBond.bondRegex("(0207)"));
	}
	@Test
	public void testCase164() {
		assertFalse(JamesBond.bondRegex("(027)"));
	}
	@Test
	public void testCase165() {
		assertFalse(JamesBond.bondRegex("(03)"));
	}
	@Test
	public void testCase166() {
		assertFalse(JamesBond.bondRegex("(03007)"));
	}
	@Test
	public void testCase167() {
		assertFalse(JamesBond.bondRegex("(0307)"));
	}
	@Test
	public void testCase168() {
		assertFalse(JamesBond.bondRegex("(037)"));
	}
	@Test
	public void testCase169() {
		assertFalse(JamesBond.bondRegex("(04)"));
	}
	@Test
	public void testCase170() {
		assertFalse(JamesBond.bondRegex("(04007)"));
	}
	@Test
	public void testCase171() {
		assertFalse(JamesBond.bondRegex("(0407)"));
	}
	@Test
	public void testCase172() {
		assertFalse(JamesBond.bondRegex("(047)"));
	}
	@Test
	public void testCase173() {
		assertFalse(JamesBond.bondRegex("(05)"));
	}
	@Test
	public void testCase174() {
		assertFalse(JamesBond.bondRegex("(05007)"));
	}
	@Test
	public void testCase175() {
		assertFalse(JamesBond.bondRegex("(0507)"));
	}
	@Test
	public void testCase176() {
		assertFalse(JamesBond.bondRegex("(057)"));
	}
	@Test
	public void testCase177() {
		assertFalse(JamesBond.bondRegex("(06)"));
	}
	@Test
	public void testCase178() {
		assertFalse(JamesBond.bondRegex("(06007)"));
	}
	@Test
	public void testCase179() {
		assertFalse(JamesBond.bondRegex("(0607)"));
	}
	@Test
	public void testCase180() {
		assertFalse(JamesBond.bondRegex("(067)"));
	}
	@Test
	public void testCase181() {
		assertFalse(JamesBond.bondRegex("(07)"));
	}
	@Test
	public void testCase182() {
		assertFalse(JamesBond.bondRegex("(07007)"));
	}
	@Test
	public void testCase183() {
		assertFalse(JamesBond.bondRegex("(0707)"));
	}
	@Test
	public void testCase184() {
		assertFalse(JamesBond.bondRegex("(077)"));
	}
	@Test
	public void testCase185() {
		assertFalse(JamesBond.bondRegex("(08)"));
	}
	@Test
	public void testCase186() {
		assertFalse(JamesBond.bondRegex("(08007)"));
	}
	@Test
	public void testCase187() {
		assertFalse(JamesBond.bondRegex("(0807)"));
	}
	@Test
	public void testCase188() {
		assertFalse(JamesBond.bondRegex("(087)"));
	}
	@Test
	public void testCase189() {
		assertFalse(JamesBond.bondRegex("(09)"));
	}
	@Test
	public void testCase190() {
		assertFalse(JamesBond.bondRegex("(09007)"));
	}
	@Test
	public void testCase191() {
		assertFalse(JamesBond.bondRegex("(0907)"));
	}
	@Test
	public void testCase192() {
		assertFalse(JamesBond.bondRegex("(097)"));
	}
	@Test
	public void testCase193() {
		assertFalse(JamesBond.bondRegex("(1)"));
	}
	@Test
	public void testCase194() {
		assertFalse(JamesBond.bondRegex("(1007)"));
	}
	@Test
	public void testCase195() {
		assertFalse(JamesBond.bondRegex("(107)"));
	}
	@Test
	public void testCase196() {
		assertFalse(JamesBond.bondRegex("(17)"));
	}
	@Test
	public void testCase197() {
		assertFalse(JamesBond.bondRegex("(2)"));
	}
	@Test
	public void testCase198() {
		assertFalse(JamesBond.bondRegex("(2007)"));
	}
	@Test
	public void testCase199() {
		assertFalse(JamesBond.bondRegex("(207)"));
	}
	@Test
	public void testCase200() {
		assertFalse(JamesBond.bondRegex("(27)"));
	}
	@Test
	public void testCase201() {
		assertFalse(JamesBond.bondRegex("(3)"));
	}
	@Test
	public void testCase202() {
		assertFalse(JamesBond.bondRegex("(3007)"));
	}
	@Test
	public void testCase203() {
		assertFalse(JamesBond.bondRegex("(307)"));
	}
	@Test
	public void testCase204() {
		assertFalse(JamesBond.bondRegex("(37)"));
	}
	@Test
	public void testCase205() {
		assertFalse(JamesBond.bondRegex("(4)"));
	}
	@Test
	public void testCase206() {
		assertFalse(JamesBond.bondRegex("(4007)"));
	}
	@Test
	public void testCase207() {
		assertFalse(JamesBond.bondRegex("(407)"));
	}
	@Test
	public void testCase208() {
		assertFalse(JamesBond.bondRegex("(47)"));
	}
	@Test
	public void testCase209() {
		assertFalse(JamesBond.bondRegex("(5)"));
	}
	@Test
	public void testCase210() {
		assertFalse(JamesBond.bondRegex("(5007)"));
	}
	@Test
	public void testCase211() {
		assertFalse(JamesBond.bondRegex("(507)"));
	}
	@Test
	public void testCase212() {
		assertFalse(JamesBond.bondRegex("(57)"));
	}
	@Test
	public void testCase213() {
		assertFalse(JamesBond.bondRegex("(6)"));
	}
	@Test
	public void testCase214() {
		assertFalse(JamesBond.bondRegex("(6007)"));
	}
	@Test
	public void testCase215() {
		assertFalse(JamesBond.bondRegex("(607)"));
	}
	@Test
	public void testCase216() {
		assertFalse(JamesBond.bondRegex("(67)"));
	}
	@Test
	public void testCase217() {
		assertFalse(JamesBond.bondRegex("(7)"));
	}
	@Test
	public void testCase218() {
		assertFalse(JamesBond.bondRegex("(7007)"));
	}
	@Test
	public void testCase219() {
		assertFalse(JamesBond.bondRegex("(707)"));
	}
	@Test
	public void testCase220() {
		assertFalse(JamesBond.bondRegex("(77)"));
	}
	@Test
	public void testCase221() {
		assertFalse(JamesBond.bondRegex("(8)"));
	}
	@Test
	public void testCase222() {
		assertFalse(JamesBond.bondRegex("(8007)"));
	}
	@Test
	public void testCase223() {
		assertFalse(JamesBond.bondRegex("(807)"));
	}
	@Test
	public void testCase224() {
		assertFalse(JamesBond.bondRegex("(87)"));
	}
	@Test
	public void testCase225() {
		assertFalse(JamesBond.bondRegex("(9)"));
	}
	@Test
	public void testCase226() {
		assertFalse(JamesBond.bondRegex("(9007)"));
	}
	@Test
	public void testCase227() {
		assertFalse(JamesBond.bondRegex("(907)"));
	}
	@Test
	public void testCase228() {
		assertFalse(JamesBond.bondRegex("(97)"));
	}
	@Test
	public void testCase229() {
		assertFalse(JamesBond.bondRegex(")"));
	}
	@Test
	public void testCase230() {
		assertFalse(JamesBond.bondRegex("))"));
	}
	@Test
	public void testCase231() {
		assertFalse(JamesBond.bondRegex(")007)"));
	}
	@Test
	public void testCase232() {
		assertFalse(JamesBond.bondRegex(")07)"));
	}
	@Test
	public void testCase233() {
		assertFalse(JamesBond.bondRegex(")7)"));
	}
	@Test
	public void testCase234() {
		assertFalse(JamesBond.bondRegex("0)"));
	}
	@Test
	public void testCase235() {
		assertFalse(JamesBond.bondRegex("0007)"));
	}
	@Test
	public void testCase236() {
		assertFalse(JamesBond.bondRegex("007)"));
	}
	@Test
	public void testCase237() {
		assertFalse(JamesBond.bondRegex("07)"));
	}
	@Test
	public void testCase238() {
		assertFalse(JamesBond.bondRegex("1)"));
	}
	@Test
	public void testCase239() {
		assertFalse(JamesBond.bondRegex("1007)"));
	}
	@Test
	public void testCase240() {
		assertFalse(JamesBond.bondRegex("107)"));
	}
	@Test
	public void testCase241() {
		assertFalse(JamesBond.bondRegex("17)"));
	}
	@Test
	public void testCase242() {
		assertFalse(JamesBond.bondRegex("2)"));
	}
	@Test
	public void testCase243() {
		assertFalse(JamesBond.bondRegex("2007)"));
	}
	@Test
	public void testCase244() {
		assertFalse(JamesBond.bondRegex("207)"));
	}
	@Test
	public void testCase245() {
		assertFalse(JamesBond.bondRegex("27)"));
	}
	@Test
	public void testCase246() {
		assertFalse(JamesBond.bondRegex("3)"));
	}
	@Test
	public void testCase247() {
		assertFalse(JamesBond.bondRegex("3007)"));
	}
	@Test
	public void testCase248() {
		assertFalse(JamesBond.bondRegex("307)"));
	}
	@Test
	public void testCase249() {
		assertFalse(JamesBond.bondRegex("37)"));
	}
	@Test
	public void testCase250() {
		assertFalse(JamesBond.bondRegex("4)"));
	}
	@Test
	public void testCase251() {
		assertFalse(JamesBond.bondRegex("4007)"));
	}
	@Test
	public void testCase252() {
		assertFalse(JamesBond.bondRegex("407)"));
	}
	@Test
	public void testCase253() {
		assertFalse(JamesBond.bondRegex("47)"));
	}
	@Test
	public void testCase254() {
		assertFalse(JamesBond.bondRegex("5)"));
	}
	@Test
	public void testCase255() {
		assertFalse(JamesBond.bondRegex("5007)"));
	}
	@Test
	public void testCase256() {
		assertFalse(JamesBond.bondRegex("507)"));
	}
	@Test
	public void testCase257() {
		assertFalse(JamesBond.bondRegex("57)"));
	}
	@Test
	public void testCase258() {
		assertFalse(JamesBond.bondRegex("6)"));
	}
	@Test
	public void testCase259() {
		assertFalse(JamesBond.bondRegex("6007)"));
	}
	@Test
	public void testCase260() {
		assertFalse(JamesBond.bondRegex("607)"));
	}
	@Test
	public void testCase261() {
		assertFalse(JamesBond.bondRegex("67)"));
	}
	@Test
	public void testCase262() {
		assertFalse(JamesBond.bondRegex("7)"));
	}
	@Test
	public void testCase263() {
		assertFalse(JamesBond.bondRegex("7007)"));
	}
	@Test
	public void testCase264() {
		assertFalse(JamesBond.bondRegex("707)"));
	}
	@Test
	public void testCase265() {
		assertFalse(JamesBond.bondRegex("77)"));
	}
	@Test
	public void testCase266() {
		assertFalse(JamesBond.bondRegex("8)"));
	}
	@Test
	public void testCase267() {
		assertFalse(JamesBond.bondRegex("8007)"));
	}
	@Test
	public void testCase268() {
		assertFalse(JamesBond.bondRegex("807)"));
	}
	@Test
	public void testCase269() {
		assertFalse(JamesBond.bondRegex("87)"));
	}
	@Test
	public void testCase270() {
		assertFalse(JamesBond.bondRegex("9)"));
	}
	@Test
	public void testCase271() {
		assertFalse(JamesBond.bondRegex("9007)"));
	}
	@Test
	public void testCase272() {
		assertFalse(JamesBond.bondRegex("907)"));
	}
	@Test
	public void testCase273() {
		assertFalse(JamesBond.bondRegex("97)"));
	}
}
