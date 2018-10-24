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
		model.addAttribute("table_page", layouts);
		//SHOW PAGE
		return "page/index";
	}
	
	//MAPPING POST URI
	@RequestMapping(value ="detail", method = RequestMethod.POST)
	//CATCH PARAM FROM VIEW,
	public String index(@RequestParam Integer idMotor,Model model) {
		int value = LayoutDao.incValue(idMotor);
		String hasil = LayoutDao.updateLayout(idMotor,value);
		List<Layout> dataHasil=LayoutDao.getDetail(idMotor);
		model.addAttribute("results_page", hasil);
		model.addAttribute("result_page", dataHasil);		
		//POST: REDIRECT: PAGE VIEW
		return "page/detail";
	}		

}


