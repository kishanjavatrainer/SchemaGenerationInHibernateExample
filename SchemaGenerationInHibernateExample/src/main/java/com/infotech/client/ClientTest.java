package com.infotech.client;

import com.infotech.util.HibernateUtil;

public class ClientTest {

	public static void main(String[] args) {

		try {
			HibernateUtil.getSessionFactory();
			System.out.println("Session Factory is created..");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}