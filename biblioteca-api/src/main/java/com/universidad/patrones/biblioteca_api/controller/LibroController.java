package com.universidad.patrones.biblioteca_api.controller;

import com.universidad.patrones.biblioteca_api.model.Libro;
import com.universidad.patrones.biblioteca_api.service.LibroService;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    private final LibroService service;

    public LibroController(LibroService service) {
        this.service = service;
    }

    // GET /api/libros
    @GetMapping
    public List<Libro> listar() {
        return service.findAll();
    }

    // GET /api/libros/1
    @GetMapping("/{id}")
    public ResponseEntity<Libro> obtener(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // POST /api/libros
    @PostMapping
    public ResponseEntity<Libro> crear(@RequestBody @Valid Libro libro) {
        return ResponseEntity.status(201).body(service.save(libro));
    }

    // PUT /api/libros/1
    @PutMapping("/{id}")
    public ResponseEntity<Libro> actualizar(
            @PathVariable Long id,
            @RequestBody @Valid Libro datos) {

        return ResponseEntity.ok(service.update(id, datos));
    }

    // DELETE /api/libros/1
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    // GET /api/libros/buscar?q=java
    @GetMapping("/buscar")
    public List<Libro> buscar(@RequestParam String q) {
        return service.buscarPorPalabra(q);
    }
}