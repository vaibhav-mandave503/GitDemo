package ECOM_API_Demo;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import ECOM_API_POJO.LoginRequest;
import ECOM_API_POJO.LoginResponse;
import ECOM_API_POJO.OrderDetail;
import ECOM_API_POJO.Orders;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class ECOMAPITest {

	public static void main(String[] args) {
		// 70 - Login and get Token
		RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.setContentType(ContentType.JSON).build();
		
		LoginRequest loginRequest = new LoginRequest(); //POJO
		loginRequest.setUserEmail("vaibhav.mandave@gmail.com");
		loginRequest.setUserPassword("Vibs@acc203");
		
		RequestSpecification reqLogin = given().relaxedHTTPSValidation().log().all().spec(req).body(loginRequest);
		LoginResponse loginResponse = reqLogin.when().post("/api/ecom/auth/login").then().log().all()
				.extract().response().as(LoginResponse.class); // POJO
		System.out.println(loginResponse.getToken());
		String token = loginResponse.getToken();
		System.out.println(loginResponse.getUserId());
		String userId = loginResponse.getUserId();
		
		// 71 - Create product with image - form-data and image file
		RequestSpecification addProductBaseReq = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addHeader("Authorization", token).build();
		
		RequestSpecification reqAddProduct = given().log().all().spec(addProductBaseReq).param("productName", "Adidas Shoes").param("productAddedBy", userId)
		.param("productCategory", "fashion").param("productSubCategory", "footwear").param("productPrice", "1500")
		.param("productDescription", "Adias Originals").param("productFor", "Men")
		.multiPart("productImage",new File("D:\\OneDrive - Coforge Limited\\Miscellaneous\\Info\\prof\\santander\\API_RestAssured\\ECOM\\Images\\productImage_1650649488046.jpg"));

		String addProductResponse = reqAddProduct.when().log().all().post("/api/ecom/product/add-product")
		.then().log().all().extract().response().asString();
		JsonPath js = new JsonPath(addProductResponse);
		String productId = js.get("productId");
		System.out.println("productId:"+productId);
		
		// 72 - Create Order for Product Added
		RequestSpecification createOrderBaseReq = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addHeader("Authorization", token).setContentType(ContentType.JSON).build();
		OrderDetail orderDetail = new OrderDetail();
		orderDetail.setCountry("India");
		orderDetail.setProductOrderedId(productId);
		
		List<OrderDetail> orderDetailList = new ArrayList<OrderDetail>();
		orderDetailList.add(orderDetail);
		Orders orders = new Orders();
		orders.setOrders(orderDetailList);
		
		RequestSpecification createOrderReq = given().log().all().spec(createOrderBaseReq).body(orders);
		String responseCreateOrder = createOrderReq.when().log().all().post("/api/ecom/order/create-order")
				.then().log().all().extract().response().asPrettyString();
		System.out.println("responseCreateOrder:"+responseCreateOrder);
		JsonPath js1 = new JsonPath(responseCreateOrder);
		String orderId = js1.get("orders[0]");
		System.out.println("\norderId:"+orderId);
		
		// 73 - Delete Product 
		RequestSpecification deleteProductBaseReq = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addHeader("Authorization", token).setContentType(ContentType.JSON).build();
		
		RequestSpecification deleteProdReq = given().log().all().spec(deleteProductBaseReq).pathParam("productId", productId);
		
		String deleteProductResponse = deleteProdReq.when().delete("/api/ecom/product/delete-product/{productId}")
				.then().log().all().extract().response().asString();
		
		JsonPath js2 = new JsonPath(deleteProductResponse);
		
		Assert.assertEquals("Product Deleted Successfully", js2.get("message"));
		
		// 74 - Delete Order
		RequestSpecification deleteOrderBaseReq = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addHeader("Authorization", token).setContentType(ContentType.JSON).build();
		
		RequestSpecification deleteOrderReq = given().log().all().spec(deleteOrderBaseReq).pathParam("orderId", orderId);
		
		String deleteOrderResponse = deleteOrderReq.when().delete("/api/ecom/order/delete-order/{orderId}")
				.then().log().all().extract().response().asString();
		
		JsonPath js3 = new JsonPath(deleteOrderResponse);
		
		Assert.assertEquals("Orders Deleted Successfully", js3.get("message"));
		
	}

}