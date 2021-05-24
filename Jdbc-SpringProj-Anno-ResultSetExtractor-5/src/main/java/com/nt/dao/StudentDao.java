package com.nt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBo;

@Repository
public class StudentDao {
	
	
	private JdbcTemplate jt;
	
	
	public StudentDao(@Autowired JdbcTemplate jt) {
		super();
		System.out.println("StudentDao.StudentDao()");
		this.jt = jt;
	}
	
	public List<StudentBo> getStudentdsByCource(String course1,String course2){
		
		final String Query="select sno,sname,course,fee from student where course in (?,?)";
		
		//using non static inner classes
		/*List<StudentBo> listBo = jt.query(Query,
				                           new StudentRSExtractor() ,
				                                  cource1,cource2
				                          );*/
		
		//Using Annonymous inner class
		/*List<StudentBo> listBo  = jt.query(Query, new ResultSetExtractor<List<StudentBo>>() {

			@Override
			public List<StudentBo> extractData(ResultSet rs) throws SQLException, DataAccessException {
				
				List<StudentBo> boList = new ArrayList<>();
				
				while(rs.next()) {
					StudentBo bo = new StudentBo();
					bo.setsNo(Integer.parseInt(rs.getString("sno")));
					bo.setsName(rs.getString("sname"));
					bo.setCourse(rs.getString("course"));
					bo.setFee(Float.parseFloat(rs.getString("fee")));
					boList.add(bo);
				}
				return boList;
			}
											},
				                           cource1,cource2
											
				);	     */                             
	
		//Using Lambda Expression
	
		/*List<StudentBo> listBo = jt.query(Query,
				                         rs->{
				                        	 List<StudentBo> boList = new ArrayList<>();
				                        	 while(rs.next()) {
				                     			StudentBo bo = new StudentBo();
				                     			bo.setsNo(Integer.parseInt(rs.getString("sno")));
				                     			bo.setsName(rs.getString("sname"));
				                     			bo.setCourse(rs.getString("course"));
				                     			bo.setFee(Float.parseFloat(rs.getString("fee")));
				                     			boList.add(bo);
				                     		}
				                        	 return boList;
				                         },
				                         course1,course2
				                         );*/
		
		
		
		
		BeanPropertyRowMapper<StudentBo> bprm = new BeanPropertyRowMapper<>(StudentBo.class);
		RowMapperResultSetExtractor<StudentBo> rmrse = new RowMapperResultSetExtractor<StudentBo>(bprm);
		List<StudentBo> listBo = jt.query(Query,
				                          rmrse,
				                          course1,course2
				                         );
		return listBo;
		
	}
	
   /*private class StudentRSExtractor implements ResultSetExtractor<List<StudentBo>>{

	@Override
	public List<StudentBo> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<StudentBo> boList = new ArrayList<>();
		
		while(rs.next()) {
			StudentBo bo = new StudentBo();
			bo.setsNo(Integer.parseInt(rs.getString("sno")));
			bo.setsName(rs.getString("sname"));
			bo.setCourse(rs.getString("course"));
			bo.setFee(Float.parseFloat(rs.getString("fee")));
			boList.add(bo);
		}
		return boList;
	}
	   
   }*/
}
