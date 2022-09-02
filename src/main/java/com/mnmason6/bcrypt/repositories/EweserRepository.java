package com.mnmason6.bcrypt.repositories;

import com.mnmason6.bcrypt.models.Eweser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EweserRepository extends JpaRepository<Eweser, Long> {
    Eweser findByUsername(String username);
}
