//package com.ssafy.study.api.response;
//
//import com.ssafy.common.model.response.BaseResponseBody;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import lombok.Data;
//
///**
// * 유저 로그인 API ([SPOST] /user/signin) 요청에 대한 응답값 정의.
// */
//
//@Data
//@ApiModel("UserLoginPostResponse")
//public class UserLoginPostRes extends  BaseResponseBody{
//	@ApiModelProperty(name="JWT 인증 토큰", example = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZXN...")
//    String jwt;
//	@ApiModelProperty(name="유저 아이디", example = "sr5871@naver.com")
//    String id;
//
//	public static UserLoginPostRes of(Integer statusCode, String message, String JWT, String id){
//		// 1. ResponseBody 객체 res 하나 만들어서
//		UserLoginPostRes res=new UserLoginPostRes();
//
//		// 2. BaseResponseBody에서 상속받은 응답상태랑 메세지 설정해주고
//		res.setStatusCode(statusCode);
//		res.setMessage(message);
//
//		// 3. 생성한 JWT 토큰도 설정해주기
//		res.setJwt(JWT);
//
//		// 4. 유저 아이디도 넣어주기
//		res.setId(id);
//		return res;
//	}
//
//}