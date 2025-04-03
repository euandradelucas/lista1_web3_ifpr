package com.app.web.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequisicaoController {

  @GetMapping("/requisicao")
  public String mostrarRequisicao(HttpServletRequest request) {
    String metodo = request.getMethod();
    String uri = request.getRequestURI();
    String protocolo = request.getProtocol();

    return """
        <h1>Informações da Requisição</h1>
                <ul>
                    <li><strong>Método:</strong> %s</li>
                    <li><strong>URI do Pedido:</strong> %s</li>
                    <li><strong>Protocolo:</strong> %s</li>
                </ul>
        """.formatted(metodo, uri, protocolo);
    
  }
}
