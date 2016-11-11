package com.MasterBranch.dao;

import java.util.List;

import com.MasterBranch.bean.Enquiry;
import com.MasterBranch.bean.Query;

public interface FeedbackDAO {
	public List<Query> getAllQueries(int enquiryId);
	public List<Enquiry> getAllEnquiries();
	public void addEnquiry(Enquiry enquiry);
	public void addQuery(int id,Query query);
}
