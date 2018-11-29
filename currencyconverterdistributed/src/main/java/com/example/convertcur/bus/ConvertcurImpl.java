package com.example.convertcur.bus;

import com.example.convertcur.model.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.xml.transform.Result;
import com.example.convertcur.model.*;


public class ConvertcurImpl {
	private Map<String, ArrayList> currenciesMap = new HashMap<>();
	private ArrayList<Convert> list;
	
	public ConvertcurImpl() {
		Convert currencyCanada0= new Convert( "EUR", 0.662080);
		Convert currencyCanada1= new Convert( "GBP", 0.589424);
		Convert currencyCanada3= new Convert( "AUD", 1.03095);
		
		list = new ArrayList<>();
		list.add(currencyCanada0);
		list.add(currencyCanada1);
		list.add(currencyCanada3);
		currenciesMap.put("CAD", list);
		
		Convert currencyEuro0= new Convert( "CAD", 1.51049);
		Convert currencyEuro1 = new Convert( "GBP", 0.890205);
		Convert currencyEuro2 = new Convert( "AUD", 1.55728);
		
		list = new ArrayList<>();
		list.add(currencyEuro0);
		list.add(currencyEuro1);
		list.add(currencyEuro2);
		currenciesMap.put("EUR", list);
		
		Convert currencyBritishPound0 = new Convert( "CAD", 1.69611);
		Convert currencyBritishPound1 = new Convert( "AUR", 1.74872);
		Convert currencyBritishPound2 = new Convert( "EUR", 1.12300);
		
		list = new ArrayList<>();
		list.add(currencyBritishPound0);
		list.add(currencyBritishPound1);
		list.add(currencyBritishPound2);
		currenciesMap.put("GBP", list);
		
		
	}
	
	public ArrayList getCurrencyResult (String denomination) {
		return currenciesMap.get(denomination);
	}


}
