package com.ptteng.fuiou.api;


import com.fuiou.mpay.encrypt.DESCoderFUIOU;
import com.fuiou.mpay.encrypt.RSAUtils;
import com.fuiou.util.MD5;
import com.ptteng.fuiou.api.data.APIPayXmlBeanReq;
import com.ptteng.fuiou.base.APIBaseServlet;
import com.ptteng.fuiou.utils.ConfigReader;
import com.ptteng.fuiou.utils.HttpPoster;
import com.ptteng.fuiou.utils.XMapUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PayNewServlet extends HttpServlet implements APIBaseServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		
		try {
			String version = "3.0";
			String type = "03";
			String userid = req.getParameter("userid");
			String mchntorderid = req.getParameter("mchntorderid");
			String orderid = req.getParameter("orderid");
			String bankcard = req.getParameter("bankcard");
			String mobile = req.getParameter("mobile");
			String userip = "192.168.199.58";
			String signpay = req.getParameter("signpay");
			String vercd = req.getParameter("vercd");
			String rem1 = "";
			String rem2 = "";
			String rem3 = "";
			APIPayXmlBeanReq beanReq =new APIPayXmlBeanReq();
			beanReq.setVersion(version);
			beanReq.setMchntcd(mchntcd);
			beanReq.setType(type);
			beanReq.setMchntorderid(mchntorderid);
			beanReq.setOrderid(orderid);
			beanReq.setUserid(userid);
			beanReq.setBankcard(bankcard);
			beanReq.setMobile(mobile);
			beanReq.setVercd(vercd);
			beanReq.setRem1(rem1);
			beanReq.setRem2(rem2);
			beanReq.setRem3(rem3);
			beanReq.setUserip(userip);
			beanReq.setSigntp(signtp);
			beanReq.setSignpay(signpay);
			beanReq.setSign(getSign(beanReq.md5StrIP(key), signtp, privatekey));
			Map<String,String> map = new HashMap<String, String>();
			//String url = "http://localhost:8881/mobile_pay/apinewpay/payAction.pay";
			String url = ConfigReader.getString("api.pay_3.0_url");
			String APIFMS =XMapUtil.toXML(beanReq, charset);;
			APIFMS = DESCoderFUIOU.desEncrypt(APIFMS, DESCoderFUIOU.getKeyLength8(key));
			map.put("MCHNTCD",mchntcd);
			map.put("APIFMS", APIFMS);
			String result = new HttpPoster(url).postStr(map);
			result = DESCoderFUIOU.desDecrypt(result,DESCoderFUIOU.getKeyLength8(key));
			System.out.println(result);
			resp.getOutputStream().write(result.getBytes("utf8"));
		} catch (Exception e) {
			e.printStackTrace();
			resp.getOutputStream().write(e.getMessage().getBytes("utf8"));
		}
		
	}
	
	/**
	 * 获取签名
	 * @param signStr  签名串
	 * @param signtp   签名类型
	 * @param key      密钥
	 * @return
	 * @throws Exception
	 */
	public static String getSign(String signStr,String signtp,String key) throws  Exception{
		String sign = "";
		if ("md5".equalsIgnoreCase(signtp)) {
			sign = MD5.MD5Encode(signStr);
		} else {
			sign =	RSAUtils.sign(signStr.getBytes("utf-8"), key);
		}
		return sign;
	}

}
