#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.inject.Singleton;

public final class ProjectModule extends AbstractModule {
    @Override
    public void configure() {
    }

    @Provides
    @Singleton
    WebDriver getDriver() {
        return new ChromeDriver();
    }
}