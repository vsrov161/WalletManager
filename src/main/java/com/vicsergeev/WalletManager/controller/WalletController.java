package com.vicsergeev.WalletManager.controller;

/*
 * Created by Vic
 * 20.03.2026
 */

import com.vicsergeev.WalletManager.dto.WalletOperationRequestDto;
import com.vicsergeev.WalletManager.model.Wallet;
import com.vicsergeev.WalletManager.repository.WalletRepository;
import com.vicsergeev.WalletManager.service.WalletService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/wallet")
public class WalletController {

    private final WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @GetMapping
    public List<WalletRepository> findAllWallets() {
        return walletService.findAllWallets();    }

    @GetMapping("{walletId}")
    public WalletOperationRequestDto findWalletById(@PathVariable("walletId") UUID walletId) {
        return walletService.getWalletById(walletId);
    }
}
