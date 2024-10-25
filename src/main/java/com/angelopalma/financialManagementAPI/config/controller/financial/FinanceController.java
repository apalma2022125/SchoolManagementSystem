package com.angelopalma.financialManagementAPI.config.controller.financial;

import com.angelopalma.financialManagementAPI.config.model.FinancialSummary;
import com.angelopalma.financialManagementAPI.config.model.User;
import com.angelopalma.financialManagementAPI.config.service.financial.FinanceService;
import com.angelopalma.financialManagementAPI.config.service.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1/summaries")
public class FinanceController {

    @Autowired
    private FinanceService financialService;

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/{userId}")
    public ResponseEntity<FinancialSummary> getFinancialSummary(
            @PathVariable String userId,
            @RequestParam("from") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate from,
            @RequestParam("to") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate to) {

        User userFound = usuarioService.findById(userId);

        FinancialSummary summary = financialService.generateSummary(userFound, from, to);
        return ResponseEntity.ok(summary);
    }
}