package trader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import com.google.gson.Gson;

public class Utils {
	
	private static String btceUrl = "https://btc-e.com/api/2/btc_usd/ticker";
	
	public static Ticker getFromBtce() {
		String json = httpGet(btceUrl);
		if(json == null){
			System.out.println("ticker data not found");
			return null;
		}
		
		Gson gson = new Gson();
		Ticker ticker = Ticker.fromJSON(json);	//gson.fromJson(json, Ticker.class);
		return ticker;
	}
	

	private void getFromBitcoinCharts() {
	}

	public ArrayList<Ticker> fetchData(String start, String end, String length) {
		return null;
	}

	private static String httpGet(String url) {
		URL service;
		String result = null;
		try {
			service = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) service.openConnection();
			if (conn.getResponseCode() != 200) {
				throw new IOException(conn.getResponseMessage());
			}

			// Buffer the result into a string
			BufferedReader rd = new BufferedReader(
					new InputStreamReader(conn.getInputStream())
			);
			StringBuilder sb = new StringBuilder();
			String line;
			
			while ((line = rd.readLine()) != null) {
				sb.append(line);
			}
			
			rd.close();
			conn.disconnect();
			result = sb.toString();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}

	private String httpPost(String url, String[] param, String[] paramVal) {
		URL service;
		String result = null;
		try {
			service = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) service.openConnection();
			conn.setRequestMethod("POST");
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.setUseCaches(false);
			conn.setAllowUserInteraction(false);
			conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

			// Create the form content
			OutputStream out = conn.getOutputStream();
			Writer writer = new OutputStreamWriter(out, "UTF-8");
			for (int i = 0; i < param.length; i++) {
				writer.write(param[i]);
				writer.write("=");
				writer.write(URLEncoder.encode(paramVal[i], "UTF-8"));
				writer.write("&");
			}
			writer.close();
			out.close();

			if (conn.getResponseCode() != 200) {
				throw new IOException(conn.getResponseMessage());
			}

			// Buffer the result into a string
			BufferedReader rd = new BufferedReader(new InputStreamReader(
					conn.getInputStream()));
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = rd.readLine()) != null) {
				sb.append(line);
			}
			rd.close();

			conn.disconnect();
			result = sb.toString();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
