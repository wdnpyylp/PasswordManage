package com.fx.passform.plugin;

import com.fx.passform.util.MailKit;
import com.jfinal.plugin.IPlugin;

import java.util.Hashtable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.naming.Context;

/**
 * Email plugin
 * <p/>
 * Created by fan.xu on 2014/10/24.
 */
public class EmailPlugin implements IPlugin {

    /**
     * 发送信息
     */
    private MailInfo info;

    /**
     * 线程池
     */
    private ExecutorService pool;

    /**
     * 邮件信息
     *
     * @return
     */
    public MailInfo getInfo() {
        return info;
    }

    /**
     * 构造信息
     *
     * @param info
     * @param num
     */
    public EmailPlugin(MailInfo info, int num) {
        this.info = info;
        // 创建一个可重用线程数的线程池
        pool = Executors.newFixedThreadPool(num);
        //MailKit.init(pool,info);
    }
    private Hashtable env;
    
	public EmailPlugin(String url, int port, String user, String pass) {
		// TODO Auto-generated constructor stub
		env = new Hashtable();
        env.put(Context.SECURITY_PRINCIPAL, user);
        env.put(Context.SECURITY_CREDENTIALS, pass);
        env.put("url", url);
        env.put("port", port);
        //MailKit.init(pool,info);
	}

	@Override
    public boolean start() {
        MailKit.init(pool,info);
        return true;
    }

    @Override
    public boolean stop() {
        if (!pool.isShutdown()) {
            pool.shutdown();
        }
        return true;
    }
}
