/**
 * 
 */
package com.troy.software.enrollment.persistence.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import com.troy.software.enrollment.persistence.domain.UserDetails;

/**
 * @author Prabu S B
 *
 */
@Repository
@Component
public class UserImpl implements User {
	
	@Autowired
	MongoTemplate mongoTemplate; 

	/* (non-Javadoc)
	 * @see com.troy.software.enrollment.persistence.repository.User#add(com.troy.software.enrollment.persistence.domain.UserDetails)
	 */
	@Override
	public void add(UserDetails book) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.troy.software.enrollment.persistence.repository.User#save(com.troy.software.enrollment.persistence.domain.UserDetails)
	 */
	@Override
	public void save(UserDetails userDetails) {
		mongoTemplate.save(userDetails);

	}

	/* (non-Javadoc)
	 * @see com.troy.software.enrollment.persistence.repository.User#find(java.lang.String)
	 */
	@Override
	public UserDetails find(String username) {
		System.out.println("inside persistence");
		mongoTemplate.getCollection("check").
		Query query = new Query(Criteria.where("username").is(username));
		return mongoTemplate.findOne(query, UserDetails.class);		
	}
	
	/* (non-Javadoc)
	 * @see com.troy.software.enrollment.persistence.repository.User#find(java.lang.String)
	 */
	@Override
	public UserDetails getUserDetails(String rollNumber) {
		System.out.println("inside persistence");
		Query query = new Query(Criteria.where("rollNumber").is(rollNumber));
		return mongoTemplate.findOne(query, UserDetails.class);		
	} 

	/* (non-Javadoc)
	 * @see com.troy.software.enrollment.persistence.repository.User#remove(java.lang.String)
	 */
	@Override
	public void remove(String username) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.troy.software.enrollment.persistence.repository.User#findAll()
	 */
	@Override
	public List<UserDetails> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
