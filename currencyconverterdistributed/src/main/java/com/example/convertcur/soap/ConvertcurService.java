package com.example.convertcur.soap;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.example.convertcur.bus.ConvertcurImpl;
import com.example.convertcur.model.Convert;

@WebService
public class ConvertcurService {
	ConvertcurImpl cc = new ConvertcurImpl();
	
	@WebMethod
	public ArrayList<Convert> getCurrencyResult (String denomination) {
		return cc.getCurrencyResult(denomination);
	}
}
