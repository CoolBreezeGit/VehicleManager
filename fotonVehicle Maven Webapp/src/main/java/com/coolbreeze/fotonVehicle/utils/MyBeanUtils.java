package com.coolbreeze.fotonVehicle.utils;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.coolbreeze.oa.domain.V_Param;


public class MyBeanUtils {

	/*
	 * 将v_Param bean封装成map，并且去除了一些关联类属性，防止懒加载异常
	 */
	public static Map v_ParamToMap(V_Param v_Param){
		
		Map<String,Object> map=new HashMap<String,Object>();
		
		try {
			/*
			 * 采用BeanMap
			BeanMap beanMap=new BeanMap(user);
			System.out.println(beanMap.get("id"));
			System.out.println(beanMap.get("name"));
			System.out.println(beanMap.get("address"));
			*/
			
			BeanInfo beanInfo=Introspector.getBeanInfo(V_Param.class);
			
			PropertyDescriptor[] propertyDescriptors=beanInfo.getPropertyDescriptors();
			
			for(PropertyDescriptor propertyDescriptor : propertyDescriptors){
				String propName=propertyDescriptor.getName();
				
				if(!propName.equals("class") && !propName.equals("v_Configure")){
					//System.out.println(propName);
					Method getter=propertyDescriptor.getReadMethod();
					Object value=getter.invoke(v_Param);
					map.put(propName,value);					
				}
			}
			
		} catch (Exception e){
			
		}
		return map;
	}
	
}
