package cn.gym_system.dao.admin;

import org.apache.ibatis.annotations.Param;

import cn.gym_system.pojo.Admin;

/**
 * 管理员dao接口
 * @author MengPeng
 *
 */
public interface AdminMapper {
	/**
	 * 管理员登录
	 * @param adminCode
	 * @param password
	 * @return
	 */
	public Admin adminLogin(@Param("adminCode") String adminCode,
							@Param("password") String password);
}
