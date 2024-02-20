package Statment_Brancch_coverage.Statment_Brancch_coverage;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)

@Suite.SuiteClasses({
	WeakMethod1a.class, WeakMethod1b.class, 
	WeakMethod2a.class, WeakMethod2b.class,
	WeakMethod3a_Statement_And_Branch_Coverage.class, WeakMethod3b_Branch_Coverage.class

})
public class TestSuite {
	
	

}
