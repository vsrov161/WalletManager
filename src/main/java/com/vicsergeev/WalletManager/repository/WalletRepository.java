package com.vicsergeev.WalletManager.repository;

import com.vicsergeev.WalletManager.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * Created by Vic
 * 19.03.2026
 */
public interface WalletRepository extends JpaRepository<Wallet, Integer> {
}
