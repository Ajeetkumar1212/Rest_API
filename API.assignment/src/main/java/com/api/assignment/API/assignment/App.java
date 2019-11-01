package com.api.assignment.API.assignment;

import Demo.JsonUtil;
import Demo.pojo_class;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Throwable
    {
       pojo_class emp =new pojo_class();
       emp.setEmpNo(1);
       emp.setName("XYZ");
       emp.setSalary(1000.22);
       String jsonEmp=JsonUtil.convertJavaToJson(emp);
       System.out.print(jsonEmp);
       
    }
}
