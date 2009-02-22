package guice.xml.config.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LogWrapper implements LoggerIF {

	private Log logger;
	
	public LogWrapper(Class clazz) {
		logger = LogFactory.getLog(clazz);
	}

	public void trace(Object... obj) {
		if (logger.isTraceEnabled()) {
			if (obj != null && obj.length > 0) {
				if (obj.length > 1) {
					logger.trace(buildString(obj));
				} else {
					logger.trace(obj[0]);
				}
			} else {
				logger.trace(obj);
			}
		}
	}

	public void trace(Throwable t, Object... obj) {
		if (logger.isTraceEnabled()) {
			if (obj != null && obj.length > 0) {
				if (obj.length > 1) {
					logger.trace(buildString(obj), t);
				} else {
					logger.trace(obj[0], t);
				}
			} else {
				logger.trace(t);
			}
		}
	}
	
	public void debug(Object... obj) {
		if (logger.isDebugEnabled()) {
			if (obj != null && obj.length > 0) {
				if (obj.length > 1) {
					logger.debug(buildString(obj));
				} else {
					logger.debug(obj[0]);
				}
			} else {
				logger.debug(obj);
			}
		}
	}

	public void debug(Throwable t, Object... obj) {
		if (logger.isDebugEnabled()) {
			if (obj != null && obj.length > 0) {
				if (obj.length > 1) {
					logger.debug(buildString(obj), t);
				} else {
					logger.debug(obj[0], t);
				}
			} else {
				logger.debug(t);
			}
		}
	}

	public void error(Object... obj) {
		if (logger.isErrorEnabled()) {
			if (obj != null && obj.length > 0) {
				if (obj.length > 1) {
					logger.error(buildString(obj));
				} else {
					logger.error(obj[0]);
				}
			} else {
				logger.error(obj);
			}
		}
	}

	public void error(Throwable t, Object... obj) {
		if (logger.isErrorEnabled()) {
			if (obj != null && obj.length > 0) {
				if (obj.length > 1) {
					logger.error(buildString(obj), t);
				} else {
					logger.error(obj[0], t);
				}
			} else {
				logger.error(t);
			}
		}
	}

	public void fatal(Object... obj) {
		if (logger.isFatalEnabled()) {
			if (obj != null && obj.length > 0) {
				if (obj.length > 1) {
					logger.fatal(buildString(obj));
				} else {
					logger.fatal(obj[0]);
				}
			} else {
				logger.fatal(obj);
			}
		}
	}

	public void fatal(Throwable t, Object... obj) {
		if (logger.isFatalEnabled()) {
			if (obj != null && obj.length > 0) {
				if (obj.length > 1) {
					logger.fatal(buildString(obj), t);
				} else {
					logger.fatal(obj[0], t);
				}
			} else {
				logger.error(t);
			}
		}
	}

	public void info(Object... obj) {
		if (logger.isInfoEnabled()) {
			if (obj != null && obj.length > 0) {
				if (obj.length > 1) {
					logger.info(buildString(obj));
				} else {
					logger.info(obj[0]);
				}
			} else {
				logger.info(obj);
			}
		}
	}

	public void info(Throwable t, Object... obj) {
		if (logger.isInfoEnabled()) {
			if (obj != null && obj.length > 0) {
				if (obj.length > 1) {
					logger.info(buildString(obj), t);
				} else {
					logger.info(obj[0], t);
				}
			} else {
				logger.info(t);
			}
		}
	}

	public void warn(Object... obj) {
		if (logger.isWarnEnabled()) {
			if (obj != null && obj.length > 0) {
				if (obj.length > 1) {
					logger.warn(buildString(obj));
				} else {
					logger.warn(obj[0]);
				}
			} else {
				logger.warn(obj);
			}
		}
	}

	public void warn(Throwable t, Object... obj) {
		if (logger.isWarnEnabled()) {
			if (obj != null && obj.length > 0) {
				if (obj.length > 1) {
					logger.warn(buildString(obj), t);
				} else {
					logger.warn(obj[0], t);
				}
			} else {
				logger.warn(t);
			}
		}
	}

	protected String buildString(Object... objects) {
		StringBuilder builder = new StringBuilder();
		for (Object obj : objects) {
			builder.append(obj);
		}
		return builder.toString();
	}
}
