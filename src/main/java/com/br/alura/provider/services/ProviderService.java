package com.br.alura.provider.services;

import com.br.alura.provider.model.Provider;
import com.br.alura.provider.repositories.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderService {
    @Autowired
    ProviderRepository providerRepository;


    public List<Provider> findAllByStateCode(String stateCode) {
        return this.providerRepository.findAllByStateCode(stateCode);
    }
}
