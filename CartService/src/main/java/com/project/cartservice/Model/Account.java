package com.project.cartservice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
	private int userId;
	private String password;
	private String email;
	//private int mobileno;
}
