package ex07;

import java.io.ObjectInputFilter.Config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ex02.Hotel;
import ex03.MemberDAO;


public class MainClass {
	
	//자바 설정파일을 읽을 때
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext atx =
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Hotel hotel = atx.getBean(Hotel.class);
        hotel.getChef().cooking();
	
        MemberDAO dao = atx.getBean(MemberDAO.class);
        
        System.out.println(dao.getDataSource().getUid());
        System.out.println(dao.getDataSource().getUrl());
        System.out.println(dao.getDataSource().getUpw());
        
       
	}
	
	

}
