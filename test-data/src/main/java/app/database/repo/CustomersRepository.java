package app.database.repo;

import app.database.entity.Customers;
import org.springframework.data.repository.CrudRepository;
import java.util.List;


public interface CustomersRepository extends CrudRepository<Customers, Integer> {

    public List<Customers> findAll();
}
