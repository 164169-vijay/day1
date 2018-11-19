package org.assignment.no4;

	 /*private*/ public /*final*/ abstract class TestAbstract {
		 
		 // we cannot declare an abstract class as private 
		 //because the implementation is done in the sub class and if it private
		 //the sub class will not be able access it.
		 
		 //Also abstract class are never final because 
		 //a final class is considered complete and cannot be used in the sub class
		 //However the whole idea of abstract class is that the implementation is done in the sub class.
		 //So it cannot be final.
		 
		
		//As we can see that if we remove the comment we get an error. 
		//This is happening //because an abstract method should 
		//always be declared in an abstract class.
		
		/*
		public abstract void test1() {
			
		}
		public void test2() 
		
		*/
		 
		 public void test2() {
			 
		 }
		 //A we can see that it is possible to create methods with or without abstract keyword. 
		 //However if the method is abstract then it is mandatory that the class has to be abstract too.

}
