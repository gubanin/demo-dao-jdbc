package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepartmentDao dep = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Test 1: Department findById ===");
		Department d = dep.findById(1);
		System.out.println(d);
		
		System.out.println("\n=== Test 2: Department findAll ===");
		List<Department> list = dep.findAll();
		for (Department department : list) {
			System.out.println(department);
		}
		
		System.out.println("\n=== Test 3: Department insert ===");
		Department newDep = new Department(null, "Tools");
		dep.insert(newDep);
		System.out.println("Inserted! new id = " +newDep.getId());
		
		System.out.println("\n=== Test 4: Department update ===");
		d = dep.findById(6);
		d.setName("DVDs");
		dep.update(d);
		System.out.println("Update completed");

		System.out.println("\n=== Test 5: Department delete ===");
		dep.deleteById(8);
		System.out.println("Delete completed");
		
	}

}
