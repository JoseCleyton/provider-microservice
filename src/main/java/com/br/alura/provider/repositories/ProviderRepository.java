package com.br.alura.provider.repositories;

import com.br.alura.provider.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProviderRepository extends JpaRepository<Provider, Long> {

    List<Provider> findAllByStateCode(String stateCode);
}
