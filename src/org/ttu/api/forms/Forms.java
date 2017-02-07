/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ttu.api.forms;
import java.net.*;
import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Gad Ocansey
 * @since 2017
 * @version 1.0
 * @email gadocansey@gmail.com
 * @company Takoradi Technical University
 * 
 */
public class Forms {
    /**
     * The pin code and serial number corresponds to what is in the excel
     * @param pin
     * @param serial
     * @param applicantName
     * @param applicantPhone
     * @param bank
     * @return HTTP STATUS CODE
     * @throws Exception 
     */
    
    public String sell(String pin,String serial,String applicantName,String applicantPhone,String bank) throws Exception {
		String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjksImlzcyI6Imh0dHA6XC9cL2FwaS50dHVwb3J0YWwuY29tXC9wdWJsaWNcL2FwaVwvYXV0aFwvbG9naW4iLCJpYXQiOjE0ODY0Mzk3MzIsImV4cCI6MTU0MTc4NjEzMiwibmJmIjoxNDg2NDM5NzMyLCJqdGkiOiIxYmMwMzAyOTllZmFiNjgxMTVjM2EwZTg0ZGIyYzE2YyJ9.ZFfiQ2FLJiRNzuiDo_-fsHqCGujgrcI9HurleSUt018";
		 
		bank = "HFCBANK"; // just example ie your bank code
 
		/******************* API URL FOR SENDING FORMS SOLD TO TTU ********/
                
                String urlString="http://api.ttuportal.com/public/api/forms/pin/"+pin+"/serial/"+serial+"/name/"
				+applicantName+"/phone/"+applicantPhone+"/bank/"+bank+"?token="+token;
               
                URL url = new URL(urlString);

		 
		String result=null;
		URLConnection connection = url.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String inputLine;
		inputLine = in.readLine().trim();
              
                //JSONObject jsonObject = (JSONObject)inputLine;
                //String status= jsonObject.getString("status");
                
		in.close();
		 return result.toString();
	}
}
