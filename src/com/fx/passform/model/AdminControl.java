package com.fx.passform.model;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;

public class AdminControl extends Model<AdminControl>{

	private static final long serialVersionUID = 1L;

	public static final AdminControl dao = new AdminControl();
	
	/**
     * 增加管理员操作
     *
     * @param staffId  工号
     * @param user 用户名
     * @return
     */
	//增加管理员
	public boolean addAdmin(String staffId, String user){   
		AdminControl admin = new AdminControl();
		admin.set("createTime",new Timestamp(new Date().getTime()));
		admin.set("staffId",staffId).set("user",user);
		return admin.save();
	}
	
	//删除管理员	
		public boolean delAdminById(String id){   
			return AdminControl.dao.deleteById(id);
		}
		

		//查询所有管理员用户
		public List<AdminControl> findAll(){
			return find("select * from admin");
		}
		
		public Page<AdminControl> findAll(int pageNum, int pageCount){
			return dao.paginate(pageNum, pageCount,"select * "," from admin where 1=1 order by id desc");
		}
		
}


