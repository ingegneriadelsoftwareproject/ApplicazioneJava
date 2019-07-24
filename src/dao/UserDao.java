package dao;

import java.time.LocalDate;
import application.entity.*;
import java.util.List;

import application.entity.Order;
import application.entity.User;


public abstract class UserDao {

		/**
		 * ritorna una lista di users
		 * @param f filtri applicati alla ricerca
		 * @return
		 */
		public abstract List<User> readUsersBirthDate(String username, LocalDate birthData); 
		public abstract List<User> readUsersName(String username); 
		public abstract List<User> readUsersOnlyBirthDate(LocalDate birthData); 
		public abstract void deleteUser(String username ); 
		public abstract List<Order> readOrder(User u ); 
		public abstract List<OrderStaticsUser> readOrderStatics(User u ); 
		public abstract List<PreferencesStaticsUser> readPreferences(User u ); 
		
	
		
}
