package Skeleton;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin= {"pretty","html:cucumber-reports"},features= {"src/test/resources/Skeleton/shout.feature","src/test/resources/Skeleton/pgm2.feature"},monochrome=true,dryRun=false)


public class CucumberRunner {

}
