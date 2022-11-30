package net.swapnil.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.swapnil.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
