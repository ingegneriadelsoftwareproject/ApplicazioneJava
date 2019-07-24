package dao;

import java.time.LocalDate;
import application.entity.*;
import java.util.List;

import application.entity.Order;
import application.entity.User;


public abstract class UserDao {

		/**
		 * dato uno username e una data di nascita ritorna una lista di utenti
		 * @param username
		 * @param birthData
		 * @return
		 */
		public abstract List<User> readUsersBirthDate(String username, LocalDate birthData);
		/**
		 * dato un username ritorna una lista di utenti corrispondente
		 * @param username
		 * @return
		 */
		public abstract List<User> readUsersName(String username); 
		/**
		 * data una data di nascita ritorna una lista di utenti che sono nati in quella data 
		 * @param birthData
		 * @return
		 */
		public abstract List<User> readUsersOnlyBirthDate(LocalDate birthData); 
		/**
		 * dato un username elimina l'utente che ha quel username dal database
		 * 
		 * @param username
		 */
		public abstract void deleteUser(String username ); 
		/**
		 * dato un oggetto user, legge tutti gli ordini effettuati da quell'utente 
		 * @param u
		 * @return
		 */
		public abstract List<Order> readOrder(User u ); 
		/**
		 * dato uno user legge tutte le statistiche sugli ordini effettuati da quel utente 
		 * @param u
		 * @return
		 */
		public abstract List<OrderStaticsUser> readOrderStatics(User u );
		/**
		 * dato uno user legge le statistiche relative alle preferenze di quell'utente 
		 * @param u
		 * @return
		 */
		public abstract List<PreferencesStaticsUser> readPreferences(User u ); 
		
	
		
}
