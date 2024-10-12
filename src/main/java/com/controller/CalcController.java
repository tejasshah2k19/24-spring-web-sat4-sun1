package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.InputNumberBean;

@Controller
public class CalcController {

	@GetMapping("inputnumber")
	public String inputNumber() {
		return "InputNumber";// jsp
	}

	@PostMapping("calculate")
	public String calculate(InputNumberBean bean, Model model) {
		System.out.println(bean.getN1() + bean.getN2());
		int ans = 0;

		if (bean.getOpr().equals("+")) {
			ans = bean.getN1() + bean.getN2();
		} else if (bean.getOpr().equals("-")) {
			ans = bean.getN1() - bean.getN2();
		} else if (bean.getOpr().equals("*")) {
			ans = bean.getN1() * bean.getN2();
		}

		model.addAttribute("ans", ans);// request.setAttribute();
		return "Result";// jsp rd
	}
}
