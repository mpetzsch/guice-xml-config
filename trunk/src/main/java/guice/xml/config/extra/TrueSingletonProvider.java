package guice.xml.config.extra;

import guice.xml.config.utils.LogWrapper;
import guice.xml.config.utils.LoggerIF;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Provider;

public class TrueSingletonProvider<T> implements Provider<T>
{
	@Inject
	private Injector injector;

	private static Map<Key<?>, Object> singletonCache;
	private static final Lock lock = new ReentrantLock();
	private static LoggerIF logger;

	private Key<T> boundKey;
	
	static
	{
		logger = new LogWrapper(TrueSingletonProvider.class);
		logger.debug("static {} - Booting....");
		singletonCache = new ConcurrentHashMap<Key<?>, Object>();
	}
	
	@SuppressWarnings("unchecked")
	public TrueSingletonProvider(Class iface)
	{
		logger.debug("Constructed (", iface, ")");
		boundKey = Key.get(iface, SingletonInternal.class);
	}

	private boolean instanceReady()
	{
		return singletonCache.containsKey(boundKey);
	}

	@SuppressWarnings("unchecked")
	public T get()
	{
		logger.debug("get singleton (", boundKey, ")");
		if (!instanceReady())
		{
			try
			{
				lock.lock();
				if (instanceReady())
				{
					// just unlock and return
				} else
				{
					logger.debug("instantiate singleton (", boundKey, ")");
					// put into the map
					singletonCache
							.put(boundKey, injector.getInstance(boundKey));
				}
			} finally
			{
				lock.unlock();
			}
		}
		return (T) singletonCache.get(boundKey);
	}
}
