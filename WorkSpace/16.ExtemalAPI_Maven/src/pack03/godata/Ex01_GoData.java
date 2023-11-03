package pack03.godata;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Ex01_GoData {
	// json&xml:서버로 클라이언트는 여러가지 요청을 보냄 : Request
	// 서버는 클라이언트의 요청에 따라 페이지 또는 데이터르ㄹ 통해 응답: Response
	// 데이터의 요청은 여러가지 언어나 플랫폼에서 할 수 있음 ->타입 공통적으로 사용(json & xml)
	// json->String " "
	// 변수 : "변수명" : " 변수값"
	// 객체 : {"변수명" : "변수값" }dto1건 dto내부에 변수
	// 배열(리스트) : []->ArrayList<dto>,DTO[]

	// ?=&=&=R%2B7bHYCalznWJCmVsmOWWlKE1klaVhaaGjrziOlH6gQIrH6p%2BZ84UYuBaUTu0uQ55SzZHuqZOkxTnwkPwjmTSQ%3D%3D
	//https://api.odcloud.kr/api/3082925/v1/uddi:b4759786-c28c-41dd-b600-a9abdbec3ae1?page=1&perPage=100&serviceKey=R%2B7bHYCalznWJCmVsmOWWlKE1klaVhaaGjrziOlH6gQIrH6p%2BZ84UYuBaUTu0uQ55SzZHuqZOkxTnwkPwjmTSQ%3D%3D
	public static void main(String[] args) {
		HttpClient client = HttpClients.createDefault();// 요청을 위한 객체
		try {
			//주소와 ㅍㅏ라메터를 보내기 위한 객체
			URIBuilder builder = new URIBuilder(
					"https://api.odcloud.kr/api/3082925/v1/uddi:b4759786-c28c-41dd-b600-a9abdbec3ae1");
			builder.addParameter("page","1" );
			builder.addParameter("perPage","100") ;
			builder.addParameter("serviceKey","R+7bHYCalznWJCmVsmOWWlKE1klaVhaaGjrziOlH6gQIrH6p+Z84UYuBaUTu0uQ55SzZHuqZOkxTnwkPwjmTSQ=="); 
			//Get&Post : 요청 시 url에 파라메터가 보이는지 여부
			HttpGet request = new HttpGet(builder.build());
			
			HttpResponse response = client.execute(request);
			String responseBody = EntityUtils.toString(response.getEntity());
			//System.out.println(responseBody);
			//jsonObject API(Library): StringJson에서는 하나씩 데이터를 빼오는것이 불편함.
			
			
//			JsonElement jElement = JsonParser.parseString(responseBody);
//			JsonObject jobj = jElement.getAsJsonObject();
//			JsonArray jArray = (JsonArray)jobj.get("data");
//			System.out.println(jArray.size());
//			
//			for (int i = 0; i < jArray.size(); i++) {
//				JsonObject tempObj = jArray.get(i).getAsJsonObject();
//				System.out.print(tempObj.get("데이터기준일자")+ " ");
//				System.out.print(tempObj.get("비고")+ " ");
//				System.out.print(tempObj.get("상호명")+" ");
//				System.out.print(tempObj.get("소재지도로명주소")+" ");
//				System.out.println();
//							
//			}
			
			
			PojoClass pojo = new Gson().fromJson(responseBody, PojoClass.class);
			System.out.println(pojo.list.size());
			System.out.println(pojo.list.get(0).storeName);
			
			
			String pojoJson = new Gson().toJson(pojo);
			System.out.println(pojoJson);
			
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	//Plain Old java Object : DTO와 같으나 임시로 테이터를 변환하기 위한 객체.
	
	public class PojoClass{
		
		@SerializedName("data")
		ArrayList<PojoInnerData> list;
		
		public class PojoInnerData{
			@SerializedName("상호명")//변수에 storeName안써도 에 상호명..
			public String storeName;
			@SerializedName("데이터기준일자")
			public String infoDate;
			@SerializedName("비고")
			public String comment;
		}
		
		
		
		
		
		
		
	}
	
	
	
	
}
