package it.dstech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerPalindrome {
	@RequestMapping(value = "/palindrome")
	public ModelAndView mav(@RequestParam("testo") String testo, Model model) {
		String[] currencies = testo.split("\\s+");
		
		
	}
	public static int conta(String currencies) {
		int count=0;
		for(int i = 0; i < currencies.length(); i++){
            if(currencies.charAt(i) != ' '){
                count++;
                while(currencies.charAt(i) != ' ' && i < currencies.length()-1){
                    i++;
                }
            }
        }
        return count;
		  
		
	}
	

}
