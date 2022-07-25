package com.clone.burgerking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clone.burgerkingDAO.MenuDAO;
import com.clone.burgerkingVO.MenuVO;


@Service
public class MenuServiceImpl implements MenuService{

	@Autowired
	MenuDAO dao;
	
	@Override
	public int insertMenu(MenuVO menu) {
		// TODO Auto-generated method stub
		
		return dao.insert(menu);
	}

	@Override
	public int deleteMenu(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

	@Override
	public int updateMenu(MenuVO menu) {
		// TODO Auto-generated method stub
		return dao.update(menu);
	}

	@Override
	public MenuVO getMenuById(int id) {
		// TODO Auto-generated method stub
		return dao.getMenuById(id);
	}

	@Override
	public List<MenuVO> getMenus() {
		// TODO Auto-generated method stub
		return dao.getMenus();
	}

}
