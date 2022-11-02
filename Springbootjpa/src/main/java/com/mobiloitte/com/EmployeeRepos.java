package com.mobiloitte.com;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepos extends JpaRepository<EmpRec, Integer> 
{
	
}