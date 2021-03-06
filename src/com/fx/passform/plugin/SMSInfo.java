package com.fx.passform.plugin;

import com.cloopen.rest.sdk.CCPRestSmsSDK;

/**
 * 短信网关信息
 * <p/>
 * Created by fan.xu on 2014/10/24.
 */
public class SMSInfo {

    //初始化服务器地址和端口
    private String ip = "sandboxapp.cloopen.com";
    private String port = "8883";
    //初始化主帐号和主帐号令牌
    private String user;
    private String pass;
    //初始化应用ID
    private String appId;
    //短信验证时间
    private String smstime;
    //短信使用模板
    private String tmpId;

    public static CCPRestSmsSDK restAPI = new CCPRestSmsSDK();

    public SMSInfo() {
        //todo 使用model  ，完整对象
//        CCPRestSmsSDK restAPI = new CCPRestSmsSDK();
//        restAPI.init(ip, port);
//        restAPI.setAccount(user, pass);
//        restAPI.setAppId(tmpId);
    }

    public SMSInfo(String ip, String port, String user, String pass) {
        //测试使用
        //初始化SDK
        
    	SMSInfo.restAPI.init(ip, port);
    	SMSInfo.restAPI.setAccount(user, pass);
//        restAPI.setAppId(appid);
        this.ip=ip;
        this.port=port;
        this.user=user;
        this.pass=pass;
//        this.appId=appid;
//        this.restAPI=restAPI;
    }

	public String getIp() {
		return ip;
	}

	public String getPort() {
		return port;
	}

	public String getUser() {
		return user;
	}

	public String getPass() {
		return pass;
	}

	public String getAppId() {
		return appId;
	}

	public String getSmstime() {
		return smstime;
	}

	public String getTmpId() {
		return tmpId;
	}

	public CCPRestSmsSDK getRestAPI() {
		return restAPI;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public void setSmstime(String smstime) {
		this.smstime = smstime;
	}

	public void setTmpId(String tmpId) {
		this.tmpId = tmpId;
	}

	public void setRestAPI(CCPRestSmsSDK restAPI) {
		this.restAPI = restAPI;
	}

   
}
