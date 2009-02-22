package guice.xml.config;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class TestExternalConfigModule {

	@Test
	public void testExternalConfigModule() {
		ExternalConfigModule module = new ExternalConfigModule("testConfig1.xml"){		
			@Override
			protected void extendConfigure() {
								
			}
		};
		Injector injector = Guice.createInjector(module);
	}

}
