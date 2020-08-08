package grade;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GradeAvgController {

	  @GetMapping("Grade-json")
	  @ResponseBody
	  public MarksAvg displayGrade(@RequestParam(value="Physics",required=false, defaultValue="80") int phy, @RequestParam(value="Chemistry",required=false, defaultValue="80") int chem,@RequestParam(value="Maths",required=false, defaultValue="80") int maths) 
	  
	  {       
		  MarksAvg grade = new MarksAvg();
		  
		 
		  grade.setPhy(phy);
		  grade.setChem(chem);
		  grade.setMaths(maths);
		  grade.setTotal(240);
		  grade.setGrd("A");

		  return grade;
	
	 }
	  
	   @GetMapping("/Grade")
	    public ModelAndView htmlView(Model model)
	  {    
		   MarksAvg grade = new MarksAvg();
		      
			  grade.setPhy(80);
			  grade.setChem(80);
			  grade.setMaths(80);
			  grade.setTotal(240);
			  grade.setGrd("A");

			  
		  
		   
	      
	        ModelAndView mav = new ModelAndView();
	        mav.addObject("grade", grade);
	        mav.setViewName("mygrade.html");   
	        return mav;
	  }

  
}