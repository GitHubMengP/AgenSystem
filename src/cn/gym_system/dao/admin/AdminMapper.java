package cn.gym_system.dao.admin;

import org.apache.ibatis.annotations.Param;

import cn.gym_system.pojo.Admin;

/**
 * ����Աdao�ӿ�
 * @author MengPeng
 *
 */
public interface AdminMapper {
	/**
	 * ����Ա��¼
	 * @param adminCode
	 * @param password
	 * @return
	 */
	public Admin adminLogin(@Param("adminCode") String adminCode,
							@Param("password") String password);
}
