package com.SpringJdbc1;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spconfig.xml");
        
        Dao dao = ac.getBean("DaoImpl",Dao.class);
        Student st = new Student();
        st.setId(101);
        st.setName("puja");
        st.setEmail("puja@gmail.com");
        st.setAge(22);
       st.setAddress("kolkata");
        
  /*      Student st2 = new Student();
        st2.setId(70);
        st2.setName("riya");
        st2.setEmail("riya@gmail.com");
        st2.setAge(35);
        st2.setAddress("delhi");*/
        
        int rs = dao.insert(st);
       System.out.println(rs);
        
        //int rs2 = dao.insert(st2);
       // System.out.println(rs2);
    }
}
