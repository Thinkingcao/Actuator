package com.thinkingcao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 * &#64;author cao_wencao
 * &#64;date 2018年11月22日 下午1:04:45
 * </pre>
 */
@RestController
public class IndexController {
	@RequestMapping("/index")
	public String index() {
		return "这是 index ";
	}

}
