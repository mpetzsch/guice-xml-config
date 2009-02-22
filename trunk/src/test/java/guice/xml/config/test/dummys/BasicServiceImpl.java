package guice.xml.config.test.dummys;

import java.util.Map;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class BasicServiceImpl implements BasicServiceIF {
	@Inject
	public BasicServiceImpl(@Named("bobbins") String bobbins, @Named("test1") Map<String, String> properties) {
		System.out.println("bobbins: " + bobbins);
		System.out.println("test1: " + properties);
	}
}
