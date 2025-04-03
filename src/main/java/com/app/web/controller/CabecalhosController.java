package com.app.web.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CabecalhosController {

    @GetMapping("/cabecalhos")
    public String mostrarCabecalhos(HttpServletRequest request) {
        String host = request.getHeader("host");
        String userAgent = request.getHeader("user-agent");
        String acceptEncoding = request.getHeader("accept-encoding");
        String acceptLanguage = request.getHeader("accept-language");

        return """
                <h1>Cabeçalhos HTTP</h1>
                <ul>
                    <li><strong>Host:</strong> %s</li>
                    <li><strong>User-Agent:</strong> %s</li>
                    <li><strong>Accept-Encoding:</strong> %s</li>
                    <li><strong>Accept-Language:</strong> %s</li>
                </ul>
                """.formatted(host, userAgent, acceptEncoding, acceptLanguage);
    }
}
