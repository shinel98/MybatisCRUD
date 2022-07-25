package com.clone.burgerkingDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.clone.burgerkingVO.MenuVO;

@Repository
public class MenuDAO {
//	JdbcTemplate template;
//	
//	public void setTemplate(JdbcTemplate template) {
//		this.template = template;
//	}
	
	@Autowired
	SqlSession sqlSession;
	
	public int insert(MenuVO menu) {
	    int result = sqlSession.insert("Menu.insertMenu", menu);    
		return result;
	}
	public int update(MenuVO menu) {
		int result = sqlSession.update("Menu.updateMenu", menu);
		return result;
	}
	public int delete(int id) {
		int result = sqlSession.delete("Menu.deleteMenu", id);
		return result;
	}
	public MenuVO getMenuById(int id) {
		MenuVO menu = sqlSession.selectOne("Menu.getMenu", id);
		return menu;
	}
	public List<MenuVO> getMenus(){    
		List<MenuVO> list = sqlSession.selectList("Menu.getMenuList");
		return list;
	}    
	
}

