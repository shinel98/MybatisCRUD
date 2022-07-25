package com.clone.burgerkingDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.clone.burgerkingVO.MenuVO;

public class MenuDAO {
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public int create(MenuVO menu) {
	    String sql="insert into lih_menu(type,photo,name,des) values('"+menu.getType()+"','"+menu.getPhoto()+"','"+menu.getName()+"','"+menu.getDes()+"');";    
		
		return template.update(sql);
	}
	public int update(MenuVO menu) {
		String sql = "update lih_menu set type='"+menu.getType()+"', photo='"+ menu.getPhoto()+"', name='" + menu.getName() +"', des='" + menu.getDes()+"' where id="+menu.getId()+";";
		return template.update(sql);
	}
	public int delete(int id) {
		String sql = "delete from lih_menu where id=" + id;
		return template.update(sql);
	}
	public MenuVO getMenuById(int id) {
		String sql = "select * from lih_menu where id=?";
		return template.queryForObject(sql, new Object[] {id} , new BeanPropertyRowMapper<MenuVO>(MenuVO.class));
	}
	public List<MenuVO> getMenus(){    
		String sql = "select * from lih_menu";
	    return template.query(sql , new RowMapper<MenuVO>(){    
	        public MenuVO mapRow(ResultSet rs, int row) throws SQLException {    
	            MenuVO menu =new MenuVO();
	            menu.setId(rs.getInt(1));
	            menu.setType(rs.getString(2));    
	            menu.setPhoto(rs.getString(3));    
	            menu.setName(rs.getString(4));    
	            menu.setDes(rs.getString(5));   
	            return menu;    
	        }    
	    });    
	}    
	
}

