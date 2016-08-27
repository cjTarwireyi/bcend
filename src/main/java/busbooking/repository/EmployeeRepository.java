package busbooking.repository;


import busbooking.domain.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Cornelious on 7/31/2016.
 */
@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeEntity,Long> {
}
