package com.test.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.domain.ProductVO;

@Controller
public class SampleController3 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController3.class);
	
	@RequestMapping("/doD")
	public String doD(Model model) {
		
		ProductVO product = new ProductVO("Sample Product", 10000);
		
		logger.info("doD called");
		
		// addAttribute "이름"을 지정하지 않은 경우
		// 자동으로 저장되는 객체의 클래스명 앞 글자를 소문자로 처리한 클래스명을 이름으로 간주
//		model.addAttribute(product);
		model.addAttribute("product", product);
		
		return "productDetail";
	}
}
