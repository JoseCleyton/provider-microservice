package com.br.alura.provider.controllers;

import com.br.alura.provider.model.Provider;
import com.br.alura.provider.services.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/provider")
public class ProviderController {
    @Autowired
    ProviderService providerService;

    @GetMapping("/{stateCode}")
    public ResponseEntity<List<Provider>> findAll(@PathVariable String stateCode) {
        return ResponseEntity.ok((this.providerService.findAllByStateCode(stateCode)));
    }
}
