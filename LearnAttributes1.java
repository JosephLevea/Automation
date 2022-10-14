package com.testNG.basic;

	import org.testng.annotations.Test;

	public class LearnAttributes1 {
		
		@Test (invocationCount=3)  
		public void signOut() {
			System.out.println("sign out");
		}
		
		@Test (priority=1)
		public void signUp() {
			System.out.println("signUp");
		}
		
		@Test (enabled=false)
		public void login() {
			System.out.println("login");
		}

		@Test (invocationCount=3,description="Used to test search product") 
		public void searchProduct() {
			System.out.println("search Product");
		}
		
		
		@Test   
		public void addToCart() {
			System.out.println("add to cart");
		}

	

	}


