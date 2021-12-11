package com.axios;

import java.util.HashMap;

import com.axios.core.http.HttpRequest;
import com.axios.header.Header;
import com.axios.request.Body;
import com.axios.request.Request;
import com.axios.response.HttpResponse;

import org.junit.Test;

public class AxiosTest {

	@Test
	public void test1_Axios() throws Exception{
		String url = "http://192.168.1.109:9099/RollCall/people/axiosGet";
		Axios.get(
			url //,
//			new Request().add("value", "this is axios text1"),
//			new Header().add("token", "this is axios text1")
		).then(value ->{
			System.out.println(value);
		});
	}

	@Test
	public void test2_Axios() throws Exception{
		String url = "http://localhost:8080/demo/base/add";

		HashMap<String, Object> paramMap = new HashMap<>();
		// paramMap.put("value", "axios test in test2_Axios");

		HttpResponse value = HttpRequest.get(url).form(paramMap).header("", "").execute();

		System.out.println(value);
	}

	@Test
	public void test3_Axios() throws Exception{
		String url = "http://localhost:8080/demo/base/remove";

		Request request = new Request().add("name", "axios test in test3_Axios");

		HttpResponse value = HttpRequest.post(url).body(request.toBody()).execute();

		System.out.println(value);
	}

	@Test
	public void test4_Axios() throws Exception{
		String url = "http://localhost:8080/demo/base/remove";

		Axios.post(
			url,
			new Body().add("name", "this is axios test4"),
			new Header().add("token", "this is axios test4")
		)
		.then(value ->{
			System.out.println(value.getData());
		});
	}

	@Test
	public void  test5_Axios() throws Exception{
		String url = "http://192.168.1.109:9099/RollCall/people/axiosGet";
		System.out.println(Axios.get(url).body());
//		String value = Axios.get("");
	}

	@Test
	public void test6_Axios()throws Exception{
		String url = "http://localhost:8080/demo/base/select";
		Axios.put(url).then(value ->{
			System.out.println(value);
		});
	}

	@Test
	public void test7_Axios()throws Exception{
		String url = "http://localhost:8080/demo/base/update";
		Axios.delete(url).then(value ->{
			System.out.println(value);
		});
	}

}
