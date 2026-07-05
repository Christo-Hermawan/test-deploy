package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.Map;

@RestController
// Sementara pakai "*" biar gampang testing dulu.
// Setelah frontend live di Vercel, ganti jadi domain Vercel-nya, misal:
// @CrossOrigin(origins = "https://nama-app-kamu.vercel.app")
@CrossOrigin(origins = "*")
public class HelloController {

    @GetMapping("/api/hello")
    public Map<String, Object> hello() {
        return Map.of(
                "message", "Halo dari backend Spring Boot yang jalan di Render!",
                "timestamp", Instant.now().toString()
        );
    }

    @GetMapping("/api/health")
    public Map<String, String> health() {
        return Map.of("status", "OK");
    }
}
