package com.mavenTesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ StringHelperTest.class, StringHelpetTestParameterized.class })
public class TestSuit {

}
