package com.googlecode.richrest.client.view.swing;

import java.awt.EventQueue;

/**
 * UI工具类
 * @author <a href="mailto:liangfei0201@gmail.com">liangfei</a>
 */
public class UIUtils {

	private UIUtils() {}

	public static boolean isUIThread() {
		return EventQueue.isDispatchThread();
	}

	public static boolean isUIThread(Thread thread) {
		return "java.awt.EventDispatchThread".equals(thread.getClass().getName());
	}

	public static boolean isNonUIThread() {
		return ! isUIThread();
	}

	public static boolean isNonUIThread(Thread thread) {
		return ! isUIThread(thread);
	}

	public static void syncExecute(Runnable runnable) {
		try {
			EventQueue.invokeAndWait(runnable);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public static void asyncExecute(Runnable runnable) {
		EventQueue.invokeLater(runnable);
	}

}
