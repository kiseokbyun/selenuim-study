package selenuim.test.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;

import selenuim.test.environment.EnvironmentManager;
import selenuim.test.environment.RunEnvironment;

public class DemoTest {

    @Before
    public void startBrowser() {
        EnvironmentManager.initWebDriver();
    }

    @Test
    public void demo() {
        // given
        WebDriver driver = RunEnvironment.getWebDriver();
        
        // when
        driver.get("https://www.naver.com/");
        System.out.println(driver.findElement(By.id("search")).getText());
        
        driver.findElement(ByClassName.className("logo_naver")).click();
        
        //then
        assertThat(driver.getTitle()).isEqualTo("NAVER");
        assertThat(driver.findElement(ByClassName.className("logo_naver"))).isNotNull();
        assertThat(driver.findElement(By.id("search")).getTagName()).isEqualTo("div");
    }

    @After
    public void tearDown() {
        EnvironmentManager.shutDownDriver();
    }
}
