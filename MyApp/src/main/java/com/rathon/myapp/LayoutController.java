package com.rathon.myapp;

import com.rathon.myapp.model.Layout;
import com.rathon.myapp.model.dao.LayoutDao;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/** 
 * @author ratho
 *
 */
@Controller
public class LayoutController {
	
	/**	 
	 * @param model
	 * @return views
	 */
	@RequestMapping(value ="/layout", method = RequestMethod.GET)
	public String index(Model model) {		
		List <Layout> layouts  = LayoutDao.getLayout();
		List <Layout> layoutBwh= LayoutDao.getBottomText();
		List <Layout> layoutTgh = LayoutDao.getMidText();
		model.addAttribute("table_page", layouts);
		model.addAttribute("table_page_mid",layoutTgh);
		model.addAttribute("table_page_bot",layoutBwh);
		return "page/index";
	}
	
	//MAPPING POST URI
	@RequestMapping(value ="detail", method = RequestMethod.POST)
	//CATCH PARAM FROM VIEW,
	public String index(@RequestParam String name,Model model) {
		int value = LayoutDao.incValue(name);
		String hasil = LayoutDao.updateLayout(name,value);
		List<Layout> dataHasil=LayoutDao.getDetail(name);
		model.addAttribute("results_page", hasil);
		model.addAttribute("result_page", dataHasil);		
		return "page/detail";
	}		

}


