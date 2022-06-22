package com.shopcar.member.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class MemberDTO {
	private String userId;
	private String userPw;
	private String userName;
	private String userPhone;
	private String userEmail;
	
}
