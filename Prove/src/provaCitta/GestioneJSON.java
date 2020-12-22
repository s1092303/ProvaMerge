package provaCitta;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;



public class GestioneJSON {

	private JSONArray ja = null;
	private JSONObject jo = null;
	
	public GestioneJSON() {
		this.jo = new JSONObject();
		this.ja = new JSONArray();
	}

	public JSONArray getArray() {
		return ja;
	}

	public void setArray(JSONArray ja) {
		this.ja = ja;
	}

	public JSONObject getObject() {
		return jo;
	}

	public void setObject(JSONObject jo) {
		this.jo = jo;
	}
	
	public void insertObject(JSONObject jo) {
	//	this.ja.add(jo);
	}
	
	public void salvaFile(String nome_file, boolean isObject) {
		try {
			PrintWriter file_output = new PrintWriter(new BufferedWriter(new FileWriter(nome_file)));
			
			if(isObject)
				file_output.println(this.jo);
			else
				file_output.println(this.ja);
			
			file_output.close();
			System.out.println("File salvato!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void caricaFile(String nome_file, boolean isObject) {
	//	String data = "";
	//	String line = "";
		try {
			Scanner file_input = new Scanner(new BufferedReader(new FileReader(nome_file)));	  
			String str = file_input.nextLine();
			
			if(isObject) {
				this.jo = (JSONObject) JSONValue.parseWithException(str);	 //parse JSON Object
				System.out.println("JSONObject letto: "+ this.jo);
			}else{
				this.ja = (JSONArray) JSONValue.parseWithException(str);	//parse JSON Array
				System.out.println("JSONArray letto: "+ this.ja);
				System.out.println("IL JSONArray letto ha "+ this.ja.size()+" elementi!");
			}
			
			file_input.close();
			
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void chiamataAPI(String url, boolean isObject) {
		try {
			URLConnection openConnection = new URL(url).openConnection();
			InputStream in = openConnection.getInputStream();
			
			String data = "";
			String line = "";
			try {
			   InputStreamReader inR = new InputStreamReader( in );
			   BufferedReader buf = new BufferedReader( inR );
			  
			   while ( ( line = buf.readLine() ) != null ) {
				   data+= line;
			   }
			} finally {
			   in.close();
			}
			if(isObject) {
				this.jo = (JSONObject) JSONValue.parseWithException(data);
				JSONObject getSth = (JSONObject) jo.get("wind");
				//JSONObject getSth1 = (JSONObject) jo.get("visibility");
				//System.out.println("JSONObject scaricato: "+ this.jo);
				Double speed = (Double) getSth.get("speed");
				Long deg = (Long) getSth.get("deg");
				Long visibility = (Long) jo.get("visibility");
				System.out.println("Wind speed: " + speed);
				System.out.println("Wind degree: " + deg);
				System.out.println("Visibility: " + visibility);
				
			} else {
				this.ja = (JSONArray) JSONValue.parseWithException(data);
				System.out.println("JSONArray scaricato: "+ this.ja);
				System.out.println("IL JSONArray scaricato ha "+ this.ja.size()+" elementi:");

				for(int i=0;i<this.ja.size();i++) {
					JSONObject jo = (JSONObject) this.ja.get(i);
					System.out.println(i+") "+jo.get("title"));
				}
			}
				
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

