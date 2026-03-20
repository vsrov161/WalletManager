package com.vicsergeev.WalletManager.service;

/*
 * Created by Vic
 * 20.03.2026
 */

import com.vicsergeev.WalletManager.repository.WalletRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WalletService {
    private final WalletRepository walletRepository;

    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

//    public List<WalletRepository> findAllWallets() {
//        return walletRepository.findAll().stream()
//                .
//    }

}
