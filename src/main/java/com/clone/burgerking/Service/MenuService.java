package com.clone.burgerking.Service;

import java.util.List;

import com.clone.burgerkingVO.MenuVO;

public interface MenuService {
	public int insertMenu(MenuVO menu);
	public int deleteMenu(int id);
	public int updateMenu(MenuVO menu);
	public MenuVO getMenuById(int id);
	public List<MenuVO> getMenus();
}
