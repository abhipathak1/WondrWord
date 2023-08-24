package com.masai.service;

import java.util.List;

import com.masai.model.Ticket;

public interface TicketService {
	public Ticket createTicket(Integer customerId, Integer activityId, Ticket ticketDTO) ;

	public Ticket updateTicket(Integer customerId, Integer ticketId, Ticket ticketDTO) ;
	
	public Ticket getTicketById(Integer customerId, Integer ticketId) ;
	
	public Boolean deleteTicket(Integer customerId, Integer ticketId) ;
	
	public List<Ticket> viewAllTickets(Integer pageNumber, Integer itemsPerPage) ;
	
	public List<Ticket> getTicketBookingHistory(Integer customerId, Integer pageNumber, Integer itemsPerPage) ;

}