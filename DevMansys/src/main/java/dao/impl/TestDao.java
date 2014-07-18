package dao.impl;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import dao.TestDaoI;
@Service
@ComponentScan
@EnableAutoConfiguration
public class TestDao implements TestDaoI {

	@Override
	public String test() {
		// TODO Auto-generated method stub
		return "zhangjun1";
	}

}
