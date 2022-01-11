package ma.anrt.inpt.jpabookprintingdemo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.anrt.inpt.jpabookprintingdemo.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
