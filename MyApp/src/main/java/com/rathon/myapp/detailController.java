//package com.rathon.myapp;
//
//import com.rathon.myapp.model.detail;
//import com.rathon.myapp.model.dao.detailDao;
//import java.util.List;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//
//@Controller
//public class detailController {
//	@RequestMapping(value="/updateLayout", method=RequestMethod.GET)
//	public String detail(Model model) {
//		List<detail> details= detailDao.getDetail("Caferacer");
//		model.addAttribute("result", details);
//		return "page/detail";
//	}
//}
