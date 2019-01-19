package com.test.web;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.domain.ProductVO;

@Controller
public class SampleController5 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController5.class);
	
	@RequestMapping("doJSON")
	@ResponseBody
	public ProductVO doJSON() {
		
		logger.info("doJSON called");
		
		ProductVO product = new ProductVO("샘플상품", 5000);
		
		return product;
	}
}
