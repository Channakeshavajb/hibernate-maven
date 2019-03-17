package com.xworkz.SportsExample;

public class SportsTest {

	public static void main(String[] args) {
		
		
		SportsDTO dto=new SportsDTO();
		dto.setName("cricket");
		dto.setState("karnataka");
		dto.setPlayers(11);
		
		SportsDAO dao=new SportsDAO();
		dao.save(dto);
		

	}

}
