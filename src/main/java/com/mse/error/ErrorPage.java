package com.mse.error;


import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorPage {

	private LocalDate date;
	//private String status;

	private String msg;
	private int code;
	
	
	
}
