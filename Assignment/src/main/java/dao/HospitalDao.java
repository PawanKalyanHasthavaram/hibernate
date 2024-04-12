package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Admin;
import dto.Hospital;

public class HospitalDao {
	private EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	public Hospital saveHospital(Hospital hospital,int admin_id) {
		Admin a=manager.find(Admin.class, admin_id);
		if(a!=null) {
			a.getHospitals().add(hospital);
			hospital.setAdmin(a);
			EntityTransaction transaction=manager.getTransaction();
			manager.persist(hospital);
			transaction.begin();
			transaction.commit();
			return hospital;
			
		}
		return null;
	}
	public Hospital updateHospital(Hospital hospital) {
		Hospital dbHospital=manager.find(Hospital.class,hospital.getId());
		if(dbHospital!=null) {
			dbHospital.setFounder(hospital.getFounder());
			dbHospital.setName(hospital.getName());
			dbHospital.setGst_nuber(hospital.getGst_nuber());
			dbHospital.setYear_of_estb(hospital.getYear_of_estb());
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			transaction.commit();
			return dbHospital;
			
		}
		return null;
	}
	public List<Hospital> findHospitalByAdminId(int admin_id){
		Query q=manager.createQuery("select a.hospital from Admin a where a.id=?1");
		q.setParameter(1, admin_id);
		return q.getResultList();
	}
	

}
